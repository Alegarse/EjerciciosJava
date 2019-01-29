/** 
 *
 * @author Alejandro
 */
public class PruebaCaballo {
    public static void main (String[] args) {
        
        Caballo a = new Caballo("Gigante","pura","macho","negro",5);
        Caballo b = new Caballo("Luna","mixta","hembra","pardo",3);
        Caballo c = new Caballo("Rocinante","mixta","macho","marron",6);
        
        System.out.println("Hola, me llamo " + a.getNombre() + " y soy de raza " + a.getRaza());
        a.cabalga();
        a.relincha();
        
        System.out.println("Que tal, soy " + b.getNombre() + " y tengo "+ b.getEdad() + " años");
        b.trota();
        b.relincha();
       
        System.out.println("Que tal, soy " + c.getNombre() + " y soy de raza " + c.getRaza());
        c.trota();
        c.relincha();

    }
}
