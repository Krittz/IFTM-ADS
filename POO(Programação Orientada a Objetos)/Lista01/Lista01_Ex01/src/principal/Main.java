package principal;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Gerenciamento controle = new Gerenciamento();
		int opMenu; 

		do {
			System.out.println("**=====| Menu Principal |=====**");
			System.out.println("| (1) - Exibir cliente |");
			System.out.println("| (2) - Atualizar limite|");
			System.out.println("| (3) - Atualizar situação |");
			System.out.println("| (0) - Encerrar programa|");
			opMenu = Integer.parseInt(sc.nextLine());

			switch (opMenu) {
			case 1:
				controle.vizualizar();
				break;
			case 2:
				controle.atualizaCredito();
				break;
			case 3:
				controle.atualizaSituacao();
				break;
			default:
				System.out.println("Finalizando...");
				break;
			}

		} while (opMenu != 0);

		sc.close();
	}

}
