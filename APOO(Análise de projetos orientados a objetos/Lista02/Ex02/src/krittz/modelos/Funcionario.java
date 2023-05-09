package krittz.modelos;

public class Funcionario {
	private String cpf;
	private String nome;
	private float salario;
	private String identidade;
	
	private Filho filhos[];
	
	public Funcionario(){
		this.filhos = new Filho[10];
	}

	public Funcionario(String cpf, String nome, float salario, 
			String identidade) {
		this.cpf = cpf;
		this.nome = nome;
		this.salario = salario;
		this.identidade = identidade;
		this.filhos = new Filho[10];
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
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

	public Filho getFilho(int posicao) {
		Filho f = null;
		
		if((posicao >= 0) && (posicao < filhos.length))
		    if(filhos[posicao] != null)
		    	f = filhos[posicao];
		
		return f;
	}

	public void setFilhos(Filho fi) {
		int i = 0;
		boolean achou = false;
		
		do{
			if(filhos[i] == null){
				filhos[i] = fi;
				achou = true;
			}
			i++;
		}while((i < filhos.length) && (!achou));
	}
	
	public Filho[] getFilhos(){
		return filhos;
	}
}
