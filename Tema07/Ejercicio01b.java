/** Ejercicios de Java
*
* Ejercicio 1 del Tema 7b:
* Define un array de números enteros de 3 filas por 6 columnas con nombre num
y asigna los valores según la siguiente tabla. Muestra el contenido de todos
los elementos del array dispuestos en forma de tabla como se muestra en la
figura.
*
* Autor: Alejandro  García Serrano
*/


public class Ejercicio01b {
  public static void main(String[] args) {

    System.out.println ("Programa que muestra un array de 2 dimensiones por pantalla.");
    System.out.println ("============================================================\n");
    
    
    int [][] num = {{0,30,2,0,0,5} , {75,0,0,0,0,0}, {0,0,-2,9,0,11}};
    int fila;
    int columna;
    
    System.out.println("Array num   Columna0 Columna1 Columna2 Columna3 Columna4 Columna5");
    System.out.println("           -------------------------------------------------------");
    
    for  (fila=0 ; fila <3 ; fila++ ){
      System.out.print ("Fila " + fila + "  ");
        
        for (columna=0 ; columna<6 ; columna++ ){
          System.out.printf ( "%9d", num[fila][columna]);
        }
        System.out.println();
    }
  }
}
