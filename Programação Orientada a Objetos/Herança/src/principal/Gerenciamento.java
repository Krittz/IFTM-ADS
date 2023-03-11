package principal;

import java.util.Scanner;

public class Gerenciamento {
    Tecnico tecnico = new Tecnico();
    Jogador jogador = new Jogador();
    Scanner sc = new Scanner(System.in);

    public Gerenciamento() {

    }

    public void cadastroTecnico() {
        if (tecnico.getNome() == null) {

            System.out.println("---| Cadastre de Técnico |---");
            System.out.println("Nome: ");
            tecnico.setNome(sc.nextLine());
            System.out.println("Idade: ");
            tecnico.setIdade(Integer.parseInt(sc.nextLine()));
            System.out.println("Carterinha CTF: ");
            tecnico.setCarteiraCTF(sc.nextLine());
            System.out.println("Cadastro efetuado com sucesso!");
        } else {
            System.out.println("Já possui cadastro!");
        }
    }

    public void cadastroJogador() {
        if (jogador.getNome() == null) {
            System.out.println("---| Cadastro de Jogador |---");
            System.out.println("Nome: ");
            jogador.setNome(sc.nextLine());
            System.out.println("Idade: ");
            jogador.setIdade(Integer.parseInt(sc.nextLine()));
            System.out.println("Numero da camisa: ");
            jogador.setNumeroCamisa(Integer.parseInt(sc.nextLine()));
            System.out.println("Posição: ");
            jogador.setPosicao(sc.nextLine());
        } else {
            System.out.println("Já possui cadastro!");
        }
    }

    public void menu() {
        int op = 0;
        do {
            System.out.println("---| Menu Principal |---");
            System.out.println("1 - Cadastro de Tecnico ");
            System.out.println("2 - Exibir Tecnico");
            System.out.println("3 - Cadastro de Jogador");
            System.out.println("4 - Exibe Jogador");

            System.out.println("3 - sair");
            op = Integer.parseInt(sc.nextLine());
            switch (op) {
                case 1:
                    cadastroTecnico();
                    break;
                case 2:
                    exibeTecnico();
                    break;
                case 3:
                    cadastroJogador();
                    break;
                case 4:
                    exibeJogador();
                    break;
                default:
                    System.out.println("Opção inválida");
                    break;
            }
        } while (op != 3);

    }

    public void exibeTecnico() {
        if (tecnico.getNome() == null) {
            System.out.println("Não possui ninguem cadastrado");
        } else {
            System.out.println("===============***=================");
            System.out.println("Nome: " + tecnico.getNome());
            System.out.println("Idade: " + tecnico.getIdade());
            System.out.println("Carteira CTF: " + tecnico.getCarteiraCTF());
            System.out.println("===============***=================");
        }
    }

    public void exibeJogador() {
        if (jogador.getNome() == null) {
            System.out.println("Não possui ninguem cadastrado");
        } else {
            System.out.println("===============***=================");
            System.out.println("Nome: " + jogador.getNome());
            System.out.println("Idade: " + jogador.getIdade());
            System.out.println("N Camisa: " + jogador.getNumeroCamisa());
            System.out.println("Posição: " + jogador.getPosicao());
            System.out.println("===============***=================");

        }
    }

}
