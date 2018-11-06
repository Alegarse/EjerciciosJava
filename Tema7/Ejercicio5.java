/** Ejercicios de Java
*
* Ejercicio 5 del Tema 7
*
* Autor: Alejandro  García Serrano
*/


public class Ejercicio5 {
  public static void main(String[] args) {
    
    System.out.println ("Programa que pide 10 numero y especifica cual es el máximo y cual el mínimo");
    
    int[] num = new int [10];
    int i;
    int max = Integer.MIN_VALUE;
    int min = Integer.MAX_VALUE;
    
    System.out.println ("Por favor,introduzca un número entero y pulse intro");
   
    
    for (i = 0; i < 10; i++) {
      num[i] = Integer.parseInt(System.console().readLine());
      if (num[i] < min) {
        min = num[i];
      }
      if (num[i] > max)  {
        max = num[i];
      }
    }
    System.out.println();
    for (i = 0; i < 10; i++) {
      System.out.print(num[i]);
      if (num[i] == max) {
        System.out.print(" es el máximo");
      }
      if (num[i] == min) {
        System.out.print(" es el mínimo");
      }
      System.out.println();
    }
  }
}

