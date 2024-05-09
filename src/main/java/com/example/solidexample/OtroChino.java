package com.example.solidexample;

public class OtroChino extends Carro implements Reporte {

  @Override
  int obtenerPrecio() {
    return 50;
  }


  void configurarAsientos() {
    //configura asientos.
  }

  @Override
  public void enviarReporte() {
    //envia reporte
  }
}
