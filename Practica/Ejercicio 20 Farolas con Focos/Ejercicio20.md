<h1 align="center"> 📝 Ejercicio 20. Farolas con focos</h1>

<img src= 'https://i.gifer.com/origin/8c/8cd3f1898255c045143e1da97fbabf10_w200.gif' height="20" width="100%">

<div align="center">

[Siguiente](/Documentos/Ejercicio1.md)<br>
[Anterior](/Documentos/Ejercicio19.md)
 </div>

<img src= 'https://i.gifer.com/origin/8c/8cd3f1898255c045143e1da97fbabf10_w200.gif' height="20" width="100%">

---

Se desea extender el nivel de detalle de la red de alumbrado (Ejercicio 6) para que ahora se pueda incluir en las farolas información del foco (o lamparita) que posee cada una. De un foco se desea conocer la marca de la empresa que lo fabricó y la cantidad de veces máxima que puede encenderse. A esto último lo llaman ciclos de encendido. Cada vez que a un foco apagado se lo enciende se completa un ciclo de encendido. Por ejemplo, si a un foco se lo enciende, apaga, y enciende otra vez se le completan 2 ciclos de encendido. Cuando un foco supera la cantidad de ciclos de encendido con el que fue fabricado se dice que el foco se encuentra vencido.

Actualice el ejercicio de farolas con los siguientes casos de uso:

```java
/*
* Crear una farola que posee un foco fabricado por fabricante con cantidad de
 ciclos el valor de cantidadDeCiclos. Debe inicializarla como apagada
*/
public Farola (String fabricante, int cantidadDeCiclos)
/*
* Crea la relación de vecinos entre las farolas. La relación de vecinos entre 
las farolas es recíproca, es decir el receptor del mensaje será vecino de 
otraFarola, al igual que otraFarola también se convertirá en vecina del 
receptor del mensaje
*/
public void pairWithNeighbor( Farola otraFarola )
/*
* Retorna sus farolas vecinas
*/
public List<Farola> getNeighbors ()


/*
* Si la farola no está encendida, la enciende, contabiliza el ciclo de 
encendido y propaga la acción. 
*/
public void turnOn()

/*
* Si la farola no está apagada, la apaga y propaga la acción.
*/
public void turnOff()

/*
* Retorna una lista con las farolas que están en la red de la farola 
receptora y que poseen focos vencidos. Incluyendo el chequeo entre las 
farolas vecinas y las vecinas de estas propagando en toda la red.
*/
public List<Farola> farolasConFocosVencidos()

```

***Tareas***

- Complete el diseño y el diagrama de clases UML.
- Implemente en Java de la funcionalidad requerida.
- Implemente los tests que considere necesarios justificando su elección según lo visto en teoría respecto a valores de borde y particiones equivalentes.
