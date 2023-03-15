package krittz.modelos;

import java.util.Objects;

public class Livros {
    private int isbn;
    private String titulo;
    private String autor;
    private String editora;
    private int ano;

    public Livros() {
    }

    public Livros(int isbn, String titulo, String autor, String editora, int ano) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
        this.editora = editora;
        this.ano = ano;
    }

    public int getIsbn() {
        return this.isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public String getTitulo() {
        return this.titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return this.autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getEditora() {
        return this.editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public int getAno() {
        return this.ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public Livros isbn(int isbn) {
        setIsbn(isbn);
        return this;
    }

    public Livros titulo(String titulo) {
        setTitulo(titulo);
        return this;
    }

    public Livros autor(String autor) {
        setAutor(autor);
        return this;
    }

    public Livros editora(String editora) {
        setEditora(editora);
        return this;
    }

    public Livros ano(int ano) {
        setAno(ano);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Livros)) {
            return false;
        }
        Livros livros = (Livros) o;
        return isbn == livros.isbn && Objects.equals(titulo, livros.titulo) && Objects.equals(autor, livros.autor) && Objects.equals(editora, livros.editora) && ano == livros.ano;
    }



    @Override
    public String toString() {
        return "{" +
            " isbn='" + getIsbn() + "'" +
            ", titulo='" + getTitulo() + "'" +
            ", autor='" + getAutor() + "'" +
            ", editora='" + getEditora() + "'" +
            ", ano='" + getAno() + "'" +
            "}";
    }


}