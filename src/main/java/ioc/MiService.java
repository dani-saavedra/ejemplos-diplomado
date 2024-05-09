package ioc;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

//Esto indica que queremos que nuestra anotación esté disponible en tiempo de ejecución,
// lo que nos permitirá inspeccionarla utilizando reflexión en tiempo de ejecución.
@Retention(RetentionPolicy.RUNTIME)
//Esto especifica que nuestra anotación se puede aplicar solo a tipos (clases, interfaces, enumeraciones).
@Target(ElementType.TYPE)
public @interface MiService {

  int version() default 1;
}