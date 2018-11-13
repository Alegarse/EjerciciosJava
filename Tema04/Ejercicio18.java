/** Ejercicios de Java
*
* Ejercicio 18 del Tema 4: Escribe un programa que diga cuál es la primera cifra de un número entero
introducido por teclado. Se permiten números de hasta 5 cifras.
*
* Autor: Alejandro  Garcaría Serrano
*/


public class Ejercicio18{
  
  public static void main(String[] args) {
    
    System.out.println("Programa para averiguar la pimera cifra de un número  de máximo 5 cifras introducido por teclado");
    System.out.println("================================================================================================");

    int num;
    
    /** DESARROLLO*/
    
    System.out.print("Introduce el número entero que tengas en mente: ");
    num = Integer.parseInt(System.console().readLine());
    
    if (num > 9999) {
    System.out.print ("La primera cifra del número es " + (num / 10000));
    }
    if ((num > 999) && (num <= 9999)) {
    System.out.print ("La primera cifra del número es " + (num / 1000));
    }
    if ((num > 99) && (num <= 999)){
    System.out.print ("La primera cifra del número es " + (num / 100));
    }
    if ((num > 9) && (num <= 99)){
    System.out.print ("La primera cifra del número es " + (num / 10));
    }
    if (num <= 9){
    System.out.print ("La primera y única cifra del número es " + num);
    }
      
  } 
    
}
