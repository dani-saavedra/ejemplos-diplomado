package patrones.creacionales.abstractfactory;

public class DecoracionVictoriana implements Decoracion {

  @Override
  public Silla crearSilla() {
    return new SillaVictoriana();
  }


  @Override
  public Sofa creaSofa() {
    return new SofaVictoriana();
  }

}
