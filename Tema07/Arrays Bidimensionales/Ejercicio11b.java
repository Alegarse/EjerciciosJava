/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema7b.Arrays.Bidimensionales;

/**
 * Ejercicios de Java
 *
 * Ejercicio 11b del Tema 7
 *
 * Autor: Alejandro García Serrano
 */

public class Ejercicio11 {

    public static void main(String[] args) {

        int[][] n = new int[10][10];

           for (int i = 0;i < 10;i++) {
            for (int j = 0;j < 10;j++) {
                n[i][j] = (int)((Math.random()*101) + 200);
                System.out.printf("%5d", n[i][j]);
            }
            System.out.println();
        }
           System.out.println();

        System.out.println("Pintamos la diagonal de la esquina superior izquierda a la esquina inferior derecha.");

        int max = 200;
        int min = 300;
        int suma = 0;

        for (int i = 0;i < 10;i++) {
            int num = n[i][i];
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
