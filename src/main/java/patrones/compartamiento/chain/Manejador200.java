package patrones.compartamiento.chain;

public class Manejador200 implements Manejador {

  @Override
  public boolean validar(Moneda moneda) {
    return "200 Pesos Colombianos".equals(moneda.getTexto());
  }

  @Override
  public int obtenerValor() {
    return 200;
  }

}
