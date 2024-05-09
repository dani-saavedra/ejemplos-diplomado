package ioc;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Main {

  public static void main(String[] args) throws Exception {
    Class<PruebaService> clase = PruebaService.class;
    PruebaService prueba = new PruebaService();

    // Verificamos si la anotación está presente en la clase
    if (clase.isAnnotationPresent(MiService.class)) {
      //creamos una instancia de el
    } else {
      System.out.println("La anotación no está presente en la clase.");
    }

    Class<PersonaService> personaService = PersonaService.class;

    // Obtenemos el constructor de PersonaService que recibe una clase
    Constructor<PersonaService> constructor = personaService.getDeclaredConstructor(
        PruebaService.class);

    // Hacemos accesible el constructor para poder utilizarlo
    constructor.setAccessible(true);

    // Creamos una nueva instancia de PersonaService utilizando el constructor
    PersonaService persona = constructor.newInstance(prueba);
    persona.hacerAlgo();
  }
}
