package tema6;

/**
 * Ejercicios de Java
 *
 * Ejercicio 18 del Tema 6.
 *
 * Autor: Alejandro García Serrano
 */
import java.util.Scanner;

public class Ejercicio18 {

    public static void main(String[] args) {

        
        System.out.println("Secuencia para seleccionar tres colores para los dormitorios.");
        
//        String Color = "";
//        String Color1 = "";
//        String Color2 = "";
//        String Color3 = "";
//        
//        do {
//            for (int i = 0 ; i <3 ; i++){
//                switch ((int)(Math.random() * 6)){
//                    case 0:
//                    Color = "Rojo";
//                    break;
//                    case 1:
//                    Color = "Azul";
//                    break;
//                    case 2:
//                    Color = "Verde";
//                    break;
//                    case 3:
//                    Color = "Amarillo";
//                    break;
//                    case 4:
//                    Color = "Violeta";
//                    break;
//                    case 5:
//                    Color = "Naranja";
//                    break;
//                    default:
//                }
//                if (i == 0){
//                    Color1 = Color;
//                }
//                if (i == 1){
//                    Color2 = Color;
//                }
//                if (i == 2){
//                    Color3 = Color;
//                }
//                
//            }
//        }while ((Color1 == Color2) == (Color2 == Color3) == (Color1 == Color3));


        int c1,c2,c3;
        
        do {
            c1 = (int)(Math.random()*6);
            c2 = (int)(Math.random()*6);
            c3 = (int)(Math.random()*6);
        } while ((c1 == c2) || (c2 == c3) || (c1 == c3));
        
        String Color1 = "";
        String Color2 = "";
        String Color3 = "";
        
        switch (c1){
                    case 0:
                    Color1 = "Rojo";
                    break;
                    case 1:
                    Color1 = "Azul";
                    break;
                    case 2:
                    Color1 = "Verde";
                    break;
                    case 3:
                    Color1 = "Amarillo";
                    break;
                    case 4:
                    Color1 = "Violeta";
                    break;
                    case 5:
                    Color1 = "Naranja";
                    break;
                    default:
        }
        switch (c2){
                    case 0:
                    Color2 = "Rojo";
                    break;
                    case 1:
                    Color2 = "Azul";
                    break;
                    case 2:
                    Color2 = "Verde";
                    break;
                    case 3:
                    Color2 = "Amarillo";
                    break;
                    case 4:
                    Color2 = "Violeta";
                    break;
                    case 5:
                    Color2 = "Naranja";
                    break;
                    default:
        }
        switch (c3){
                    case 0:
                    Color3 = "Rojo";
                    break;
                    case 1:
                    Color3 = "Azul";
                    break;
                    case 2:
                    Color3 = "Verde";
                    break;
                    case 3:
                    Color3 = "Amarillo";
                    break;
                    case 4:
                    Color3 = "Violeta";
                    break;
                    case 5:
                    Color3 = "Naranja";
                    break;
                    default:
        }
        
        System.out.println("Los colores seleccionados para los dormitorios son:");
        System.out.println(Color1 + " " + Color2 + " " + Color3);
        
        
    }
}
 