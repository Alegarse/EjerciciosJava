/** Ejercicios de Java
*
* Ejercicio 2 del Tema 7
*
* Autor: Alejandro  García Serrano
*/


public class Ejercicio02 {
  public static void main(String[] args) {
    char[] simbolo = new char [10];
    
    simbolo[0] = 'a';
    simbolo[1] = 'x';
    simbolo[4] = '@';
    simbolo[6] = ' ';
    simbolo[7] = '+';
    simbolo[8] = 'Q';
    
    System.out.println ("Los valores del array son: ");
    for (int i = 0; i < 10; i++) {
    System.out.println("Elemento " + i + " : " + simbolo[i]);
    }
    
  }
}

