/** Ejercicios de Java
*
* Ejercicio 4 del Tema 4
*
* Autor: Alejandro  García Serrano
*/


public class Ejercicio4 {
  public static void main(String[] args) {
    
    System.out.print("Por favor, introduca el número de horas trabajadas durante la semana: ");
    int h = Integer.parseInt(System.console().readLine());
    int extra = h - 40;
    int suma;
    
    
    if (h < 40){
      System.out.println ("Su sueldo es: " + (h * 12) + " €.");
      }
      else{
      suma = ((40 * 12) + (extra * 16));
      System.out.println ("Su sueldo es: " + suma + " €.");
      }
      
       
  }   
}
