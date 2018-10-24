/** Ejercicios de Java
*
* Ejercicio 5 del Tema 1
*
* Autor: Alejandro  García Serrano
*/


public class Ejercicio5 {
  public static void main(String[] args) {

    String rojo ="\033[31m";
    String verde ="\033[32m";
    String naranja ="\033[33m";
    String azul ="\033[34m";
    String morado ="\033[35m";
    String blanco ="\033[37m";

    System.out.println("Horario de Clase");
    System.out.println();
    System.out.println("HORARIO   Lunes  Martes  Miércoles  Jueves  Viernes");
    System.out.println("---------------------------------------------------");
    System.out.printf("%-8s  %-5s  %-6s  %-9s  %-6s  %-7s\n" ,"PRIMERA",rojo + "EED",verde + "INF",naranja + "PRO",naranja + "PRO",verde + "SINF" + blanco);
    System.out.printf("%-8s  %-5s  %-6s  %-9s  %-6s  %-7s\n" ,"SEGUNDA",morado + "LM",verde + "SINF",naranja + "PRO",naranja + "PRO",verde + "SINF" + blanco);
    System.out.printf("%-8s  %-5s  %-6s  %-9s  %-6s  %-7s\n" ,"TERCERA",morado + "LM",verde + "SINF",naranja + "PRO",rojo + "EED",verde + "SINF" + blanco);
    System.out.printf("%-8s  %-5s  %-6s  %-9s  %-6s  %-7s\n" ,"CUARTA",blanco + "BBDD",naranja + "PRO",blanco + "BBDD",rojo + "EED",azul + "FOL" + blanco);
    System.out.printf("%-8s  %-5s  %-6s  %-9s  %-6s  %-7s\n" ,"QUINTA",blanco + "BBDD",naranja + "PRO",blanco + "BBDD",morado + "LM",azul + "FOL" + blanco);
    System.out.printf("%-8s  %-5s  %-6s  %-9s  %-6s  %-7s\n" ,"SEXTA",blanco + "BBDD",naranja + "PRO",blanco + "BBDD",morado + "LM",azul + "FOL" + blanco);
    System.out.println("---------------------------------------------------");
  }
}
