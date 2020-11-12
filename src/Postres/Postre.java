package Postres;

import Adicionales.Aderezo;
import java.util.ArrayList;

/**
 *
 * @author Javier Reyes, Paul Bustos
 */
public abstract class Postre {
	protected String sabor;
	protected double precioParcial;
	protected ArrayList<Aderezo> aderezos;

	public Postre(String sabor) {
		this.aderezos = new ArrayList<>();
		this.sabor = sabor;
	}

	public ArrayList<Aderezo> getAderezos() {
		return this.aderezos;
	}

	public void addAderezos(Aderezo aderezo) {
		this.aderezos.add(aderezo);
	}

	public void quitarAderezos(Aderezo aderezo) {
		this.aderezos.remove(aderezo);
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
