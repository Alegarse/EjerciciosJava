/** Ejercicios de Java
*
* Ejercicio 4 del Tema 7b: Modifica el programa anterior de tal forma que las sumas parciales y la suma
total aparezcan en la pantalla con un pequeño retardo, dando la impresión de
que el ordenador se queda “pensando” antes de mostrar los números.
*
* Autor: Alejandro  García Serrano
*/


public class Ejercicio04b {
  public static void main(String[] args) {

    System.out.println ("Programa que muestra un array del tipo hoja de cálculo.");
    System.out.println ("====================================================== \n");
    

      
      int [][] num = new int [4][5];
      int fila;
      int columna;
    
    
      for  (fila=0 ; fila <4 ; fila++ ){
          for (columna=0 ; columna<5 ; columna++ ){
            num [fila][columna] = (int)((Math.random()*900) + 100);
          }
      }
      int sumaF = 0;
      int sumaC = 0;
      
      System.out.println(); 
      System.out.println( "Este es el array bidimensional generado de forma aleatoria");
      System.out.println( "──────────────────────────────────────────────────────────");
    
      for  (fila=0 ; fila <4 ; fila++ ){
          sumaF = 0;      
          for (columna=0 ; columna<5 ; columna++ ){
            System.out.printf ( "%9d", num[fila][columna]);
          try {
            Thread.sleep(500);
          } catch (InterruptedException ex) {
          // No compilaba usando elinicio, así que he creado esta excepción
          }
            sumaF += num [fila][columna];
          }
          System.out.print("   ┊");
          try {
            Thread.sleep(1000);
          } catch (InterruptedException ex) {
          // No compilaba usando elinicio, así que he creado esta excepción
          }
          System.out.printf ("   Σ=%4d",sumaF);
          System.out.println();
      }
      for (columna=0 ; columna<5 ; columna++) {
          System.out.print ("┄┄┄┄┄┄┄┄┄");
      }
      System.out.println();
      for (columna=0 ; columna<5 ; columna++) {
          sumaC = 0;
          for (fila=0 ; fila<4 ; fila++) {
            sumaC += num [fila][columna];
          }
          try {
            Thread.sleep(1000);
          } catch (InterruptedException ex) {
          // No compilaba usando elinicio, así que he creado esta excepción
          }
          System.out.printf ("   Σ=%4d",sumaC);
      }
      System.out.print ("       TOTAL \n");
    }
  }

