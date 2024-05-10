package reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

public class Main {

  public static void main(String[] args)
      throws NoSuchFieldException, IllegalAccessException, NoSuchMethodException, InvocationTargetException, InstantiationException {
  /*
    Persona daniel = new Persona("Daniel");
    System.out.println(daniel.getNombre());
    Field campo = Persona.class.getDeclaredField("nombre");
    campo.setAccessible(true);
    campo.set(daniel, "Super Daniel");
    System.out.println(daniel.getNombre());

   */

    Class<Logica> logica = Logica.class;
    OtraLogica instancciaOtralogica = new OtraLogica();
    if (!logica.isAnnotationPresent(Service.class)) {
      throw new RuntimeException("No aplico Inversion de Control correctamente");
    }
    Class<OtraLogica> otraLogicaClass = OtraLogica.class;

    Constructor<Logica> constructor = logica.getDeclaredConstructor(otraLogicaClass);
    constructor.setAccessible(true);


    Logica instanciaLogica = constructor.newInstance(instancciaOtralogica);
    instanciaLogica.hacerAlgo();

  }
}
