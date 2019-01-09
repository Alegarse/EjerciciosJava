import java.util.Scanner;

public class SenderoAleatorio {

    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
         
        System.out.print("Introduzca la longitud del sendero en metros: ");
        int longitud = Integer.parseInt(s.nextLine());
         
        // Para que no de fallo si vuelve mucho a la inquierda//
        int margen = 14; 
         
        // Genero si el camino se va hacia la inquierda o derecha//
        for (int i = 0; i < longitud; i++){
            margen += aleatorio(-1, 1);
            System.out.print(repite(" ", margen));
                  
            if(aleatorio(0, 1) == 0){
                System.out.println("#    #");
            //Hay algun obstaculo en el camino//
            }else{ 
                int posicionObstaculo = aleatorio(1, 4);
                // Pinto borde inquierdo del camino//
                System.out.print("#");
                // Gestiono los posibles ostaculos del camino//
                for (int j = 1; j <= 4; j++){
                    //Compruebo si debo pintar obtaculo//
                    if(j == posicionObstaculo){
                        //Genero el obstaculo de forma aleatoria//
                        if (aleatorio(0, 1) == 0){  
                            System.out.print("*");
                        }else{
                            System.out.print("O");
                        }
                    //No hay obstaculo en el camino//
                    } else { 
                        System.out.print(" ");
                    }
                }
                //Pinto borde derecho del camino//
                System.out.println("#"); 
            }
         }
    }
    /*Funcion que genera un numero aleatorio entre dos dados */
    
    public static int aleatorio(int inicio, int fin){
        
        return (int)(Math.random() * (fin - inicio + 1)) + inicio;
        
    }
    /*Funcion que repite un String x veces */
    
    public static String repite(String cadena, int repeticiones){
        
        String resultado = "";        
        for (int i = 0; i < repeticiones; i++){
            resultado += cadena;
        }
        return resultado;
        }
    }

