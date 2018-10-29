/** Ejercicios de Java
*
* Ejercicio 5 del Tema 3
*
* Autor: Alejandro  García Serrano
*/


public class Ejercicio5 {
  public static void main(String[] args) {
    System.out.println("Programa de cálculo de área de rectangulos");
    System.out.print("Introduzca la longitud de la base en centímetros: ");
    double base = Double.parseDouble(System.console().readLine());
    System.out.print("Introduzca el valor de la altura: ");
    double altura = Double.parseDouble(System.console().readLine());
    System.out.println("El área del rectángulo es de " + (base * altura) + " cm²");
  } 
}
