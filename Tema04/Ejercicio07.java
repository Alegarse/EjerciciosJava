/** Ejercicios de Java
*
* Ejercicio 7 del Tema 4: Realiza un programa que calcule la media de tres notas.
*
* Autor: Alejandro  García Serrano
*/


public class Ejercicio07{
  
  public static void main(String[] args) {
    
    System.out.println("Este programa calcula la media obtenida entre 3 notas: ");
    System.out.println("Introduzca la nota obtenida en el primer examen: ");
    double n1 = Double.parseDouble(System.console().readLine());
    System.out.println("Introduzca la nota obtenida en el segundo examen: ");
    double n2 = Double.parseDouble(System.console().readLine());
    System.out.println("Introduzca la nota obtenida en el tercer examen: ");
    double n3 = Double.parseDouble(System.console().readLine());
    
    double media = ((n1+n2+n3)/3);
        
    System.out.printf ("La media obtenida es %.2f .\n",media);
  }   
}
