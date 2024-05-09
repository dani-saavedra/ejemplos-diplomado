package alto;

public class PagoFactura {

  //Inyección: Eliminar la responsabilidad de una clase de tener que crear instancias de otra clase
  //y en su lugar, esa dependencia sea recibida a través de constructor o por parametro.

  public void realizarPagoElectricidad(Notificacion notificacion) {
    //Realiza el pago
    System.out.println("Estoy pagando la factura");
    notificacion.enviarNotificacionSMS("pague");
  //Para hacer Inversion de dependencias, necesitar inyeccción de depdencias.
  }

  public void realizarPagoAgua(Notificacion notificacion) {
    //Realiza el pago
    System.out.println("Estoy pagando la factura");
    notificacion.enviarNotificacionSMS("pague");
    //Para hacer Inversion de dependencias, necesitar inyeccción de depdencias.
  }

}
//acoplamiento
