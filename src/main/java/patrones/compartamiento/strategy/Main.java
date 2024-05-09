package patrones.compartamiento.strategy;

public class Main {

  public static void main(String[] args) {
    App app = new App();
    app.pagoFactura(new PagoPSE(), 100, "Daniel");
  }
}
