/** Ejercicios de Java
*
* Ejercicio 4 del Tema 4:Vamos a ampliar uno de los ejercicios de la relación anterior para considerar
las horas extras. Escribe un programa que calcule el salario semanal de un
trabajador teniendo en cuenta que las horas ordinarias (40 primeras horas de
trabajo) se pagan a 12 euros la hora. A partir de la hora 41, se pagan a 16
euros la hora.
*
* Autor: Alejandro  García Serrano
*/


public class Ejercicio04 {
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
