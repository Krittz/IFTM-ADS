package cristian.crud;

import android.content.ContentValues;

public class Contato {
    private int id;
    private String nome;
    private String telefone;

   public Contato(){
       this.id = 0;
       this.nome = "";
       this.telefone = "";
   }
    public Contato(int id, String nome, String telefone) {
        this.id = id;
        this.nome = nome;
        this.telefone = telefone;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    public ContentValues getValues(){
       ContentValues values = new ContentValues();
       if(this.id>0)  values.put("id", this.id);
       values.put("nome", this.nome);
       values.put("telefone", this.telefone);
       return  values;
    }
}
