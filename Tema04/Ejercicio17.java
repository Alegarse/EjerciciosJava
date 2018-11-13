/** Ejercicios de Java
*
* Ejercicio 17 del Tema 4: Escribe un programa que diga cuál es la última cifra de un número entero
introducido por teclado.
*
* Autor: Alejandro  Garcaría Serrano
*/


public class Ejercicio17{
  
  public static void main(String[] args) {
    
    System.out.println("Programa para averiguar la última cifra de un número introducido por teclado");
    System.out.println("============================================================================");

    int num;
    
    /** DESARROLLO*/
    
    System.out.print("Introduce el número entero que tengas en mente: ");
    num = Integer.parseInt(System.console().readLine());
    System.out.print ("La última cifra del número es " + (num % 10));

      
  } 
    
}
