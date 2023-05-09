package br.com.krittz.ficharios;

import br.com.krittz.modelos.Aluno;
import br.com.krittz.modelos.Turma;
import br.com.krittz.modelos.Enturmacao;

import java.util.Scanner;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class FicharioEnturmacao {
  private ArrayList<Turma> turmas = new ArrayList<Turma>();
  private ArrayList<Aluno> alunos = new ArrayList<Aluno>();
  private ArrayList<Enturmacao> enturmacoes = new ArrayList<Enturmacao>();

  private Scanner sc = new Scanner(System.in);

  public FicharioEnturmacao() {

  }

  public FicharioEnturmacao(ArrayList<Turma> turmas, ArrayList<Aluno> alunos, ArrayList<Enturmacao> enturmacoes) {
    this.turmas = turmas;
    this.alunos = alunos;
    this.enturmacoes = enturmacoes;
  }
// ===================ENTURMAR ALUNOS
  public void enturmar() {
    System.out.println("-----|| Enturmar ||-----");
    System.out.println("Informe o código da turma: ");
    String codigo = sc.nextLine();
    System.out.println("Informe a matricula do aluno: ");
    String matricula = sc.nextLine();
    System.out.println("Informe a data da enturmação: (yyyy/MM/dd)" );
    String data = sc.nextLine();
    
// FORMATAR DATA PARA SAIDA PADRÃO BRASILEIRO
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    LocalDate dataEnturmacao = LocalDate.parse(data, formatter);
    Enturmacao enturmacao = new Enturmacao();
// PERCORRER LISTA E VERIFICAR SE A TURMA EXISTE, CASO SIM, PROSSEGUIR COM A ENTURMAÇÃO
    for (Turma turma : turmas) {
      if (turma.getCodigo().equals(codigo)) {
        enturmacao.setTurma(turma);
        // PERCORRER LISTA E VERIFICAR SE O ALUNO EXISTE, CASO SIM, PROSSEGUIR COM A ENTURMAÇÃO
        for (Aluno aluno : alunos) {
          if (aluno.getMatricula().equals(matricula)) {
            enturmacao.setAluno(aluno);
            enturmacao.setDataEnturmacao(dataEnturmacao);
            enturmacoes.add(enturmacao);
            System.out.println("Aluno enturmado com sucesso!");
          } else {
            System.out.println("Aluno não encontrado!");
          }
        }
      } else {
        System.out.println("Turma não encontrada!");
      }
    }

  }

// ===================DESENTURMAR ALUNOS
  public void desenturmar() {
    System.out.println("-----|| Desenturmar ||-----");
    System.out.println("Informe a posição do vetor a ser desenturmado: ");
    int posicao = Integer.parseInt(sc.nextLine());
// VERIFICAR SE A POSIÇÃO EXISTE E SE NÃO ESTÁ VAZIA
    if (posicao < enturmacoes.size() && enturmacoes.get(posicao) != null) {
      System.out.println(enturmacoes.get(posicao));
// CONFIRMA A DESENTURMAÇÃO, CASO SIM, REMOVER A ENTURMAÇÃO DO VETOR
      System.out.println("Confirma a desenturmação? (S/N)");
      String opcao = sc.nextLine();
      if (opcao.equalsIgnoreCase("S")) {
        enturmacoes.remove(posicao);
        System.out.println("Desenturmação concluída!");
      } else {
        System.out.println("Desenturmação cancelada!");
      }

    }
  }
// ===================CONSULTAR ENTURMAÇÃO
  public void consultar() {
    System.out.println("-----|| Consultar ||-----");
    System.out.println("Informe a posição do vetor a ser consultado: ");
    int posicao = Integer.parseInt(sc.nextLine());
// VERIFICAR SE A POSIÇÃO EXISTE E SE NÃO ESTÁ VAZIA, CASO SIM, EXIBIR A ENTURMAÇÃO
    if (posicao < enturmacoes.size() && enturmacoes.get(posicao) != null) {
      System.out.println(enturmacoes.get(posicao));
    } else {
      System.out.println("Posição inválida!");
    }
  }
// ===================LISTAR ENTURMAÇÕES
  public void listar() {
    System.out.println("-----|| Listar ||-----");
// PERCORRER O VETOR E EXIBIR TODAS AS ENTURMAÇÕES
    for (Enturmacao enturmacao : enturmacoes) {
      System.out.println(enturmacao);
    }
  }
}