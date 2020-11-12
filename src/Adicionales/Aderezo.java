package Adicionales;

/**
 *
 * @author Pedro Mendoza
 */
/*
 * public enum Aderezo { MALVAVISCOS,FRUTILLA,CREMA
 * 
 * }
 */

public abstract class Aderezo {
	private String nombre;

	public Aderezo(String nombre) {
		this.nombre = nombre;
	}

	public abstract void setNombre();

	public String toString() {
		return nombre.toUpperCase();
	}

}
