public class App {

  public static void main(String[] args) throws Exception {
    System.out.println("==========[Imagem carregada no disco]==========");
    Image image = new ProxyImage("test_10mb.jpg");
    image.display();
    System.out.println("");
    System.out.println("==========[Imagem não carregada no disco]==========");
    image = new ProxyImage();
    image.display();
  }
}
