package tema6;

/**
 * Ejercicios de Java
 *
 * Ejercicio 16 del Tema 6.
 *
 * Autor: Alejandro García Serrano
 */
import java.util.Scanner;
public class Ejercicio16 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Simulador simplificado de maquina tragaperras.");
        System.out.println("Pulse Intro para tirar de la palanca.");
        s.nextLine();
        String figura = "";
        String figura1 = "";
        String figura2 = "";
        String figura3 = "";
        
        
        for (int i = 0 ; i < 3; i++){
            switch ((int)(Math.random() * 5)){
                case 0:
                figura = "Corazón";
                break;
                case 1:
                figura = "Diamante";
                break;
                case 2:
                figura = "Herradura";
                break;
                case 3:
                figura = "Campana";
                break;
                case 4:
                figura = "Limón";
                break;
                default:
            }
            if (i == 0){
                figura1= figura;
            }
            if (i == 1){
                figura2= figura;
            }
            if (i == 2){
                figura3= figura;
            }
        }
        
        if ((figura1 == figura2) && (figura2 == figura3)){
            System.out.println("Ha sacado: " + figura1 + " " + figura2 + " " + figura3);
            System.out.println("Enhorabuena, ha ganado 10 monedas.");
        }
        if ((figura1 == figura2) && (figura2 != figura3)){
            System.out.println("Ha sacado: " + figura1 + " " + figura2 + " " + figura3);
            System.out.println("Bien,ha recuperado su moneda.");
        }
        if ((figura1 != figura2) && (figura2 == figura3)){
            System.out.println("Ha sacado: " + figura1 + " " + figura2 + " " + figura3);
            System.out.println("Bien,ha recuperado su moneda.");
        }
        if ((figura1 == figura3) && (figura2 != figura1)){
            System.out.println("Ha sacado: " + figura1 + " " + figura2 + " " + figura3);
            System.out.println("Bien,ha recuperado su moneda.");
        }
        if ((figura1 != figura2) && (figura2 != figura3) && (figura1 != figura3)){
            System.out.println("Ha sacado: " + figura1 + " " + figura2 + " " + figura3);
            System.out.println("Lo siento, ha perdido.");
        }

    }
}