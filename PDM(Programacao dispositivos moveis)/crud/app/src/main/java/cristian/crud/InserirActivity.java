package cristian.crud;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class InserirActivity extends AppCompatActivity {
    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inserir);
    }
    public void adicionar(View view){
        EditText edtNome = findViewById();
        EditText edtTelefone = findViewById();
        String nome = edtNome.getText().toString().trim();
        String telefone = edtTelefone.getText().toString().trim();

        Contato c = new Contato (0, nome, telefone);
        DBHelper dbHelper = new DBHelper(getApplicationContext());
        c.setId(dbHelper.inserirContato(c));
        if(c.getId() >0){
            Toast.makeText(getApplicationContext(), "Inserido com sucesso", Toast.LENGTH_LONG).show();
        }
    }
}
