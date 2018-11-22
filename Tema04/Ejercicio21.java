/** Ejercicios de Java
*
* Ejercicio 21 del Tema 4 : Calcula la nota de un trimestre de la asignatura Programación. El programa
pedirá las dos notas que ha sacado el alumno en los dos primeros controles.
Si la media de los dos controles da un número mayor o igual a 5, el alumno
está aprobado y se mostrará la media. En caso de que la media sea un número
menor que 5, el alumno habrá tenido que hacer el examen de recuperación
que se califica como apto o no apto, por tanto se debe preguntar al usuario
¿Cuál ha sido el resultado de la recuperación? (apto/no apto). Si el
resultado de la recuperación es apto, la nota será un 5; en caso contrario, se
mantiene la nota media anterior.
*
* Autor: Alejandro  Garcaría Serrano
*/


public class Ejercicio21{
  
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
      System.out.print("¿Cual es el resultado de tu examen de recuperacion? (1)Apto o (2)No apto: ");
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
