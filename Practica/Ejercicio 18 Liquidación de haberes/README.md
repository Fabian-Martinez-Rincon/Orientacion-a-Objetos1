<h1 align="center"> 📝 Ejercicio 18. Liquidación de haberes</h1>

<img src= 'https://i.gifer.com/origin/8c/8cd3f1898255c045143e1da97fbabf10_w200.gif' height="20" width="100%">

<div align="center">

[Siguiente](/Documentos/Ejercicio19.md)<br>
[Anterior](/Documentos/Ejercicio17.md)
 </div>

<img src= 'https://i.gifer.com/origin/8c/8cd3f1898255c045143e1da97fbabf10_w200.gif' height="20" width="100%">

---

**Nota: este ejercicio es del estilo de los que encontrarán en la evaluación parcial**

Nos metemos en el negocio de los sistemas de gestión de empresas y, para ello, vamos a comenzar por desarrollar un módulo de liquidación de haberes. Debe ofrecer la siguiente funcionalidad:

**Dar de alta un empleado:** Se indica el nombre, apellido, CUIL y fecha de nacimiento. Se indica si tiene cónyuge a cargo. Se indica si tiene hijos a cargo. El sistema agrega el empleado a la nómina de la empresa. Se registra la fecha actual como fecha de inicio de la relación laboral del empleado. 

**Buscar un empleado:** Se indica el CUIL del empleado. El sistema retorna al empleado con ese CUIL o null si no existe. 

**Dar de baja un empleado:** Se indica el empleado a dar de baja. El sistema lo quita de la nómina de la empresa. 

**Cargar el contrato de un empleado:** Se indica el empleado, la fecha de inicio del contrato, la fecha de fin (si corresponde) y algunos valores adicionales dependiendo del tipo de contrato. Hay dos tipos de contratos:
- Si el contrato es "por horas", se indica el valor-hora acordado, y el número de horas que trabajará por mes. También se indica la fecha de fin del contrato. 
- Si el contrato es "de planta", se indica el sueldo mensual acordado, el monto acordado por tener cónyuge a cargo, y el monto acordado por tener hijos a cargo. Estos contratos no tienen fecha de fin (nunca se vencen).

El sistema registra el contrato creado para el empleado. Pueden existir múltiples contratos creados para un mismo empleado, sin embargo un empleado solo puede tener un único contrato activo (no vencido) a la vez. El contrato activo para el caso de contrato permanente es el único contrato vigente. Para un contrato “por horas”, se considera activo aquel cuya fecha de fin sea posterior a la fecha actual.

**Obtener empleados con contratos vencidos.** El sistema devuelve la lista de todos aquellos empleados cuyos contrato actual se encuentre vencido. Si para un empleado existiese más de un contrato, el contrato con fecha de inicio más reciente es el considerado actual, dicho contrato puede estar vigente (si no tiene fecha de fin o si la fecha de fin es posterior a la fecha actual), o vencido (para los que tienen fecha de fin, cuando dicha fecha es inferior o igual a la fecha actual)

**Generar recibos de cobro.** Por cada empleado (con contrato activo, es decir sin vencer) el sistema genera un recibo de sueldo. El sistema devuelve los recibos de sueldo. De un recibo de sueldo puede obtenerse la siguiente información:  el nombre, apellido, CUIL y antigüedad en la empresa del empleado al que pertenece el recibo; la fecha en la que fue generado el recibo; y el monto total que le corresponde cobrar al empleado. 
El monto se calcula en dos pasos, el básico y la antigüedad. El básico se calcula de la siguiente forma:
- Si su contrato es por horas fijas, el monto a cobrar es el valor-hora acordado multiplicado por el número de horas que trabaja por mes.
- Si su contrato es de planta, el monto a cobrar es el sueldo mensual acordado, el monto acordado por tener cónyuge a cargo (si es que tiene cónyuge a cargo), y el monto acordado por tener hijos a cargo (si es que tiene hijos a cargo)

La antigüedad se calcula como un porcentaje del básico. Aumenta automáticamente cuando se alcanza cierta antigüedad, en función de esta escala:  5 años 30%, 10 años 50%, 15 años 70%, 20 años 100%.

Su tarea es diseñar y programar en Java lo que sea necesario para ofrecer la funcionalidad antes descrita. Se espera que entregue los siguientes productos.

- `1)` Diagrama de clases UML.
- `2)` Implementación en Java de la funcionalidad requerida.
- `3)` Implemente los tests que considere necesarios justificando su elección según lo visto en teoría respecto a valores de borde y particiones equivalentes.
