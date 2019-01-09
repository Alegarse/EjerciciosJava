/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alejandro
 */
public class Ejercicio02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println("Muestra los números múltiplos de 5 de 0 a 100 utilizando un bucle while.");
        
        int num = 0;
        while (num <= 100) {
            System.out.print(+num + " ");
            num+=5;
        }
    }
    
}
