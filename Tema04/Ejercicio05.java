/** Ejercicios de Java
*
* Ejercicio 5 del Tema 4: Realiza un programa que resuelva una ecuación de primer grado (del tipo ax +
b = 0).
*
* Autor: Alejandro  García Serrano
*/


public class Ejercicio05 {
  public static void main(String[] args) {
    
    System.out.println("Este programa resuelve ecuaciones de primer grado del tipo ax + b = 0");
    System.out.println("Introduzca el valor deseado para lavariable a");
    double a = Integer.parseInt(System.console().readLine());
    System.out.println("Introduzca el valor deseado para lavariable b");
    double b = Integer.parseInt(System.console().readLine());
        
    if (a == 0) {
      System.out.println ("La ecuación no tiene solución real posible");
    } else {
      System.out.println ("El valor de x es: " + (-b/a));
    }
  }   
}
