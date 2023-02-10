package gerencia;

import java.util.ArrayList;
import java.util.Scanner;

import model.Veiculo;

public class GerenciaVeiculo {
	private ArrayList<Veiculo> veiculos;
	private Scanner sc;

	public GerenciaVeiculo(ArrayList<Veiculo> veiculos) {
		this.sc = new Scanner(System.in);
		this.veiculos = veiculos;
	}

	// ==================================================================================================
	public void incluir() {

		System.out.println("====================================");
		System.out.println("...::: Incluir Veiculo :::...");
		System.out.println("====================================");
		Veiculo veiculo = new Veiculo();

		lerDados(veiculo);
		veiculos.add(veiculo);

		System.out.println("Veiculo cadastrado com sucesso!");
		System.out.println("....................................");

	}

	// ==================================================================================================
	public void alterar() {
		System.out.println("====================================");
		System.out.println("...::: Alterar Veiculo :::...");
		System.out.println("====================================");

		if (veiculos.isEmpty()) {
			System.out.println("...::: AVISO :::...");
			System.out.println("Não há veiculos cadastrados!");
			System.out.println("....................................");
		} else {
			System.out.println("Digite a posição do veiculo para alterar: ");
			int pos = sc.nextInt();
			sc.skip("\r\n");

			String mensagem = "O veiculo que deseja alterar é este?";

			if (validarDados(pos, mensagem)) {
				System.out.println("Digite os novos dados: ");
				lerDados(veiculos.get(pos));
				System.out.println("Veiculo alterado com sucesso!");
				System.out.println("....................................");
			}
		}
	}

	public void remover() {
		System.out.println("====================================");
		System.out.println("...::: Excluir Veiculo :::...");
		System.out.println("====================================");

		if (veiculos.isEmpty()) {
			System.out.println("...::: AVISO :::...");
			System.out.println("Não há veiculos cadastrados!");
			System.out.println("....................................");
		} else {
			System.out.println("Digite a posição do veiculo para remover: ");
			int pos = sc.nextInt();
			sc.skip("\r\n");

			String mensagem = "O veiculo que deseja remover é este?";

			if (validarDados(pos, mensagem)) {
				veiculos.remove(pos);
				System.out.println("Veiculo excluído com sucesso!");
				System.out.println("....................................");
			}
		}
	}

	public void pesquisar() {
		System.out.println("====================================");
		System.out.println("...::: pesquisar Veiculo :::...");
		System.out.println("====================================");

		if (veiculos.isEmpty()) {
			System.out.println("...::: AVISO :::...");
			System.out.println("Não há veiculos cadastrados!");
			System.out.println("....................................");
		} else {
			System.out.println("Digite a posição do veiculo para pesquisar: ");
			int pos = sc.nextInt();
			sc.skip("\r\n");

			String mensagem = "O veiculo que deseja pesquisar é este?";

			if (!validarDados(pos, mensagem)) {
				pesquisar();
			}
		}
	}

	public void relatorio() {
		System.out.println("====================================");
		System.out.println("...::: Listar Veiculos :::...");
		System.out.println("====================================");

		if (veiculos.isEmpty()) {
			System.out.println("...::: AVISO :::...");
			System.out.println("Não há veiculos cadastrados!");
			System.out.println("....................................");
		} else {
			for (Veiculo veiculo : veiculos) {
				System.out.println("-------------------------------");
				System.out.println("posição #" + veiculos.indexOf(veiculo));
				imprimir(veiculo);
			}
			System.out.println("-------------------------------");
		}
	}

	private void lerDados(Veiculo veiculo) {

		System.out.println("1. Digite a marca do veiculo: ");
		veiculo.setMarca(sc.nextLine());

		System.out.println("2. Digite o modelo do veiculo: ");
		veiculo.setModelo(sc.nextLine());

		System.out.println("3. Digite o ano de fabricação do veiculo: ");
		veiculo.setAnoFabricacao(sc.nextInt());
		sc.skip("\r\n");

		System.out.println("4. Digite o ano de modelo do veiculo: ");
		veiculo.setAnoModelo(sc.nextInt());
		sc.skip("\r\n");

		System.out.println("5. Digite o preço do veiculo: ");
		veiculo.setPreco(sc.nextDouble());
		sc.skip("\r\n");

	}

	private void imprimir(Veiculo veiculo) {
		System.out.println("...............................");
		System.out.println("Marca                = " + veiculo.getMarca());
		System.out.println("Modelo               = " + veiculo.getModelo());
		System.out.println("Ano de fabricação    = " + veiculo.getAnoFabricacao());
		System.out.println("Ano de Modelo        = " + veiculo.getAnoModelo());
		System.out.printf("preço                = R$ %.2f\n", veiculo.getPreco());
		System.out.println("...............................");
	}

	private boolean validarDados(int pos, String mensagem) {

		if (pos < 0 || pos >= veiculos.size()) {
			System.out.println("ALERTA: posição inválida. Deve ser um número entre 0 e N-1");
			return false;
		}

		System.out.println(mensagem);
		imprimir(veiculos.get(pos));

		System.out.println("[1] Sim");
		System.out.println("[2] Não");

		int opcao = sc.nextInt();
		sc.skip("\r\n");

		if (opcao != 1) {
			System.out.println("Voltando ao menu inicial...");
			return false;
		}

		return true;
	}

}
