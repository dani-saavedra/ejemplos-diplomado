package patrones.compartamiento.chain;

public class Manejador100 implements Manejador{

  @Override
  public boolean validar(Moneda moneda) {
    return "100 Pesos Colombianos".equals(moneda.getTexto());
  }

  @Override
  public int obtenerValor() {
    return 100;
  }
}
