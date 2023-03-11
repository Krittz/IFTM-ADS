package br.com.krittz.modelos;

import java.util.Objects;
public class Aluno extends Pessoa{

private String matricula;

    public Aluno() {
    }

    public Aluno(String matricula, String nome, String cpf, String telefone, String email) {
        this.matricula = matricula;
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
        this.email = email;
    }

    public String getMatricula() {
        return this.matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }


    @Override
    public String toString() {
        return 
            "\n|------------------**-----------------|" +
            "\nMatricula: " + getMatricula() + 
            "\nNome: " + getNome()  +
            "\nCpf: " + getCpf() + 
            "\nTelefone: " + getTelefone() + 
            "\nE-mail: " + getEmail() ;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Aluno)) {
            return false;
        }
        Aluno aluno = (Aluno) o;
        return Objects.equals(matricula, aluno.matricula);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(matricula);
    }
    

}
