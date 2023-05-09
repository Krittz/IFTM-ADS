package principal;

import java.util.Scanner;

public class Gerenciador {

	Veiculo[][] veiculos;
	Scanner sc = new Scanner(System.in);

	public Gerenciador(Veiculo v[][]) {
		veiculos = v;
	}

	public void cadastro() {
		int pos1 = 0;
		int pos2 = 0;

		while ((pos1 <= veiculos.length && pos2 <= veiculos.length) && veiculos[pos1][pos2] != null) {
			pos1++;
			pos2++;
		}
		;
		if (veiculos[pos1][pos2] != null) {
			Veiculo ve = new Veiculo();
			System.out.println("=====| Cadastro de veiculos |=====");
			System.out.print("Marca : ");
			ve.setMarca(sc.nextLine());
			System.out.print("Modelo : ");
			ve.setModelo(sc.nextLine());
			System.out.print("Ano de fabricação : ");
			ve.setAnoFabricacao(Integer.parseInt(sc.nextLine()));
			System.out.println("----------------");

		} else {
			System.out.println("Memória cheia!!!");
		}
	}



	public void exibir() {
		System.out.println("=====| Carros |=====");
		for(int i = 0; i<= veiculos.length; i++) {
			for(int j = 0; j<= veiculos.length; j++) {
				System.out.println("Marca : " + veiculos[i][j].getMarca());
				System.out.println("Modelo : " + veiculos[i][j].getModelo());
				System.out.println("Ano de Fabricação : " + veiculos[i][j].getAnoFabricacao());
			}
		}

	}
	
	public void iversao() {
		System.out.println("=====| Carros |=====");
		for(int i = veiculos.length; i>= veiculos.length; i--) {
			for(int j = veiculos.length; j>= veiculos.length; j--) {
				System.out.println("Marca : " + veiculos[i][j].getMarca());
				System.out.println("Modelo : " + veiculos[i][j].getModelo());
				System.out.println("Ano de Fabricação : " + veiculos[i][j].getAnoFabricacao());
			}
		}
	}
}