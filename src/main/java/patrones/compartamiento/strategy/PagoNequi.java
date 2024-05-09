package patrones.compartamiento.strategy;

public class PagoNequi implements EstrategiaPago {

  @Override
  public void pagarFactura(int monto, String cliente) {
    System.out.println("Pagando por nequi");
  }
}
