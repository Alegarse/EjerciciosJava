/** Ejercicios de Java
*
* Ejercicio 2 del Tema 7b:
* Escribe un programa que pida 20 números enteros. Estos números se deben
introducir en un array de 4 filas por 5 columnas. El programa mostrará las
sumas parciales de filas y columnas igual que si de una hoja de cálculo se
tratara. La suma total debe aparecer en la esquina inferior derecha.
*
* Autor: Alejandro  García Serrano
*/


public class Ejercicio02b {
  public static void main(String[] args) {

    System.out.println ("Programa que muestra un array de 2 dimensiones por pantalla.");
    System.out.println ("============================================================\n");
    
    
    int [][] num = {{0,30,2,0,0,5} , {75,0,0,0,0,0}, {0,0,-2,9,0,11}};
    int fila;
    int columna;
    
    System.out.println("Array num   Columna0 Columna1 Columna2 Columna3 Columna4 Columna5");
    
    for  (fila=0 ; fila <3 ; fila++ ){
      System.out.print ("Fila " + fila + " ");
        
        for (columna=0 ; columna<6 ; columna++ ){
          System.out.printf ( "%9d", num[fila][columna]);
        }
        System.out.println();
    }
  }
}
