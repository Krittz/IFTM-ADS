import java.util.Scanner;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.text.ParseException;

public class App {
    public static void main(String[] args) throws Exception {

        final int TAM = 300;
        Scanner sc = new Scanner(System.in);
        Funcionario funcionario[] = new Funcionario[TAM];
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        
        
        int opMenu;
        do{

            System.out.println("-------|| Menu Primario ||-------");
            System.out.println("1 - Menu de Funcionarios");
            System.out.println("2 - Menu de Filhos");
            System.out.println("3 - Sair");
            System.out.print("Opção: ");
            opMenu =Integer.parseInt(sc.nextLine());

            switch(opMenu){
                case 1:
                int opFuncionario;
                    System.out.println("-------|| Menu de Funcionarios ||-------");
                    do{
                        System.out.println("1 - Cadastrar Funcionario");
                        System.out.println("2 - Excluir Funcionarios");
                        System.out.println("3 - Alterar Funcionarios");
                        System.out.println("4 - Listar Funcionarios");
                        System.out.println("5 - Listar Funcionarios/Filhos");
                        System.out.println("6 - Consultar Funcionario");
                        System.out.println("0 - Voltar");
                        System.out.print("Opção: ");
                        opFuncionario = Integer.parseInt(sc.nextLine());

                        switch(opFuncionario){
                            case 1: 
                            int cont = 0;
                            Funcionario func = new Funcionario();
                            System.out.println("-------|| Cadastrar Funcionario ||-------");
                                while((cont >= 0) && (cont < funcionario.length) &&(funcionario[cont] != null)){
                                    cont++;
                                } if(cont > funcionario.length -1){
                                    System.out.println("Vetor cheio!");
                                }else{
                                    System.out.println("Informe o nome do funcionario: ");
                                    func.setNome(sc.nextLine());

                                    System.out.println("Informe o cpf do funcionario: ");
                                    func.setCpf(sc.nextLine());

                                    System.out.println("Informe o salario do funcionario: ");
                                    func.setSalario(Float.parseFloat(sc.nextLine()));

                                    System.out.println("Informe a identidade do funcionario: ");
                                    func.setIdentidade(sc.nextLine());

                                    funcionario[cont] = func;

                                }
                            
                                break;
                        
                            case 2:
                            System.out.println("-------|| Excluir Funcionario ||-------");
                            System.out.println("Informe a posição do funcionario no vetor: ");
                            int posExcluir = Integer.parseInt(sc.nextLine());
                            if((posExcluir >= 0) && (posExcluir < funcionario.length) && (funcionario[posExcluir] != null)){
                                System.out.println("Confirme os dados do funcionario: ");
                                System.out.println("Nome: " + funcionario[posExcluir].getNome());
                                System.out.println("Cpf: " + funcionario[posExcluir].getCpf());
                                System.out.println("Salario: " + funcionario[posExcluir].getSalario());
                                System.out.println("Identidade: " + funcionario[posExcluir].getIdentidade());
                                System.out.println("Confirma exclusão? (1 - Sim/ 2 - Não)");
                                int opExcluir = Integer.parseInt(sc.nextLine());
                                if(opExcluir == 1){
                                    funcionario[posExcluir] = null;
                                }else{
                                    System.out.println("Exclusão cancelada!");
                                }

                            }
                                break;

                            case 3:
                            System.out.println("-------|| Alterar Funcionario ||-------");
                            System.out.println("Informe a posição do funcionario no vetor: ");
                            int posAlterar = Integer.parseInt(sc.nextLine());
                            if((posAlterar >= 0) && (posAlterar < funcionario.length) && (funcionario[posAlterar] != null)){
                                System.out.println("Confirme os novos dados do funcionario: ");
                                System.out.println("Nome: " + funcionario[posAlterar].getNome());
                                System.out.println("Cpf: " + funcionario[posAlterar].getCpf());
                                System.out.println("Salario: " + funcionario[posAlterar].getSalario());
                                System.out.println("Identidade: " + funcionario[posAlterar].getIdentidade());
                                System.out.println("Confirma alteração? (1 - Sim/ 2 - Não)");
                                int opAlterar = Integer.parseInt(sc.nextLine());
                                if(opAlterar == 1){
                                    System.out.println("Informe o novo nome do funcionario: ");
                                    funcionario[posAlterar].setNome(sc.nextLine());

                                    System.out.println("Informe o novo cpf do funcionario: ");
                                    funcionario[posAlterar].setCpf(sc.nextLine());

                                    System.out.println("Informe o novo salario do funcionario: ");
                                    funcionario[posAlterar].setSalario(Float.parseFloat(sc.nextLine()));

                                    System.out.println("Informe a nova identidade do funcionario: ");
                                    funcionario[posAlterar].setIdentidade(sc.nextLine());
                                }else{
                                    System.out.println("Alteração cancelada!");
                                }
                            }

                                break;

                            case 4:
                                System.out.println("-------|| Listar Funcionarios ||-------");
                                for(int i = 0; i < funcionario.length; i++){
                                    if(funcionario[i] != null){                                        
                                        System.out.println("Funcionario: #" + i);
                                        System.out.println("Nome: " + funcionario[i].getNome());
                                        System.out.println("Cpf: " + funcionario[i].getCpf());
                                        System.out.println("Salario: " + funcionario[i].getSalario());
                                        System.out.println("Identidade: " + funcionario[i].getIdentidade());
                                    }
                                }
                                break;

                            case 5:
                                System.out.println("-------|| Listar Funcionarios/Filhos ||-------");
                                break;

                            case 6:
                                System.out.println("-------|| Consultar Funcionario ||-------");
                                System.out.println("Informe a posição do funcionario: ");
                                int posConsultar = Integer.parseInt(sc.nextLine());
                                if((posConsultar >= 0) && (posConsultar < funcionario.length) && (funcionario[posConsultar] != null)){
                                    System.out.println("Funcionario: #" + posConsultar);
                                    System.out.println("Nome: " +funcionario[posConsultar].getNome());
                                    System.out.println("Cpf: " +funcionario[posConsultar].getCpf());
                                    System.out.println("Salario: " +funcionario[posConsultar].getSalario());
                                    System.out.println("Identidade: " +funcionario[posConsultar].getIdentidade());
                                }
                                break;

                            default:
                                System.out.println("Opção inválida!");
                                break;
                        }
                    }while(opFuncionario != 0);
                    break;

                case 2:
                System.out.println("-------|| Menu de Filhos ||-------");
                int opFilho;
                do{
                    System.out.println("1 - Cadastrar");
                    System.out.println("2 - Excluir");
                    System.out.println("3 - Alterar");
                    System.out.println("4 - Listar");
                    System.out.println("5 - Consultar");
                    System.out.println("0 - Voltar");
                    opFilho = Integer.parseInt(sc.nextLine());

                    switch(opFilho){
                        case 1:
                        System.out.println("-------|| Cadastrar Filho ||-------");
                        System.out.println("Informe a posição do funcionario no vetor:");
                        int posCadastrar = Integer.parseInt(sc.nextLine());
                        if(funcionario[posCadastrar] != null){

                        System.out.println("Confirme o funcionario");
                        System.out.println("Nome: " + funcionario[posCadastrar].getNome());
                        System.out.println("Cpf: " + funcionario[posCadastrar].getCpf());
                        System.out.println("Identidade: " + funcionario[posCadastrar].getIdentidade());
                        System.out.println("Confirmar funcionario: 1 - Sim/ 2 - Não");
                        int opConfirmar = Integer.parseInt(sc.nextLine());

                        if(opConfirmar == 1){
                               int cont = 0;
                                while((cont >= 0) && (cont < funcionario[posCadastrar].getFilhos().length) && (funcionario[posCadastrar].getFilhos()[cont] != null)){
                                    cont++;
                                }if(cont > funcionario[posCadastrar].getFilhos().length -1){
                                    System.out.println("Vetor cheio!");
                                }else{
                                    Filho filho = new Filho();
                                    System.out.println("Nome: ");
                                    filho.setNome(sc.nextLine());

                                    System.out.println("CPF: ");
                                    filho.setCpf(sc.nextLine());

                                    System.out.println("Certidão de Nascimento:");
                                    filho.setNumCertNasc(sc.nextLine());

                                    System.out.println("Data de Nascimento: ");
                                    String dataNasc = sc.nextLine();                                   
                                    Date dataFormatada;
                                    try{
                                        dataFormatada = sdf.parse(dataNasc);
                                        filho.setDataNascimento(dataFormatada);
                                    }catch(ParseException e){
                                        e.printStackTrace();
                                    }
                                    funcionario[posCadastrar].getFilhos()[cont] = filho;	
                                }
                        }
                        }else{
                            System.out.println("Funcionario não encontrado!");
                        }
                            break;
                        case 2:
                            System.out.println("-------|| Excluir Filho ||-------");
                            System.out.println("Informe a posição do funcionario no vetor:");
                            int posFunc = Integer.parseInt(sc.nextLine());

                            System.out.println("Informe a posição do filho no vetor:");
                            int posFilho = Integer.parseInt(sc.nextLine());

                            if((posFilho>= 0) && (posFunc < funcionario[posFunc].getFilhos().length) && (funcionario[posFunc].getFilhos()[posFilho] != null) ){
                                System.out.println("Confirme o filho");
                                System.out.println("Nome: " + funcionario[posFunc].getFilhos()[posFilho].getNome());
                                System.out.println("CPF: " + funcionario[posFunc].getFilhos()[posFilho].getCpf());
                                System.out.println("Certidão de Nascimento: " + funcionario[posFunc].getFilhos()[posFilho].getNumCertNasc());
                                System.out.println("Data de Nascimento: " + funcionario[posFunc].getFilhos()[posFilho].getDataNascimento());
                                System.out.println("Confirmar filho: 1 - Sim/ 2 - Não");
                                int opConfirmar = Integer.parseInt(sc.nextLine());

                                if(opConfirmar == 1){
                                    funcionario[posFunc].getFilhos()[posFilho] = null;
                                }else{
                                    System.out.println("Operação cancelada!");
                                }
                            }else{
                                System.out.println("Cadastro não encontrado!");
                            }
                            break;
                        case 3:
                            System.out.println("-------|| Alterar Filho ||-------");
                            break;
                        case 4:
                            System.out.println("-------|| Listar Filhos ||-------");
                            break;
                        case 5:
                            System.out.println("-------|| Consultar Filho ||-------");
                            break;
                        default:
                            break;    
                    }
                
                }while(opFilho != 0);
                    break;

                case 3:
                    System.out.println("Saindo do sistema...");
                    break;
            }

        }while(opMenu != 3);

        sc.close();
    }
}
