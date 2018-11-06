/** Ejercicios de Java
*
* Ejercicio 3 del Tema 7
*
* Autor: Alejandro  García Serrano
*/


public class Ejercicio3 {
  public static void main(String[] args) {
    
    System.out.println ("Programa que lee 10 números por teclado y luego los muestra en orden inverso");
    
    int[] num = new int [10];
    for (int i = 0; i < 10; i++) {
    System.out.print ("Por favor, introduzca un número y pulse la tecla intro: ");
    num[i] = Integer.parseInt(System.console().readLine());
    }
    
    System.out.println ("Los valores del array son: ");
    for (int i = 0; i < 10; i++) {
    System.out.println("Posición array " + i + " : " + num[i]);
    }
    System.out.println("");
    System.out.println ("Los valores del array invertidos son: ");
    for (int i = 9; i >= 0; i--) {
    System.out.println("Posición array " + i + " : " + num[i]);
    }
    
  }
}

