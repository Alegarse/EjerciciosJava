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

    System.out.println ("Programa que muestra un array del tipo hoja de cálculo.");
    System.out.println ("====================================================== \n");
    
    
    int [][] num = new int [4][5];
    int fila;
    int columna;
    
    
    for  (fila=0 ; fila <4 ; fila++ ){
              
        for (columna=0 ; columna<5 ; columna++ ){
          System.out.print("Introduzca el numero deseado de la fila " + fila + " y la columna " + columna + " : \n");
          num [fila][columna] = Integer.parseInt(System.console().readLine());
        }
    }
     int sumaF = 0;
     int sumaC = 0;
     
    System.out.println(); 
    System.out.println( "Este es el array bidimensional generado desde los números introducidos");
    System.out.println( "──────────────────────────────────────────────────────────────────────\n45");
    
    for  (fila=0 ; fila <4 ; fila++ ){
        sumaF = 0;      
        for (columna=0 ; columna<5 ; columna++ ){
          System.out.printf ( "%9d", num[fila][columna]);
          sumaF += num [fila][columna];
        }
        System.out.print("   ┊");
        System.out.printf (" Σ = %4d",sumaF);
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
        System.out.printf (" Σ = %4d",sumaC);
    }
    System.out.print ("       TOTAL \n");
  }
}
