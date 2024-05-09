package patrones.compartamiento.chain;

public interface Manejador {

  boolean validar(Moneda moneda);

  int obtenerValor();

}
