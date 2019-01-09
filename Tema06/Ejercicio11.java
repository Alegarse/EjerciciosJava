
/** Ejercicios de Java
*
* Ejercicio 10 del Tema 6.
*
* Autor: Alejandro  García Serrano
*/
public class Ejercicio11 {


    public static void main(String[] args) {
      
    System.out.println("Programa que muestra 20 notas generadas al azar:");

    int nota;
    String nombnota= "";
    int susp = 0;
    int suf = 0;
    int bien = 0;
    int not = 0;
    int sobre = 0;

    
    for(int i = 1; i <= 20; i++) {
      
      nota = (int)(Math.random() * 5);
      
      switch(nota) {
        case 0:
          nombnota = "suspenso";
          susp++;
          break;
        case 1:
          nombnota = "suficiente";
          suf++;
          break;
        case 2:
          nombnota = "bien";
          bien++;
          break;
        case 3:
          nombnota = "notable";
          not++;
          break;
        case 4:
          nombnota = "sobresaliente";
          sobre++;
          break;
        }

        System.out.print(nombnota);
        System.out.print(", ");
      }
      System.out.println("\nSe han mostrado " + susp + " suspensos, " + suf + " suficientes, " + bien + " bien, " + not + " notables y " + sobre + " sobresalientes");
    }
    
}
