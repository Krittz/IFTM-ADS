package krittz.gerenciamento;

import java.util.ArrayList;
import java.util.Scanner;
import krittz.modelos.Livros;

public class GerenciamentoLivros {

  private ArrayList<Livros> livros = new ArrayList<Livros>();
  private Scanner sc = new Scanner(System.in);

  public GerenciamentoLivros() {}

  public GerenciamentoLivros(ArrayList<Livros> livros) {
    this.livros = livros;
  }

  public void cadastrarLivro() {
    Livros livro = new Livros();
    System.out.println("............................................");
    System.out.println(".......:::CADASTRO DE LIVROS:::..............");
    System.out.println("............................................");

    System.out.print("ISBN: ");
    livro.setIsbn(Integer.parseInt(sc.nextLine()));
    System.out.println("Título: ");
    livro.setTitulo(sc.nextLine());
    System.out.println("Autor: ");
    livro.setAutor(sc.nextLine());
    System.out.println("Editora: ");
    livro.setEditora(sc.nextLine());
    System.out.println("Ano: ");
    livro.setAno(Integer.parseInt(sc.nextLine()));

    if (livros.contains(livro)) {
      System.out.println("...:::Livro já cadastrado! :::...");
      return;
    } else {
      livros.add(livro);
      System.out.println("...:::Livro cadastrado com sucesso!:::...");
      return;
    }
  }

  public void listarLivros() {
    System.out.println("............................................");
    System.out.println(".......:::LISTA DE LIVROS:::..............");
    System.out.println("............................................");
    if (livros.isEmpty()) {
      System.out.println("...:::Não há livros cadastrados! :::...");
      return;
    } else {
      for (Livros livro : livros) {
        System.out.println(livro);
      }
      return;
    }
  }

  public void consultarLivros() {
    System.out.println("............................................");
    System.out.println(".......:::CONSULTA DE LIVROS:::..............");
    System.out.println("............................................");
    if (livros.isEmpty()) {
      System.out.println("...:::Não há livros cadastrados! :::...");
      return;
    } else {
      System.out.println("Digite o ISBN do livro: ");
      int isbn = Integer.parseInt(sc.nextLine());
      for (Livros livro : livros) {
        if (livro.getIsbn() == isbn) {
          System.out.println(livro);
          return;
        } else {
          System.out.println("...:::Livro não encontrado! :::...");
          return;
        }
      }
    }
  }

  public void alterarLivros() {
    System.out.println("............................................");
    System.out.println(".......:::ALTERAÇÃO DE LIVROS:::..............");
    System.out.println("............................................");
    if (livros.isEmpty()) {
      System.out.println("...:::Não há livros cadastrados! :::...");
    } else {
      System.out.println("Digite o ISBN do livro: ");
      int isbn = Integer.parseInt(sc.nextLine());
      for (Livros livro : livros) {
        if (livro.getIsbn() == isbn) {
          System.out.println("Título: ");
          livro.setTitulo(sc.nextLine());
          System.out.println("Autor: ");
          livro.setAutor(sc.nextLine());
          System.out.println("Editora: ");
          livro.setEditora(sc.nextLine());
          System.out.println("Ano: ");
          livro.setAno(Integer.parseInt(sc.nextLine()));
          System.out.println("...:::Livro alterado com sucesso! :::...");
          return;
        } else {
          System.out.println("...:::Livro não encontrado! :::...");
          return;
        }
      }
    }
  }

  public void excluirLivros() {
    System.out.println("............................................");
    System.out.println(".......:::EXCLUSÃO DE LIVROS:::..............");
    System.out.println("............................................");
    if (livros.isEmpty()) {
      System.out.println("...:::Não há livros cadastrados! :::...");
    } else {
      System.out.println("Digite o ISBN do livro: ");
      int isbn = Integer.parseInt(sc.nextLine());
      for (Livros livro : livros) {
        if (livro.getIsbn() == isbn) {
          livros.remove(livro);
          System.out.println("...:::Livro excluído com sucesso! :::...");
          return;
        } else {
          System.out.println("...:::Livro não encontrado! :::...");
          return;
        }
      }
    }
  }
}
