<h1 align="center"> 📝 Ejercicio 3: Presupuestos</h1>

<img src= 'https://i.gifer.com/origin/8c/8cd3f1898255c045143e1da97fbabf10_w200.gif' height="20" width="100%">

<div align="center">

[Siguiente](/Practica/Ejercicio%204%20Figuras%20y%20cuerpos/)<br>
[Anterior](/Practica/Ejercicio%202%20Balanza%20Electr%C3%B3nica/)
 </div>

<img src= 'https://i.gifer.com/origin/8c/8cd3f1898255c045143e1da97fbabf10_w200.gif' height="20" width="100%">

- [Item](/Practica/Ejercicio%203%20Presupuestos%20y%203%20Bis%20Balansa%20Mejorada/Ejercicio-3-Presupuestos/src/main/java/ar/edu/unlp/info/oo1/Ejercicio_3_Presupuestos/Item.java)
- [Presupuesto](/Practica/Ejercicio%203%20Presupuestos%20y%203%20Bis%20Balansa%20Mejorada/Ejercicio-3-Presupuestos/src/main/java/ar/edu/unlp/info/oo1/Ejercicio_3_Presupuestos/Presupuesto.java)
- [ItemTest](/Practica/Ejercicio%203%20Presupuestos%20y%203%20Bis%20Balansa%20Mejorada/Ejercicio-3-Presupuestos/src/test/java/ar/edu/unlp/info/oo1/Ejercicio_3_Presupuestos/ItemTest.java)
- [PresupuestoTest](/Practica/Ejercicio%203%20Presupuestos%20y%203%20Bis%20Balansa%20Mejorada/Ejercicio-3-Presupuestos/src/test/java/ar/edu/unlp/info/oo1/Ejercicio_3_Presupuestos/PresupuestoTest.java)

---

 Defina el proyecto Ejercicio 3 - Presupuesto y dentro de él Implemente las clases que se observan en el siguiente diagrama. Ambas son subclases de Object. Preste atención a los siguientes aspectos:

<img width ='35%' src='https://user-images.githubusercontent.com/55964635/223016099-bbb42255-fb19-4623-a4ad-8199c38f1bb6.png'>

- ¿Cuáles son las variables de instancia de cada clase?
- ¿Qué variables inicializa y cómo?


**Probando su código:**

Utilice los tests provistos para confirmar que su implementación ofrece la funcionalidad esperada. En este caso, se trata de dos clases,  ItemTest y PresupuestoTest, que debe agregar dentro del paquete tests. Haga las modificaciones necesarias para que el proyecto no tenga errores. Siéntase libre de explorar las clases de test para intentar entender qué es lo que hacen.  

<img src= 'https://i.gifer.com/origin/8c/8cd3f1898255c045143e1da97fbabf10_w200.gif' height="20" width="100%">

<h1 align="center"> 📝 Ejercicio 3 - Bis: Balanza mejorada</h1>

---

- [Balanza](/Practica/Ejercicio%203%20Presupuestos%20y%203%20Bis%20Balansa%20Mejorada/Ejercicio-3-Bis-Balansa-Mejorada/src/main/java/ar/edu/unlp/info/oo1/Ejercicio_3_Bis_Balansa_Mejorada/Balanza.java)
- [Producto](/Practica/Ejercicio%203%20Presupuestos%20y%203%20Bis%20Balansa%20Mejorada/Ejercicio-3-Bis-Balansa-Mejorada/src/main/java/ar/edu/unlp/info/oo1/Ejercicio_3_Bis_Balansa_Mejorada/Producto.java)
- [Ticket](/Practica/Ejercicio%203%20Presupuestos%20y%203%20Bis%20Balansa%20Mejorada/Ejercicio-3-Bis-Balansa-Mejorada/src/main/java/ar/edu/unlp/info/oo1/Ejercicio_3_Bis_Balansa_Mejorada/Ticket.java)
- [BalanzaTest](/Practica/Ejercicio%203%20Presupuestos%20y%203%20Bis%20Balansa%20Mejorada/Ejercicio-3-Bis-Balansa-Mejorada/src/test/java/ar/edu/unlp/info/oo1/Ejercicio_3_Bis_Balansa_Mejorada/BalanzaTest.java)
- [ProductoTest](/Practica/Ejercicio%203%20Presupuestos%20y%203%20Bis%20Balansa%20Mejorada/Ejercicio-3-Bis-Balansa-Mejorada/src/test/java/ar/edu/unlp/info/oo1/Ejercicio_3_Bis_Balansa_Mejorada/ProductoTest.java)

---

Realizando el ejercicio de los presupuestos, aprendimos que un objeto puede tener una colección de otros objetos. Con esto en mente, ahora queremos mejorar la balanza implementada anteriormente.

**Tarea 1**

Mejorar la balanza para que recuerde los productos ingresados (los mantenga en una colección). Analice de qué forma puede realizarse este nuevo requerimiento e implemente el mensaje 

```java
getProductos() : List<Producto>
```

que retorna todos los productos ingresados a la balanza (en la compra actual, es decir, desde la última vez que se la puso a cero).

¿Qué cambio produce este nuevo requerimiento en el mensaje ponerEnCero() ?


¿Es necesario, ahora, almacenar los totales en la balanza? ¿Se pueden obtener estos valores de otra forma?

**Tarea 2**

Con esta nueva funcionalidad, podemos enriquecer al Ticket, haciendo que él también conozca a los productos (a futuro podríamos imprimir el detalle). Ticket también debería entender el mensaje  

```java
getProductos():List<Producto> .
```

**Tarea 3**

Después de hacer estos cambios, ¿siguen pasando los tests? ¿Está bien que sea así?

<img src= 'https://i.gifer.com/origin/8c/8cd3f1898255c045143e1da97fbabf10_w200.gif' height="20" width="100%">

### UML

<img src= 'https://user-images.githubusercontent.com/55964635/228714498-31b4f053-ab3a-4891-ba75-3cecb18b4dd1.jpg' width="100%">

<img src= 'https://i.gifer.com/origin/8c/8cd3f1898255c045143e1da97fbabf10_w200.gif' height="20" width="100%">

