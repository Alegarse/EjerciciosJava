/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema9;

/**
 *
 * @author Alejandro
 */
public class Vehiculo {
    
    //Atributos de clase
    private static int kilometrosTotales = 0;
    private static int vehiculosCreados = 0;
    
    //Atributos de instancia
    private int kilometrosRecorridos = 0;
      
    //Constructor

    public Vehiculo() {
    }


    //Getters y Setters

    public String getMarca() {
        return marca;
    }

    public String getColor() {
        return color;
    }

    public String getTipo() {
        return tipo;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    

    /** Arrancar  */
    void arranca() {
        System.out.println("Brumm brumm brumm");
    }
    
}
