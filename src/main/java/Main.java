import alto.PagoFactura;
import bajo.Aldeamo;
import bajo.Massivian;

public class Main {

  public static void main(String[] args) {
    PagoFactura pagar = new PagoFactura();
    pagar.realizarPagoElectricidad(new Massivian());
    pagar.realizarPagoAgua(new Aldeamo());

    Clase.metodoStatic();
    Clase instancia = new Clase();
    instancia.otroMetodo();
    instancia.metodoStatic();
  }

  //Injection Dependency : ID
  //Inversion Dependency : ID //Toda la inversion tiene inyeccion, pero no toda la inyeccion es inversion
  //IoC: Inversion of Control: // Toda la inversion de control se apoya en la Inyección de dependencias.
  //Spring
}
