<h1 align="center"> 📝 Ejercicio 15. Alquiler de propiedades</h1>

<img src= 'https://i.gifer.com/origin/8c/8cd3f1898255c045143e1da97fbabf10_w200.gif' height="20" width="100%">

<div align="center">

[Siguiente](/Practica/Ejercicio%2016%20Pol%C3%ADticas%20de%20cancelaci%C3%B3n/)<br>
[Anterior](/Practica/Ejercicio%2014%20Intervalo%20de%20tiempo/)
 </div>

<img src= 'https://i.gifer.com/origin/8c/8cd3f1898255c045143e1da97fbabf10_w200.gif' height="20" width="100%">

---

**Nota: este ejercicio es del estilo de los que encontrarán en la evaluación parcial**

Necesitamos que usted implemente OOBnB, un sistema para publicar propiedades en alquiler, y para alquilarlas. Identifique objetos y responsabilidades. El sistema ofrece la siguiente funcionalidad:

**`Registrar usuarios:`** Se provee nombre, dirección, dni. El sistema da de alta el usuario. El sistema retorna el Usuario. El usuario no tiene propiedades en alquiler. El usuario no tiene ninguna reserva de propiedad. El usuario no ha alquilado nunca una propiedad. 

**`Registrar una propiedad en alquiler:`** Se provee nombre, descripción, precio por noche, y dirección. Se provee el usuario propietario. El sistema da de alta la propiedad y la retorna. La propiedad no tiene ninguna fecha ocupada. 

**`Buscar propiedades disponibles en un período:`** Se indica el período (fecha de inicio y fecha de fin). Retorna todas las propiedades que se encuentran disponibles desde la fecha de inicio (inclusive) hasta el día de fin (inclusive). 

**`Hacer una reserva:`** Se indica la propiedad, el período y el usuario para quien se hace la reserva (el inquilino). Si la propiedad está libre, se genera la reserva (que queda registrada en el sistema). La propiedad pasa a estar ocupada en esas fechas. Si la propiedad no está libre no hace nada y retorna null. Ver notas al final de este ejercicio sobre cómo podría resolver este punto.

**`Calcular el precio de una reserva:`** dada una reserva, obtener el precio a partir del precio por noche de la propiedad y la cantidad de noches de la reserva. 

**`Eliminar reserva:`** Dada una reserva, si la fecha de inicio de la reserva es posterior a la fecha actual se elimina la reserva. La propiedad pasa a estar disponible en esas fechas. 

**`Obtener las reservas de un usuario:`** dado un usuario, obtener todas las reservas que ha efectuado (pasadas o futuras). 

**`Calcular los ingresos de un propietario:`** dado un usuario, y dos fechas, obtener el monto total que conseguirá por todas las reservas, de todas sus propiedades, entre las fechas indicadas. 


**`Notas sobre el diseño e implementación:`** 

Para el manejo de los períodos de reserva puede considerar usar la implementación de DateLapse (ejercicio 14 Intervalo de tiempo). La clase DateLapse podría ser mejorada agregando un nuevo método: 


```java
/**
Retorna true si el período de tiempo del receptor 
se superpone con el recibido por parámetro
**/
public boolean overlaps (anotherDateLapse: DateLapse)

```

**Tareas**

- `1)` Complete el diseño y el diagrama de clases UML.
- `2)` Implemente en Java de la funcionalidad requerida.
- `3)` Implemente los tests (JUnit) que considere necesarios.
