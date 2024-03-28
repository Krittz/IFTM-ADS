package cristian.crud;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.SearchView;
import android.widget.Toast;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatImageView;

public class InserirActivity extends AppCompatActivity {
    AppCompatButton btnGravar, retriveScreen;
    AppCompatImageView btnDelete;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inserir);
        btnGravar = findViewById(R.id.btnGravar);
        retriveScreen = findViewById(R.id.retriveScreen);


        retriveScreen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(InserirActivity.this, MainActivity.class);
                startActivity(i);
            }
        });
        btnGravar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText edtNome = findViewById(R.id.inputNome);
                EditText edtTelefone = findViewById(R.id.inputPhone);
                String nome = edtNome.getText().toString().trim();
                String telefone = edtTelefone.getText().toString().trim();

                Contato c = new Contato(0, nome, telefone);
                DBHelper dbHelper = new DBHelper(getApplicationContext());
                c.setId(dbHelper.inserirContato(c));
                if (c.getId() > 0) {
                   exibe_dialogo();
                }
            }
        });
    }

    private void exibe_dialogo() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);

        builder.setMessage("Adicionado com sucesso!").setTitle("Adicionar contato");

        builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                finish();
            }
        });
        AlertDialog dialog = builder.create();
        dialog.show();

    }


}
