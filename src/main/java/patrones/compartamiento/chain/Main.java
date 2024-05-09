package patrones.compartamiento.chain;

import java.util.ArrayList;
import java.util.List;

public class Main {

  public static void main(String[] args) {
    List<Manejador> manejadores = new ArrayList<>();
    manejadores.add(new Manejador500());
    manejadores.add(new Manejador100());
    manejadores.add(new Manejador200());

    List<Moneda> monedas = new ArrayList<>();
    //monedas.add(new Moneda("200 Pesos Chilenos"));
    //monedas.add(new Moneda("100 Soles"));
    //DEAD CODE

    monedas.add(new Moneda("500 Pesos Colombianos"));
    monedas.add(new Moneda("500 COP"));
    monedas.add(new Moneda("100 Pesos Colombianos"));

    Coin coinkk = new Coin(manejadores);
    int total = coinkk.sumarMonedasIngresadas(monedas);
    System.out.println("Dinero ingresado " + total);
  }
}
