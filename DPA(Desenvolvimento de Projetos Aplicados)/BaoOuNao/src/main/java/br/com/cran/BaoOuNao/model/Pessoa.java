package br.com.cran.BaoOuNao.model;

import java.time.LocalDate;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class Pessoa {
    private String cpf;
    private String nome;
    private String telefone;
    private String email;
    private LocalDate dataNascimento;

    public Pessoa() {
    }

    public Pessoa(String cpf, String nome, String telefone, String email, LocalDate dataNascimento) {
        this.cpf = cpf;
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
        this.dataNascimento = dataNascimento;
    }
}