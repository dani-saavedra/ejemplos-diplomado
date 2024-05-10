package patrones.creacionales.abstractfactory;

public class DecoracionModerna implements Decoracion {

  @Override
  public Silla crearSilla() {
    return new SillaModerna();
  }

  @Override
  public Sofa creaSofa() {
    return new SofaModerna();
  }


}
