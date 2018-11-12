/** Ejercicios de Java
*
* Ejercicio 14 del Tema 4
*
* Autor: Alejandro  García Serrano
*/


public class Ejercicio14{
  
  public static void main(String[] args) {
    
      System.out.print("Programaque verifica si un número es par y/o divisible entre 5");
        
      System.out.print("Introduca un número entero: ");
      int num = Integer.parseInt(System.console().readLine());
      System.out.println();

    if ((num % 2) == 0) {
      System.out.print ("El número " + num + " es par");
    } else {
       System.out.print ("El número " + num + " es impar");
    }
    if ((num % 5) == 0) {
      System.out.print (" y divisible entre 5");
    } else {
       System.out.print ("y no divisible entre 5");
    }
  } 
    
}
