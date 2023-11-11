package cristian.crud;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    AppCompatButton redirectBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        redirectBtn = (AppCompatButton) findViewById(R.id.redirectCreate);

        redirectBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, InserirActivity.class);
                startActivity(i);            }
        });
    }
    @Override
    protected void onResume(){
        super.onResume();
        loadData();
    }

    private void loadData() {
        DBHelper db = new DBHelper(getApplicationContext());
        List<String> lista = db.getContatos();
        ArrayAdapter<String> adaptador = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, lista);
        ListView lv = findViewById(R.id.listView);
        lv.setAdapter(adaptador);
    }


}