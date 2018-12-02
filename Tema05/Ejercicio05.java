/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alejandro
 */
public class Ejercicio05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println("Muestra los números del 320 al 160, contando de 20 en 20 hacia atrás utilizando un bucle while.");
        
        int i = 320;
        while (i>=160) {
            System.out.print(+i+" ");
            i-=20;
        }
    }
    
}
