/** Parte 1 Ejercicio01 Tema 9
 *
 * @author Alejandro
 */
public class PruebaCaballo {
    public static void main (String[] args) {
        
        Caballo a = new Caballo("Gigante","pura","macho","negro");
        Caballo b = new Caballo("Luna","mixta","hembra","pardo");
        Caballo c = new Caballo("Rocinante","mixta","macho","marron");
        
        System.out.println("Hola, me llamo " + a.getNombre() + " y soy de raza " + a.getRaza());
        a.cabalga();
        a.relincha();
        
        System.out.println("Que tal, soy " + b.getNombre());
        b.trota();
        b.relincha();
       
        System.out.println("Que tal, soy " + c.getNombre() + " y soy de raza " + c.getRaza());
        c.trota();
        c.relincha();

    }
}
