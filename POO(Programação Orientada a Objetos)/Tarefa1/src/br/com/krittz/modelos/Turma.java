package br.com.krittz.modelos;
import java.util.Objects;
public class Turma {
    private String codigo;
    private String nome;
    private Aluno[] alunosTurma;

    public Turma(){

    }
    public Turma(String codigo, String nome, Aluno[] alunosTurma) {
        this.codigo = codigo;
        this.nome = nome;
        this.alunosTurma = alunosTurma;
    }

    public String getCodigo() {
        return this.codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


    public Aluno[] getAlunosTurma() {
        return this.alunosTurma;
    }
    public void setAlunosTurma(Aluno[] alunosTurma) {
        this.alunosTurma = alunosTurma;
    }
    @Override
    public String toString() {
        return "{" +
            " codigo='" + getCodigo() + "'" +
            ", nome='" + getNome() + "'" +
            ", alunosTurma='" + getAlunosTurma() + "'" +
            "}";
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Turma)) {
            return false;
        }
        Turma turma = (Turma) o;
        return Objects.equals(codigo, turma.codigo) && Objects.equals(nome, turma.nome) && Objects.equals(alunosTurma, turma.alunosTurma);
    }

    @Override
    public int hashCode() {
        return Objects.hash(codigo, nome, alunosTurma);
    }
    

}
