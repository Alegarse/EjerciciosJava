/** Ejercicios de Java
*
* Ejercicio 11 del Tema 4: Escribe un programa que dada una hora determinada (horas y minutos),
calcule los segundos que faltan para llegar a la medianoche.
*
* Autor: Alejandro  García Serrano
*/


public class Ejercicio11{
  
  public static void main(String[] args) {
    
    System.out.println("Programa que dada una hora determinada (horas y minutos), calcula los segundos que faltan para llegar a la medianoche.");
    System.out.print("Introduzca la hora en formato 24 hrs: ");
    int hora = Integer.parseInt(System.console().readLine());
    System.out.print("Introduzca los minutos: ");
    int minutos = Integer.parseInt(System.console().readLine());
    int tPasado = ((hora * 3600) + (minutos * 60));
    int tRestante = ((24 * 3600) - (tPasado));
    
    System.out.println("Quedan " + tRestante + " segundos para la medianoche");
  }   
}
