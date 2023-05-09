package principal;

import java.util.Scanner;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		final int TAM = 2;
		ArrayList<Livro> livros = new ArrayList<Livro>();
		GerenciaLivros gerenciador = new GerenciaLivros(livros, TAM);
		
		Scanner sc = new Scanner(System.in);
		int option;
		
		do {
			System.out.println("===***|| Menu de Livros ||***===\n\n" + "[1] - Incluir\n" + "[2] - Excluir\n" + "[3] - Alterar\n" + "[4] - Consultar\n" + "[5] - Relatório\n" + "[0] - Sair");
			option = Integer.parseInt(sc.nextLine());
			
			switch(option) {
			case 1:
				gerenciador.incluir();
				break;
			
			case 2: 
				gerenciador.excluir();
				break;
				
			case 3:
				gerenciador.alterar();
				break;
				
			case 4:
				gerenciador.consultar();
				break;
				
			case 5:
				gerenciador.relatorio();
				break;
				
			default:
				System.out.println("Bye...");
				break;
			}
			
		}while(option != 0);
		sc.close();
	}

}
