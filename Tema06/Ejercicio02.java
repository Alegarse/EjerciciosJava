/** Ejercicios de Java
*
* Ejercicio 2 del Tema 6
*
* Autor: Alejandro  García Serrano
*/


public class Ejercicio2 {
  public static void main(String[] args) {
    int numeroPalo = (int) (Math.random() * 4) + 1;
    int numeroFigura = (int) (Math.random() * 12) + 1;
    
    System.out.println("El programa muestra una carta al azar de la baraja francesa:");
    String nombrePalo = "numeroPalo";
    String nombreFigura = "numeroFigura";
    
      switch (numeroPalo) {
        case 1:
        nombrePalo = "corazones";
        break;
        case 2:
        nombrePalo = "picas";
        break;
        case 3:
        nombrePalo = "tréboles";
        break;
        case 4:
        nombrePalo = "diamantes";
        break;
        default:
        }
      
      switch (numeroFigura) {
        case 1:
        nombreFigura = "As";
        break;
        case 11:
        nombreFigura = "J";
        break;
        case 12:
        nombreFigura = "Q";
        break;
        case 13:
        nombreFigura = "K";
        break;
        default:
        nombreFigura = String.valueOf(numeroFigura);
        }
        
    System.out.println("Su carta generada es " + nombreFigura + " y el palo es " + nombrePalo);
  }
}

