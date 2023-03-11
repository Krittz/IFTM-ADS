package br.com.krittz.modelos;

import java.time.LocalDate;
import java.util.Objects;

public class Enturmacao {
    private String codigo;
    private Turma turma;
    private Aluno aluno;
    private  LocalDate dataEnturmacao;
    public Enturmacao() {

    }

    public Enturmacao(String codigo, Turma turma, Aluno aluno, LocalDate dataEnturmacao) {
        this.codigo = codigo;
        this.turma = turma;
        this.aluno = aluno;
        this.dataEnturmacao = dataEnturmacao;

    }

    public String getCodigo() {
        return this.codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public Turma getTurma() {
        return this.turma;
    }

    public void setTurma(Turma turma) {
        this.turma = turma;
    }

    public Aluno getAluno() {
        return this.aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }
    public LocalDate getDataEnturmacao() {
        return dataEnturmacao;
    }

    
    public void setDataEnturmacao(LocalDate dataEnturmacao) {
        this.dataEnturmacao = dataEnturmacao;
    }

    @Override
    public String toString() {
        return "{" +
                " codigo='" + getCodigo() + "'" +
                ", turma='" + getTurma() + "'" +
                ", aluno='" + getAluno() + "'" +
                ", dataEnturmacao='" + getDataEnturmacao() + "'" +
                "}";
    }
   
    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Enturmacao)) {
            return false;
        }
        Enturmacao enturmacao = (Enturmacao) o;
        return codigo == enturmacao.codigo && Objects.equals(turma, enturmacao.turma) && Objects.equals(aluno, enturmacao.aluno);
    }

    @Override
    public int hashCode() {
        return Objects.hash(codigo, turma, aluno);
    }

   


}
