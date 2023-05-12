import java.util.Scanner;

public class App {

  public static void main(String[] args) throws Exception {
    Scanner sc = new Scanner(System.in);
    EstoqueFacade estoque = new EstoqueFacade();
    int op;
    do {
      System.out.println("=== Gerenciamento de Estoque ===");
      System.out.println("1 - Adicionar produto");
      System.out.println("2 - Remover produto");
      System.out.println("3 - Atualizar produto");
      System.out.println("4 - Listar produtos");
      System.out.println("0 - Sair");

      System.out.print("Opção: ");
      op = sc.nextInt();
      sc.nextLine();

      switch (op) {
        case 1:
          System.out.print("Nome do produto: ");
          String nome = sc.nextLine();
          System.out.print("Preço do produto: ");
          double preco = sc.nextDouble();
          System.out.print("Quantidade do produto: ");
          int quantidade = sc.nextInt();
          estoque.adicionarProduto(nome, preco, quantidade);
          System.out.println("Produto adicionado com sucesso!");
          break;
        case 2:
          System.out.print("Nome do produto: ");
          nome = sc.nextLine();
          estoque.removerProduto(nome);
          System.out.println("Produto removido com sucesso!");
          break;
        case 3:
          System.out.print("Nome do produto: ");
          nome = sc.nextLine();
          System.out.print("Preço do produto: ");
          preco = sc.nextDouble();
          System.out.print("Quantidade do produto: ");
          quantidade = sc.nextInt();
          estoque.atualizarProduto(nome, preco, quantidade);
          System.out.println("Produto atualizado com sucesso!");
          break;
        case 4:
          estoque.listarProdutos();
          break;
        default:
          if (op != 0) {
            System.out.println("Opção inválida!");
          }
          break;
      }
      System.out.println();
    } while (op != 0);
    sc.close();
  }
}
