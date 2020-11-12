package Procesos;

import Postres.Postre;

/**
 *
 * @author Milen Ortega
 */
public class ManejadorDePrecio {

	protected double precioParcial;

	public ManejadorDePrecio(double precio) {
		this.precioParcial = precio;
	}

	public static double calcularPrecioFinal(Postre postres) {
		double precioFinal;
		precioFinal = (postres.getPrecioParcial() + (postres.getPrecioParcial() * 0.12))
				+ (postres.getAderezos().size() * 0.50);
		return precioFinal;
	}

	public static String showPrecioFinal(Postre postres) {
		return "Precio Final: $ " + calcularPrecioFinal(postres);
	}
}
