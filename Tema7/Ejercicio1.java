/** Ejercicios de Java
*
* Ejercicio 1 del Tema 7
*
* Autor: Alejandro  García Serrano
*/


public class Ejercicio1 {
  public static void main(String[] args) {
    int[] n = new int [12];
    
    n[0] = 39;
    n[1] = -2;
    n[4] = 0;
    n[6] = 14;
    n[8] = 5;
    n[9] = 120;
    
    System.out.print ("Los valores del array son: ");
    for (int i = 0; i < 11; i++) {
    System.out.print(n[i] + " ");
    }
    
  }
}

