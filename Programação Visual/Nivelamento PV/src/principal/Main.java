package principal;

import gerencia.GerenciaVeiculo;
import java.util.ArrayList;
import java.util.Scanner;
import model.Veiculo;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    ArrayList<Veiculo> veiculos = new ArrayList<Veiculo>();
    GerenciaVeiculo gerenciaVeiculos = new GerenciaVeiculo(veiculos);
    int opcao = 0;
    do {
      System.out.println("====================================");
      System.out.println("...::: Gerenciamento de veiculos :::...");
      System.out.println("====================================");
      System.out.println("1 - Incluir");
      System.out.println("2 - Alterar");
      System.out.println("3 - Remover");
      System.out.println("4 - Pesquisar");
      System.out.println("5 - Relatório");
      System.out.println("0 - Sair");

      System.out.print("Opção: ");
      opcao = Integer.parseInt(sc.nextLine());

      switch (opcao) {
        case 1:
          gerenciaVeiculos.incluir();
          break;
        case 2:
          gerenciaVeiculos.alterar();
          break;
        case 3:
          gerenciaVeiculos.remover();
          break;
        case 4:
          gerenciaVeiculos.pesquisar();
          break;
        case 5:
          gerenciaVeiculos.relatorio();
          break;
        default:
          if (opcao != 0) {
            System.out.println("Opção inválida!");
            return;
          } else {
            System.out.println("Saindo...");
          }
      }
    } while (opcao != 0);

    sc.close();
  }
}
