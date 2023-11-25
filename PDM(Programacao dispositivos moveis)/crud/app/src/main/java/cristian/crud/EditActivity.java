package cristian.crud;

import android.content.Intent;
import android.os.Bundle;

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
        if (i.hasExtra("ID")) {
            preenche(i.getIntExtra("ID", 0));
        }

    }

    private void preenche(int id) {
        
    }
}
