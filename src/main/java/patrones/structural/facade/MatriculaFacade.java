package patrones.structural.facade;

public class MatriculaFacade {

  private Factura factura;
  private Email email;

  void matricularEstudiante(String idEstudiante){
    factura.emitirrFactura();
    email.enviarEmail();
  }
}
