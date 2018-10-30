/** Ejercicios de Java
*
* Ejercicio 3 del Tema 6
*
* Autor: Alejandro  García Serrano
*/


public class Ejercicio3 {
  public static void main(String[] args) {
    int numeroPalo = (int) (Math.random() * 4) + 1;
    int numeroFigura = (int) (Math.random() * 9) + 1;
    
    System.out.println("El programa muestra una carta al azar de la baraja de naipes española");
    String nombrePalo = "numeroPalo";
    String nombreFigura = "numeroFigura";
    
      switch (numeroPalo) {
        case 1:
        nombrePalo = "oro";
        break;
        case 2:
        nombrePalo = "espadas";
        break;
        case 3:
        nombrePalo = "bastos";
        break;
        case 4:
        nombrePalo = "copas";
        break;
        default:
        }
      
      switch (numeroFigura) {
        case 1:
        nombreFigura = "As";
        break;
        case 10:
        nombreFigura = "sota";
        break;
        case 11:
        nombreFigura = "caballo";
        break;
        case 12:
        nombreFigura = "rey";
        break;
        default:
        nombreFigura = String.valueOf(numeroFigura);
        }
        
    System.out.println("Su carta generada es " + nombreFigura + " y el palo es " + nombrePalo);
  }
}

