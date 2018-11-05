/** Ejercicios de Java
*
* Ejercicio 4 del Tema 6
*
* Autor: Alejandro  García Serrano
*/


public class Ejercicio4 {
  public static void main(String[] args) {
       
    System.out.println("El programa una sucesión de 20 números aleatorios entre 0 y 10,ambos inclusive");
      for (int i = 0; i <= 19; i++) {
      System.out.print((int)(Math.random()*11) + "  ");
      }
  }
}

