/** Ejercicios de Java
*
* Ejercicio 8 del Tema 3
*
* Autor: Alejandro  García Serrano
*/


public class Ejercicio08 {
  public static void main(String[] args) {
    System.out.println("Cálculo de salario semanal");
    System.out.print("Introduzca las horas trabajadas: ");
    int horas = Integer.parseInt(System.console().readLine());
    System.out.println("El salario semanal es de: " + (horas * 12) + " €");
  } 
}
