/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Adicionales;

/**
 *
 * @author Pedro Mendoza
 */
/*public enum Aderezo {
    MALVAVISCOS,FRUTILLA,CREMA
    
}*/

public abstract class Aderezo{
    protected String nombre;

    public Aderezo(){}

    public Aderezo(String nombre){
        this.nombre = nombre; 
    }
    
    public abstract void setNombre();

    public String toString() {
        return nombre.toUpperCase();
    }

} 
