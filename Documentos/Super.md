# Busqueda de Metodos en Java


- [Method Lookup](#method-lookup)
- [Method Lookup con herencia](#method-lookup-con-herencia)
- [Sobre escribír metodos (overriding)](#sobre-escribír-metodos)
- [Extender Métodos](#extender-métodos)
- [Super](#super)
- [Super y el Method Lookup](#super-y-el-method-lookup)
- [Super() en los constructores](#super-en-los-constructores)


## Method Lookup

Antes de avanzar con super, recordemos primero que ocurre cuando un objeto recibe un mensaje (cuando alguien invoca un metodo de un objeto)

Cuando un objeto recibe un mensaje, todos los objetos son instancias de clases, lo que pasa es que algun objeto va a buscar a la clase de ese objeto (a la clase de esa instancia) un metodo que corresponda con el mensaje que se le envio (un metodo que se llame igual y que tenga los parametros en el mismo orden). 

![image](https://user-images.githubusercontent.com/55964635/192359878-c98013e6-ff36-48eb-b934-488414bec1ec.png)

Cuando tengo un error al querer mandarle mensajes a objetos que no van a entender, porque no hay ningun metodo en su clase que se corresponda con el mensaje, los encuentra el compilador

```java
new Luz().encender();
new Calefaccion().encender();
new Puerta().`enceder`(); 
```

En esta instancia de Puerta, le envio encender y el compilador ya sabe que mi objeto Puerta, no posee el metodo encender (Directamente no nos deja compilar), mientras que con los otros dos ejemplos que tengo, el compilador los va a dejar pasar porque, chequea que los objetos pudieron entender los mensajes recibidos.

## Method Lookup con herencia



<img width="250" align='left'  src = 'https://user-images.githubusercontent.com/55964635/192593948-5ef01c06-4db4-461f-819e-7618228fbbfc.png'>

Cuando un objeto recibe un mensaje, se busca en su clase un método cuya firma se corresponda con el mensaje. Si no lo encuentra, sigue buscando en la superclase de su clase, y en la superclase de esta..


```java
new Luz().encender();
new Calefaccion().encender();
```

## Sobre escribír metodos
- La búsqueda en la cadena de superclases termina tan pronto encuentro un método cuya firma coincide con la que busco.
- Si heredaba un método con la misma firma, el mismo queda 'oculto'

<img width="152" align='left'  src = 'https://user-images.githubusercontent.com/55964635/192596770-db030a56-4833-4473-940e-d75160026415.png'>



```java
public void actionOne(){ // Metodo de A
    // Hacer algo como le gusta a A
}

public void actionOne(){ // Metodo de B
    // Hacer algo como le gusta a B
}
```

```java
new B().actionOne();
```
Aca tengo una instancia de B y esa instancia le digo 'actionOne', va a su clase a buscar el metodo actionOne, lo encuentra y lo ejecuta, FIN. El problema de esto es que nadie sabe que tenemos ese mismo metodo en la clase A, entonces decimos que se sobre Escribe ese metodo o queda oculto (no es muy frecuente usar la sobre escritura de metodos ya que la mayoria de las herencias siguen la logica de 'esUn')



## Extender Métodos

## Super

## Super y el Method Lookup
## Super() en los constructores