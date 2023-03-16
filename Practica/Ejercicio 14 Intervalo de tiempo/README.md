<h1 align="center"> 📝 Ejercicio 14. Intervalo de tiempo</h1>

<img src= 'https://i.gifer.com/origin/8c/8cd3f1898255c045143e1da97fbabf10_w200.gif' height="20" width="100%">

<div align="center">

[Siguiente](/Practica/Ejercicio%2015%20Alquiler%20de%20propiedades/)<br>
[Anterior](/Practica/Ejercicio%2013%20Cliente%20con%20correo%20con%20adjuntos/)
 </div>

<img src= 'https://i.gifer.com/origin/8c/8cd3f1898255c045143e1da97fbabf10_w200.gif' height="20" width="100%">

---

En Java, las fechas se representan normalmente con instancias de la clase java.time.LocalDate ( https://docs.oracle.com/javase/8/docs/api/java/time/LocalDate.html ). Se pueden crear con varios métodos "static" como por ejemplo `LocalDate.now().`

- Investigue cómo hacer para crear una fecha determinada, por ejemplo 15/09/1972. 
- Investigue cómo hacer para determinar si la fecha de hoy se encuentra entre las fechas 15/12/1972 y 15/12/2032. Sugerencia: vea los métodos permiten comparar LocalDates y que retornan booleans.
- Investigue cómo hacer para calcular el número de días entre dos fechas. Lo mismo para el número de meses y de años Sugerencia: vea el método until.

Tenga en cuenta que los métodos de LocalDate colaboran con otros objetos que están definidos a partir de enums, clases e interfaces de java.time; por ejemplo java.time.temporal.ChronoUnit.DAYS


***Tarea 1***

Implemente la clase DateLapse (Lapso de tiempo). Un objeto DateLapse representa el lapso de tiempo entre dos fechas determinadas. La primera fecha se conoce como “from” y la segunda como “to”. Una instancia de esta clase entiende los mensajes:

```java
public LocalDate getFrom()
“Retorna la fecha de inicio del rango”

public LocalDate getTo()
“Retorna la fecha de fin del rango”

public int sizeInDays()
“retorna la cantidad de días entre la fecha 'from' y la fecha 'to'”

public boolean includesDate(LocalDate other)
“recibe un objeto LocalDate y retorna true si la fecha está entre el from y el to del receptor y false en caso contrario”.

```

***Tarea 2***

Escriba tests de unidad para asegurarse de que los métodos implementados funcionan adecuadamente. 

***Tarea 3***

Asumiendo que implementó la clase DateLapse con dos variables de instancia “from” y “to”, realice otra implementación de la clase para que su representación sea a través de los atributos “from” y “sizeInDays” y coloquela en otro paquete. Es decir, debe basar su nueva implementación en estas variables de instancia solamente. Intente definir una interfaz java para que ambas soluciones la implementen. 

Los cambios en la estructura interna de un objeto sólo deben afectar a la implementación de sus métodos. Estos cambios deben ser transparentes para quien le envía mensajes, no debe notar ningún cambio y seguir usándolo de la misma forma. Por lo tanto, los tests que implementó en la tarea 2 deberían pasar sin problemas. 

