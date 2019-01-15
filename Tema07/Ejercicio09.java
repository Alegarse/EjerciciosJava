/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema7.Arrays.Simples;

/** Ejercicios de Java
*
* Ejercicio 9 del Tema 7
*
* Autor: Alejandro  García Serrano
*/

import java.util.Scanner;
public class Ejercicio09 {
    
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
   
    System.out.println("Programa que pide 8 números e indica si son par o impar");
    int [] numeros = new int [8];
    int i;
   
    for (i = 0; i <8; i++) {
    System.out.print ("Introduzca un número y pulse intro: ");
    numeros [i] = Integer.parseInt(s.nextLine());
    }
    System.out.println();
    for (i = 0; i <8; i++) {
    System.out.print ("Número: " + numeros[i]);
      if ( numeros[i] %2 == 0) {
        System.out.print (" :Par");
      } else {
        System.out.print (" :Impar");
      }
    System.out.println();
    }
  }
}