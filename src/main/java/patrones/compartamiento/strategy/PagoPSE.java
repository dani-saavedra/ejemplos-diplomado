package patrones.compartamiento.strategy;

public class PagoPSE implements EstrategiaPago {

  @Override
  public void pagarFactura(int monto, String cliente) {
    System.out.println("Pagando por PSE");
  }
}
