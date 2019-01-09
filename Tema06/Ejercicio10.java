
/** Ejercicios de Java
*
* Ejercicio 10 del Tema 6.
*
* Autor: Alejandro  García Serrano
*/
public class Ejercicio10 {


    public static void main(String[] args) {

    int caracter;
    int longitud;
    String relleno = "";
    
    for(int i = 1; i <= 10; i++) {
      
      longitud = (int)(Math.random() * 40) + 1;
      caracter = (int)(Math.random() * 6);
      
      switch(caracter) {
        case 0:
          relleno = "*";
          break;
        case 1:
          relleno = "-";
          break;
        case 2:
          relleno = "=";
          break;
        case 3:
          relleno = ".";
          break;
        case 4:
          relleno = "|";
          break;
        case 5:
          relleno = "@";
          break;
        default:
      }
      
      // pinta la línea
      for(int k = 1; k <= longitud; k++) {
        System.out.print(relleno);
      }
      System.out.println();
    }
    }
    
}
