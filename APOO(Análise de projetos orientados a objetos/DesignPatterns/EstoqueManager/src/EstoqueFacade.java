    public class EstoqueFacade {

    private EstoqueManager estoqueManager;

    public EstoqueFacade() {
        this.estoqueManager = new EstoqueManager();
    }

    // Cria um novo objeto Produto com os parâmetros informados e adiciona à lista de produtos
    // do estoque através do método adicionarProduto() da classe EstoqueManager;
    public void adicionarProduto(String nome, double preco, int quantidade) {
        Produto produto = new Produto(nome, preco, quantidade);
        this.estoqueManager.adicionarProduto(produto);
    }

    // Remove um produto da lista de produtos do estoque com base no nome informado 
    // como parâmetro através do método removerProduto() da classe EstoqueManager
    public void removerProduto(String nome) {
        this.estoqueManager.removerProduto(nome);
    }

    // Atualiza o preço e a quantidade de um produto na lista de produtos do estoque 
    // com base no nome informado como parâmetro através do método atualizarProduto() da classe EstoqueManager
    public void atualizarProduto(String nome, double preco, int quantidade) {
        this.estoqueManager.atualizarProduto(nome, preco, quantidade);
    }
    // Exibe na tela uma lista dos produtos do estoque através do método listarProdutos() da classe EstoqueManager
    public void listarProdutos() {
        this.estoqueManager.listarProdutos();
    }
    }
