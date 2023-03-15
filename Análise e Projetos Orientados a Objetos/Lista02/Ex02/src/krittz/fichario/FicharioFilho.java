package krittz.fichario;
import java.util.Scanner;
import krittz.modelos.*;

public class FicharioFilho {

	private Scanner sc;
	private int posFunc;
	private int cont;
	private Funcionario[] funcs;
	private int pos;
	private int resp;
	
	public FicharioFilho(Funcionario[] f){
		funcs = f;
		sc = new Scanner(System.in);
	}
	
	public void inserir(){
		System.out.println("Qual a posição do funcionário no vetor?");
		posFunc = sc.nextInt();
		
		if(funcs[posFunc] != null){
	    	System.out.println("-[ Funcionário ]-");
	    	System.out.println("Nome: " + funcs[posFunc].getNome());
	    	System.out.println("CPF: " + funcs[posFunc].getCpf());
	    	System.out.println("Identidade: " + funcs[posFunc].getIdentidade());
	    	System.out.println("Salário: " + funcs[posFunc].getSalario());
			
			int respFunc;
			System.out.println("Confirma o funcionário?(1-sim/2-não): ");
			respFunc = sc.nextInt();
			
			if(respFunc == 1){
				cont = 0;
				while ((cont < funcs[posFunc].getFilhos().length) && 
						(funcs[posFunc].getFilhos()[cont] != null)) {
					cont++;
				}

				if (cont > (funcs[posFunc].getFilhos().length - 1)) {
					System.out.println("Vetor cheio!");
				} else {
					Filho fi = new Filho();

					System.out.println("-=[Inserir Filho]=-");
					System.out.println("Nome: ");
					fi.setNome(sc.next());
					System.out.println("CPF: ");
					fi.setCpf(sc.next());
					System.out.println("Número Certidão Nascimento: ");
					fi.setNumCertNasc(sc.next());
					System.out.println("Data Nascimento: ");
					fi.setDataNascimento(sc.nextInt());

					funcs[posFunc].getFilhos()[cont] = fi;
				}
			}
			else{
				System.out.println("Inclusão cancelada!");
			}
		}
	}
	
	public void excluir(){
		System.out.println("-=[Exclusão Filho]=-");
		System.out.println("Qual a posição do funcionário no vetor?");
		posFunc = sc.nextInt();

		System.out.println("Qual posição do filho deseja excluir?");
		pos = sc.nextInt();

		if ((pos >= 0) && (pos < funcs[posFunc].getFilhos().length) && 
				(funcs[posFunc].getFilhos()[pos] != null)) {
			imprimir(funcs[posFunc].getFilhos()[pos]);

			System.out.println("Confirma a exclusão?(1-Sim/2-não)");
			resp = sc.nextInt();

			if (resp == 1) {
				funcs[posFunc].getFilhos()[pos] = null;
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
		System.out.println("Qual a posição do funcionário no vetor?");
		posFunc = sc.nextInt();
		System.out.println("Qual posição deseja alterar?");
		pos = sc.nextInt();

		if ((pos >= 0) && (pos < funcs[posFunc].getFilhos().length) && 
				(funcs[posFunc].getFilhos()[pos] != null)) {
			imprimir(funcs[posFunc].getFilhos()[pos]);

			System.out.println("Confirma a alteração?(1-Sim/2-não)");
			resp = sc.nextInt();

			if (resp == 1) {
				System.out.println("Nome: ");
				funcs[posFunc].getFilhos()[pos].setNome(sc.next());
				System.out.println("CPF: ");
				funcs[posFunc].getFilhos()[pos].setCpf(sc.next());
				System.out.println("Salário: ");
				funcs[posFunc].getFilhos()[pos].setNumCertNasc(sc.next());
				System.out.println("Identidade: ");
				funcs[posFunc].getFilhos()[pos].setDataNascimento(sc.nextInt());

				System.out.println("Alteração efetuada com sucesso.");
			} else {
				System.out.println("Alteração não efetuada.");
			}
		} else {
			System.out.println("Funcionário não encontrado.");
		}

	}
	
	public void consultar(){
		System.out.println("-=[Consulta Filho]=-");
		System.out.println("Qual a posição do funcionário no vetor?");
		posFunc = sc.nextInt();
		System.out.println("Qual posição deseja consultar?");
		pos = sc.nextInt();

		if ((pos >= 0) && (pos < funcs[posFunc].getFilhos().length) && 
				(funcs[posFunc].getFilhos()[pos] != null)) {
			imprimir(funcs[posFunc].getFilhos()[pos]);
		} else {
			System.out.println("Funcionário não encontrado.");
		}
	}
	
	public void relatorio(){
		System.out.println("-=[Relatório Filhos]=-");
		System.out.println("Qual a posição do funcionário no vetor?");
		posFunc = sc.nextInt();
		if((posFunc >= 0) && (posFunc < funcs.length) && 
				(funcs[posFunc] != null)){
			for (int i = 0; i < funcs[posFunc].getFilhos().length; i++) {
				if (funcs[posFunc].getFilhos()[i] != null) {
					imprimir(funcs[posFunc].getFilhos()[i]);
				}
			}
		}
		else{
			System.out.println("Funcionário não existe!");
		}
	}
	
	public void imprimir(Filho f){
		System.out.println("--------------------------------------------");
		System.out.println("Nome: " + f.getNome());
		System.out.println("CPF: " + f.getCpf());
		System.out.println("Número Certidão Nascimento: " + f.getNumCertNasc());
		System.out.println("Data de Nascimento: " + f.getDataNascimento());
	}
}
