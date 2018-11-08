/** Ejercicios de Java
*
* Ejercicio 7 del Tema 7
*
* Autor: Alejandro  García Serrano
*/


public class Ejercicio7 {
  public static void main(String[] args) {
   
   System.out.println("Programa que muestra 100 números aleatorios por pantalla");
   int [] numeros = new int [100];
   int i, valor1, valor2;
   
   for (i = 0; i <100; i++) {
   numeros [i] = (int)(Math.random() * 101);
   }
   for (i = 0; i <100; i++) {
   System.out.print (numeros[i] + " ");
   }
   System.out.println();
   System.out.println ("Introduzca un valor existente en el listado:");
   valor1 = Integer.parseInt(System.console().readLine());
   
   System.out.println ("Introduzca a que valor desea cambiarlo:");
   valor2 = Integer.parseInt(System.console().readLine());
   
   for (i = 0; i <100; i++) {
     if (numeros[i] == valor1) {
       System.out.print ("\""+ valor2 + "\" ");
     } else {
       System.out.print (numeros[i] + " ");  
     }
    }
  }
}
