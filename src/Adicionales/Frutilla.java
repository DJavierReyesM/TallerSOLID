/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Adicionales;

/**
 *
 * @author Gilson Ponce
 */
/*public enum Aderezo {
    MALVAVISCOS,FRUTILLA,CREMA
    
}*/

public class Frutilla extends Aderezo{
    
    public Frutilla(){
        super("Frutilla");
    }
    
    @Override
    public void setNombre(){
       this.nombre = "Frutilla";
    };


} 