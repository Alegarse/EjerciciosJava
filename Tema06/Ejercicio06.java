public class Ejercicio06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println("Adivine un número entre 0 y 100.");

        int opor = 5;
        int ale = (int)(Math.random()*101);
        int n;
        
        do {
        System.out.print("Introduzca un número: ");
        n = Integer.parseInt(System.console().readLine());
        opor--;
        System.out.println();
            
            if (n == ale){
                System.out.println("Enhorabuena, has acertado el número.");
            } else {
                if (n > ale){
                    System.out.println("El número que busca es menor al introducido.");
                }
                if (n < ale){
                    System.out.println("El número que busca es mayor al introducido.");
                }
            }
        }while (n != ale && opor != 0);
        
        if (n != ale){
          System.out.println("Lo siento, ha fallado. El número era el: " + ale);
        }
    }
    
}
