/** Ejercicios de Java
*
* Ejercicio 2 del Tema 3
*
* Autor: Alejandro  García Serrano
*/


public class Ejercicio2 {
  public static void main(String[] args) {
   System.out.println("Calculo de equivalencia de euros a pesetas");
    System.out.print("Introduzca el importe en euros que desea conocer en pesetas: ");
      double euros = Double.parseDouble(System.console().readLine());
      double pesetas = (double) (euros * 166.386);
    System.out.print(euros + " euros equivalen a " + pesetas+ " pesetas");
  }
}
