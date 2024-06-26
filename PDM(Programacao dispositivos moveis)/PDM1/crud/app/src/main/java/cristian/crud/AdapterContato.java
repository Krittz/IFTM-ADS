package cristian.crud;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.widget.AppCompatImageButton;
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
        AppCompatImageButton btnEdit = (view.findViewById(R.id.btnEditar));
        btnDelete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                exibe_dialogo_apagar(c.getId(), view);
            }
        });
        btnEdit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("IFTM", "Editar");
                Intent i = new Intent(view.getRootView().getContext(), EditActivity.class);
                i.putExtra("ID", c.getId());
                i.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                view.getRootView().getContext().startActivity(i);
            }
        });
        return view;
    }

    private void exibe_dialogo_apagar(int _id, View view) {
        AlertDialog.Builder builder = new AlertDialog.Builder(view.getRootView().getContext());
        builder.setPositiveButton("Sim", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int which) {
                apagar(_id);
            }
        });

        builder.setNegativeButton("Não", null);
        builder.setMessage("Realmente apagar?").setTitle("Apagar");
        AlertDialog dialog = builder.create();
        dialog.show();


    }

    public void apagar(int id) {
        Log.d("Apagar", "id = " + id);
        DBHelper dbh = new DBHelper(contexto);
        dbh.delete(id);
        for (int i = 0; i < dados.size(); i++) {
            if (dados.get(i).getId() == id) {
                dados.remove(i);
                break;
            }
        }
        notifyDataSetChanged();
    }


}
