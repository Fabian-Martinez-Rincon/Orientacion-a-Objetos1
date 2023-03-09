<h1 align="center"> 📝 Ejercicio 4: Figuras y cuerpos</h1>

<img src= 'https://i.gifer.com/origin/8c/8cd3f1898255c045143e1da97fbabf10_w200.gif' height="20" width="100%">

<div align="center">

[Siguiente](/Documentos/Ejercicio5.md)<br>
[Anterior](/Documentos/Ejercicio3.md)
 </div>

<img src= 'https://i.gifer.com/origin/8c/8cd3f1898255c045143e1da97fbabf10_w200.gif' height="20" width="100%">

<div align="center">
<img src="https://media.giphy.com/media/l3q2K70ZguDAkbSsU/giphy.gif"/>
</div>

---

**Figuras en 2D**

Defina un nuevo proyecto figurasYCuerpos

En Taller de Programación definió clases para representar figuras geométricas. Retomaremos ese ejercicio para trabajar con Cuadrados y Círculos.

El siguiente diagrama de clases documenta los mensajes que estos objetos deben entender. Decida usted qué variables de instancia son necesarias. Ambas clases son subclases de Object. Puede agregar mensajes adicionales si lo cree necesario.

<img width='57%' src="https://user-images.githubusercontent.com/55964635/223018313-bf81f0da-f947-4c83-a6d2-6597f7d8dce6.png">


Fórmulas y mensajes útiles:

- Diámetro del círculo: radio * 2
- Perímetro del círculo: π * diámetro
- Área del círculo: π * radio 2
- π se obtiene enviando el mensaje #pi a la clase Float (Float pi) (ahora Math.PI) 

**Cuerpos en 3D**

Ahora que tenemos Círculos y Cuadrados, podemos usarlos para construir cuerpos (en 3D) y calcular su volumen y superficie o área exterior. Vamos a pensar a un cilindro como "un cuerpo que tiene una figura 2D como cara basal y que tiene una altura (vea la siguiente imagen)" . Si en el lugar de la figura2D tuviera un círculo, se formaría el siguiente cuerpo 3D.

<img width='50%' src="https://user-images.githubusercontent.com/55964635/223018520-e498ed26-ecab-4f5c-a64d-23106c84644f.png">

Si reemplazamos la cara basal por un rectángulo, tendremos un prisma (una caja de zapatos). 

El siguiente diagrama de clases documenta los mensajes que entiende un cuerpo3D. Decida usted qué variables de instancia son necesarias. Cuerpo3D es subclase de Object.

Decida usted si es necesario hacer cambios en las figuras 2D.

<img width='35%' src="https://user-images.githubusercontent.com/55964635/223018768-8c50ee12-56be-44cc-baa8-2699095876fd.png">

---