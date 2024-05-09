package com.example.solidexample;

public class Main {


  public static void main(String[] args) {
    Carro[] carros = {
        new Audi(),
        new Cherry(),
        new Mercedez()
    };
    verPrecioCarros(carros);
  }
  //Herencia, Polimorfirmo, Encapsulación, abstracción.

  public static void verPrecioCarros(Carro[] carros) {
    for (Carro carro : carros) {
      System.out.println(carro.obtenerPrecio());
    }
  }

  public static void configurarAsientosCarro(Carro[] carros) {
    for (Carro carro : carros) {
      //Esta instancia es de TIPO TAL:
      if (carro instanceof Audi) {
        ((Audi) carro).buildChairs();
      } else if (carro instanceof Mercedez) {
        ((Mercedez) carro).setupChairs();
      }
    }
  }

}
