package principal;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Veiculo veic[][] = new Veiculo[5][5];
		Gerenciador gerencia = new Gerenciador(veic);
		Scanner sc = new Scanner(System.in);
		

		int opMenu;
		do {
			System.out.println("=====|     Menu Principal      |=====");
			System.out.println("      1 - Cadastrar veículos");
			System.out.println("      2 - Exibir lista");
			System.out.println("      3 - Exibir lista inversa");
			opMenu = Integer.parseInt(sc.nextLine());

			switch (opMenu) {
			case 1:
				gerencia.cadastro();
				break;
			case 2:
				gerencia.exibir();
				break;
			case 3:
				gerencia.iversao();
				break;
				
			default:
				System.out.println("Opção inválida!");
				System.out.println("Tente novamente");
				System.out.println(" ");
				break;
			}
		} while (opMenu != 0);

		sc.close();
	}

}
