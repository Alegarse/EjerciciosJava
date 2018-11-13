/** Ejercicios de Java
*
* Ejercicio 12 del Tema 4: Realiza un minicuestionario con 10 preguntas tipo test sobre las asignaturas
que se imparten en el curso. Cada pregunta acertada sumará un punto. El
programa mostrará al final la calificación obtenida. Pásale el minicuestionario
a tus compañeros y pídeles que lo hagan para ver qué tal andan de conoci-
mientos en las diferentes asignaturas del curso.
*
* Autor: Alejandro  García Serrano
*/


public class Ejercicio12{
  
  public static void main(String[] args) {
    
    System.out.println("Mini cuestionario de conocimientos del curso.");
    
    int puntuacion = 0;
    String respuesta;
    
    System.out.println("Pregunta 1. ¿Es lo mismo el lenguaje Java que el JavaScript?: ");
    System.out.println("a) Si    b)No     c)Si, en una dimensión paralela");
    respuesta = System.console().readLine();
    if (respuesta.equals("b")) {
      puntuacion++;
    }
    System.out.println();
    
    System.out.println("Pregunta 2. ¿Que notación usamos en java  para indicar un caracter?: ");
    System.out.println("a) char    b)String    c)Int");
    respuesta = System.console().readLine();
    if (respuesta.equals("a")) {
      puntuacion++;
    }
    System.out.println();
    
    System.out.println("Pregunta 3. ¿Cuantos perfiles tiene Métrica v3?: ");
    System.out.println("a) 7    b)3     c)5");
    respuesta = System.console().readLine();
    if (respuesta.equals("c")) {
      puntuacion++;
    }
    System.out.println();
    
    System.out.println("Pregunta 4. ¿Piensas que estudias suficiente?: ");
    System.out.println("a) Si    b)No     c)Si has respondido a, es mentira!");
    respuesta = System.console().readLine();
    if (respuesta.equals("c")) {
      puntuacion++;
    }
    System.out.println();
    
    System.out.println("Pregunta 5. ¿De cuantos procesos se compone Métrica v3?: ");
    System.out.println("a) 5    b)9     c)3");
    respuesta = System.console().readLine();
    if (respuesta.equals("c")) {
      puntuacion++;
    }
    System.out.println();
    
    System.out.println("Pregunta 6. ¿Es lo mismo DIMM que SIMM en las memorias RAM?: ");
    System.out.println("a) Si    b)No     c)Depende de si es de 32 o 64 bits");
    respuesta = System.console().readLine();
    if (respuesta.equals("b")) {
      puntuacion++;
    }
    System.out.println();
    
    System.out.println("Pregunta 7. ¿Que indican los MHz en las memorias RAM?: ");
    System.out.println("a) Frecuencia    b)Tiempo de ciclo     c)¿Que es una memoria RAM?");
    respuesta = System.console().readLine();
    if (respuesta.equals("a")) {
      puntuacion++;
    }
    System.out.println();
    
    System.out.println("Pregunta 8. ¿Se puede emular Linux en Maquina Virtual?: ");
    System.out.println("a) Si    b)No     c)A veces");
    respuesta = System.console().readLine();
    if (respuesta.equals("a")) {
      puntuacion++;
    }
    System.out.println();
    
    System.out.println("Pregunta 9. ¿Cuantas sesiones de trabajo de orden primario existen en Métrica v3?: ");
    System.out.println("a) 5   b)4    c)2");
    respuesta = System.console().readLine();
    if (respuesta.equals("b")) {
      puntuacion++;
    }
    System.out.println();
    
    System.out.println("Pregunta 10. ¿Has tenido paciencia y leido hasta esta pregunta?: ");
    System.out.println("a) Si    b)No     c)Perdón, me distraje con el vuelo de una mosca :)");
    respuesta = System.console().readLine();
    if (respuesta.equals("a")) {
      puntuacion++;
    }
    System.out.println();
    System.out.println("Su puntuación total obtenida es: " + puntuacion);
  }   
}
