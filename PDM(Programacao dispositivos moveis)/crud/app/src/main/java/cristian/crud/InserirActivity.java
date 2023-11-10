package cristian.crud;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.SearchView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

public class InserirActivity extends AppCompatActivity {
    AppCompatButton btnGravar, retriveScreen;

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
                    Toast.makeText(getApplicationContext(), "Inserido com sucesso", Toast.LENGTH_LONG).show();
                }
            }
        });
    }


}
