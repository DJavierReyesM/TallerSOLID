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
	protected String nombre;

	public Aderezo() {
	}

	public Aderezo(String nombre) {
		this.nombre = nombre;
	}

	public abstract void setNombre();

	public String toString() {
		return nombre.toUpperCase();
	}

}
