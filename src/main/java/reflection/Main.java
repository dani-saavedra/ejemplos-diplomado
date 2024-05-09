package reflection;

import java.lang.reflect.Field;

public class Main {

  public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {

    Persona daniel = new Persona("Daniel");
    System.out.println(daniel.getNombre());

    Field campo = Persona.class.getDeclaredField("nombre");
    campo.setAccessible(true);
    campo.set(daniel, "Super Daniel");
    System.out.println(daniel.getNombre());
  }
}
