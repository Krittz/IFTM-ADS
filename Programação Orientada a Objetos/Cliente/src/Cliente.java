public class Cliente {
    private int codigo;
    private String nome;
    private double limiteCredito;
    private boolean ehEspecial;

    public Cliente(){

    }

    public int getCodigo() {
        return this.codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getLimiteCredito() {
        return this.limiteCredito;
    }

    public void setLimiteCredito(double limiteCredito) {
        this.limiteCredito = limiteCredito;
    }

    public boolean isEhEspecial() {
        return this.ehEspecial;
    }

    public boolean getEhEspecial() {
        return this.ehEspecial;
    }

    public void setEhEspecial(boolean ehEspecial) {
        this.ehEspecial = ehEspecial;
    }

}
