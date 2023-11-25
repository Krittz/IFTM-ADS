package cristian.crud;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatEditText;

public class EditActivity extends AppCompatActivity {
    AppCompatButton btnSalvar;
    AppCompatEditText editNome, editNumero;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit);
        btnSalvar = findViewById(R.id.btnSalvarEdit);
        editNome = findViewById(R.id.editNome);
        editNumero = findViewById(R.id.editNumero);
        Intent i = getIntent();
        int id = i.getIntExtra("ID", 0);
        if (i.hasExtra("ID")) {
            preenche(i.getIntExtra("ID", 0));
        }
        btnSalvar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DBHelper dbHelper = new DBHelper(getApplicationContext());
                String novoNome = editNome.getText().toString().trim();
                String novoNumero = editNumero.getText().toString().trim();
                if (TextUtils.isEmpty(novoNome) && TextUtils.isEmpty(novoNumero)) {
                    finish();
                } else {
                    Contato c = new Contato();
                    c.setId(id);
                    c.setNome(novoNome);
                    c.setTelefone(novoNumero);
                    dbHelper.update(c);
                    finish();
                }
            }
        });

    }

    private void preenche(int id) {

        DBHelper dbHelper = new DBHelper(getApplicationContext());
        Contato c = dbHelper.getContato(id);
        editNome.setText(c.getNome());
        editNumero.setText(c.getTelefone());


    }
}
