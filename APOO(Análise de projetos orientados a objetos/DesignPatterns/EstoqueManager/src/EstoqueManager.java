import java.util.ArrayList;
import java.util.List;

public class EstoqueManager {

  private List<Produto> produtos;

  public EstoqueManager(){}

  public EstoqueManager(List<Produto> produtos) {
    this.produtos = new ArrayList<>();
  }

  // Recebe um objeto Produto e adiciona à lista de produtos
  public void adicionarProduto(Produto produto) {
    this.produtos = new ArrayList<>();
    this.produtos.add(produto);
  }

    // Recebe o nome de um produto e o remove da lista de produtos
  public void removerProduto(String nome) {
    this.produtos.removeIf(produto -> produto.getNome().equals(nome));
  }

  // Recebe o nome de um produto e atualiza seu preço e quantidade
  public void atualizarProduto(String nome, double preco, int quantidade) {
    for (Produto produto : this.produtos) {
      if (produto.getNome().equals(nome)) {
        produto.setPreco(preco);
        produto.setQuantidade(quantidade);
        break;
      }
    }
  }

    // Lista todos os produtos cadastrados
  public void listarProdutos() {
    for (Produto produto : this.produtos) {
      System.out.printf(
        "%s - R$%.2f (%d unidades)%n",
        produto.getNome(),
        produto.getPreco(),
        produto.getQuantidade()
      );
    }
  }
}
