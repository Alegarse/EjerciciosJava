/** Ejercicios de Java
*
* Ejercicio 4 del Tema 7
*
* Autor: Alejandro  García Serrano
*/


public class Ejercicio4 {
  public static void main(String[] args) {
    
    System.out.println ("Programa que genera 20 números aleatorios u les calcula el cuadrado y el cubo: ");
    
    int[] numero = new int [20];
    int[] cuadrado = new int [20];
    int[] cubo = new int [20];
    int i;
    
    for (i = 0; i < 20 ; i++) {
    numero [i] = (int)(Math.random() * 101);
    cuadrado [i] = numero [i] * numero [i];
    cubo [i] = numero [i] * cuadrado [i];
    }
    
    System.out.println("  n  │   n²  │    n³\n─────┼───────┼─────────");
    for (i = 0; i < 20 ; i++){
      System.out.printf("%3d  | %5d | %8d \n", numero[i], cuadrado[i], cubo[i]);
    }
    System.out.println("─────┼───────┼─────────");
  }
}

