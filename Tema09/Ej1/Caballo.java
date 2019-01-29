/**
 *
 * @author Alejandro
 */
public class Caballo {

    //Atributos
    private String nombre;
    private String raza;
    private String sexo;
    private String color;
    private int edad;

    //Métodos
    //Constructor
    Caballo(String n, String r, String s, String c, int e) {
        this.nombre = n;
        this.raza = r;
        this.sexo = s;
        this.color = c;
        this.edad = e;
    }

    public Caballo() {
    }
    

    //Getters

    public String getNombre() {
        return nombre;
    }

    public String getRaza() {
        return raza;
    }

    public String getSexo() {
        return sexo;
    }

    public String getColor() {
        return color;
    }

    public int getEdad() {
        return edad;
    }
    
    //Setters

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    //Métodos//////////////////////////////////////////
    /**
     * Cabalga
     */
    void cabalga() {
        System.out.println("Tocoto tocoto tocoto");
    }

    /**
     * Relincha
     */
    void relincha() {
        System.out.println("Hiiiihaaaaii");
    }

    /**
     * Trote
     */
    void trota() {
        System.out.println("toctoc toctoc toctoc");
    }
}
