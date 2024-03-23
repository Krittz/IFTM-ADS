package br.com.cran.uploaddearquivos;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ProgressBar;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import okhttp3.MediaType;
import okhttp3.RequestBody;

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
            Uri selectedfile = data.getData();
            String arquivo = tempfile(selectedfile);
            upload(arquivo);
        }
    }

    private String tempfile(Uri contentUri) {
        String retorno = "";
        try {
            String extensao = "." + getContentResolver().getType(contentUri).split("/")[1];
            File outputDir = getCacheDir();
            File outputFile = File.createTempFile("upload", extensao, outputDir);
            retorno = outputFile.getAbsolutePath();
            OutputStream out = new FileOutputStream(outputFile);
            InputStream in = getContentResolver().openInputStream(contentUri);

            byte[] buf = new byte[1024];
            int len;
            while ((len = in.read(buf)) > 0) {
                out.write(buf, 0, len);
            }
            out.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return retorno;
    }

    public void upload(String arquivo) {
        ProgressBar pb = findViewById(R.id.progresso);
        pb.setVisibility(View.VISIBLE);
        File file = new File(arquivo);
        RequestBody requestBody = RequestBody.create(MediaType.parse("*/*"), file);
    }
}