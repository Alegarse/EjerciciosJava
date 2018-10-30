/** Ejercicios de Java
*
* Ejercicio 1 del Tema 6
*
* Autor: Alejandro  García Serrano
*/


public class Ejercicio1 {
  public static void main(String[] args) {
    int dado = (int) (Math.random() * 6) + 1;
    int dado2 = (int) (Math.random() * 6) + 1;
    int dado3 = (int) (Math.random() * 6) + 1;
    int suma = (dado + dado2 + dado3);
    
    System.out.println("Cálculo de la tirada aleatoria resultante de 3 dados:");
    String nombrePalo = "numeroPalo";
    String nombreFigura = "numeroFigura";
    
      
    System.out.println("La tirada del primer dado es: " + dado);
    System.out.println("La tirada del segundo dado es: " + dado2);
    System.out.println("La tirada del tercer dado es: " + dado3);
    System.out.println("La suma de estas tiradas es: " + suma);
  }
}

