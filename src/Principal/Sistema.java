package Principal;

import Adicionales.*;
import Postres.*;
import Procesos.*;
import Leche.*;
import java.util.ArrayList;

/**
 *
 * @author djurado
 */
public class Sistema {
	public static void main(String [ ] args){
      // Producir un helado de vainilla y una torta de chocolate, 
        // a ambos agregarles CREMA y FRUTILLAS
        // y cambiar el tipo de leche por Leche Deslactosada
<<<<<<< HEAD
    	ArrayList<Postre> arrPostres = new ArrayList<>();
=======
        ArrayList<Postre> arrPostres = new ArrayList<>();
>>>>>>> ef6069cb842e28783005330f6724af830a8d7a0b
        ManejadorDeLeche mnj_leche = new ManejadorDeLeche(new LecheDescremada());
        
        // Producir Helado
       Postre helado_vainilla = new Helado("Vainilla");
       arrPostres.add(helado_vainilla);
       // Producir Pastel
      Postre pastel_chocolate = new Pastel("Chocolate");
      arrPostres.add(pastel_chocolate);
       
        
          arrPostres.forEach(postre -> {
            postre.addAderezos(new Crema());
            postre.addAderezos(new Frutilla());
            System.out.println(postre);
            mnj_leche.cambiarTipoLeche(postre);
            System.out.println(ManejadorDePrecio.showPrecioFinal(postre));
        });        

    
    }
}
