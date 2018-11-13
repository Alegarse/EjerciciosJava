/** Ejercicios de Java
*
* Ejercicio 8 del Tema 4: Amplía el programa anterior para que diga la nota del boletín (insuficiente,
suficiente, bien, notable o sobresaliente).
*
* Autor: Alejandro  García Serrano
*/


public class Ejercicio08{
  
  public static void main(String[] args) {
    
    System.out.println("Este programa calcula la media obtenida entre 3 notas y le dice la nota corresponiente del boletín ");
    System.out.print("Introduzca la nota obtenida en el primer examen: ");
    double n1 = Double.parseDouble(System.console().readLine());
    System.out.print("Introduzca la nota obtenida en el segundo examen: ");
    double n2 = Double.parseDouble(System.console().readLine());
    System.out.print("Introduzca la nota obtenida en el tercer examen: ");
    double n3 = Double.parseDouble(System.console().readLine());
    double media = ((n1+n2+n3)/3);
    
    if (media < 5) {
      System.out.println ("Tiene un Insuficiente");
    }
    if ((media >= 5) && (media < 6)) {
      System.out.println ("Tiene un Suficiente");
    }
    if ((media >= 6) && (media < 8)) {
      System.out.println ("Tiene un Bien");
    }
    if ((media >= 8) && (media < 9)) {
      System.out.println ("Tiene un Notable");
    }
    if ((media >=9) && (media <=10)) {
      System.out.println ("Tiene un Sobresaliente");
    }
  }   
}
