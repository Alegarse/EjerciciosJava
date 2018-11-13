/** Ejercicios de Java
*
* Ejercicio 2 del Tema 4: Realiza un programa que pida una hora por teclado y que muestre luego
buenos días, buenas tardes o buenas noches según la hora. Se utilizarán los
tramos de 6 a 12, de 13 a 20 y de 21 a 5. respectivamente. Sólo se tienen en
cuenta las horas, los minutos no se deben introducir por teclado.
*
* Autor: Alejandro  García Serrano
*/


public class Ejercicio02 {
  public static void main(String[] args) {
    
    System.out.print("Por favor, introduzca la hora actual [0 - 23]: ");
    int h = Integer.parseInt(System.console().readLine());
    
    
    if ((h >= 6 ) && (h <=12)){
      System.out.println ("Buenos días");
      }
      if ((h >= 13 ) && (h <=20)){
      System.out.println ("Buenas tardes");
      }
      if ((h >= 21 ) && (h <=23) || (h >= 0 ) && (h <=5)){
      System.out.println ("Buenas noches");
      }
      if ((h >= 24 ) || (h <0)){
      System.out.println ("La hora no es válida");
      }
      
       
  }   
}
