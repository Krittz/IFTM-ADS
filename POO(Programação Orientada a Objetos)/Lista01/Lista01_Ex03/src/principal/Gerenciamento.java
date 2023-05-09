package principal;

import java.util.Scanner;

public class Gerenciamento {

	Scanner sc = new Scanner(System.in);
	Pessoa[] vetPessoa;

	public Gerenciamento(Pessoa pe[]) {
		vetPessoa = pe;
	}

	public void cadastrar() {
		System.out.println("---| Cadastro de pessoas |---");

		int pos = 0;

		while (pos <= vetPessoa.length && vetPessoa[pos] != null) {
			pos++;
		}
		;
		if (pos < vetPessoa.length) {
			Pessoa p = new Pessoa();
			System.out.println("Informe os seguintes dados");
			System.out.print("\t Nome: ");
			p.setNome(sc.nextLine());
			System.out.print("\n\t Idade: ");
			p.setIdade(Integer.parseInt(sc.nextLine()));

			vetPessoa[pos] = p;

		} else {
			System.out.println("Memória cheia!");
		}
	}

	public void listagem() {
		System.out.println("---| Listagem de pessoas |---");

		for (int i = 0; i <= vetPessoa.length; i++) {
			imprimir(vetPessoa[i]);
			System.out.println("***=====|_____|=====***");
		}

	}

	public void listagemReversa() {
		System.out.println("---| Listagem reversa |---");
		for (int i = 10; i >= vetPessoa.length; i--) {
			imprimir(vetPessoa[i]);
			System.out.println("***=====|_____|=====***");
		}
	}

	public void imprimir(Pessoa p) {
		System.out.println("Nome: " + p.getNome());
		System.out.println("idade: " + p.getIdade());

	}
}
