package principal;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Pessoa pessoas[] = new Pessoa[10];
		Gerenciamento gerenciar = new Gerenciamento(pessoas);
		int opMenu;
		do {
			System.out.println("**=====| Menu Principal |=====**");
			System.out.println("| (1) - Cadastrar pessoas      |");
			System.out.println("| (2) - Exibir lista           |");
			System.out.println("| (3) - Exibir lista invertida |");
			System.out.println("| (0) - Encerrar programa      |");
			opMenu = Integer.parseInt(sc.nextLine());

			switch (opMenu) {
			case 1:
				gerenciar.cadastrar();
				break;
			case 2:
				gerenciar.listagem();
				break;
			case 3:
				gerenciar.listagemReversa();
				break;
			default:
				System.out.println("Opção inválida!!!");
				break;

			}

		} while (opMenu != 0);
		sc.close();

	}

}
