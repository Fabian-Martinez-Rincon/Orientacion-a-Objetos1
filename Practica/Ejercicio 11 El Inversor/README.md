<h1 align="center"> 📝 Ejercicio 11 - El Inversor</h1>

<img src= 'https://i.gifer.com/origin/8c/8cd3f1898255c045143e1da97fbabf10_w200.gif' height="20" width="100%">

<div align="center">

[Siguiente](/Practica/Ejercicio%2012%20Volumen%20y%20superficie%20con%20s%C3%B3lidos/)<br>
[Anterior](/Practica/Ejercicio%2010%20Job%20Scheduler/)
 </div>

<img src= 'https://i.gifer.com/origin/8c/8cd3f1898255c045143e1da97fbabf10_w200.gif' height="20" width="100%">



---

Estamos desarrollando una aplicación móvil para que un inversor pueda conocer el estado de sus inversiones. El sistema permite manejar dos tipos de inversiones: Inversión en acciones e inversión en plazo fijo. Nuestro sistema representa al inversor y a cada uno de los tipos de inversiones con una clase.

---

- **La clase InversionEnAcciones** tiene las siguientes variables de instancia:
  -	String nombre;
  -	int cantidad;
  -	double valorUnitario;

---

- **La clase PlazoFijo** tiene las siguientes variables de instancia:
  -	LocalDate fechaDeConstitucion;
  -	double montoDepositado;
  -	double porcentajeDeInteresDiario;

---

- **La clase Inversor** tiene las siguientes variables de instancia:
  - String nombre;
  - List<?> inversiones;

---

La variable inversiones de la clase Inversor es una colección con instancias de cualquiera de las dos clases de inversiones que pueden estar mezcladas.

Cuando se quiere saber cuánto dinero representan las inversiones del inversor, se envía al mismo el mensaje valorActual().

- `1)` Implemente en Java lo que considere necesario para que las instancias de Inversor entiendan el mensaje valorActual() teniendo en cuenta los siguientes criterios:   
  - el valor actual de las inversiones de un inversor es la suma de los valores actuales de cada una de las inversiones en su cartera (su colección de inversiones).  
  - el valor actual de un plazo fijo equivale al montoDepositado incrementado como corresponda por el porcentaje de interés diario, desde la fecha de constitución a la fecha actual (la del momento en el que se hace el cálculo).  
  - el valor actual de una InversionEnAcciones se calcula multiplicando el número de acciones por el valor unitario de las mismas.

***Recordatorio: No olvide la inicialización.***

- `2)` Construya un diagrama UML de clases para documentar su solución.
- `3)` Implemente los tests (JUnit) que considere necesarios.
