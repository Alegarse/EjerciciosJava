/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema7b.Arrays.Bidimensionales;

/**
 * Ejercicios de Java
 *
 * Ejercicio 12b del Tema 7
 *
 * Autor: Alejandro García Serrano
 */

public class Ejercicio12 {

    public static void main(String[] args) {

        int[][] n = new int[9][9];

           for (int i = 0;i < 9;i++) {
            for (int j = 0;j < 9;j++) {
                n[i][j] = (int)((Math.random()*401) + 500);
                System.out.printf("%5d", n[i][j]);
            }
            System.out.println();
        }
           System.out.println();

        System.out.println("Pintamos la diagonal de la esquina inferior izquierda a la esquina superior derecha.");

        int max = 500;
        int min = 900;
        int suma = 0;

        for (int i = 8;i >=0;i--) {
            int j = (i- (i -1));
            int num = n[i][j];
            System.out.print(num + " ");
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
            suma += num;
            
        }
        System.out.println();
        System.out.println("\nEl máximo de esta diagonal es: " + max);
        System.out.println("El mínimo de esta diagonal es: " + min);
        System.out.println("La media de todos los elementos de esta diagonal es: " + ((double) suma / 10));
    }
}
