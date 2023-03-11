import java.util.Scanner;
public class App {
    public static void main(String[] args)  {
       
        Scanner sc = new Scanner(System.in);
        Gerenciador gerencia = new Gerenciador();
        int opMenu = 0;
        do{

            System.out.println("=====| Menu Principal |=====");
            System.out.println("1 - Cadastrar cliente");
            System.out.println("2 - Exibir cliente");
            System.out.println("3 - Atualizar crédito");
            System.out.println("4 - Atualizar situação");
            System.out.println("5 - Sair");
            opMenu = Integer.parseInt(sc.nextLine());
            
            switch(opMenu){
                case 1:
                    gerencia.cadastraCliente();
                    break;
                case 2:
                gerencia.exibirCliente();
                    break;
                case 3:
                gerencia.atualizaCredito();
                    break;
                case 4:
                gerencia.atualizaSituacao();
                    break;
                case 5:
                    System.out.println("Saindo...");
                    break;
                default:
                    break;
            }
        }while(opMenu !=5);
        sc.close();
    }
}
