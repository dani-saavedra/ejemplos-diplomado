package reflection;

public class Logica {

  private OtraLogica otraLogica;

  public Logica(OtraLogica otraLogica) {
    this.otraLogica = otraLogica;
  }

  public void hacerAlgo() {
    otraLogica.saludar();
  }
}
