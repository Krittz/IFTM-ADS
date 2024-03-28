package cristian.adaptadores;

import android.content.Context;
import android.content.res.XmlResourceParser;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import org.xmlpull.v1.XmlPullParserException;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private List<String> diasDaSemana;
    private ArrayAdapter<String> listAdapter;
    private ArrayAdapter<String> listNovaAdapter;
    private List<String> filmes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Carregar dias da semana na Spinner e ListView
        diasDaSemana = carregarDiasDaSemana();
        listAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, diasDaSemana);

        Spinner spinner = findViewById(R.id.spinner);
        ArrayAdapter<String> spinnerAdapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, diasDaSemana);
        spinnerAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(spinnerAdapter);

        ListView listView = findViewById(R.id.listView);
        listView.setAdapter(listAdapter);

        // Adicionar evento OnItemClick à Spinner
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parentView, View selectedItemView, int position, long id) {
                String selectedItem = (String) parentView.getItemAtPosition(position);
                exibirToast("Item selecionado na Spinner: " + selectedItem);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parentView) {
                // Faz alguma coisa se nada estiver selecionado
            }
        });

        // Adicionar evento OnItemClick à ListView
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String selectedItem = (String) parent.getItemAtPosition(position);
                exibirToast("Item selecionado na ListView: " + selectedItem);
            }
        });

        // Adicionar novo item à lista ao clicar no botão
        Button btnOk = findViewById(R.id.btnOk);
        btnOk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                adicionarNovoItem();
            }
        });

        // Configurar a nova ListView
        ListView listNova = findViewById(R.id.listNova);
        filmes = new ArrayList<>();
        listNovaAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, filmes);
        listNova.setAdapter(listNovaAdapter);



        listNova.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                excluirItem(position);
            }
        });
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        // Salvar filmes quando a atividade for destruída (pode ser ajustado conforme necessário)
        salvarFilmesEmXML(filmes);
    }

    private List<String> carregarDiasDaSemana() {
        List<String> diasDaSemana = new ArrayList<>();

        try {
            XmlResourceParser parser = getResources().getXml(R.xml.semana);

            while (parser.getEventType() != XmlResourceParser.END_DOCUMENT) {
                if (parser.getEventType() == XmlResourceParser.START_TAG) {
                    if (parser.getName().equals("dia")) {
                        parser.next(); // Move para o conteúdo dentro da tag <dia>
                        diasDaSemana.add(parser.getText());
                    }
                }
                parser.next();
            }

            parser.close();

        } catch (IOException | XmlPullParserException e) {
            e.printStackTrace();
        }

        return diasDaSemana;
    }

    private void exibirToast(String mensagem) {
        Toast.makeText(this, mensagem, Toast.LENGTH_SHORT).show();
    }

    private void adicionarNovoItem() {
        EditText inputNew = findViewById(R.id.inputNew);
        String novoItem = inputNew.getText().toString().trim();

        if (!novoItem.isEmpty()) {
            filmes.add(novoItem);
            listNovaAdapter.notifyDataSetChanged(); // Comunicar a mudança
            inputNew.setText("");
        } else {
            exibirToast("Digite um novo item primeiro.");
        }
    }

    private void salvarFilmesEmXML(List<String> filmes) {
        try {
            FileOutputStream fileOutputStream = openFileOutput("filmes.xml", Context.MODE_PRIVATE);
            OutputStreamWriter writer = new OutputStreamWriter(fileOutputStream);

            writer.write("<?xml version=\"1.0\" encoding=\"utf-8\"?>\n");
            writer.write("<filmes>\n");

            for (String filme : filmes) {
                writer.write("    <filme>" + filme + "</filme>\n");
            }

            writer.write("</filmes>");
            writer.close();

            exibirToast("Filmes salvos com sucesso!");

        } catch (IOException e) {
            e.printStackTrace();
            exibirToast("Erro ao salvar filmes.");
        }
    }
    private void excluirItem(int position) {
        if (position >= 0 && position < filmes.size()) {
            filmes.remove(position);
            listNovaAdapter.notifyDataSetChanged(); // Comunicar a mudança
            exibirToast("Item excluído com sucesso.");
        }
    }

}
