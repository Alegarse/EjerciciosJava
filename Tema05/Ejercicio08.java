/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alejandro
 */
public class Ejercicio08 {

    public static void main(String[] args) {
        // TODO code application logic here
        System.out.print("Introduzca un número y le mostraré su tabla de multiplicación: ");
        int numero = Integer.parseInt(System.console().readLine());
        System.out.println();
        System.out.println("Tabla de multiplicar del "+numero+":");;
        
        for (int i = 0; i < 10; i++){
            int respuesta = (numero * i);
            System.out.println(+ numero + " x " + i + " = " + respuesta);
        }
        
        
    }
    
}
