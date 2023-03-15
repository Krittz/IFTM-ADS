import java.util.Scanner;
import krittz.gerenciamento.GerenciamentoLivros;
import krittz.modelos.Livros;

public class Main {

  public static void main(String[] args) throws Exception {

    GerenciamentoLivros gerenciamentoLivros = new GerenciamentoLivros();
    Livros livro = new Livros();
    Scanner sc = new Scanner(System.in);    int opcao = 0;


    do{
      System.out.println("............................................");
      System.out.println(".......:::BIBLIOTECA:::..............");
      System.out.println("............................................");
      System.out.println("1 - Cadastrar Livro");
      System.out.println("2 - Listar Livros");
      System.out.println("3 - Consultar Livros");
      System.out.println("0 - Sair");
      System.out.println("............................................");
      System.out.print("Opção: ");
      opcao = Integer.parseInt(sc.nextLine());

      switch(opcao){
        case 1:
          gerenciamentoLivros.cadastrarLivro();
          break;
        case 2:
          gerenciamentoLivros.listarLivros();
          break;
        case 3:
          gerenciamentoLivros.consultarLivros();
          break;
        case 0:
          System.out.println("...:::Saindo...:::...");
          break;
        default:
          System.out.println("...:::Opção inválida!:::...");
          break;
      }
    }while(opcao != 0);
    sc.close();
  }
}
