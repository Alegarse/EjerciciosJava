package tema6;

/**
 * Ejercicios de Java
 *
 * Ejercicio 23 del Tema 6.
 *
 * Autor: Alejandro García Serrano
 */
public class Ejercicio23 {

    public static void main(String[] args) {

        System.out.println("Programa que tira cinco veces un dado de Poker");
        String Cara = "";
        
        for (int i = 0 ; i < 5 ; i++){
            int d = (int)(Math.random()*6);
            switch (d){
                    case 0:
                    Cara = "As";
                    break;
                    case 1:
                    Cara = "K";
                    break;
                    case 2:
                    Cara = "Q";
                    break;
                    case 3:
                    Cara = "J";
                    break;
                    case 4:
                    Cara = "7";
                    break;
                    case 5:
                    Cara = "8";
                    break;
                    default:
            }
        System.out.print(Cara + " ");
        }
        System.out.println();
    }
}
 