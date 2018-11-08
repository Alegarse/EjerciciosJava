/** Ejercicios de Java
*
* Ejercicio 10 del Tema 7
*
* Autor: Alejandro  García Serrano
*/


public class Ejercicio10 {
  public static void main(String[] args) {
    System.out.println("Programa que organiza 20 números aleatorios colocando primerlo los pares y a continuación los impares");
    int [] numeros = new int [20];
    int i;
    for (i = 0; i <20; i++) {
    numeros [i] = (int)(Math.random() * 21);
    }
    System.out.println("Los numeros generados aleatoriamente originales son:");
    for (i = 0; i <20; i++) {
    System.out.print (+ numeros[i] + " ");
    }
    for (i = 0; i <20; i++) {
    System.out.print ("Número: " + numeros[i]);
      if ( numeros[i] %2 == 0) {
        System.out.print (" :Par");
      } else {
        System.out.print (" :Impar");
      }
    
  }
}
