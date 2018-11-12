/** Ejercicios de Java
*
* Ejercicio 13 del Tema 4
*
* Autor: Alejandro  García Serrano
*/


public class Ejercicio13{
  
  public static void main(String[] args) {
    
    System.out.println ("Programa que ordena numeros enteros escritos por teclado");
    System.out.print ("Introduca el primer número: ");
    int a = Integer.parseInt(System.console().readLine());
    System.out.println();
    System.out.print ("Introduca el segundo número: ");
    int b = Integer.parseInt(System.console().readLine());
    System.out.println();
    System.out.print ("Introduca el tercer número: ");
    int c = Integer.parseInt(System.console().readLine());
    System.out.println();
    
    if ((a > b) && (a > c) && (b > c)); {
      System.out.print (" " + a + " " + b + " " + c);
    } else { if ((a > b) && (a > c) && (c > b)); 
      System.out.print (" " + a + " " + c + " " + b);
    } 

    } else { if ((b > a) && (b > c) && (a > c)); 
      System.out.print (" " + b + " " + a + " " + c);
    } 

    } else { if ((b > a) && (b > c) && (c > a)); 
      System.out.print (" " + b + " " + c + " " + a);
    } 

    } else { if ((c > a) && (c > b) && (a > b)); 
      System.out.print (" " + c + " " + a + " " + b);
    } 

    } else { if ((c > a) && (c > b) && (b > a)); 
      System.out.print (" " + c + " " + b + " " + a);
    } 
//* No consigo que lo haga //
  }   
}
