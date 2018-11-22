/** Ejercicios de Java
*
* Ejercicio 21 del Tema 4 : Realiza un programa que, dado un día de la semana (de lunes a viernes) y una
hora (horas y minutos), calcule cuántos minutos faltan para el fin de semana.
Se considerará que el fin de semana comienza el viernes a las 15:00h. Se da
por hecho que el usuario introducirá un día y hora correctos, anterior al viernes
a las 15:00h.
*
* Autor: Alejandro  Garcaría Serrano
*/


public class Ejercicio22{
  
  public static void main(String[] args) {
    
    System.out.println("Cálculo de la nota del trimestre de Programación");
    System.out.println("================================================");
    
    double nota1,nota2;
    int recu;
   
    System.out.print("Introduce la nota obtenida en el primer control: ");
    nota1 = Double.parseDouble(System.console().readLine());
    System.out.print("Introduce la nota obtenida en el segundo control: ");
    nota2 = Double.parseDouble(System.console().readLine());
    double media = (nota1 + nota2)/2;
    System.out.println();

     /** DESARROLLO*/
    
    if (media >= 5) {
      System.out.println("Has aprobado y tu media es: " + media);
    } else {
      System.out.println("Tu media es inferior a 5");
      System.out.print("¿Cual es el resultado de tu examen de recuperacion?(1)Apto o (2)No apto: ");
      recu = Integer.parseInt(System.console().readLine());
      switch (recu) {
        case 1:
        System.out.print("Enhorabuena, has recuperado. Tu media es 5");
        break;
        case 2:
        System.out.println("Lo siento, no has recuperado. Tu nota es: " + media);
        break;
        default:
        System.out.println("No has introducido una opción correcta");
      }
    } 
  } 
    
}
