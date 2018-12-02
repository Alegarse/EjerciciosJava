/** Ejercicios de Java
*
* Ejercicio 5 del Tema 6
*
* Autor: Alejandro  García Serrano
*/


public class Ejercicio05 {
  public static void main(String[] args) {
    
    int maximo = 100;
    int minimo = 199;
    int suma = 0;
    int cont = 0;
    int n;
       
    System.out.println("El programa una sucesión de 50 números aleatorios entre 100 y 199,ambos inclusive,indicando el máximo,el mínimo y la media:");
      for (int i = 0; i < 50; i++) {
        n = (int)((Math.random()*99) + 100);
        System.out.print(+ n + " ");
        suma = suma + n;
        cont++;
        
        if (n < minimo){
            minimo = n;
        }
        
        if (n > maximo){
            maximo = n;
        }
      }
      System.out.println();
      System.out.println("El máximo es " + maximo + ", el mínimo es " + minimo + ", y su media es " +(suma/cont));
  }
}

