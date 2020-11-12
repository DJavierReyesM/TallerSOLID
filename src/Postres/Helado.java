package Postres;

/**
 *
 * @author Pedro Mendoza
 */
public class Helado extends Postre {

	public Helado(String sabor) {
		super(sabor);
		this.precioParcial = 7.85;
	}

	@Override
	public String toString() {
		return "Helado" + super.toString();
	}

}
