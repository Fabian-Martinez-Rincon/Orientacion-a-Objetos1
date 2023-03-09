<h1 align="center"> 📝 Ejercicio 16. Políticas de cancelación </h1>

<img src= 'https://i.gifer.com/origin/8c/8cd3f1898255c045143e1da97fbabf10_w200.gif' height="20" width="100%">

<div align="center">

[Siguiente](/Documentos/Ejercicio17.md)<br>
[Anterior](/Documentos/Ejercicio15.md)
 </div>

<img src= 'https://i.gifer.com/origin/8c/8cd3f1898255c045143e1da97fbabf10_w200.gif' height="20" width="100%">

---

**Nota: este ejercicio es del estilo de los que encontrarán en la evaluación parcial**

En el sistema de alquiler de propiedades del ejercicio 15 (OOBnB) se quiere introducir funcionalidad para calcular el monto que será reembolsado (devuelto) si se cancela una reserva.  Eso cambia la la funcionalidad indicada anteriormente de la siguiente manera: 

**Registrar una propiedad en alquiler:** Se provee nombre, descripción, precio por noche, y dirección. **`Adicionalmente se indica la política de cancelación`**. El sistema da de alta la propiedad y la retorna. La propiedad no tiene ninguna fecha ocupada. 

La política de cancelación puede ser una de tres: flexible, moderada, o estricta. 

**Calcular el monto a reembolsar si se hiciera una cancelación:** Dada una reserva y una fecha tentativa de cancelación, devuelve el monto que sería reembolsado. El cálculo se hace de la siguiente manera. 
- `a)` Si la propiedad tiene política de cancelación flexible, se reembolsará el monto total sin importar la fecha de cancelación (que de todas maneras debe ser anterior a la fecha de inicio de la reserva). 
- `b)` Si una propiedad tiene política de cancelación moderada, se reembolsará el monto total si la cancelación se hace hasta una semana antes y 50% si se hace hasta 2 días antes.
- `c)` Si una propiedad tiene política de cancelación estricta, no se reembolsará nada (0, cero) sin importar la fecha tentativa de cancelación.  

Actualice su diseño, implementación y tests. 
