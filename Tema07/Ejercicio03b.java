/** Ejercicios de Java
*
* Ejercicio 3 del Tema 7b: Modifica el programa anterior de tal forma que los números que se introducen
en el array se generen de forma aleatoria (valores entre 100 y 999).
*
* Autor: Alejandro  García Serrano
*/


public class Ejercicio03b {
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
          sumaF += num [fila][columna];
        }
        System.out.print("   ┊");
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
        System.out.printf ("   Σ=%4d",sumaC);
    }
    System.out.print ("       TOTAL \n");
  }
}
