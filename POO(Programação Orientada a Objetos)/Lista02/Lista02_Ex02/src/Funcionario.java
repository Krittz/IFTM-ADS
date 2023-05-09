public class Funcionario {
    private String nome;
    private String cpf;
    private float salario;
    private String identidade;

    private Filho filhos[];

    public Funcionario() {
        this.filhos = new Filho[10];
    }

    public Funcionario(String nome, String cpf, float salario, String identidade) {
        this.nome = nome;
        this.cpf = cpf;
        this.salario = salario;
        this.identidade = identidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public String getIdentidade() {
        return identidade;
    }

    public void setIdentidade(String identidade) {
        this.identidade = identidade;
    }

    public Filho getFilhos(int posicao) {
        Filho f = null;
        if ((posicao >= 0) && (posicao < filhos.length))
            if (filhos[posicao] != null)
                f = filhos[posicao];
        return f;
    }

    public void setFilhos(Filho fi) {
        int i = 0;
        boolean achou = false;
        do {
            if (filhos[i] == null) {
                filhos[i] = fi;
                achou = true;
            }

        } while ((i < filhos.length) && (!achou));
    }

    public Filho[] getFilhos() {
        return filhos;
    }
}