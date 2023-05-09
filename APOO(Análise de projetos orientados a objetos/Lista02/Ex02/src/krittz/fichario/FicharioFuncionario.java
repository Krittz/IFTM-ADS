package krittz.fichario;
import krittz.modelos.*;

import java.util.Scanner;

public class FicharioFuncionario {

	private Funcionario[] fun;
	private int cont;
	private Scanner sc;
	private int pos;
	private int resp;
	
	public FicharioFuncionario(Funcionario[] f){
		fun = f;
		sc = new Scanner(System.in);
	}
	
	public void inserir(){
		cont = 0;
		while ((cont < fun.length) && (fun[cont] != null)) {
			cont++;
		}

		if (cont > (fun.length - 1)) {
			System.out.println("Vetor cheio!");
		} else {
			Funcionario fu = new Funcionario();

			System.out.println("-=[Inserir Funcionário]=-");
			System.out.println("Nome: ");
			fu.setNome(sc.nextLine());
			System.out.println("CPF: ");
			fu.setCpf(sc.next());
			System.out.println("Salário: ");
			fu.setSalario(sc.nextFloat());
			System.out.println("Identidade: ");
			fu.setIdentidade(sc.next());

			fun[cont] = fu;
		}
	}
	
	public void excluir(){
		System.out.println("-=[Exclusão Funcionário]=-");
		System.out.println("Qual posição deseja excluir?");
		pos = sc.nextInt();

		if ((pos >= 0) && (pos < fun.length) && (fun[pos] != null)) {
			imprime(fun[pos]);

			System.out.println("Confirma a exclusão?(1-Sim/2-não)");
			resp = sc.nextInt();

			if (resp == 1) {
				fun[pos] = null;
				System.out.println("Exclusão efetuada com sucesso.");
			} else {
				System.out.println("Exclusão não efetuada.");
			}
		} else {
			System.out.println("Funcionário não encontrado.");
		}
	}
	
	public void alterar(){
		System.out.println("-=[Alteração Funcionário]=-");
		System.out.println("Qual posição deseja alterar?");
		pos = sc.nextInt();

		if ((pos >= 0) && (pos < fun.length) && (fun[pos] != null)) {
			imprime(fun[pos]);

			System.out.println("Confirma a alteração?(1-Sim/2-não)");
			resp = sc.nextInt();

			if (resp == 1) {
				System.out.println("Nome: ");
				fun[pos].setNome(sc.next());
				System.out.println("CPF: ");
				fun[pos].setCpf(sc.next());
				System.out.println("Salário: ");
				fun[pos].setSalario(sc.nextFloat());
				System.out.println("Identidade: ");
				fun[pos].setIdentidade(sc.next());

				System.out.println("Alteração efetuada com sucesso.");
			} else {
				System.out.println("Alteração não efetuada.");
			}
		} else {
			System.out.println("Funcionário não encontrado.");
		}
	}
	
	public void consultar(){
		System.out.println("-=[Consulta Funcionário]=-");
		System.out.println("Qual posição deseja consultar?");
		pos = sc.nextInt();

		if ((pos >= 0) && (pos < fun.length) && (fun[pos] != null)) {
			imprime(fun[pos]);
		} else {
			System.out.println("Funcionário não encontrado.");
		}

	}
	
	public void relatorio(){
		System.out.println("-=[Relatório Funcionários]=-");
		for (int i = 0; i < fun.length; i++) {
			if (fun[i] != null) {
				imprime(fun[i]);
			}
		}
	}
	
	public void relatorioComFilhos(){
		System.out.println("-=[Relatório Funcionários / Filhos]=-");
		for (int i = 0; i < fun.length; i++) {
			if (fun[i] != null) {
				imprimeComFilhos(fun[i]);
			}
		}
	}

	public void imprime(Funcionario f){
    	System.out.println("-------------------------------------");
    	System.out.println("Nome: " + f.getNome());
    	System.out.println("CPF: " + f.getCpf());
    	System.out.println("Identidade: " + f.getIdentidade());
    	System.out.println("Salário: " + f.getSalario());
    }
	
	public void imprimeComFilhos(Funcionario f){
    	System.out.println("====================================");
    	imprime(f);
    	System.out.println("-------------------------------------");
        
    	for(int i = 0; i < f.getFilhos().length; i++){
    		if(f.getFilhos()[i] != null)
    			imprimirFilho(f.getFilhos()[i]);
        }
    }
	
	public void imprimirFilho(Filho f){
		System.out.println("--------------------------------------------");
		System.out.println("Nome: " + f.getNome());
		System.out.println("CPF: " + f.getCpf());
		System.out.println("Número Certidão Nascimento: " + f.getNumCertNasc());
		System.out.println("Data de Nascimento: " + f.getDataNascimento());
	}
 }

