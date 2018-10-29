/** Ejercicios de Java
*
* Ejercicio 12 del Tema 3
*
* Autor: Alejandro  García Serrano
*/


public class Ejercicio12 {
  public static void main(String[] args) {
    
    System.out.println("Calculo de la nota que se necesita para obtener la media deseada");
    System.out.print("Introduce la nota del primer examen:");
    double nota1 = Double.parseDouble(System.console().readLine());
    System.out.print("¿Qué nota quieres sacar en el trimestre?");
    double media = Double.parseDouble(System.console().readLine());
    double nota2 = (media - (nota1 * 0.4)) / 0.6;
    System.out.printf("Para tener un " + media + " de media en el trimestre necesitas sacar un " + nota2 + " en el segundo examen.");
  } 
}
