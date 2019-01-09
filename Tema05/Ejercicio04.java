/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alejandro
 */
public class Ejercicio04 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
    int intentos = 0;
    int numIntroducido;
    
    System.out.println("Comprobaremos si usted conoce la combinación correcta de la caja fuerte. ");
    System.out.println("Tiene 4 intentos.");
    
    while (intentos < 4) {
      
      System.out.println ("Por favor, introduzca el número de la combinación de la caja fuerte: ");
      numIntroducido = Integer.parseInt(System.console().readLine());
      
      if (numIntroducido == 2548) {
        
        System.out.println ("La caja fuerte se ha abierto satisfactoriamente.");
        intentos = 4;
      } else {
        
        System.out.println ("Lo siento, esa no es la combinación.");
      }
      
      intentos++;
    }
    }
    
}
