/** Ejercicios de Java
*
* Ejercicio 6 del Tema 4: Realiza un programa que calcule el √
tiempo que tardará en caer un objeto desde una altura h.
*
* Autor: Alejandro  García Serrano
*/


public class Ejercicio06 {
  
  final static double g = 9.81;
  
  public static void main(String[] args) {
    
    System.out.println("Este programa calcula el tiempo que tarda en caer un objeto desde una altura 'h' ");
    System.out.println("Introduzca el valor deseado para la altura");
    double h = Double.parseDouble(System.console().readLine());
    
    double t = Math.sqrt(2*h/g);
        
    if (h == 0) {
      System.out.println ("No has dejado caer el objeto desde ninguna altura");
    } else {
      System.out.printf ("El tiempo que tarda en caer es  %.2f segundos.\n",t);
    }
  }   
}
