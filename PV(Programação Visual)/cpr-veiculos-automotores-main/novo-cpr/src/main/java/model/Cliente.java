package model;

/**
 *
 * @author crist
 */
public class Cliente {

    private int codigo;
    private String nome;
    private String cnh;
    private String email;
    private String telefone;

    public Cliente() {

    }

    public Cliente(int codigo, String nome, String cnh, String email, String telefone) {
        this.codigo = codigo;
        this.nome = nome;
        this.cnh = cnh;
        this.email = email;
        this.telefone = telefone;
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

    public String getCnh() {
        return this.cnh;
    }

    public void setCnh(String cnh) {
        this.cnh = cnh;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return this.telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

}
