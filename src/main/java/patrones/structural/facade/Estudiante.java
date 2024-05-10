package patrones.structural.facade;

public class Estudiante {

  private String id;
  MatriculaFacade facade;
  void matricularse(){
    facade.matricularEstudiante(id);
  }
}
