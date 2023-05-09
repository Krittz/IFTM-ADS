package principal;

import java.util.Scanner;
import java.util.ArrayList;

public class GerenciaLivros {
	private int tam;
	private Scanner sc;
	private ArrayList<Livro> vetLivros;
	
	
	public GerenciaLivros(ArrayList<Livro> livros, int tam) {
		vetLivros = livros;
		sc = new Scanner(System.in);
		this.tam = tam;
	}
	
	public void incluir() {
		System.out.println("===***||  Inclusão ||***===");
		
		if(vetLivros.size() <= tam) {
			Livro li = new Livro();
			
			System.out.println("Informe os dados do livro a ser incluído: ");			
			li = cadastrarLivros(li);
			
			vetLivros.add(li);
			System.out.println("Livro incluso com exito");			
			
		}else {
			System.out.println("Erro, não foi possivel incluir novo livro");
		}
	}
	
	public void excluir() {
		 int posicao;
		 System.out.println("===***|| Exclusão ||***====");
		 
		 System.out.println("Informe a posição do livro a ser excluido:");
		 posicao = Integer.parseInt(sc.nextLine());
		 
		 if(confirmaPosicao(posicao, vetLivros)) {
			 vetLivros.remove(posicao);
		 }
		 
		 System.out.println("Livro excluido com sucesso");
	}
	
	public void consultar() {
		int posicao;
		System.out.println("===***|| Consulta ||***===");		
		System.out.println("Informe a posição do livro a ser consultado: ");
		posicao= Integer.parseInt(sc.nextLine());
		
		if(confirmaPosicao(posicao, vetLivros)) {
			
			imprimir(vetLivros.get(posicao));			
		}
	}
	
	public void alterar() {
		int posicao;
		System.out.println("===***|| Alteração ||***===");
		System.out.println("Informe a posição do livro a ser alterado:");
		posicao = Integer.parseInt(sc.nextLine());
		
		if(confirmaPosicao(posicao, vetLivros)) {
			vetLivros.set(posicao,  cadastrarLivros(vetLivros.get(posicao)));
		}		
	}
	
	public void relatorio() {
		System.out.println("===***|| Relatório ||***===");
		
		if(!vetLivros.isEmpty()) {
			for(Livro li : vetLivros) {
				System.out.println("Livro: *" +vetLivros.lastIndexOf(li));
				imprimir(li);
				System.out.println("===***|| ||***===");
			}
		}else {
			System.out.println("Não ha livros");
		}
	}
	
	public void imprimir(Livro livro) {
		System.out.println("Titulo: " +livro.getTitulo());
		System.out.println("Autor: " +livro.getAutor());
		System.out.println("Editora: " +livro.getEditora());
		System.out.println("Ano de publicação: " +livro.getAnoPublicacao());
		System.out.println("Edição: " +livro.getEdicao());
		System.out.println("ISBN: " +livro.getIsbn());	
	}
	
	private Livro cadastrarLivros(Livro li) {
		System.out.println("Titulo: ");
		li.setTitulo(sc.nextLine());
		
		System.out.println("Autor: ");
		li.setAutor(sc.nextLine());
		
		System.out.println("Editora: ");
		li.setEditora(sc.nextLine());
		
		System.out.println("Ano de publicação: ");
		li.setAnoPublicacao(Integer.parseInt(sc.nextLine()));
		
		System.out.println("Edição: ");
		li.setEdicao(Integer.parseInt(sc.nextLine()));
		
		System.out.println("ISBN: ");
		li.setIsbn(sc.nextLine());
		
		return li;					
	}
	
	public boolean confirmaPosicao(int posicao, ArrayList<Livro> vetLivros) {
		int i = 0;
		
		if(posicao < 0 || posicao >= vetLivros.size()) {
			System.out.println("Cadastro não encontrado");
			i++;
		}
		if(vetLivros.isEmpty()){
			System.out.println("Não há livros cadastrados");
			i++;
		}
		if(i == 0) {
			return true;
			
		}else {
			return false;
		}
		
	}
}
