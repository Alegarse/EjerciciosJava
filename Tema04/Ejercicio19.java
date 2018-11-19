/** Ejercicios de Java
*
* Ejercicio 19 del Tema 4 : Realiza un programa que nos diga cuántos dígitos tiene un número entero que
puede ser positivo o negativo. Se permiten números de hasta 5 dígitos.
*
* Autor: Alejandro  Garcaría Serrano
*/


public class Ejercicio19{
  
  public static void main(String[] args) {
    
    System.out.println("Programa que indica cuantos dígitos tiene un número");
    System.out.println("================================================================================================");
    
    int num, numabs;
    int digitos = 0;
    System.out.print("Introduce el número entero que tengas en mente: ");
    num = Integer.parseInt(System.console().readLine());
    numabs = Math.abs(num);
    System.out.println();

     /** DESARROLLO*/
    
    
    if (numabs > 9999) {
      digitos = 5;
      System.out.print ("El número " + num + " tiene " + digitos + " digitos");
    }
    if ((numabs > 999) && (numabs <= 9999)) {
      digitos = 4;
      System.out.print ("El número " + num + " tiene " + digitos + " digitos");
    }
    if ((numabs > 99) && (numabs <= 999)){
      digitos = 3;
      System.out.print ("El número " + num + " tiene " + digitos + " digitos");
    }
    if ((numabs > 9) && (numabs <= 99)){
      digitos = 2;
      System.out.print ("El número " + num + " tiene " + digitos + " digitos");
    }
    if (numabs <= 9){
      digitos = 1;
      System.out.print ("El número " + num + " tiene " + digitos + " digito");
    }
      
  } 
    
}
