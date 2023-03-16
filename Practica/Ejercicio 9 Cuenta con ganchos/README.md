<h1 align="center"> 📝 Ejercicio 9 : Cuenta con ganchos</h1>

<img src= 'https://i.gifer.com/origin/8c/8cd3f1898255c045143e1da97fbabf10_w200.gif' height="20" width="100%">

<div align="center">

[Siguiente](/Practica/Ejercicio%2010%20Job%20Scheduler/)<br>
[Anterior](/Practica/Ejercicio%208%20Distribuidora%20El%C3%A9ctrica/)
 </div>

<img src= 'https://i.gifer.com/origin/8c/8cd3f1898255c045143e1da97fbabf10_w200.gif' height="20" width="100%">


---

Observe con detenimiento el diseño que se muestra en el siguiente diagrama. La clase cuenta es abstracta. El método `puedeExtraer()` es abstracto. Las clases `CajaDeAhorro` y `CuentaCorriente` son concretas y están incompletas.

![image](https://user-images.githubusercontent.com/55964635/224113806-58c95e30-15d6-46de-9483-124ff25f9c73.png)

**Tarea A:** Complete la implementación de las clases CajaDeAhorro y CuentaCorriente para que se puedan efectuar depósitos, extracciones y transferencias teniendo en cuenta los siguientes criterios. 

- Las **cajas de ahorro** solo pueden extraer y transferir cuando cuentan con fondos suficientes. 
- Las extracciones, los depósitos y las transferencias desde cajas de ahorro tienen un costo adicional de 2% del monto en cuestión (téngalo en cuenta antes de permitir una extracción o transferencia desde caja de ahorro).
- Las **cuentas corrientes** pueden extraer aún cuando el saldo de la cuenta sea insuficiente. Sin embargo, no deben superar cierto límite por debajo del saldo. Dicho límite se conoce como límite de descubierto (algo así como el máximo saldo negativo permitido). Ese límite es diferente para cada cuenta (lo negocia el cliente con la gente del banco). 
- Cuando se abre una **cuenta corriente**, su límite descubierto es 0 (no olvide definir el constructor por default).

**Tarea B:** Reflexione, charle con el ayudante y responda a las siguientes preguntas.
- ¿Por qué cree que este ejercicio se llama "Cuenta con ganchos"? 
- En las implementaciones de los métodos `extraer()` y `transferirACuenta()`  que se ven en el diagrama, ¿quién es `this`? ¿Puede decir de qué clase es this?
- ¿Por qué decidimos que los métodos `puedeExtraer()` y `extraerSinControlar` tengan visibilidad "protegido"?
- ¿Se puede transferir de una caja de ahorro a una cuenta corriente y viceversa? ¿por qué? ¡Pruébelo!
- ¿Cómo se declara en Java un método abstracto? ¿Es obligatorio implementarlo? ¿Qué dice el compilador de Java si una subclase no implementa un método abstracto que hereda?

**Tarea C:** Escriba los tests de unidad que crea necesarios para validar que su implementación funciona adecuadamente.