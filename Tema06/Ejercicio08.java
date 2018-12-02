/** Ejercicios de Java
*
* Ejercicio 8 del Tema 6.
*
* Autor: Alejandro  García Serrano
*/
public class Ejercicio08 {


    public static void main(String[] args) {

        System.out.println("Programa que muestra la apuesta de la quiniela");
        int resultado;
        int columna = 3;
        
        for (int f = 1; f <= 15; f++) {
          System.out.print("Partido");
          System.out.printf("%3d.  |",f);
          
        if (f == 15){
          columna =2;
        }
        
        for (int apuesta = 1; apuesta < columna; apuesta++){
          resultado = (int)((Math.random() * 6) + 1);
          switch (resultado){
            case 1:
            System.out.print("1    |");
            break;
            case 2:
            System.out.print("1    |");
            break;
            case 3:
            System.out.print("1    |");
            break;
            case 4:
            System.out.print("  X  |");
            break;
            case 5:
            System.out.print("  X  |");
            break;
            case 6:
            System.out.print("    2|");
            break;
            default:
          }
        }
                System.out.println();
        }

        
        
    }
    
}
