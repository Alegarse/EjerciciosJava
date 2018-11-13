/** Ejercicios de Java
*
* Ejercicio 6 del Tema 2
*
* Autor: Alejandro  García Serrano
*/


public class Ejercicio06 {
  public static void main(String[] args) {

    int basImp = 3200;
    double conIva = basImp *1.21;
        
    System.out.println("Importe factura:");
    System.out.println("----------------");
    System.out.println("Base imponible: " + basImp+"€");
    System.out.println("I.V.A:          21 %");
    System.out.println("Subtotal:       " + conIva+"€"); 
  }
}
