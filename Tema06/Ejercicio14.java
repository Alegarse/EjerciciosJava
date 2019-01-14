/** Ejercicios de Java
*
* Ejercicio 14 del Tema 6.
*
* Autor: Alejandro  García Serrano
*/
import java.util.Scanner;
public class Ejercicio14 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        int intentos = 5;
        int numero;
        int min = 0;
        int max = 100;
        boolean premio = false;
        int aux;
        
        System.out.println("Piensa en un número comprendido entre el 0 y el 100. Voy a intentar adivinarlo en 5 oportunidades");
        System.out.println("Pulsa Intro para comenzar.");
        s.nextLine();
        
        do{
            numero = (int)(Math.random() * (max - min) + min);
            System.out.println("¿Es el " + numero + " el número que habías pensado?");
            System.out.println("1)Has acertado, 2) Es mayor o 3) Es menor");
            aux = Integer.parseInt(s.nextLine());
            intentos--;
            
            if (aux == 1) {
                premio = true;
                System.out.println("Ole yó,he acertado el número!!");
            }
            if (aux == 2 && intentos > 0){
                min = numero +1;
            }
            if (aux == 3 && intentos > 0){
                max = numero - 1;
            }
        } while (!premio && intentos > 0);
        
        if (!premio) {
            System.out.println("Mecachis, no he conseguido acertarlo.");
        }
                
    }
    
}
