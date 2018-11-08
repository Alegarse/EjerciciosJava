/** Ejercicios de Java
*
* Ejercicio 6 del Tema 7
*
* Autor: Alejandro  García Serrano
*/


public class Ejercicio6 {
  public static void main(String[] args) {
    
    System.out.println ("Programa que pide 15 numeros y los reordena en el array");
    
    int[] array = new int [15];
    int i;
    
    System.out.println ("Por favor,introduzca un número entero y pulse intro: ");
    for (i = 0; i <= 14; i++) {
      array [i] = Integer.parseInt(System.console().readLine());
    }
    System.out.println("Array original:");
    for (i = 0; i <= 14; i++) {
      System.out.println(array [i] + " ");
    }
    System.out.println("Array invertido:");
    for (i = 14; i >= 0; i--) {
      System.out.println(+ array [i] + " ");
    }
  }
}
