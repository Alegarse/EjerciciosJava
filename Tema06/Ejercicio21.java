package tema6;

/**
 * Ejercicios de Java
 *
 * Ejercicio 21 del Tema 6.
 *
 * Autor: Alejandro García Serrano
 */
public class Ejercicio21 {

    public static void main(String[] args) {

        
        System.out.println("Programa que tira cinco monedas al aire.");
        
        int m1,m2,m3,m4,m5;
        
        m1 = (int)(Math.random()*8);
        m2 = (int)(Math.random()*8);
        m3 = (int)(Math.random()*8);
        m4 = (int)(Math.random()*8);
        m5 = (int)(Math.random()*8);

        String Curso1 = "";
        String Curso2 = "";
        String Curso3 = "";
        String Curso4 = "";
        String Curso5 = "";
        String aux = "";
        
        switch (m1){
                    case 0:
                    Curso1 = "1 Centimo";
                    break;
                    case 1:
                    Curso1 = "2 Centimos";
                    break;
                    case 2:
                    Curso1 = "5 Centimos";
                    break;
                    case 3:
                    Curso1 = "10 Centimos";
                    break;
                    case 4:
                    Curso1 = "20 Centimos";
                    break;
                    case 5:
                    Curso1 = "50 Centimos";
                    break;
                    case 6:
                    Curso1 = "1 Euro";
                    break;
                    case 7:
                    Curso1 = "2 Euros";
                    break;
                    default:
        }
        int coc = (int)(Math.random()*2);
        if (coc == 0){
            aux = "Cara";
        }else{
            aux = "Cruz";
        }
        System.out.println(Curso1 + " " + aux);
    
        switch (m2){
                    case 0:
                    Curso2 = "1 Centimo";
                    break;
                    case 1:
                    Curso2 = "2 Centimos";
                    break;
                    case 2:
                    Curso2 = "5 Centimos";
                    break;
                    case 3:
                    Curso2 = "10 Centimos";
                    break;
                    case 4:
                    Curso2 = "20 Centimos";
                    break;
                    case 5:
                    Curso2 = "50 Centimos";
                    break;
                    case 6:
                    Curso2 = "1 Euro";
                    break;
                    case 7:
                    Curso2 = "2 Euros";
                    break;
                    default:
        }
        coc = (int)(Math.random()*2);
        if (coc == 0){
            aux = "Cara";
        }else{
            aux = "Cruz";
        }
        System.out.println(Curso2 + " " + aux);

        switch (m3){
                    case 0:
                    Curso3 = "1 Centimo";
                    break;
                    case 1:
                    Curso3 = "2 Centimos";
                    break;
                    case 2:
                    Curso3 = "5 Centimos";
                    break;
                    case 3:
                    Curso3 = "10 Centimos";
                    break;
                    case 4:
                    Curso3 = "20 Centimos";
                    break;
                    case 5:
                    Curso3 = "50 Centimos";
                    break;
                    case 6:
                    Curso3 = "1 Euro";
                    break;
                    case 7:
                    Curso3 = "2 Euros";
                    break;
                    default:
        }
        coc = (int)(Math.random()*2);
        if (coc == 0){
            aux = "Cara";
        }else{
            aux = "Cruz";
        }
        System.out.println(Curso3 + " " + aux);

        switch (m4){
                    case 0:
                    Curso4 = "1 Centimo";
                    break;
                    case 1:
                    Curso4 = "2 Centimos";
                    break;
                    case 2:
                    Curso4 = "5 Centimos";
                    break;
                    case 3:
                    Curso4 = "10 Centimos";
                    break;
                    case 4:
                    Curso4 = "20 Centimos";
                    break;
                    case 5:
                    Curso4 = "50 Centimos";
                    break;
                    case 6:
                    Curso4 = "1 Euro";
                    break;
                    case 7:
                    Curso4 = "2 Euros";
                    break;
                    default:
        }
        coc = (int)(Math.random()*2);
        if (coc == 0){
            aux = "Cara";
        }else{
            aux = "Cruz";
        }
        System.out.println(Curso4 + " " + aux);

        switch (m5){
                    case 0:
                    Curso5 = "1 Centimo";
                    break;
                    case 1:
                    Curso5 = "2 Centimos";
                    break;
                    case 2:
                    Curso5 = "5 Centimos";
                    break;
                    case 3:
                    Curso5 = "10 Centimos";
                    break;
                    case 4:
                    Curso5 = "20 Centimos";
                    break;
                    case 5:
                    Curso5 = "50 Centimos";
                    break;
                    case 6:
                    Curso5 = "1 Euro";
                    break;
                    case 7:
                    Curso5 = "2 Euros";
                    break;
                    default:
        }
        coc = (int)(Math.random()*2);
        if (coc == 0){
            aux = "Cara";
        }else{
            aux = "Cruz";
        }
        System.out.println(Curso5 + " " + aux);

   
    }
}
 