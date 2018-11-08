/** Ejercicios de Java
*
* Ejercicio 10 del Tema 4
*
* Autor: Alejandro  García Serrano
*/


public class Ejercicio10{
  
  public static void main(String[] args) {
    
    System.out.println("Este programa te dice que Horóscopo eres según tu fecha de nacimiento");
    System.out.print("Introduzca su día de nacimiento: ");
    int dia = Integer.parseInt(System.console().readLine());
    System.out.print("Introduzca su mes de nacimiento (1 -12): ");
    int mes = Integer.parseInt(System.console().readLine());
    
    switch (mes) {
    case 1:
    if (dia >= 20) {
      System.out.println("Su horóscopo es Acuario");
    } else {
      System.out.println("Su horóscopo es Capricornio");
    } 
    break;
    case 2:
    if (dia >= 19) {
      System.out.println("Su horóscopo es Piscis");
    } else {
      System.out.println("Su horóscopo es Acuario");
    } 
    break;
    case 3:
    if (dia >= 21) {
      System.out.println("Su horóscopo es Aries");
    } else {
      System.out.println("Su horóscopo es Piscis");
    } 
    break;
    case 4:
    if (dia >= 20) {
      System.out.println("Su horóscopo es Tauro");
    } else {
      System.out.println("Su horóscopo es Aries");
    } 
    break;
    case 5:
    if (dia >= 21) {
      System.out.println("Su horóscopo es Géminis");
    } else {
      System.out.println("Su horóscopo es Tauro");
    } 
    break;
    case 6:
    if (dia >= 21) {
      System.out.println("Su horóscopo es Cáncer");
    } else {
      System.out.println("Su horóscopo es Géminis");
    } 
    break;
    case 7:
    if (dia >= 23) {
      System.out.println("Su horóscopo es Leo");
    } else {
      System.out.println("Su horóscopo es Cáncer");
    } 
    break;
    case 8:
    if (dia >= 23) {
      System.out.println("Su horóscopo es Virgo");
    } else {
      System.out.println("Su horóscopo es Leo");
    }
    break; 
    case 9:
    if (dia >= 23) {
      System.out.println("Su horóscopo es Libra");
    } else {
      System.out.println("Su horóscopo es Virgo");
    } 
    break;
    case 10:
    if (dia >= 23) {
      System.out.println("Su horóscopo es Escorpio");
    } else {
      System.out.println("Su horóscopo es Libra");
    } 
    break;
    case 11:
    if (dia >= 22) {
      System.out.println("Su horóscopo es Sagitario");
    } else {
      System.out.println("Su horóscopo es Escorpio");
    } 
    break;
    case 12:
    if (dia >= 22) {
      System.out.println("Su horóscopo es Capricornio");
    } else {
      System.out.println("Su horóscopo es Sagitario");
    } 
    }  
  
  }   
}
