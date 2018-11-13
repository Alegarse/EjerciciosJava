/** Ejercicios de Java
*
* Ejercicio 9 del Tema 4: Realiza un programa que resuelva una ecuación de segundo grado (del tipo
ax 2 + bx + c = 0).
*
* Autor: Alejandro  García Serrano
*/


public class Ejercicio09{
  
  public static void main(String[] args) {
    
    System.out.println("Este programa te dice la solución a una ecuación del tipo ax 2 + bx + c = 0).");
    System.out.print("Introduca el valor de a: ");
    int a = Integer.parseInt(System.console().readLine());
    System.out.print("Introduca el valor de b: ");
    int b = Integer.parseInt(System.console().readLine());
    System.out.print("Introduca el valor de c: ");
    int c = Integer.parseInt(System.console().readLine());
    
    if ((a == 0) && (b != 0)) {
      System.out.println ("La ecuación no tiene solución");
    }
    if ((a == 0) && (b == 0) && (c != 0)) {
      System.out.printf ("Se produce una igualdad imposible, ya que %.0f = 0 no es posible",c);
    }
    if ((a != 0) && (b == 0)) {
      System.out.println ("La solución es un número imaginario");
    }
    if ((a != 0) && (b != 0) && (c == 0)) {
      double sol1 = (-b / a);
      System.out.println ("Las soluciones son: 0 y = " + sol1);
    }
    if ((a != 0) && (b != 0) && (c != 0)){
      System.out.println ("Las soluciones son: " + (-c) + " y " + (-b / a));
    }
  }   
}
