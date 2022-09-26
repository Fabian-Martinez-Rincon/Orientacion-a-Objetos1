# Recordemos

Antes de avanzar con super, recordemos primero que ocurre cuando un objeto recibe un mensaje (cuando alguien invoca un metodo de un objeto)

Cuando un objeto recibe un mensaje, todos los objetos son instancias de clases, lo que pasa es que algun objeto va a buscar a la clase de ese objeto (a la clase de esa instancia) un metodo que corresponda con el mensaje que se le envio (un metodo que se llame igual y que tenga los parametros en el mismo orden). 

![image](https://user-images.githubusercontent.com/55964635/192359878-c98013e6-ff36-48eb-b934-488414bec1ec.png)

Cuando tengo un error al querer mandarle mensajes a objetos que no van a entender, porque no hay ningun metodo en su clase que se corresponda con el mensaje, los encuentra el compilador

- new Luz().encender();
- new Calefaccion().encender();
- new Puerta().`enceder`(); En esta instancia de Puerta, le envio encender y el compilador ya sabe que mi objeto Puerta, no posee el metodo encender (Directamente no nos deja compilar), mientras que con los otros dos ejemplos que tengo, el compilador los va a dejar pasar porque, chequea que esos objetos
existen


# Super





