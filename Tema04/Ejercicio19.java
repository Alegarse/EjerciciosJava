/** Ejercicios de Java
*
* Ejercicio 19 del Tema 4 : Realiza un programa que nos diga cuántos dígitos tiene un número entero que
puede ser positivo o negativo. Se permiten números de hasta 5 dígitos.
*
* Autor: Alejandro  Garcaría Serrano
*/


public class Ejercicio19{
  
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
