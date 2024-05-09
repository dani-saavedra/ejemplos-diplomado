package ioc;

public class PersonaService {

  private PruebaService pruebaService;

  public PersonaService(PruebaService pruebaService) {
    this.pruebaService = pruebaService;
  }

  public void hacerAlgo() {
    pruebaService.saludar();
  }
}
