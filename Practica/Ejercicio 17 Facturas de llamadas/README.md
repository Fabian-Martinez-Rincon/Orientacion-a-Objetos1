<h1 align="center"> 📝 Ejercicio 17. Facturación de llamadas</h1>

<img src= 'https://i.gifer.com/origin/8c/8cd3f1898255c045143e1da97fbabf10_w200.gif' height="20" width="100%">

<div align="center">

[Siguiente](/Practica/Ejercicio%2018%20Liquidaci%C3%B3n%20de%20haberes/)<br>
[Anterior](/Practica/Ejercicio%2016%20Pol%C3%ADticas%20de%20cancelaci%C3%B3n/)
 </div>

<img src= 'https://i.gifer.com/origin/8c/8cd3f1898255c045143e1da97fbabf10_w200.gif' height="20" width="100%">

---

**Nota: este ejercicio es del estilo de los que encontrarán en la evaluación parcial.**

Se desea implementar un sistema de registro y facturación de llamadas telefónicas. El sistema ofrece la siguiente funcionalidad:

**Agregar un número a la lista de números disponibles.** Se provee un número de teléfono. El sistema lo agrega a la lista de números telefónicos disponibles. Asuma que el número de teléfono que se provee es nuevo (nunca fue utilizado). 

**Dar de alta como cliente a una persona física (un individuo).** Se provee nombre, dirección, DNI. El sistema da de alta el cliente y le asigna un número telefónico de la lista de números de teléfonos disponibles. El número asignado deja de estar disponible. El sistema retorna el cliente. 

**Dar de alta como cliente a una persona jurídica (empresa, organismo, asociación, etc,).** Se provee nombre, dirección, CUIT y tipo de persona jurídica (por ejemplo Sociedad Anónima, Repartición Provincial, etc.). El sistema da de alta el cliente y le asigna un número telefónico de la lista de números de teléfonos disponibles. El número asignado deja de estar disponible. El sistema retorna el cliente. 

**Registrar una llamada local.** Se provee la fecha y hora de comienzo, la duración en minutos, el número del teléfono que llama y el del teléfono que recibe. El sistema guarda el registro de la llamada. El sistema retorna el registro de la llamada. 

**Registrar una llamada interurbana.** Se provee la fecha y hora de comienzo, la duración en minutos, el número del teléfono que llama y el del teléfono que recibe. Se provee la distancia en kilómetros entre el que llama y el que recibe. El sistema guarda el registro de la llamada. El sistema retorna el registro de la llamada. 

**Registrar una llamada internacional.** Se provee la fecha y hora de comienzo, la duración en minutos, el número del teléfono que llama y el del teléfono que recibe. Se provee el país de origen y país destino de la llamada. El sistema guarda el registro de la llamada. El sistema retorna el registro de la llamada. 

**Facturar las llamadas de un cliente.** Se indica el cliente para el cual se quiere facturar. Se indican las fechas de inicio y fin del período a considerar. El sistema retorna una factura en la que consta: el cliente al que pertenece, la fecha de facturación, las fechas de inicio y fin del período, y el monto total de todas las llamadas que el cliente hizo, y que iniciaron en ese período. 

Para el cálculo del costo de una llamada tenga en cuenta lo siguiente:

- `1)` Las llamadas locales tienen un costo por minuto de duración (utilice $1).
- `2)` Las llamadas interurbanas tienen un costo de conexión fijo (utilice $5), y un costo por minuto de duración que depende de la distancia (utilice $2 para menos de 100km, $2.5 para distancias entre 100km y 500km, y $3 para distancias de más de 500km).
- `3)` Las llamadas internacionales tienen un costo por minuto que depende del país destino y de la hora (el precio diurno de 8:00 a 20:00 es un valor, y el precio nocturno de 20:00 a 8:00 es otro). Por ahora utilice $4 como precio diurno para todos los países y $3 como precio nocturno para todos los países. 
- `4)` Las llamadas efectuadas por personas físicas tienen un 10% de descuento.

`1)` Diseñe (documente en un diagrama de clases UML) e implemente en Java toda la funcionalidad antes descripta.

`2 - bonus)` Es probable que los montos utilizados para los cálculos le hayan quedado fijos dentro del código (hardcoded). Piense qué pasaría si al facturar se proveyera (como un parámetro más) el "cuadro tarifario". ¿Cómo sería ese objeto? ¿Qué responsabilidad le podría delegar? ¿Cómo haríamos para tener montos diferentes para los distintos países en las llamadas internacionales?

`3)` Implemente los tests que considere necesarios justificando su elección según lo visto en teoría respecto a valores de borde y particiones equivalentes.
