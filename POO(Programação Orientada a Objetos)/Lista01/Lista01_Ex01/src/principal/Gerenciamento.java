package principal;

import java.util.Scanner;

public class Gerenciamento {

	Scanner sc = new Scanner(System.in);
	Cliente cli = new Cliente();

	public void vizualizar() {

		System.out.println("*=====| Vizualização de cliente |=====*");
		System.out.println("Nome : " + cli.getNome());
		System.out.println("Código : " + cli.getCodigo());
		System.out.println("Situação especial : " + cli.iseClienteEspecial());
		System.out.println("Limite de crédito : " + cli.getLimiteCredito());
		System.out.println(" ");

	}

	public void atualizaCredito() {
		System.out.println("*=====| Atualização de crédito |=====*");
		vizualizar();
		if (cli.iseClienteEspecial() != false) {
			System.out.println("Confirma cliente: (1 - Sim | 2 - Nao)");
			int x = Integer.parseInt(sc.nextLine());
			if (x == 1) {
				System.out.println("Informe o novo limite de crédito: ");
				cli.setLimiteCredito(Double.parseDouble(sc.nextLine()));
				System.out.println("\n");
				vizualizar();
				System.out.println("----------");
			} else {
				System.out.println("Operação cancelada!");
			}

		} else {
			System.out.println("Cliente não qualificado para crédito");
		}

	}

	public void atualizaSituacao() {
		System.out.println("*=====| Atualização de situação|=====*");
		vizualizar();
		System.out.println("Confirma cliente: (1 - Sim | 2 - Nao)");
		int x = Integer.parseInt(sc.nextLine());
		if (x == 1) {
			System.out.println("Deseja alterar a situação do cliente para ?");
			System.out.println("1 - True | 2 false");
			x = Integer.parseInt(sc.nextLine());
			switch (x) {
			case 1:
				cli.seteClienteEspecial(true);
				System.out.println("Situação alterada!");
				break;
			case 2:
				cli.seteClienteEspecial(false);
				cli.setLimiteCredito(0);
				System.out.println("Situação alterada!");
				break;
			default:
				System.out.println("Opção inválida!!!");
				break;
			}
		} else {
			System.out.println("Operação cancelada!");
		}

	}

}