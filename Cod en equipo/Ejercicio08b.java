/** Ejercicios de Java
*
* Ejercicio 8b del Tema 7:Escribe un programa que, dada una posición en un tablero de ajedrez, nos diga
a qué casillas podría saltar un alfil que se encuentra en esa posición. Como se
indica en la figura, el alfil se mueve siempre en diagonal. El tablero cuenta con
64 casillas. Las columnas se indican con las letras de la “a” a la “h” y las filas
se indican del 1 al 8.
*
* Autores: Alejandro  García Serrano y Raúl
*/
import java.util.Scanner;
public class Ejercicio08b {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
 
        int[][] array = new int [8][8];
        int x,y;
        char posx;
        String [] letras = {"a", "b", "c", "d", "e", "f", "g", "h"};
        
        Scanner s = new Scanner(System.in);
        System.out.println("Introduca la posicion de la figura: (Ej: d7) ");
        String posicion = s.nextLine();
        
        y = (posicion.charAt(1) - 48);
        x = (posicion.charAt(0) - 97);

        int xfija = x;
        int yfija = y;
        
// Diagonal superior derecha //
       
        System.out.print("Posiciones en diagonal superior derecha: ");
        while (x < 8 && y < 8) {
            x = x + 1;
            y = y + 1;
        System.out.print(letras[x] + y + " ");
        }
        
// Restauro valores de x e y y marco espacio de separación//
        
        x = xfija;
        y = yfija;
        System.out.println("");
        
// Diagonal superior izquierda //
        
        System.out.print("Posiciones en diagonal superior izquierda: ");
        while (x > 0 && y < 8) {
            x = x - 1;
            y = y + 1;
        System.out.print(letras[x] + y + " ");
        }

// Restauro valores de x e y y marco espacio de separación//
        
        x = xfija;
        y = yfija;
        System.out.println("");
            
// Diagonal inferior derecha //

        System.out.print("Posiciones en diagonal inferior derecha: ");
        while (x < 7 && y > 0) {   
            x = x + 1;
            y = y - 1;
        System.out.print(letras[x] + y + " ");
        
        }
        
// Restauro valores de x e y y marco espacio de separación//
        
        x = xfija;
        y = yfija;
        System.out.println("");
            
// Diagonal inferior izquierda //

        System.out.print("Posiciones en diagonal inferior izquierda: ");
        while (x > 0 && y > 0) {
            x = x - 1;
            y = y - 1;
            System.out.print(letras[x] + y + " ");
        }
    }
}
