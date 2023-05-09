package principal;

public class Livro {
	private String titulo;
	private String editora;
	private String autor;
	private String isbn;
	private int anoPublicacao;
	private int edicao;
	
	public Livro() {
		
	}
	
	public Livro(String titulo, String editora, String autor, String isbn, int anoPublicacao, int edicao) {
		this.autor = autor;
		this.editora = editora;
		this.isbn = isbn;
		this.titulo = titulo;
		this.anoPublicacao = anoPublicacao;
		this.edicao = edicao;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getEditora() {
		return editora;
	}

	public void setEditora(String editora) {
		this.editora = editora;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public int getAnoPublicacao() {
		return anoPublicacao;
	}

	public void setAnoPublicacao(int anoPublicacao) {
		this.anoPublicacao = anoPublicacao;
	}

	public int getEdicao() {
		return edicao;
	}

	public void setEdicao(int edicao) {
		this.edicao = edicao;
	}
}
