/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema8;

import java.util.Scanner;

/**
 *
 * @author alejandro
 */
public class Tema8 {

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
//        switch (posx) {
//            case 'a':
//                x= 0;
//                break;
//            case 'b':
//                x= 1;
//                break;
//            case 'c':
//                x= 2;
//                break;
//            case 'd':
//                x= 3;
//                break; 
//            case 'e':
//                x= 4;
//                break;
//            case 'f':
//                x= 5;
//                break;
//            case 'g':
//                x= 6;
//                break; 
//            case 'h':
//                x= 7;
//                break;
//            default:
//                System.out.println("La coordenada introducida no es válida.");
//                x = 0;
//        }
        int xfija = x;
        int yfija = y;
        
        // Diagonal superior derecha //
       
        System.out.print("Posiciones en diagonal superior derecha: ");
        while (x < 8 && y < 8) {
            x = x + 1;
            y = y + 1;
            
            System.out.print(letras[x] + y + " ");
//            switch (x) {
//                case 1:
//                    System.out.print("b" + y + " ");
//                    break;
//                case 2:
//                    System.out.print("c" + y + " ");
//                    break;                
//                case 3:
//                    System.out.print("d" + y + " ");
//                    break;                
//                case 4:
//                    System.out.print("e" + y + " ");
//                    break;                
//                case 5:
//                    System.out.print("f" + y + " ");
//                    break;                
//                case 6:
//                    System.out.print("g" + y + " ");
//                    break;                
//                case 7:
//                    System.out.print("h" + y + " ");
//                    break;
//            }

        }
        x = xfija;
        y = yfija;
            // Diagonal superior izquierda //
            System.out.println("");
            System.out.print("Posiciones en diagonal superior izquierda: ");
            while (x < 8 && y < 8) {
            
            x = x - 1;
            y = y + 1;
            switch (x) {
                case 0:
                    System.out.print("a" + y + " ");
                    break;
                case 1:
                    System.out.print("b" + y + " ");
                    break;
                case 2:
                    System.out.print("c" + y + " ");
                    break;                
                case 3:
                    System.out.print("d" + y + " ");
                    break;                
                case 4:
                    System.out.print("e" + y + " ");
                    break;                
                case 5:
                    System.out.print("f" + y + " ");
                    break;                
                case 6:
                    System.out.print("g" + y + " ");
                    break;                
                case 7:
                    System.out.print("h" + y + " ");
                    break;
            }
                       
        }
        x = xfija;
        y = yfija;
            // Diagonal inferior derecha //
            System.out.println("");
            System.out.print("Posiciones en diagonal inferior derecha: ");
            while (x < 8 && y < 8) {
            
            x = x + 1;
            y = y - 1;
            switch (x) {
                case 0:
                    System.out.print("a" + y + " ");
                    break;
                case 1:
                    System.out.print("b" + y + " ");
                    break;
                case 2:
                    System.out.print("c" + y + " ");
                    break;                
                case 3:
                    System.out.print("d" + y + " ");
                    break;                
                case 4:
                    System.out.print("e" + y + " ");
                    break;                
                case 5:
                    System.out.print("f" + y + " ");
                    break;                
                case 6:
                    System.out.print("g" + y + " ");
                    break;                
                case 7:
                    System.out.print("h" + y + " ");
                    break;
            }         
        }
        x = xfija;
        y = yfija;
            // Diagonal inferior izquierda //
            System.out.println("");
            System.out.print("Posiciones en diagonal inferior izquierda: ");
            while (x < 8 && y < 8) {
            
            x = x - 1;
            y = y - 1;
            switch (x) {
                case 0:
                    System.out.print("a" + y + " ");
                    break;
                case 1:
                    System.out.print("b" + y + " ");
                    break;
                case 2:
                    System.out.print("c" + y + " ");
                    break;                
                case 3:
                    System.out.print("d" + y + " ");
                    break;                
                case 4:
                    System.out.print("e" + y + " ");
                    break;                
                case 5:
                    System.out.print("f" + y + " ");
                    break;                
                case 6:
                    System.out.print("g" + y + " ");
                    break;                
                case 7:
                    System.out.print("h" + y + " ");
                    break;
            }
                       
        }
    }
    
}
