import java.util.Scanner;

public class Gerenciamento {
  Pessoa pessoa = new Pessoa();
  Carro carro = new Carro();
  Scanner sc = new Scanner(System.in);

  public Gerenciamento() {
  }

  // ======================== Metodos de Gerenciamento Classe Pessoa
  // ========================
  public void cadastraPessoa() {
    System.out.println("--- Cadastro Pessoal ---");
    System.out.println("Digite seu nome: ");
    pessoa.setNome(sc.nextLine());
    System.out.println("Digite sua idade: ");
    pessoa.setIdade(Integer.parseInt(sc.nextLine()));
    if (pessoa.getIdade() >= 18) {
      System.out.println("Possui CNH? (S/N)");
      char h = sc.nextLine().charAt(0);
      if (h == 'S' || h == 's') {
        pessoa.sethabilitado(true);
        System.out.println("Digite seu numero de CNH: ");
        pessoa.setCnh(Long.parseLong(sc.nextLine()));
        System.out.println("Possui veiculo? (S/N)");
        char v = sc.nextLine().charAt(0);
        if (v == 'S' || v == 's') {
          pessoa.setPossuiVeiculo(true);
        }
        System.out.println("Pessoa cadastrada com sucesso!");
      } else {
        pessoa.sethabilitado(false);
        System.out.println("Pessoa não habilitada!");
        System.out.println("Utitlize outros meios de transporte!");
      }

    } else {
      System.out.println("Você não tem idade para dirigir!");

    }
  }

  public void exibePessoa() {
    if (pessoa.getNome() != null) {
      System.out.println("=== Registro pessoal ===");
      System.out.println("Nome: " + pessoa.getNome());
      System.out.println("Idade: " + pessoa.getIdade());
      System.out.println("Habilitado: " + pessoa.ishabilitado());
      if (pessoa.ishabilitado()) {
        System.out.println("CNH: " + pessoa.getCnh());
        if (pessoa.isPossuiVeiculo()) {
          System.out.println("Possui veiculo: " + pessoa.isPossuiVeiculo());
        }
      }
    } else {
      System.out.println("Nenhuma pessoa cadastrada!");
    }
  }

  public void excluiPessoa() {
    System.out.println("--- Exclusão de cadastro ---");
    System.out.println("Cadastro disponivel para: ");
    if (pessoa.getNome() != null) {
      exibePessoa();
      System.out.println("Deseja excluir o cadastro? (S/N)");
      char h = sc.nextLine().charAt(0);
      if (h == 'S') {
        pessoa.setNome(null);
        pessoa.setIdade(0);
        pessoa.sethabilitado(false);
        pessoa.setCnh(0);
        System.out.println("Cadastro excluido com sucesso!");
      }
    } else {
      System.out.println("Nenhuma pessoa cadastrada!");
    }
  }

  public void menuPessoa() {

    System.out.println("----| Menu Pessoal |----");
    System.out.println("1 - Cadastrar");
    System.out.println("2 - Exibir cadastro");
    System.out.println("3 - Excluir cadastro");
    System.out.println("4 - Retornar ao menu principal");
    int op = Integer.parseInt(sc.nextLine());
    switch (op) {
      case 1:
        cadastraPessoa();
        break;
      case 2:
        exibePessoa();
        break;
      case 3:
        excluiPessoa();
        break;
      case 4:
        System.out.println("Retornando ao menu principal...");
        break;
      default:
        System.out.println("Opção inválida!");
        break;
    }

  }

  // ======================== Metodos de Gerenciamento Classe Veiculo
  // ========================

  public void cadastraVeiculo() {
    System.out.println("--- Cadastro de Veiculo ---");

    if (pessoa.isHabilitado()) {

      if (carro.getPlaca() == null) {
        System.out.println("Digite a placa do veiculo: ");
        carro.setPlaca(sc.nextLine());
        System.out.println("Digite a marca do veiculo: ");
        carro.setMarca(sc.nextLine());
        System.out.println("Digite o modelo do veiculo: ");
        carro.setModelo(sc.nextLine());
        System.out.println("Digite o ano de fabricação do veiculo: ");
        carro.setAnoFabricacao(Integer.parseInt(sc.nextLine()));
      } else {
        System.out.println("Já possui veículo cadastrado");
      }

    } else {
      System.out.println("Pessoa não habilitada!");
    }
  }

  public void exibeVeiculo() {
    if (pessoa.isPossuiVeiculo()) {
      if (carro.getPlaca() != null) {
        System.out.println("=== Registro de veiculo ===");
        System.out.println("Placa: " + carro.getPlaca());
        System.out.println("Marca: " + carro.getMarca());
        System.out.println("Modelo: " + carro.getModelo());
        System.out.println("Ano de fabricação: " + carro.getAnoFabricacao());
        System.out.println("Propietario/Condutor: " + pessoa.getNome());
      } else {
        System.out.println("Nenhum veiculo cadastrado!");
      }
    } else {
      System.out.println("Nenhum veiculo cadastrado!");
    }
  }

  public void excluirVeiculo() {
    if (pessoa.getNome() != null) {
      if (pessoa.isHabilitado() == true) {
        if (carro.getPlaca() != null) {
          exibeVeiculo();
          System.out.println("Deseja excluir o veiculo? (S/N)");
          char h = sc.nextLine().charAt(0);
          if (h == 'S' || h == 's') {
            carro.setPlaca(null);
            carro.setMarca(null);
            carro.setModelo(null);
            carro.setAnoFabricacao(0);
            System.out.println("Veiculo excluido com sucesso!");
          } else {
            System.out.println("Nenhum veiculo cadastrado!");
          }
        }
      } else {
        System.out.println("Pessoa não habilitada!");
        System.out.println("Sem veiculo para excluir!");
      }
    } else {
      System.out.println("Nenhuma pessoa cadastrado!");
    }
  }


  public void menuVeiculo() {
    System.out.println("----| Menu Veiculo |----");
    System.out.println("1 - Cadastrar veiculo");
    System.out.println("2 - Exibir veiculo");
    System.out.println("3 - Alterar veiculo");
    System.out.println("4 - Excluir veiculo");
    System.out.println("5 - Retornar ao menu principal");

    int op = Integer.parseInt(sc.nextLine());
    switch (op) {
      case 1:
        if (pessoa.getNome() != null) {
          cadastraVeiculo();
        } else {
          System.out.println("Nenhuma pessoa cadastrada!");
          System.out.println("Deseja cadastrar uma pessoa? (S/N)");
          char h = sc.nextLine().charAt(0);
          if (h == 'S' || h == 's') {
            cadastraPessoa();
          }
        }
        break;
      case 2:
        exibeVeiculo();
        break;
      case 3:
        // alteraVeiculo();
        break;
      case 4:
        excluirVeiculo();
        break;
      case 5:
        System.out.println("Retornando ao menu principal...");
        break;
      default:
        System.out.println("Opção inválida!");
        break;
    }
  }
}
