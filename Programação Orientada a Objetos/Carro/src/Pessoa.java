public class Pessoa {

  private String nome;
  private int idade;
  private boolean habilitado;
  private boolean possuiVeiculo;
  private long cnh;

  public Pessoa(String nome, int idade, boolean habilitado, long cnh) {
    this.nome = nome;
    this.idade = idade;
    this.habilitado = habilitado;
    this.cnh = cnh;
  }

  public Pessoa() {
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public int getIdade() {
    return idade;
  }

  public void setIdade(int idade) {
    this.idade = idade;
  }

  public boolean ishabilitado() {
    return habilitado;
  }

  public void sethabilitado(boolean habilitado) {
    this.habilitado = habilitado;
  }

  public long getCnh() {
    return cnh;
  }

  public void setCnh(long cnh) {
    this.cnh = cnh;
  }

  public boolean isHabilitado() {
    return habilitado;
  }

  public void setHabilitado(boolean habilitado) {
    this.habilitado = habilitado;
  }

  public boolean isPossuiVeiculo() {
    return possuiVeiculo;
  }

  public void setPossuiVeiculo(boolean possuiVeiculo) {
    this.possuiVeiculo = possuiVeiculo;
  }

}
