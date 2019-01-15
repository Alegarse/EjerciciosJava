package tema6;

/**
 * Ejercicios de Java
 *
 * Ejercicio 17 del Tema 6.
 *
 * Autor: Alejandro García Serrano
 */
import java.util.Scanner;

public class Ejercicio17 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("¿Que altura tiene la pecera? (minimo valor: 4): ");
        int altura = Integer.parseInt(s.nextLine());

        System.out.print("¿Que anchura tiene la pecera? (cminimo valor: 4): ");
        int ancho = Integer.parseInt(s.nextLine());

        int posicion = 0;
        int posicionPez = (int) (Math.random() * (altura - 2) * (ancho - 2));

        for (int i = 0; i < ancho; i++) {
            System.out.print("*");
            System.out.print(" ");
        }
        System.out.println();

        for (int i = 2; i < altura; i++) {
            System.out.print("* "); 
            for (int j = 2; j < ancho; j++) {
                if (posicion == posicionPez) {
                    System.out.print("& ");
                } else {
                    System.out.print("  ");
                }
                posicion++;
            }
            System.out.println("*");
        }

        for (int i = 0; i < ancho; i++) {
            System.out.print("*");
            System.out.print(" ");
        }
        
        System.out.println();

    }
}
