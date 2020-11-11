/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Postres;

import Adicionales.Aderezo;
import java.util.ArrayList;

/**
 *
 * @author Javier Reyes
 */
public abstract class Postre {
    protected String sabor;
    protected double precioParcial;
    protected ArrayList<Aderezo> aderezos;
    
    public Postre(String sabor){
        aderezos= new ArrayList<>();
        this.sabor=sabor;
    
    }
    
    

    public ArrayList<Aderezo> getAderezos() {
        return aderezos;
    }
    
   
    
    @Override
    public String toString() {
        return "{" + "sabor=" + sabor + ", precioParcial=" + precioParcial + ", aderezos=" + aderezos + '}';
    }
    public double getPrecio() {
        return this.precioParcial;
    }
            
    public double getPrecioParcial() {
        return precioParcial;
    }
   
}
