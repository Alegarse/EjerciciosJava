
/** Ejercicios de Java
*
* Ejercicio 12 del Tema 6.
*
* Autor: Alejandro  García Serrano
*/
public class Ejercicio12 {


    public static void main(String[] args) {


    int linea = 0;
    System.out.print("\033[32m");
    
    for(int i = 0; i < 15000; i++) {
      System.out.print((char)(Math.random() * 95 + 32));
      linea++;
      
      if (linea == 80) {
        linea = 0;
        System.out.println();
      }
    }
    }
    
}
