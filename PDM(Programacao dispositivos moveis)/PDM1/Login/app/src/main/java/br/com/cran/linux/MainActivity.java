package br.com.cran.linux;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatEditText;

import android.os.Bundle;
import android.view.View;
import android.widget.ProgressBar;

import com.android.volley.toolbox.JsonObjectRequest;

import org.json.JSONObject;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void showProgress(boolean exibir) {
        ProgressBar pb = findViewById(R.id.progressBar);
        if (exibir) {
            pb.setVisibility(View.VISIBLE);
        } else {
            pb.setVisibility(View.GONE);
        }
    }

    public void cadastrar(View v) {
        showProgress(true);
        AppCompatEditText inputEmail = findViewById(R.id.inputEmail);
        AppCompatEditText inputPassword = findViewById(R.id.inputPassword);
        String url = "http://linux.cran.com.br/controller/LoginController.php";
        JSONObject parametros = new JSONObject();
    }
}