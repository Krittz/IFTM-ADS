package krittz.modelos;
import java.util.Objects;

public class Filho {
  private String cpf;
	private String nome;
	private String numCertNasc;
	private int dataNascimento;

  public Filho(){

  }
  public Filho(String cpf, String nome, String numCertNasc, int dataNascimento){
    this.cpf = cpf;
    this.nome = nome;
    this.numCertNasc = numCertNasc;
    this.dataNascimento = dataNascimento;
  }

  public String getCpf() {
    return this.cpf;
  }

  public void setCpf(String cpf) {
    this.cpf = cpf;
  }

  public String getNome() {
    return this.nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getNumCertNasc() {
    return this.numCertNasc;
  }

  public void setNumCertNasc(String numCertNasc) {
    this.numCertNasc = numCertNasc;
  }

  public int getDataNascimento() {
    return this.dataNascimento;
  }

  public void setDataNascimento(int dataNascimento) {
    this.dataNascimento = dataNascimento;
  }

  @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Filho)) {
            return false;
        }
        Filho filho = (Filho) o;
        return Objects.equals(cpf, filho.cpf) && Objects.equals(nome, filho.nome) && Objects.equals(numCertNasc, filho.numCertNasc) && dataNascimento == filho.dataNascimento;
  }


  @Override
  public String toString() {
    return "{" +
      " cpf='" + getCpf() + "'" +
      ", nome='" + getNome() + "'" +
      ", numCertNasc='" + getNumCertNasc() + "'" +
      ", dataNascimento='" + getDataNascimento() + "'" +
      "}";
  }



}