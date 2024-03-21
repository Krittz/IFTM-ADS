package br.com.cran.fileupload;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.google.gson.Gson;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.RequestBody;
import okhttp3.Response;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    public void act_enviar(View view) {
        Intent intent = new Intent().setType("*/*").setAction(Intent.ACTION_GET_CONTENT);
        startActivityForResult(Intent.createChooser(intent, "Escolha:"), 123);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == 123 && resultCode == RESULT_OK) {
            Uri selectedFile = data.getData();
            String arquivo = tempfile(selectedFile);
            upload(arquivo);
        }
    }

    private void upload(String arquivo) {
        ProgressBar pb = findViewById(R.id.progresso);
        pb.setVisibility(View.VISIBLE);
        File file = new File(arquivo);
        RequestBody requestBody = RequestBody.create(MediaType.parse("*/*"), file);
        MultipartBody.Part fileToUpload = MultipartBody.Part.createFormData("arquivo", file.getName(), requestBody);
        RequestBody filename = RequestBody.create(MediaType.parse("text/plain"), file.getName());
        ApiConfig getResponse = AppConfig.getRetrofit().create(ApiConfig.class);
        Call call = (Call) getResponse.uploadFile(fileToUpload, filename);
        call.enqueue(new Callback() {
            @Override
            public void onFailure(Call call, IOException e) {
                // Lidar com o erro de forma adequada, como registrar a exceção ou exibir uma mensagem de erro
                e.printStackTrace();
                runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        ProgressBar pb = findViewById(R.id.progresso);
                        pb.setVisibility(View.GONE);
                        Toast.makeText(MainActivity.this, "Erro ao enviar o arquivo", Toast.LENGTH_SHORT).show();
                    }
                });
            }

            @Override
            public void onResponse(Call call, Response response) throws IOException {
                if (!response.isSuccessful()) {
                    // Lidar com o erro de forma adequada
                    onFailure(call, new IOException("Request failed with code " + response.code()));
                    return;
                }

                // Processar o corpo da resposta
                try {
                    String responseBodyString = response.body().string();
                    // Aqui você precisa implementar a lógica para converter a resposta (responseBodyString) para ServerResponse
                    // Isso pode ser feito usando Gson ou outro mecanismo de desserialização JSON
                    // Por exemplo:
                    Gson gson = new Gson();
                    ServerResponse serverResponse = gson.fromJson(responseBodyString, ServerResponse.class);

                    if (serverResponse != null) {
                        runOnUiThread(new Runnable() {
                            @Override
                            public void run() {
                                if (serverResponse.getSuccess()) {
                                    Toast.makeText(getApplicationContext(), serverResponse.getMessage(), Toast.LENGTH_SHORT).show();
                                } else {
                                    Toast.makeText(getApplicationContext(), serverResponse.getMessage(), Toast.LENGTH_SHORT).show();
                                }
                            }
                        });
                    } else {
                        Log.v("Response", "Resposta do servidor nula");
                    }
                } catch (IOException e) {
                    // Lidar com erros de leitura do corpo da resposta
                    onFailure(call, e);
                } finally {
                    // Certifique-se de fechar o corpo da resposta após o uso
                    response.body().close();
                    runOnUiThread(new Runnable() {
                        @Override
                        public void run() {
                            ProgressBar pb = findViewById(R.id.progresso);
                            pb.setVisibility(View.GONE);
                        }
                    });
                }
            }

        });
    }

    private String tempfile(Uri selectedFile) {
        String retorno = "";
        try {
            String extensao = "." + getContentResolver().getType(selectedFile).split("/")[1];
            File outputDir = getCacheDir();
            File outputFile = File.createTempFile("upload", extensao, outputDir);
            retorno = outputFile.getAbsolutePath();
            OutputStream out = new FileOutputStream(outputFile);
            InputStream in = getContentResolver().openInputStream(selectedFile);

            byte[] buf = new byte[1024];
            int len;
            while ((len = in.read(buf)) > 0) {
                out.write(buf, 0, len);

            }
            out.close();
            in.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return retorno;
    }
}