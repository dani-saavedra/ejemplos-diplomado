package patrones.compartamiento.chain;

import java.util.List;

public class Coin {

  private List<Manejador> manejadores;

  public Coin(List<Manejador> manejadores) {
    this.manejadores = manejadores;
  }

  //Trade off
  public int sumarMonedasIngresadas(List<Moneda> monedas) {
    int dineroIngresado = 0;
    for (Moneda moneda : monedas) {
      for (Manejador manejador : manejadores) {
        if (manejador.validar(moneda)) {
          dineroIngresado = dineroIngresado + manejador.obtenerValor();
        }
      }
    }
    return dineroIngresado;
  }
}
