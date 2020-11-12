# TallerSOLID

1.-Se está violando el "Open-Closed Principle (OCP)" puesto que la funcionalidad de las clases Pastel y Helado es demasiado similar y se está quemando código, de tal forma que si se debe añadir una funcionalidad a futuro se deberían modificar ambas clases, lo cuál no es pertinente. Lo más óptimo es emplear una clase padre como Postre que tenga todas las funcionalidades generales de Pastel y Helado, que estas últimas hereden de Postre y se extienda su funcionalidad de forma más especifica según los requerimientos necesarios como lo es en el caso del precioParcial, asegurandonos también de no violar el "Liskov Substitution Principle" en el proceso por el tema de la herencia.

###### ENUM ADICIONALES 4
:eyeglasses: Se está violando el principio "Dependecy Inversion Principle (DIP)" 
El ENUM puede que este muy desacoplado, ya que si queremos trabajar
en cada uno de los tipos de aderezo que existe, no se podra y no permitira el optimo 
acoplamiento y cohesion a futuras mejoras para su escalabilidad. Puede que en un aderezo
tenga atributos especificos que queremos manejar. Asi se alcanza un bajo acoplamiento entre clases.


3. Se está violando el principio "Open-Closed Principle (OCP)" ya que si necesitaramos hacer un cambio a la formula del precio deberiamos entrar a la clase Postre a cambiarla, haciendola estar "abierta" a modificaciones. Debido a eso se creo la clase ManejadorDePrecio para que tengo el objetivo de calcular los precios y tambien presentar los precios dependiendo del postre. 

### Literal 2. Hecho por Paul Douglas Bustos Mite
-------------
La clase Procesos.OperacionesAderezo se define los métodos de añadir y quitar aderezo para cada tipo de postre.

Esta clase viola el principio de responsabilidad única o Single Responsability Principle(SRP) ya que los métodos de añadir y quitar aderezo deben formar parte de la clase abstrata Postres.Postre ya que en esta clase se define como atributo un arreglo de aderezos.
La clase Procesos.OperacionesAderezo duplica estos métodos para cada tipo de postre, helado y pastel.
No es necesario que la clase Procesos.OperacionesAderezo puesto que en la clase abstracta Postres.Postre se puede añadir los dos métodos para añadir y quitar el aderezo sin que otra clase se encargue de estas funciones.

Además viola el principio de inversión de dependencias o Dependency Inversion Principle(DIP) porque ya que las clases Postres.Helado y Postres.Pastel dependen de esta clase no abstracta para la usar sus operaciones correspondientes para añadir y quitar aderezo.

`Añadido` Funciones agregarAderezo y quitarAderezo en la clase Postres.Postre
`Eliminado` Clase Procesos.OperacionesAderezo