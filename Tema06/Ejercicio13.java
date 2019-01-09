
/** Ejercicios de Java
*
* Ejercicio 13 del Tema 6.
*
* Autor: Alejandro  García Serrano
*/
public class Ejercicio13 {


    public static void main(String[] args) {
      
      System.out.println("Programa que simula la tirada de dos dados:");
      
      int dado1 = 0;
      int dado2 = 1;
      
      while (dado1 != dado2){
        dado1 = (int)((Math.random()*6)+1);
        dado2 = (int)((Math.random()*6)+1);
        System.out.println("La tirada resulta- Dado 1: " + dado1 + " y Dado 2: " + dado2);
      }


    }
    
}
