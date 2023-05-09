package main;

import br.com.krittz.ficharios.*;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		int op = 0;
		Scanner sc = new Scanner(System.in);
		FicharioAluno ficharioAluno = new FicharioAluno();
		FicharioProfessor ficharioProfessor = new FicharioProfessor();
		FicharioTurma ficharioTurma = new FicharioTurma();
		FicharioEnturmacao ficharioEnturmacao = new FicharioEnturmacao();

		do {

// DESIGUINAR PARA CADA MENU SUBSEQUENTE
			System.out.println("-----|| Menu Princial ||-----");
			System.out.println("1 - Menu aluno");
			System.out.println("2 - Menu professor");
			System.out.println("3 - Menu turmas");
			System.out.println("4 - Menu enturmação");
			System.out.println("5 - Sair");
			System.out.print("Opção: ");

			op = Integer.parseInt(sc.nextLine());

			switch (op) {
				case 1:
					// --------------|| Menu Aluno ||--------------
					int opAluno;
					do {
						System.out.println("-----|| Menu Aluno ||-----");
						System.out.println("1 - Cadastrar Aluno");
						System.out.println("2 - Alterar Aluno");
						System.out.println("3 - Excluir Aluno");
						System.out.println("4 - Consultar Alunos");
						System.out.println("5 - Relatório de Aluno");
						System.out.println("0 - Voltar ao menu principal");
						System.out.print("Opção: ");
						opAluno = Integer.parseInt(sc.nextLine());

						switch (opAluno) {

							case 1:
								ficharioAluno.cadastrarAluno();
								break;
							case 2:
								ficharioAluno.alterarAluno();
								break;
							case 3:
								ficharioAluno.excluirAluno();
								break;
							case 4:
								ficharioAluno.consultarAluno();
								break;

							case 5:
								ficharioAluno.relatorioAluno();
								break;
							case 0:
								System.out.println("Voltando ao menu principal...");
								break;
							default:
								if (opAluno != 0) {
									System.out.println("Opção inválida!");
								}
						}

					} while (opAluno != 0);
					break;

				case 2:
					int opProfessor;
					do {
						System.out.println("-----|| Menu Professor ||-----");
						System.out.println("1 - Cadastrar Professor");
						System.out.println("2 - Alterar Professor");
						System.out.println("3 - Excluir Professor");
						System.out.println("4 - Consultar Professor");
						System.out.println("5 - Relatório de Professor");
						System.out.println("0 - Voltar ao menu principal");
						System.out.print("Opção: ");
						opProfessor = Integer.parseInt(sc.nextLine());

						switch (opProfessor) {
							case 1:
								ficharioProfessor.cadastrarProfessor();
								break;
							case 2:
								ficharioProfessor.alterarProfessor();
								break;
							case 3:
								ficharioProfessor.excluirProfessor();
								break;
							case 4:
								ficharioProfessor.consultarProfessor();
								break;
							case 5:
								ficharioProfessor.relatorioProfessor();
								break;
							case 0:
								System.out.println("Voltando ao menu principal...");
								break;
							default:
								if (opProfessor != 0) {
									System.out.println("Opção inválida!");
								}
						}
						opProfessor = Integer.parseInt(sc.nextLine());
					} while (opProfessor != 0);

					break;
				case 3:
					System.out.println("-----|| Menu Turmas ||-----");
					int opTurmas;
					do {
						System.out.println("1 - Cadastrar turma");
						System.out.println("2 - Alterar turma");
						System.out.println("3 - Excluir turma");
						System.out.println("4 - Consultar turma");
						System.out.println("5 - Relatório de turmas");
						System.out.println("0 - Retornar ao menu principal");
						opTurmas = Integer.parseInt(sc.nextLine());
						switch (opTurmas) {
							case 1:
								ficharioTurma.cadastrarTurma();
								break;
							case 2:
								ficharioTurma.alterarTurma();
								break;
							case 3:
								ficharioTurma.excluirTurma();
								break;
							case 4:
								ficharioTurma.consultaTurma();
								break;
							case 5:
								ficharioTurma.relatrioTurma();
								break;
							default:
								if (opTurmas != 0) {
									System.out.println("Opção inválida!");
								}
						}
					} while (opTurmas != 0);

					break;
				case 4:
					System.out.println("-----|| Menu Enturmação ||-----");
					int opEnturmacao;
					do {
						System.out.println("1 - Cadastrar turma");
						System.out.println("2 - Alterar turma");
						System.out.println("3 - Excluir turma");
						System.out.println("4 - Consultar turma");
						System.out.println("5 - Relatório de turmas");
						System.out.println("0 - Retornar ao menu principal");
						opEnturmacao = Integer.parseInt(sc.nextLine());
						switch (opEnturmacao) {
							case 1:
								ficharioEnturmacao.enturmar();
								break;
							case 2:
								ficharioEnturmacao.desenturmar();
								break;
							case 3:
								ficharioEnturmacao.consultar();
								break;
							case 4:
								ficharioEnturmacao.listar();
								break;
							default:
								if (opEnturmacao != 0) {
									System.out.println("Opção inválida!");
								}
						}
					} while (opEnturmacao != 0);
					break;
				case 0:
					System.out.println("Saindo...");
					break;
				default:
					if (op != 5) {
						System.out.println("Opção inválida!");
					}

			}

		} while (op != 5);
		sc.close();
	}

}
