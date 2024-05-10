package patrones.creacionales.abstractfactory;

public class Main {

  public static void main(String[] args) {
    decorarionesJohn(new DecoracionModerna());
  }

  public static void decorarionesJohn(Decoracion decoracion) {//Como quiere decorar)
    /*
      if (estilo.equals("Victoriano")) {
        SillaVictoriana sillaVictoriana = new SillaVictoriana();
        SofaVictoriana sofaVictoriana = new SofaVictoriana();
        sillaVictoriana.verEstiloSilla();
      } else if ("Moderno".equals(estilo)) {
        SillaModerna sillaModerno = new SillaModerna();
        SofaModerna sofaModerno = new SofaModerna();
        sillaModerno.verEstiloSilla();
      }
     */

    Silla silla = decoracion.crearSilla();
    Sofa sofa = decoracion.creaSofa();
    sofa.verEstiloSofa();
    silla.verEstiloSilla();

  }
}
