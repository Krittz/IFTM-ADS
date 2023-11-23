package cristian.crud;

import android.content.Context;
import android.content.DialogInterface;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;

import java.util.List;

public class AdapterContato extends BaseAdapter {
    List<Contato> dados;
    LayoutInflater inflater;
    Context contexto;

    public AdapterContato(List<Contato> dados, Context _contexto) {
        this.contexto = _contexto;
        this.dados = dados;
        this.inflater = LayoutInflater.from(_contexto);
    }

    @Override
    public int getCount() {
        return dados.size();
    }

    @Override
    public Object getItem(int i) {
        return dados.get(i);
    }

    @Override
    public long getItemId(int i) {
        return dados.get(i).getId();
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = inflater.inflate(R.layout.item_contato, null);
        }
        Contato c = dados.get(i);
        final AppCompatTextView tvNome = view.findViewById(R.id.tvNome);
        final AppCompatTextView tvNumero = view.findViewById(R.id.tvNumero);

        tvNome.setText(c.getNome());
        tvNumero.setText(c.getTelefone());

        AppCompatImageView btnDelete = (view.findViewById(R.id.btnDelete));
        btnDelete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                exibe_dialogo_apagar(c.getId());
            }
        });
        return view;
    }

    private void exibe_dialogo_apagar(int _id) {
        AlertDialog.Builder builder = new AlertDialog.Builder(contexto);
        builder.setPositiveButton("Sim", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int wich) {
                apagar(_id);
            }
        });
        builder.setMessage("Realmente apagar?").setTitle("Apagar");
        AlertDialog dialog = builder.create();
        dialog.show();
    }

    public void apagar(int id) {
        Log.d("Apagar", "id = " + id);
        DBHelper dbh = new DBHelper(contexto);
        dbh.delete(id);
    }


}
