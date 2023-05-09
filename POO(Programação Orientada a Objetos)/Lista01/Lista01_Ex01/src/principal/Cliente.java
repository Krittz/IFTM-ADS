package principal;

public class Cliente {
	private int codigo;
	private String nome;
	private boolean eClienteEspecial;
	private double limiteCredito;

	public Cliente() {

	}

	

	public Cliente(int c, String n) {
		codigo = c;
		nome = n;
		limiteCredito = 0;
		eClienteEspecial = false;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public boolean iseClienteEspecial() {
		return eClienteEspecial;
	}

	public void seteClienteEspecial(boolean eClienteEspecial) {
		this.eClienteEspecial = eClienteEspecial;
	}

	public double getLimiteCredito() {
		return limiteCredito;
	}

	public void setLimiteCredito(double limiteCredito) {
		this.limiteCredito = limiteCredito;
	}

}
