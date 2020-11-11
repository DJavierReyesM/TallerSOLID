# TallerSOLID
###### ENUM ADICIONALES
:eyeglasses: El ENUM puede que este muy desacoplado, ya que si queremos trabajar

en cada uno de los tipos de aderezo que existe, no se podra y no permitira el optimo 

acoplamiento y cohesion a futuras mejoras para su escalabilidad. Puede que en un aderezo

tenga atributos especificos que queremos manejar.


3. Se está violando el principio "Open-Closed Principle (OCP)" ya que si necesitaramos hacer un cambio a la formula del precio deberiamos entrar a la clase Postre a cambiarla, haciendola estar "abierta" a modificaciones. Debido a eso se creo la clase ManejadorDePrecio para que tengo el objetivo de calcular los precios y tambien presentar los precios dependiendo del postre. 

