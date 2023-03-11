package br.com.krittz.ficharios;

import br.com.krittz.modelos.Professor;
import java.util.Scanner;
import java.util.ArrayList;

public class FicharioProfessor {
    private Scanner sc = new Scanner(System.in);
    private ArrayList<Professor> professores = new ArrayList<>();

    public FicharioProfessor() {

    }

    public FicharioProfessor(ArrayList<Professor> professores) {
        this.professores = professores;
    }

// ===================CADASTRO DE NOVOS PROFESSORES
    public void cadastrarProfessor() {
        Professor professor = new Professor();

        System.out.println("-----|| Cadastrar Professor ||-----");

        System.out.print("Código: ");
        professor.setCodigo(Integer.parseInt(sc.nextLine()));
        System.out.print("Nome: ");
        professor.setNome(sc.nextLine());
        System.out.print("CPF: ");
        professor.setCpf(sc.nextLine());
        System.out.print("Telefone: ");
        professor.setTelefone(sc.nextLine());
        System.out.print("Email: ");
        professor.setEmail(sc.nextLine());
//VERIFICAR SE O PROFESSOR JÁ ESTÁ CADASTRADO, CASO NÃO, INCLUÍ-LO
        if (professores.contains(professor)) {
            System.out.println("Professor já cadastrado!");
        } else {
            professores.add(professor);
            System.out.println("Professor cadastrado com sucesso!");
        }

    }
// ===================ALTERAR DADOS DE PROFESSORES
    public void alterarProfessor() {
        System.out.println("-----|| Alterar Professor ||-----");
        System.out.println("Informe o código do professor: ");
        int codigo = Integer.parseInt(sc.nextLine());
//PERCORRER A LISTA E VERIFICAR SE O PROFESSOR EXISTE
        for (Professor professor : professores) {
            if (professor.getCodigo() == codigo) {
                System.out.println("Professor: " + professor + " encontrado!");
                System.out.println("Confirma a alteração? (S/N)");
                String opcao = sc.nextLine();
// CONFIRMAR A ALTERAÇÃO
                if (opcao.equalsIgnoreCase("S")) {
                    System.out.println("Informe os novos dados do professor: ");
                    System.out.print("Nome: ");
                    professor.setNome(sc.nextLine());
                    System.out.print("CPF: ");
                    professor.setCpf(sc.nextLine());
                    System.out.print("Telefone: ");
                    professor.setTelefone(sc.nextLine());
                    System.out.print("Email: ");
                    professor.setEmail(sc.nextLine());
                    System.out.println("Professor alterado com sucesso!");
                } else {
                    System.out.println("Alteração cancelada!");
                }
            } else {
                System.out.println("Professor não encontrado!");
            }
        }
    }
// ===================EXCLUIR PROFESSORES
    public void excluirProfessor() {
        System.out.println("-----|| Excluir Professor ||-----");
        System.out.println("Informe o código do professor: ");
        int codigo = Integer.parseInt(sc.nextLine());
//PERCORRER A LISTA E VERIFICAR SE O PROFESSOR EXISTE
        for (Professor professor : professores) {
            if (professor.getCodigo() == codigo) {
                System.out.println("Professor: " + professor + " encontrado!");
                System.out.println("Confirma a exclusão? (S/N)");
                String opcao = sc.nextLine();
// CONFIRMAR A EXCLUSÃO
                if (opcao.equalsIgnoreCase("S")) {
                    professores.remove(professor);
                    System.out.println("Professor excluído com sucesso!");
                } else {
                    System.out.println("Exclusão cancelada!");
                }

            } else {
                System.out.println("Professor não encontrado!");
            }
        }
    }
// ===================CONSULTAR PROFESSORES
    public void consultarProfessor() {
        System.out.println("-----|| Consultar Professor ||-----");
        System.out.println("Informe o código do professor:");

        int codigo = Integer.parseInt(sc.nextLine());
//PERCORRER A LISTA E VERIFICAR SE O PROFESSOR EXISTE, CASO SIM, EXIBIR
        for (Professor professor : professores) {
            if (professor.getCodigo() == codigo) {
                System.out.println("Professor encontrado: ");
                System.out.println(professor);
            } else {
                System.out.println("Professor não encontrado!");
            }
        }

    }
// ===================RELATÓRIO DE PROFESSORES
    public void relatorioProfessor(){
        System.out.println("-----|| Relatório de Professores ||-----");
//PERCORRER A LISTA E EXIBIR OS PROFESSORES
        for (Professor professor : professores) {
            System.out.println(professor);
        }
    }

}
