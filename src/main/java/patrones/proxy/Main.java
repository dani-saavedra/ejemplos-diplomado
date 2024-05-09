package patrones.proxy;

public class Main {

  public static void main(String[] args) {
    Internet internet = new ProxySabana();
    String navegacion = internet.navegar("youtube.com/midudev");
    System.out.println(navegacion);
  }
}
