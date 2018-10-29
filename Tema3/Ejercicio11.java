/** Ejercicios de Java
*
* Ejercicio 11 del Tema 3
*
* Autor: Alejandro  García Serrano
*/


public class Ejercicio11 {
  public static void main(String[] args) {
    
    System.out.println("Conversor de Kilobits a Megabits");
    System.out.print("Introduzca una cantidad de Kb: ");
    int kilobits = Integer.parseInt(System.console().readLine());
    System.out.println(kilobits + " Kb equivalen a: " + (kilobits * 0.001) + " Mb");
  } 
}
