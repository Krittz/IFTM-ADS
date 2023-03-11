import java.util.Scanner;

public class Gerenciador {

    Cliente cli = new Cliente();
    Scanner sc = new Scanner(System.in);

    public Gerenciador(Cliente cli, Scanner sc) {
        this.cli = cli;
        this.sc = sc;
    }

    public Gerenciador() {

    }

    public void cadastraCliente() {
        System.out.println("===|| Cadastro de cliente ||===");
        if (cli.getNome() == null) {
            System.out.println("Cliente ja cadastrado");
        } else {
            System.out.println("Informe os seguintes dados:");
            System.out.println("Codigo: ");
            cli.setCodigo(Integer.parseInt(sc.nextLine()));
            System.out.println("Nome: ");
            cli.setNome(sc.nextLine());
            System.out.println("Cliente especial: (S/N)");
            char op = sc.nextLine().charAt(0);
            if (op == 'S' || op == 's') {
                cli.setEhEspecial(true);
                System.out.println("Limite de crédito: ");
                cli.setLimiteCredito(Double.parseDouble(sc.nextLine()));

            } else {
                cli.setEhEspecial(false);
            }

        }
    }

    public void exibirCliente(){
        System.out.println("Cadastro pessoal de cliente");
        if(cli.getNome() == null){
            System.out.println("Não há cliente cadastrado");
            System.out.println("Deseja seguir para cadastro? (S/N)");
            char op = sc.nextLine().charAt(0);
            if(op == 'S' || op == 's'){
                cadastraCliente();
            }else{
                System.out.println("Cancelado");
            }
        }else{
            System.out.println("Código: " + cli.getCodigo());
            System.out.println("Nome: " + cli.getNome());
            System.out.println("É especial: " + cli.getEhEspecial());
            if(cli.getEhEspecial()== true){
                System.out.println("Cŕedito: " + cli.getLimiteCredito());
            }else{
                System.out.println("Limite de cŕedito: não possui");
            }
        }
    }

    public void atualizaSituacao(){
        if(cli.getEhEspecial()== true){
           System.out.println("Cliente ja é especial");
            System.out.println("Deseja atualizar o limite de crédito: (S/N)");
            char op = sc.nextLine().charAt(0);
            if(op == 'S' || op =='s'){

            }else{
                System.out.println("Operação cancelada");
            }

        }else{
            System.out.println("Cliente não especial");
            System.out.println("Deseja atualziar situação para : Especial? (S/N)");
            char op = sc.nextLine().charAt(0);
            if(op == 'S' || op == 's'){
                cli.setEhEspecial(true);
                System.out.println("Sitaução alterada com sucesso!");
            }else{
                System.out.println("Cancelado, situação continua a mesma1");
            }
        }
    }

    public void atualizaCredito(){
        if(cli.getEhEspecial()== true){
            System.out.println("Informe o limite de crédito:  ");
            cli.setLimiteCredito(Double.parseDouble(sc.nextLine()));
        }else{
            System.out.println("Cliente não especial ");
            System.out.println("Deseja atualizar para especial: (S/N)");
            char op = sc.nextLine().charAt(0);
            if(op == 'S' || op =='s'){
                atualizaSituacao();
            }else{
                System.out.println("Cancelado");
            }
        }
    }
}