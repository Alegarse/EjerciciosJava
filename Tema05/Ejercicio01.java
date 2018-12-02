/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alejandro
 */
public class Ejercicio01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println("Muestra los números múltiplos de 5 de 0 a 100 utilizando un bucle for.");
        
        int num = 0;
        for (int i = 0; i <= 100 ; i+=5) {
            System.out.print(+i);
            System.out.print(" ");
        }
    }
    
}
