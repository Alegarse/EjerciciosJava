/** Ejercaricarios de Java
*
* Ejercaricario 15 del Tema 4
*
* Autor: Alejandro  Garcaría Serrano
*/


public class Ejercicio15{
  
  public static void main(String[] args) {
    
    System.out.println("Programa que dibuja una pirámide");
    System.out.println();
    System.out.println("Elige hacia que dirección quieres que apunte el vértice de la pirámide:");
    System.out.println("1. Arriba");
    System.out.println("2. Abajo");
    System.out.println("3. Izquierda");
    System.out.println("4. Derecarha");
    System.out.println();
    System.out.print("Introduce el número que represente la opción elegida: ");
    int sel = Integer.parseInt(System.console().readLine());
    System.out.print("Introduce el caracter con el que quieres dibujarla: ");
    String car = System.console().readLine();
    System.out.println();
    
    if (car.length() > 1) {
      
      System.out.println("Introduce solo un caracter");
      
    } else {
      
        if (sel == 1) {
          System.out.println(" " + " " + " " + car);
          System.out.println(" " + " " + car + car + car);
          System.out.println(" " + car + car + car + car + car);
        } else if (sel == 2) {
          System.out.println(" " + car + car + car + car + car);
          System.out.println(" " + " " + car + car + car);
          System.out.print(" " + " " + " " + car);
        } else if (sel == 3) {
          System.out.println(" " + " " + " ");
          System.out.println(" " + " " + car );
          System.out.println(" " + car + car );
          System.out.println(car + car + car );
          System.out.println(" " + car + car );
          System.out.println(" " + " " + car );
          System.out.print(" " + " " + " " );
        } else if (sel == 4) {
          System.out.println(" " + " " + " ");
          System.out.println("" + car + " " + " ");
          System.out.println("" + car + car + " ");
          System.out.println("" + car + car + car);
          System.out.println("" + car + car + " ");
          System.out.println("" + car + " " + " ");
          System.out.print(" " + " " + " ");
          
        } else {
          
          System.out.print("La opción introducida es errónea");
        }
    }
  } 
    
}
