package patrones.proxy;

public class ProxySabana implements Internet {

  private Internet internet;

  public ProxySabana() {
    this.internet = new InternetPublico();
  }

  @Override
  public String navegar(String url) {
    if (url.contains("xxx") || url.contains("youtube")) {
      throw new RuntimeException("Pagina prohibida");
    }
    return internet.navegar(url);
  }
}
//ExceptionHandler