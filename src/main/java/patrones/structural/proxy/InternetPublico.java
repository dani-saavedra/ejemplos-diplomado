package patrones.structural.proxy;

public class InternetPublico implements Internet {

  @Override
  public String navegar(String url) {
    return "Contenido de la pagina " + url;
  }
}
