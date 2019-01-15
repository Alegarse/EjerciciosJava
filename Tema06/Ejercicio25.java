package tema6;

/**
 * Ejercicios de Java
 *
 * Ejercicio 25 del Tema 6.
 *
 * Autor: Alejandro García Serrano
 */
public class Ejercicio25 {

    public static void main(String[] args) {

        System.out.println("Programa que muestra 100 numeros enteros distinguiendo los primos y los múltiplos de 5");

        
        for (int i = 0 ; i < 100 ; i++){
            int num = (int)((Math.random()* 191) + 10);
            
            boolean esPrimo = true;
            for (int j = 2; j < num; j++) {
                if ((num % j) == 0) {
                esPrimo = false;
            }}
                
            if (esPrimo) {
              System.out.print(" #" + num + "# ");
            } else if (num %5 == 0) {
              System.out.print(" [" + num + "] ");
            } else {
              System.out.print(" " + num + " ");
            }
        }

    }
}
 