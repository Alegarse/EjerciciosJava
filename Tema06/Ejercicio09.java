
/** Ejercicios de Java
*
* Ejercicio 9 del Tema 6.
*
* Autor: Alejandro  García Serrano
*/
public class Ejercicio09 {


    public static void main(String[] args) {

        System.out.println("Programa que genera numeros aleatorios pares entre 0 y 100 y se detiene al generar el 24:");
        System.out.println();
        int contador = 0;
        int aleatorio = 0;
       
        while (aleatorio !=24) {
          aleatorio = (int)(Math.random()*51)*2;
          System.out.print(+ aleatorio + " ");
          contador++;
        }
        System.out.print("\nHa generado " + contador + " numeros aleatorios");
        

        
        
    }
    
}
