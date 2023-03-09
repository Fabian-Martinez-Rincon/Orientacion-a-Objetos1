<h1 align="center"> 📝 Ejercicio 12: Volumen y superficie de sólidos</h1>

<img src= 'https://i.gifer.com/origin/8c/8cd3f1898255c045143e1da97fbabf10_w200.gif' height="20" width="100%">

<div align="center">

[Siguiente](/Documentos/Ejercicio13.md)<br>
[Anterior](/Documentos/Ejercicio11.md)
 </div>

<img src= 'https://i.gifer.com/origin/8c/8cd3f1898255c045143e1da97fbabf10_w200.gif' height="20" width="100%">

<div align="center">
  <img src="https://media.giphy.com/media/3oEjI3OeNGQZFKTt9m/giphy.gif"/>
 </div>

---

Una empresa siderúrgica quiere introducir en su sistema de gestión nuevos cálculos de volumen y superficie exterior para las piezas que produce. El volumen le sirve para determinar cuánto material ha utilizado. La superficie exterior le sirve para determinar la cantidad de pintura que utilizó para pintar las piezas.

El siguiente diagrama UML muestra el diseño actual del sistema. En el mismo puede observarse que un ReporteDeConstruccion tiene la lista de las piezas que fueron construidas. Pieza es una clase abstracta.

![image](https://user-images.githubusercontent.com/55964635/224115985-60731fdf-b6ad-4a06-978a-0e5658b36634.png)

***Tarea***

Su tarea es completar el diseño e implementarlo siguiendo las especificaciones que se exponen a continuación:

`getVolumenDeMaterial(nombreDeMaterial: String)`

"Recibe como parámetro un nombre de material (un string, por ejemplo 'Hierro'). Retorna la suma de los volúmenes de todas las piezas hechas en ese material"

`getSuperficieDeColor(unNombreDeColor: String)`

"Recibe como parámetro un color (un string, por ejemplo 'Rojo'). Retorna la suma de las superficies externas de todas las piezas pintadas con ese color".


***Pruebas de unidad***

Asegúrese de proveer tests de unidad para todo el comportamiento desarrollado.

***Fórmulas***

- Volumen de un cilindro: π * radio 2 * h.
- Superficie de un cilindro: 2 * π * radio  * h + 2 * π * radio 2 
- Volumen de una esfera: ⁴⁄₃ * π * radio ³.
- Superficie de una esfera: 4 * π * radio 2
- Volumen del prisma: ladoMayor * ladoMenor * altura
- Superficie del prisma: 2 * (ladoMayor * ladoMenor + ladoMayor * altura + ladoMenor * altura)
  - Para obtener π, utilizamos Math.PI
  - Para elevar un número a cualquier potencia, utilizamos Math.pow( numero: double, potencia: double ). Ej: 82  = Math.pow(8, 2) 

***Observaciones adicionales***

Probablemente note una similitud entre este ejercicio y el ejercicio de "Figuras y cuerpos” que hizo anteriormente. En ambos ejercicios usted podía construir cilindros y prismas rectangulares. Sin embargo las implementaciones varían. Discuta diferencias y similitudes con el ayudante.
