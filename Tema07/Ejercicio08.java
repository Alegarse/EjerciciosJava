/** Ejercicios de Java
*
* Ejercicio 8 del Tema 7
*
* Autor: Alejandro  García Serrano
*/


public class Ejercicio8 {
  public static void main(String[] args) {
    
    System.out.println ("Programa que muestra la temperatura media de los meses de un año");
    
    int[] temp = new int [12];
    String [] m = {"Enero", "Febrero","Marzo","Abril","Mayo","Junio","Julio","Agosto","Septiembre","Octubre","Noviembre","Diciembre"};
    int i;
    int g;
        
    for (i = 0; i <= 11; i++) {
      System.out.print(" Introduzca la temperatura media de " + m [i] + " ");
      temp [i] = Integer.parseInt(System.console().readLine());
    }
    System.out.println("Temperaturas medias del año:");
    System.out.println("____________________________");
    System.out.println("\033[37m");
    
    for (i = 0; i < 12; i++) {
      System.out.printf("%14s",m[i]);
      System.out.print(" :");
        for (g = 0; g < temp[i]; g++) {
          System.out.print ("\033[32m▤");
        }
      System.out.println(" \033[37m" + temp[i] + "ºC");
    }
    System.out.println("____________________________");
  }
}
