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

public class Crema extends Aderezo{
    
    public Crema(){
        super("Crema");
    }
    
    @Override
    public void setNombre(){
        super.nombre = "Crema";
    }

} 
