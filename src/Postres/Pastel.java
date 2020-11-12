package Postres;

/**
 *
 * @author Pedro Mendoza
 */
public class Pastel extends Postre {

	public Pastel(String sabor) {
		super(sabor);
		this.precioParcial = 15.55;
	}

	@Override
	public String toString() {
		return "Pastel" + super.toString();
	}

}
