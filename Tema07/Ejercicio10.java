/** Ejercicios de Java
*
* Ejercicio 10 del Tema 7
*
* Autor: Alejandro  García Serrano
*/


public class Ejercicio10 {
  public static void main(String[] args) {
    System.out.println("Programa que organiza 20 números aleatorios colocando primerlo los pares y a continuación los impares");
    
    int [] num = new int [20];
    int n;
    
    for (n = 0; n <20; n++) {
    num [n] = (int)(Math.random() * 21);
    }
    System.out.println("Los numeros generados aleatoriamente originales son:");
    
    for (n = 0; n <20; n++) {
    System.out.print (+ num[n] + " ");
    }
    
    System.out.println ();
    System.out.println ("El conjunto de números ordenados par/impar es:");
    
    for (n = 0; n < 20; n++) {
      if (num[n] %2 == 0) {
        System.out.print ( + num[n] + " ");
      } 
    }
    for (n = 0; n < 20; n++) {
      if (num[n] %2 == 0) {
      } else {
      System.out.print ( + num[n] + " ");
      } 
    }
  }
}
