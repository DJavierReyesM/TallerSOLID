/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Procesos;

import Postres.Postre;

/**
 *
 * @author Milen Ortega Hp
 */
public class ManejadorDePrecio {
    
    
    protected double precioParcial;
    
    public ManejadorDePrecio(double precio) {
		this.precioParcial=precio;
	}
	
	
    public static double calcularPrecioFinal(Postre postres){
    	double precioFinal;
        precioFinal=(postres.getPrecioParcial()+(postres.getPrecioParcial()*0.12))+(postres.getAderezos().size()*0.50);
        return precioFinal;
    }
    
    public static String showPrecioFinal(Postre postres){
        return "Precio Final: $ " + calcularPrecioFinal(postres);
    }
}
