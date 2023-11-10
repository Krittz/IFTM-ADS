package cristian.crud;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.SearchView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

public class InserirActivity extends AppCompatActivity {
    AppCompatButton btnGravar;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inserir);
        btnGravar = findViewById(R.id.btnGravar);
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
