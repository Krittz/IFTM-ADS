import java.util.Date;


public class Filho {

    private String nome;
    private String cpf;
    private String numCertNasc;
    private Date dataNascimento;

    public Filho(){

    }

    public Filho(String nome, String cpf, String numCertNasc, Date dataNascimento){
        this.nome = nome;
        this.cpf = cpf;
        this.numCertNasc = numCertNasc;
        this.dataNascimento = dataNascimento;
    }
    

    /**
     * @return String return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return String return the cpf
     */
    public String getCpf() {
        return cpf;
    }

    /**
     * @param cpf the cpf to set
     */
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    /**
     * @return String return the numCertNasc
     */
    public String getNumCertNasc() {
        return numCertNasc;
    }

    /**
     * @param numCertNasc the numCertNasc to set
     */
    public void setNumCertNasc(String numCertNasc) {
        this.numCertNasc = numCertNasc;
    }

    /**
     * @return Date return the dataNascimento
     */
    public Date getDataNascimento() {
        return dataNascimento;
    }

    /**
     * @param dataNascimento the dataNascimento to set
     */
    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

}