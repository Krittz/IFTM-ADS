package principal;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int TAM = 2;
		int vet1[] = new int[TAM];		
		int vet2[] = new int[TAM];
		int vet3[] = new int[TAM];
		
		System.out.println("===| Multiplicação de vetores |===");
		System.out.println("Preencha o primeiro vetor de inteiros:");
		for(int i = 0; i < vet1.length; i++) {
			vet1[i] = Integer.parseInt(sc.nextLine());
		}
		
		System.out.println("Preencha o segundo vetor de inteiros:");
		for(int i = 0; i < vet2.length; i++) {
			vet2[i] = Integer.parseInt(sc.nextLine());
		}
		
		for(int i = 0, j =(TAM-1); i< TAM; i++, j--) {
			vet3[i] = vet1[i] * vet2[j];
		}
		
		
		
		System.out.println("Vetor de resultados");
		for(int i = (TAM-1); i >=0; i--) {
			System.out.println("Posicação " + (i+1) + ": " + "(" + vet3[i] + ")");
		}
		sc.close();
	}

}
