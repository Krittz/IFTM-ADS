package br.com.krittz.modelos;

public class Pessoa {
    protected String nome;
    protected String cpf;
    protected String telefone;
    protected String email;

    public Pessoa(){

    }
    public Pessoa(String nome, String cpf, String telefone, String email){
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
        this.email = email;
    }

   
    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return this.cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getTelefone() {
        return this.telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Pessoa nome(String nome) {
        setNome(nome);
        return this;
    }

    public Pessoa cpf(String cpf) {
        setCpf(cpf);
        return this;
    }

    public Pessoa telefone(String telefone) {
        setTelefone(telefone);
        return this;
    }

    public Pessoa email(String email) {
        setEmail(email);
        return this;
    }


}
