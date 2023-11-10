package cristian.crud;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import androidx.annotation.Nullable;

public class DBHelper extends SQLiteOpenHelper {

    public static final String NOME="contatos";
    public static final int VERSAO = 1;

    public DBHelper(Context contexto){
        super(contexto, NOME, null, VERSAO);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String query = "CREATE TABLE contatos ("+
                "id         INTEGER PRIMARY KEY," +
                "nome       VARCHAR(255), " +
                "telefone   VARCHAR(16))";
        db.execSQL(query);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int old, int newv) {
        Log.d("IFTM", "old = " + old);
        Log.d("IFTM", "new = " + newv);
        String query = "DROP TABLE IF EXISTS contatos";
        db.execSQL(query);
        onCreate(db);
    }
    public int inserirContato(Contato c){
        SQLiteDatabase db = getWritableDatabase();
        long id = db.insert("contatos", null, c.getValues());
        Log.d("IFTM", "Inserido o contato id: " + id);

        return  (int) id;
    }
}
