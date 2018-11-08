/** Ejercicios de Java
*
* Ejercicio 9 del Tema 3
*
* Autor: Alejandro  García Serrano
*/


public class Ejercicio9 {
  public static void main(String[] args) {
    
    double Pi = 3.1416;
   
    System.out.println("Cálculo del volumen de un cono");
    System.out.print("Introduzca la altura del cono en centímetros: ");
    double altura = Double.parseDouble(System.console().readLine());
    System.out.print("Introduzca su radio en centímetros: ");
    double radio = Double.parseDouble(System.console().readLine());
    double volumen = ((1.0/3.0) * Pi * radio * radio * altura);
    System.out.println("El volumen del cono es de " + volumen + " cm³");
  } 
}
