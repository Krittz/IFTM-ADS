package br.com.krittz.ficharios;

import br.com.krittz.modelos.Aluno;
import java.util.Scanner;
import java.util.ArrayList;

public class FicharioAluno {
    private Scanner sc = new Scanner(System.in);
    private ArrayList<Aluno> alunos = new ArrayList<>();

    public FicharioAluno(ArrayList<Aluno> alunos) {
        this.alunos = alunos;

    }

    public FicharioAluno() {

    }
// ===================CADASTRO DE NOVOS ALUNOS
    public void cadastrarAluno() {
        
        
        Aluno aluno = new Aluno();

        System.out.println("-----|| Cadastrar Aluno ||-----");
        System.out.print("Matricula: ");
        aluno.setMatricula(sc.nextLine());
        System.out.print("Nome: ");
        aluno.setNome(sc.nextLine());
        System.out.print("CPF: ");
        aluno.setCpf(sc.nextLine());
        System.out.print("Telefone: ");
        aluno.setTelefone(sc.nextLine());
        System.out.print("Email: ");
        aluno.setEmail(sc.nextLine());

//VERIFICAR SE O ALUNO JÁ ESTÁ CADASTRADO, CASO NÃO, INCLUÍ-LO
        if (alunos.contains(aluno)) { 
            System.out.println("Aluno já cadastrado!");
        } else {            
            alunos.add(aluno);
            System.out.println("Aluno cadastrado com sucesso!");
        }
    }
// ===================ALTERAR DADOS DE ALUNOS
    public void alterarAluno() {
        System.out.println("-----|| Alterar Aluno ||-----");
        System.out.println("Informe a matrícula do aluno: ");
        String matricula = sc.nextLine();
        //PERCORRER A LISTA DE ALUNOS BUSCANDO A MATRICULA
        for (Aluno aluno : alunos) {
            if (aluno.getMatricula().equals(matricula)) {
                System.out.println("Aluno encontrado!");
                System.out.println("Informe o novo nome: ");
                aluno.setNome(sc.nextLine());
                System.out.println("Informe o novo CPF: ");
                aluno.setCpf(sc.nextLine());
                System.out.println("Informe o novo telefone: ");
                aluno.setTelefone(sc.nextLine());
                System.out.println("Informe o novo e-mail: ");
                aluno.setEmail(sc.nextLine());
                System.out.println("Aluno alterado com sucesso!");
            } else {
                System.out.println("Aluno não encontrado!");
            }
        }
    }
// ===================EXCLUIR ALUNOS
    public void excluirAluno() {
        System.out.println("-----|| Excluir Aluno ||-----");
        System.out.println("Informe a matrícula do aluno: ");
        String matricula = sc.nextLine();
// PERCORRER A LISTA DE ALUNOS BUSCANDO A MATRICULA
        for (Aluno aluno : alunos) {

            if (aluno.getMatricula().equals(matricula)) {

                System.out.println("Aluno: " + aluno.getNome() + " encontrado!");
                System.out.println("Deseja realmente excluir o aluno? (S/N)");
                String opcao = sc.nextLine();

                if (opcao.equalsIgnoreCase("S")) {//CONFIRMAR A EXCLUSÃO
                    alunos.remove(aluno);
                    System.out.println("Aluno " + aluno.getNome() + " excluído com sucesso!");

                } else {
                    System.out.println("Operação cancelada!");
                }
            } else {
                System.out.println("Aluno não encontrado!");
            }
        }
    }
// ===================CONSULTAR ALUNOS
    public void consultarAluno() {
        System.out.println("-----|| Consultar Aluno ||-----");
        System.out.println("Informe a matrícula do aluno: ");
        String matricula = sc.nextLine();
// PERCORRER A LISTA DE ALUNOS BUSCANDO A MATRICULA
        for (Aluno aluno : alunos) {
            if (aluno.getMatricula().equals(matricula)) {
                System.out.println("Aluno encontrado!");
                System.out.println("Matrícula: " + aluno.getMatricula());
                System.out.println("Nome: " + aluno.getNome());
                System.out.println("CPF: " + aluno.getCpf());
                System.out.println("Telefone: " + aluno.getTelefone());
                System.out.println("E-mail: " + aluno.getEmail());
            } else {
                System.out.println("Aluno não encontrado!");
            }
        }
    }
    
// EXIBIR LISTA DE TODOS OS ALUNOS
    public void relatorioAluno() {
        System.out.println("-----|| Relatório de Alunos ||-----");
// PERCORRER A LISTA DE ALUNOS E EXIBIR
        for(Aluno alunos : alunos){
            System.out.println(alunos);
        }

    }
}
