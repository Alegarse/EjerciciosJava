/** Ejercicios de Java
*
* Ejercicio 3 del Tema 4:Escribe un programa en que dado un número del 1 a 7 escriba el correspon-
diente nombre del día de la semana.
*
* Autor: Alejandro  García Serrano
*/


public class Ejercicio03 {
  public static void main(String[] args) {
    
    System.out.print("Por favor, introduzca un número de 1 al 7 y le diré su correspondencia de día de la semana: ");
    int num = Integer.parseInt(System.console().readLine());
    
    
    switch (num) {
    case 1:
    System.out.println ("Este número corresponde al Lunes");
    break;
    case 2:
    System.out.println ("Este número corresponde al Martes");
    break;
    case 3:
    System.out.println ("Este número corresponde al Miércoles");
    break;
    case 4:
    System.out.println ("Este número corresponde al Jueves");
    break;
    case 5:
    System.out.println ("Este número corresponde al Viernes");
    break;
    case 6:
    System.out.println ("Este número corresponde al Sábado");
    break;
    case 7:
    System.out.println ("Este número corresponde al Domingo");
    break;
    default:
    System.out.println ("El número introducido no es correcto");
    }
  }   
}
