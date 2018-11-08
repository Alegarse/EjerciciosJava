/** Ejercicios de Java
*
* Ejercicio 7 del Tema 3
*
* Autor: Alejandro  García Serrano
*/


public class Ejercicio7 {
  public static void main(String[] args) {
    System.out.println("Programa para obtener el importe total de una factura a partir de la base imponible");
    System.out.print("Introduzca la base imponible del producto: ");
    double baseImponible = Double.parseDouble(System.console().readLine());
    System.out.printf("Base imponible %10.2f\n", baseImponible);
    System.out.printf("IVA            %10.2f\n", (baseImponible * 0.21));
    System.out.printf("-----------------------\n");
    System.out.printf("Total          %10.2f\n", (baseImponible * 1.21));
  } 
}
