package br.com.krittz.modelos;

import java.util.Objects;

public class Professor extends Pessoa {
    private int codigo;

    public Professor() {

    }

    public Professor(int codigo, String nome, String cpf, String telefone, String email) {
        this.codigo = codigo;
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
        this.email = email;
    }

    public int getCodigo() {
        return this.codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Professor)) {
            return false;
        }
        Professor professor = (Professor) o;
        return codigo == professor.codigo;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(codigo);
    }

    @Override
    public String toString() {
        return 
        "\n|------------------**-----------------|" +
        "\nCódigo: " + getCodigo() + 
        "\nNome: " + getNome()  +
        "\nCpf: " + getCpf() + 
        "\nTelefone: " + getTelefone() + 
        "\nE-mail: " + getEmail() ;
    }

}
