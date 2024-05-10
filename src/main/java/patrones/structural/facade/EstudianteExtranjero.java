package patrones.structural.facade;

public class EstudianteExtranjero {

  private String pasporte;
  MatriculaFacade facade;
  void matricularse(){
    //No es obligatorio que las facades, hagan reuso, sin embargo, si lo hace,chevre
    facade.matricularEstudiante(pasporte);
  }
}
