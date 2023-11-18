package cristian.crud;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Toast;

import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;

import java.util.List;

public class AdapterContato extends BaseAdapter {
    List<Contato> dados;
    LayoutInflater inflater;

    public AdapterContato(List<Contato> dados, Context contexto) {
        this.dados = dados;
        this.inflater = LayoutInflater.from(contexto);
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
        if(view == null){
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
                Log.d("Apagar", "id = " + c.getId());
            }
        });
    return view;
    }

}
