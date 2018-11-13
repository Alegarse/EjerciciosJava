/** Ejercicios de Java
*
* Ejercicio 1 del Tema 4. Escribe un programa que pida por teclado un día de la semana y  que diga qué asignatura toca a primera hora ese día.
*
* Autor: Alejandro  García Serrano
*/


public class Ejercicio01 {
  public static void main(String[] args) {
    String dia;
    System.out.print("Por favor, introduzca un día de la semana para conocer que asignatura tiene a primera hora ");
    dia = System.console().readLine();
    dia = dia.toLowerCase();
    

      switch(dia) {
      case "lunes":
      System.out.println ("Entornos de Desarrollo");
      break;
      case "martes":
      case "viernes":
      System.out.println ("Sistemas Informáticos");
      break;
      case "miercoles":
      case "jueves":
      System.out.println ("Programación");
      break;
      default:
      System.out.println ("El día no es lectivo");
      }
      
       
   }   
}
