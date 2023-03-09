<h1 align="center"> 📝 Ejercicio 13. Cliente de correo con adjuntos</h1>

<img src= 'https://i.gifer.com/origin/8c/8cd3f1898255c045143e1da97fbabf10_w200.gif' height="20" width="100%">

<div align="center">

[Siguiente](/Documentos/Ejercicio14.md)<br>
[Anterior](/Documentos/Ejercicio12.md)
 </div>

<img src= 'https://i.gifer.com/origin/8c/8cd3f1898255c045143e1da97fbabf10_w200.gif' height="20" width="100%">

---

El diagrama de clases de UML que se muestra a continuación documenta parte del diseño simplificado de un cliente de correo electrónico.


![image](https://user-images.githubusercontent.com/55964635/224120928-e8431bf9-e2a6-4c8e-894e-c2c90a24cbd7.png)

Su funcionamiento es el siguiente: 

- En respuesta al mensaje #recibir, almacena en el inbox (una de las carpetas) el email que recibe como parámetro.
- En respuesta al mensaje #mover, mueve el email que viene como parámetro de la carpeta origen a la carpeta destino (asuma que el email está en la carpeta origen cuando se recibe este mensaje). 
- En respuesta al mensaje #buscar retorna el primer email que encuentra cuyo título o cuerpo contienen el texto indicado como parámetro. Busca en todas las carpetas. 
- En respuesta al mensaje #espacioOcupado, retorna la suma del espacio ocupado por todos los emails de todas las carpetas.
- El tamaño de un email es la suma del largo del título, el largo del cuerpo, y del tamaño de sus adjuntos.
Para simplificar, asuma que el tamaño de un archivo es el largo de su nombre.

***Tareas***

- Complete el diseño y el diagrama de clases UML.
- Implemente en Java de la funcionalidad requerida.
- Implemente los tests (JUnit) que considere necesarios.
