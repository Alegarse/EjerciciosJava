/** Ejercicios de Java
*
* Ejercicio 5 del Tema 7b: Realiza un programa que rellene un array de 6 filas por 10 columnas con
números enteros positivos comprendidos entre 0 y 1000 (ambos incluidos).
A continuación, el programa deberá dar la posición tanto del máximo como
del mínimo.
*
* Autor: Alejandro  García Serrano
*/


public class Ejercicio05b {
  public static void main(String[] args) {

    System.out.println ("Array con maximo y mínimo marcado.");
    System.out.println ("================================= \n");
    

      
      int [][] num = new int [6][10];
      int fila;
      int columna;
    
    
      for  (fila=0 ; fila <6 ; fila++ ){
          for (columna=0 ; columna<10 ; columna++ ){
            num [fila][columna] = (int)(Math.random() * 1001);
          }
      }
      
      int max = 0;
      int min = 1000;
      int fmax =0;
      int cmax = 0;
      int fmin = 0;
      int cmin = 0;
      
      for  (fila=0 ; fila <6 ; fila++ ){
          for (columna=0 ; columna<10 ; columna++ ){
            if ((num [fila][columna]) >  max); {
              max = num [fila][columna];
              fmax = fila;
              cmin = columna;
            }
          }
      }
      for  (fila=0 ; fila <6 ; fila++ ){
          for (columna=0 ; columna<10 ; columna++ ){
            if ((num [fila][columna]) <  min); {
              min = num [fila][columna];
              fmin = fila;
              cmin = columna;             
            }
          }
      }

      int sumaF = 0;
      int sumaC = 0;
      
      System.out.println(); 
      System.out.println( "Este es el array bidimensional generado de forma aleatoria");
      System.out.println( "──────────────────────────────────────────────────────────");
    
      for  (fila=0 ; fila <6 ; fila++ ){
                
          for (columna=0 ; columna<10 ; columna++ ){
            System.out.printf ( "%9d", num[fila][columna]);
          try {
            Thread.sleep(100);
          } catch (InterruptedException ex) {
          // No compilaba usando el inicio, así que he creado esta excepción
          }
            sumaF += num [fila][columna];
          }
          System.out.print("   ┊");
          try {
            Thread.sleep(1000);
          } catch (InterruptedException ex) {
          // No compilaba usando el inicio, así que he creado esta excepción
          }
          System.out.printf ("   Σ=%4d",sumaF);
          System.out.println();
      }
      for (columna=0 ; columna<10 ; columna++) {
          System.out.print ("┄┄┄┄┄┄┄┄┄");
      }
      System.out.println();
      for (columna=0 ; columna<10 ; columna++) {
          sumaC = 0;
          for (fila=0 ; fila<6 ; fila++) {
            sumaC += num [fila][columna];
          }
          try {
            Thread.sleep(1000);
          } catch (InterruptedException ex) {
          // No compilaba usando el inicio, así que he creado esta excepción
          }
          System.out.printf ("   Σ=%4d",sumaC);
      }
      System.out.print ("       TOTAL \n");
      

      System.out.println ("El máximo es " + max + " y está en la posición {" + fmax +"," + cmax + "}");
      System.out.println ("El mínimo es " + min + " y está en la posición {" + fmin +"," + cmin + "}");
      
    }
  }

