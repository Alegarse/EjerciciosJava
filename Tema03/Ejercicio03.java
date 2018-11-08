/** Ejercicios de Java
*
* Ejercicio 3 del Tema 3
*
* Autor: Alejandro  García Serrano
*/


public class Ejercicio3 {
  public static void main(String[] args) {
   System.out.println("Calculo de equivalencia de pesetas a euros");
    System.out.print("Introduzca el importe en pesetas que desea conocer en euros: ");
      double pesetas = Double.parseDouble(System.console().readLine());
      double euros = (double) (pesetas / 166.386);
    System.out.print(pesetas + " pesetas equivalen a " + euros + " euros.");
  }
}
