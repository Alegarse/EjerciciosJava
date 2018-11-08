/** Ejercicios de Java
*
* Ejercicio 10 del Tema 3
*
* Autor: Alejandro  García Serrano
*/


public class Ejercicio10 {
  public static void main(String[] args) {
    
    System.out.println("Conversor de Megabits a Kilobits");
    System.out.print("Introduzca una cantidad de Mb: ");
    int megabits = Integer.parseInt(System.console().readLine());
    System.out.println(megabits + " Mb equivalen a: " + (megabits * 1000) + " Kb");
  } 
}
