package tema6;

/**
 * Ejercicios de Java
 *
 * Ejercicio 15 del Tema 6.
 *
 * Autor: Alejandro García Serrano
 */
public class Ejercicio15 {

    public static void main(String[] args) {
        int numN = 4 * (int)(Math.random() * 7 + 1);
        String nota = "";
        String notaInicial = "";

        for (int contN = 1; contN <= numN; contN++) {
            switch ((int) (Math.random() * 7)) {
                case 0:
                    nota = "do";
                    break;
                case 1:
                    nota = "re";
                    break;
                case 2:
                    nota = "mi";
                    break;
                case 3:
                    nota = "fa";
                    break;
                case 4:
                    nota = "sol";
                    break;
                case 5:
                    nota = "la";
                    break;
                case 6:
                    nota = "si";
                    break;
                default:
            }

            if (contN == 1) {
                notaInicial = nota;
            }

            if (contN == numN) {
                nota = notaInicial;
            }

            System.out.print(nota + " ");

            if (contN == numN) {
                System.out.print("||");
            } else if (contN % 4 == 0) {
                System.out.print("| ");
            }

        }
    }
}