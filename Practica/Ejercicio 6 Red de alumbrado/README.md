<h1 align="center"> 📝 Ejercicio 6: Red de Alumbrado</h1>

<img src= 'https://i.gifer.com/origin/8c/8cd3f1898255c045143e1da97fbabf10_w200.gif' height="20" width="100%">

<div align="center">

[Siguiente](/Practica/Ejercicio%207%20Method%20Lookup%20con%20empleados/)<br>
[Anterior](/Practica/Ejercicio%205%20Genealog%C3%ADa%20salvaje/)
 </div>

<img src= 'https://i.gifer.com/origin/8c/8cd3f1898255c045143e1da97fbabf10_w200.gif' height="20" width="100%">



- [Farola](/Practica/Ejercicio%206%20Red%20de%20alumbrado/Ejercicio-6-Red-de-alumbrado/src/main/java/ar/edu/unlp/info/oo1/Ejercicio_6_Red_de_alumbrado/Farola.java)
- [FarolaTest](/Practica/Ejercicio%206%20Red%20de%20alumbrado/Ejercicio-6-Red-de-alumbrado/src/test/java/ar/edu/unlp/info/oo1/Ejercicio_6_Red_de_alumbrado/FarolaTest.java)

---

Imagine una red de alumbrado donde cada farola está conectada a una o varias vecinas formando un grafo conexo. Cada una de las farolas tiene un interruptor. Es suficiente con encender o apagar una farola cualquiera para que se enciendan o apaguen todas las demás. Sin embargo, si se intenta apagar una farola apagada (o si se intenta encender una farola encendida) no habrá ningún efecto, ya que no se propagará esta acción hacia las vecinas.

La funcionalidad a proveer permite:

- crear farolas (inicialmente están apagadas)
- conectar farolas a tantas vecinas como uno quiera (las conexiones son bi-direccionales) 
- encender una farola (y obtener el efecto antes descrito)
- apagar una farola (y obtener el efecto antes descrito)

**Tareas:**

1. Realice el diagrama UML de clases de la solución al problema. 
2. Implemente en Java, la clase Farola, como subclase de Object, con los siguientes métodos:

```java
/*
* Crear una farola. Debe inicializarla como apagada
*/
public Farola ()
/*
* Crea la relación de vecinos entre las farolas. La relación de vecinos entre las farolas es recíproca, es decir el receptor del mensaje será vecino de otraFarola, al igual que otraFarola también se convertirá en vecina del receptor del mensaje
*/
public void pairWithNeighbor( Farola otraFarola )
/*
* Retorna sus farolas vecinas
*/
public List<Farola> getNeighbors ()


/*
* Si la farola no está encendida, la enciende y propaga la acción.
*/
public void turnOn()

/*
* Si la farola no está apagada, la apaga y propaga la acción.
*/
public void turnOff()

/*
* Retorna true si la farola está encendida.
*/
public boolean isOn()


```

3. Utilice los tests provistos por la cátedra para probar las implementaciones del punto 3.

<img src= 'https://i.gifer.com/origin/8c/8cd3f1898255c045143e1da97fbabf10_w200.gif' height="20" width="100%">

### UML

<img src= 'https://user-images.githubusercontent.com/55964635/228714899-0bba96bf-5080-4f2c-b4b1-afb037f49916.jpg' width="75%">

<img src= 'https://i.gifer.com/origin/8c/8cd3f1898255c045143e1da97fbabf10_w200.gif' height="20" width="100%">