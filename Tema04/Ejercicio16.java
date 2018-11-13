/** Ejercicios de Java
*
* Ejercicio 16 del Tema 4: Realiza un programa que nos diga si hay probabilidad de que nuestra pareja
nos está siendo infiel. El programa irá haciendo preguntas que el usuario
contestará con verdadero o falso. Cada pregunta contestada como verdadero
sumará 3 puntos. Las preguntas contestadas con falso no suman puntos.
*
* Autor: Alejandro  Garcaría Serrano
*/


public class Ejercicio16{
  
  public static void main(String[] args) {
    
    System.out.println("Test para calcular la probabilidad de que nuestra pareja nos sea infiel");
    System.out.println("=======================================================================");

    int p = 0;
    String r;
    
    /** PREGUNTAS */
    
    System.out.print("01. Tu pareja parece estar más inquieta de lo normal sin ningún motivo aparente \n (v)erdadero o (f)also: ");
    r = System.console().readLine();
    if (r.equals("v")) {
      p += 3;
    } 
    System.out.print("02. Ha aumentado sus gastos de vestuario \n (v)erdadero o (f)also: ");
    r = System.console().readLine();
    if (r.equals("v")) {
      p += 3;
    } 
    System.out.print("03. Ha perdido el interés que mostraba anteriormente por ti \n (v)erdadero o (f)also: ");
    r = System.console().readLine();
    if (r.equals("v")) {
      p += 3;
    } 
    System.out.print("04. Ahora se afeita y se asea con más frecuencia (si es hombre) o ahora se arregla el pelo y se asea con más frecuencia (si es mujer) \n (v)erdadero o (f)also: ");
    r = System.console().readLine();
    if (r.equals("v")) {
      p += 3;
    }
    System.out.print("05. No te deja que mires la agenda de su teléfono móvil \n (v)erdadero o (f)also: ");
    r = System.console().readLine();
    if (r.equals("v")) {
      p += 3;
    } 
    System.out.print("06. A veces tiene llamadas que dice no querer contestar cuando estás tú delante \n (v)erdadero o (f)also: ");
    r = System.console().readLine();
    if (r.equals("v")) {
      p += 3;
    } 
    System.out.print("07. Últimamente se preocupa más en cuidar la línea y/o estar bronceado/a \n (v)erdadero o (f)also: ");
    r = System.console().readLine();
    if (r.equals("v")) {
      p += 3;
    } 
    System.out.print("08. Muchos días viene tarde después de trabajar porque dice tener mucho más trabajo \n (v)erdadero o (f)also: ");
    r = System.console().readLine();
    if (r.equals("v")) {
      p += 3;
    } 
    System.out.print("09. Has notado que últimamente se perfuma más \n (v)erdadero o (f)also: ");
    r = System.console().readLine();
    if (r.equals("v")) {
      p += 3;
    } 
    System.out.print("10. Se confunde y te dice que ha estado en sitios donde no ha ido contigo \n (v)erdadero o (f)also: ");
    r = System.console().readLine();
    if (r.equals("v")) {
      p += 3;
    } 
    System.out.println();
    /** RESPUESTAS AL TEST */
    
    if (p <= 10) {
      System.out.print ("¡Enhorabuena! tu pareja parece ser totalmente fiel. \n ");
    }  
    if ((p > 10) && (p <= 22)) {
      System.out.print ("Quizás exista el peligro de otra persona en su vida o en su mente, aunque seguramente será algo sin importancia. No bajes la guardia. \n");
    }
    if (p >22) {
      System.out.print ("Tu pareja tiene todos los ingredientes para estar viviendo un romance con otra persona. Te aconsejamos que indagues un poco más y averigües que es lo que está pasando por su cabeza. \n");
    }
      
  } 
    
}
