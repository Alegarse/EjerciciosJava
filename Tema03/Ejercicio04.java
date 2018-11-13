/** Ejercicios de Java
*
* Ejercicio 4 del Tema 3
*
* Autor: Alejandro  García Serrano
*/


public class Ejercicio04 {
  public static void main(String[] args) {
    double x;
    double y;
    String dato;
    
    System.out.print("Introduzca un número: ");
    dato = System.console().readLine();
    x = Integer.parseInt(dato);
    System.out.print("Introduzca otro número: ");
    dato = System.console().readLine();
    y = Integer.parseInt(dato);
    System.out.println("El resultado de su suma es: " + (x + y));
    System.out.println("El resultado de su resta es: " + (x - y));
    System.out.println("El resultado de su multiplicación es: " + (x * y));
    System.out.println("El resultado de su divisiónes: " + (x / y));
  } 
}
