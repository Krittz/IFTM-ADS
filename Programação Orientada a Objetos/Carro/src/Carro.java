import java.util.Scanner;

public class Carro {
  private String marca;
  private String modelo;
  private String placa;
  private int anoFabricacao;
  private boolean ligado;
  private int velocidade;
  Pessoa proprietario = new Pessoa();

  public Carro(String marca, String modelo, String placa, int anoFabricacao) {
    this.marca = marca;
    this.modelo = modelo;
    this.placa = placa;
    this.anoFabricacao = anoFabricacao;
  }

  public Carro() {

  }

  public String getMarca() {
    return marca;
  }

  public void setMarca(String marca) {
    this.marca = marca;
  }

  public String getModelo() {
    return modelo;
  }

  public void setModelo(String modelo) {
    this.modelo = modelo;
  }

  public String getPlaca() {
    return placa;
  }

  public void setPlaca(String placa) {
    this.placa = placa;
  }

  public int getAnoFabricacao() {
    return anoFabricacao;
  }

  public void setAnoFabricacao(int anoFabricacao) {
    this.anoFabricacao = anoFabricacao;
  }

  public boolean isLigado() {
    return ligado;
  }

  public void setLigado(boolean ligado) {
    this.ligado = ligado;
  }

  public int getVelocidade() {
    return velocidade;
  }

  public void setVelocidade(int velocidade) {
    this.velocidade = velocidade;
  }

  // ======================== Metodos de Gerenciamento ========================

  public boolean passear() {
    if (proprietario.getNome() == null) {
      System.out.println("Nenhuma pessoa encontrada");
      return false;
    } else {

      if (proprietario.getIdade() >= 18 && proprietario.isHabilitado()) {
        if (proprietario.isPossuiVeiculo()) {
          System.out.println("Pode passear com " + marca + " " + modelo);
          return true;
        } else {
          System.out.println("Não possui veiculo");
          return false;
        }
      } else {
        System.out.println("Passeio a pé");
        return false;
      }
      
    }
    
  }

  public void ligarCarro() {
    passear();
    if (passear()) {
      if (!ligado) {
        System.out.println("Ligando carro");
        ligado = true;
      } else {
        System.out.println("Carro já está ligado");
      }
    }

  }

  public void acelerar() {
    if (ligado) {
      if (velocidade < 120) {
        velocidade += 20;
        System.out.println("Acelerando...");
        System.out.println("Velocidade atual: " + velocidade);
      } else {
        System.out.println("Velocidade máxima atingida");
      }
    } else {
      System.out.println("Carro desligado");
    }
  }

  public void frear() {
    if (!ligado) {
      System.out.println("Carro desligado");
    } else {
      if (velocidade == 0) {
        System.out.println("Carro já está parado");
      } else {
        velocidade -= 20;
        System.out.println("Freando...");
        System.out.println("Velocidade atual: " + velocidade);
      }
    }
  }

  public void desligar() {
    if (!ligado) {
      System.out.println("Carro já está desligado");
    } else {
      if (velocidade == 0) {
        System.out.println("Desligando carro");
        ligado = false;
      } else {
        System.out.println("Carro em movimento, não é possível desligar");
      }
    }
  }

  public void menuPasseio() {
    int op = 0;
    Scanner sc = new Scanner(System.in);
    do {
      System.out.println("===|| Menu Passeio ||===");
      System.out.println("1 - Ligar carro");
      System.out.println("2 - Acelerar");
      System.out.println("3 - Frear");
      System.out.println("4 - Desligar");
      System.out.println("5 - Sair");
      System.out.print("Opção: ");
      op = sc.nextInt();
      switch (op) {
        case 1:
          ligarCarro();
          break;
        case 2:
          acelerar();
          break;
        case 3:
          frear();
          break;
        case 4:
          desligar();
          break;
        case 5:
          System.out.println("Saindo...");
          break;
        default:
          System.out.println("Opção inválida");
          break;

      }
    } while (op != 5);
    sc.close();

  }
}
