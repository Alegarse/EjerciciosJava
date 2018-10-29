/** Ejercicios de Java
*
* Ejercicio 1 del Tema 3
*
* Autor: Alejandro  García Serrano
*/


public class Ejercicio1 {
  public static void main(String[] args) {
    int x;
    int y;
    String multiplicacion;
    
    System.out.print("Introduzca un número: ");
    multiplicacion = System.console().readLine();
    x = Integer.parseInt( multiplicacion );
    System.out.print("Introduzca otro número: ");
    multiplicacion = System.console().readLine();
    y = Integer.parseInt( multiplicacion );
    System.out.println("El resultado de la multiplicación es: " + (x * y));
  }
}
