package br.com.krittz.ficharios;

import br.com.krittz.modelos.Turma;

import java.util.Scanner;
import java.util.ArrayList;

public class FicharioTurma {
  private Scanner sc = new Scanner(System.in);
  private ArrayList<Turma> turmas = new ArrayList<Turma>();

  public FicharioTurma() {

  }

  public FicharioTurma(ArrayList<Turma> turmas) {
    this.turmas = turmas;
  }
// ===================CADASTRO DE NOVAS TURMAS
  public void cadastrarTurma() {
    Turma turma = new Turma();
    System.out.println("-----|| Cadastrar ||-----");
    System.out.println("Informe o nome da turma: ");
    turma.setNome(sc.nextLine());
    System.out.println("Informe o código da turma: ");
    turma.setCodigo(sc.nextLine());
// VERIFICAR SE A TURMA JÁ ESTÁ CADASTRADA
    if (turmas.contains(turma)) {
      System.out.println("Turma já cadastrada!");
    } else {
      turmas.add(turma);
      System.out.println("Turma cadastrada com sucesso!");
    }
  }
// ===================ALTERAR DADOS DE TURMAS
  public void alterarTurma() {
    System.out.println("-----|| Alterar Turma||-----");
    System.out.println("Informe o código da turma: ");
    String codigo = sc.nextLine();

// PERCORRER LISTA E VERIFICAR SE A TURMA EXISTE
    for (Turma turma : turmas) {
      if (turma.getCodigo().equals(codigo)) {
        System.out.println("Turma encontrada: ");
        System.out.println(turma);
// CONFIRMAR A TURMA A SER ALTERADA
        System.out.println("Confirma alteração: (S/N)");
        String opcao = sc.nextLine();
        if (opcao.equalsIgnoreCase("S")) {
// CASO SIM, ALTERAR OS DADOS
          System.out.println("Informe o novo nome da turma:");
          turma.setNome(sc.nextLine());
          System.out.println("Turma alterada com sucesso!");
        } else {
          System.out.println("Alteração cancelada!");
        }
      } else {
        System.out.println("Turma não encontrada!");
      }
    }
  }
// ===================CONSULTAR TURMAS
  public void consultaTurma() {
    System.out.println("-----||Consulta Tumra ||-----");
    System.out.println("Digite o codigo da turma: ");
    String codigo = sc.nextLine();
// PERCORRER LISTA E VERIFICAR SE A TURMA EXISTE, CASO SIM, IMPRIMIR
    for (Turma turma : turmas) {
      if (turma.getCodigo().equals(codigo)) {
        System.out.println(turmas);
      } else {
        System.out.println("Turma não encontrada!");
      }
    }
  }
// ===================EXCLUIR TURMAS
  public void excluirTurma() {
    System.out.println("-----|| Exclusão de Turma ||-----");
    System.out.println("Informe o codigo da turma: ");
    String codigo = sc.nextLine();
// PERCORRER LISTA E VERIFICAR SE A TURMA EXISTE, CASO SIM, CONFIRMAR
    for (Turma turma : turmas) {
      if (turma.getCodigo().equals(codigo)) {
        System.out.println("Turma encontrada: ");
        System.out.println(turma);
// CONFIRMAR A EXCLUSÃO, CASO SIM, EXCLUIR
        System.out.println("Confirma exclusão S/N");
        String opcao = sc.nextLine();
        if (opcao.equalsIgnoreCase("S")) {
          turmas.remove(turma);
        }
      } else {
        System.out.println("Turma não encontrada!");
      }
    }
  }
// ===================RELATÓRIO DE TURMAS
  public void relatrioTurma() {
    System.out.println("-----|| Relatório de Turma ||-----");
// PERCORRER LISTA E EXIBIR
    for (Turma turmas : turmas) {
      System.out.println(turmas);
    }
  }
}
