import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Gerenciamento gerenciamento = new Gerenciamento();
        Carro carro = new Carro();
        int opcao = 0;

        System.out.println("=====|| Bem vindo ||=====");
        do{
            System.out.println("**===| Menu Principal |===**");
            System.out.println("1 - Menu pessoal");
            System.out.println("2 - Menu veiculo");
            System.out.println("3 - Menu passeio");
            System.out.println("4 - Sair");
            opcao = Integer.parseInt(sc.nextLine());
            switch(opcao){
                case 1:
                    gerenciamento.menuPessoa();
                    break;
                case 2:
                    gerenciamento.menuVeiculo();
                    break;
                case 3:
                    carro.menuPasseio();
                case 4:
                    System.out.println("Encerrando sistema");
                    break;
                default:
                    System.out.println("Opção inválida!!!");
                    break;
            }
        }while(opcao != 3);

    
        sc.close();
    }
}
