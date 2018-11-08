/** Ejercicios de Java
*
* Ejercicio 10 del Tema 4
*
* Autor: Alejandro  García Serrano
*/


public class Ejercicio10{
  
  public static void main(String[] args) {
    
    System.out.println("Este programa te dice que Horóscopo eres según tu fecha de nacimiento");
    System.out.print("Introduzca su día de nacimiento: ");
    int dia = Integer.parseInt(System.console().readLine());
    System.out.print("Introduzca su mes de nacimiento (1 -12): ");
    int mes = Integer.parseInt(System.console().readLine());
    
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
