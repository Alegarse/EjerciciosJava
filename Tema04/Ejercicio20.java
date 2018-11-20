/** Ejercicios de Java
*
* Ejercicio 20 del Tema 4 : Realiza un programa que diga si un número entero positivo introducido por
teclado es capicúa. Se permiten números de hasta 5 cifras.
*
* Autor: Alejandro  Garcaría Serrano
*/


public class Ejercicio20{
  
  public static void main(String[] args) {
    
    System.out.println("Programa que comprueba si un número introducido es capicúa);
    System.out.println("================================================================================================");
    
    int num,numInv;
    int resto = 0;
   
    System.out.print("Introduce el número entero que tengas en mente: ");
    num = Math.abs(Integer.parseInt(System.console().readLine()));
    System.out.println();

     /** DESARROLLO*/
    
    while(resto != 0) {
          resto=num%10;
          numInv=numInv*10+resto;
          falta=falta/10;
    }
    
  } 
    
}
