/** Ejercicios de Java
*
* Ejercicio 5 del Tema 6
*
* Autor: Alejandro  García Serrano
*/


public class Ejercicio5 {
  public static void main(String[] args) {
    
    int maximo = 100;
    int minimo = 199;
    int media = 0;
       
    System.out.println("El programa una sucesión de 50 números aleatorios entre 100 y 199,ambos inclusive:");
      for (int i = 0; i <= 49; i++) {
      System.out.print(((int)(Math.random()*99) + 100) + "  ");
      }

    System.out.println("");
    if (numero < maximo){
    System.out.println ("Elvalor máximo es " + maximo);
    }else{
    Sytem.out.println ("El valor máximo es " + numero);
    }
    System.out.println("El valor mínimo es " + minimo);
    System.out.println("La media es " + media);
  }
}

