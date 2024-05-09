package patrones.compartamiento.strategy;

public class App {

  public void pagoFactura(EstrategiaPago estrategiaPago, int monto, String cliente) {
    estrategiaPago.pagarFactura(monto, cliente);
  }
}
