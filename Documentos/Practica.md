<h1 align="center"> 📝 Ejercicio 1: WallPost</h1>

<img src= 'https://i.gifer.com/origin/8c/8cd3f1898255c045143e1da97fbabf10_w200.gif' height="20" width="100%">

- [Objeto WallPost](/Practica/Ejercicio%201%20WallPost/Ejercicio-1-WallPost/Documentos/ejercicio1-wallpost/src/main/java/ar/edu/unlp/oo1/ejercicio1/impl/WallPostImpl.java)
- [Test](/Practica/Ejercicio%201%20WallPost/Ejercicio-1-WallPost/Documentos/ejercicio1-wallpost/src/test/java/ar/edu/unlp/oo1/ejercicio1/WallPostTest.java)




---

##  Primera parte
Se está construyendo una red social como Facebook o Twitter. Debemos definir una clase Wallpost con los siguientes atributos: un texto que se desea publicar, cantidad de likes (“me gusta”) y una marca que indica si es destacado o no. La clase es subclase de Object.

Para realizar este ejercicio, utilice el recurso que se encuentra en el sitio de la cátedra. Para importar el proyecto, siga los pasos explicados en el documento “Trabajando con proyectos Maven, importar un proyecto”. Allí verá que existe la interface Wallpost y la clase WallpostImpl que implementa la interfaz anterior. Una vez importado, dentro del mismo, debe completar la clase WallPostImpl para que entienda:

```java
/*
* Permite construir una instancia del WallpostImpl.
* Luego de la invocación, debe tener como texto: “Undefined post”,
* no debe estar marcado como destacado y la cantidad de “Me gusta” deben ser 0.
*/
public WallpostImpl()

```

E implemente el protocolo definido en la interfaz Wallpost como se detalla a continuación

```java
/*
* Retorna el texto descriptivo de la publicación
*/
public String getText() 

/*
* setea el texto descriptivo de la publicación
*/
public void setText (String descriptionText)

/*
* retorna la cantidad de “me gusta”
*/
public int getLikes() 

/*
 * Incrementa la cantidad de likes en uno.
*/
public void like() 

/*
 * Decrementa la cantidad de likes en uno. Si ya es 0, no hace nada..
*/
public void dislike()

/*
 * Retorna true si el post está marcado como destacado, false en caso contrario
*/
public boolean isFeatured() 

/*
 * Cambia el post del estado destacado a no destacado y viceversa.
*/
public void toggleFeatured()

```

<img src= 'https://i.gifer.com/origin/8c/8cd3f1898255c045143e1da97fbabf10_w200.gif' height="20" width="100%">

## Segunda parte

Utilice los tests provistos por la cátedra para comprobar que su implementación de Wallpost es correcta. Éstos se encuentran en el mismo proyecto, en la carpeta test, clase WallPostTest.
Para ejecutar los tests simplemente haga click derecho sobre el proyecto y utilice la opción Run As >> JUnit Test. Al ejecutarlo, se abrirá una ventana con el resultado de la evaluación de los tests. Siéntase libre de investigar la implementación de la clase de test. Ya veremos en detalle cómo implementarlas. 

<img width ='50%' src='https://user-images.githubusercontent.com/55964635/223005848-2eecbaff-3a1a-45bc-aa6d-3a868a07c775.png'>

En el informe, Runs indica la cantidad de test que se ejecutaron. En Errors se indica la cantidad que dieron error y en Failures se indica la cantidad que tuvieron alguna falla, es decir,  los resultados no son los esperados. Abajo, se muestra el Failure Trace del test que falló. Si lo selecciona, mostrará el mensaje de error correspondiente a ese test, que le ayudará a encontrar la falla. Si hace click sobre alguno de los test, se abrirá su implementación en el editor. 
<img src= 'https://i.gifer.com/origin/8c/8cd3f1898255c045143e1da97fbabf10_w200.gif' height="20" width="100%">

## Tercera parte

Una vez que su implementación pasa los tests de la primera parte puede utilizar la ventana que se muestra a continuación, la cual permite inspeccionar y manipular el post (definir su texto, hacer like / dislike y marcarlo como destacado).

<img width ='30%' src='https://user-images.githubusercontent.com/55964635/223011165-4e16ff1c-0328-4a43-b2a6-3d44d5f78c1f.png'>


Para visualizar la ventana, sobre el proyecto, usar la opción del menú contextual Run As >> Java Application. La ventana permite cambiar el texto del post, incrementar la cantidad de likes, etc. El botón Print to Console imprimirá los datos del post en la consola. 

<img src= 'https://i.gifer.com/origin/8c/8cd3f1898255c045143e1da97fbabf10_w200.gif' height="20" width="100%">

### UML
<img src= 'https://user-images.githubusercontent.com/55964635/228714344-e78abcc4-0836-4747-a15c-6cc431f43556.jpg' width="40%">
<img src= 'https://i.gifer.com/origin/8c/8cd3f1898255c045143e1da97fbabf10_w200.gif' height="20" width="100%">


<h1 align="center"> 📝 Ejercicio 2: Balanza Electrónica</h1>

<img src= 'https://i.gifer.com/origin/8c/8cd3f1898255c045143e1da97fbabf10_w200.gif' height="20" width="100%">

<div align="center">

[Siguiente](/Practica/Ejercicio%203%20Presupuestos%20y%203%20Bis%20Balansa%20Mejorada/)<br>
[Anterior](/Practica/Ejercicio%201%20WallPost/)
 </div>

<img src= 'https://i.gifer.com/origin/8c/8cd3f1898255c045143e1da97fbabf10_w200.gif' height="20" width="100%">


- [Balanza](/Practica/Ejercicio%202%20Balanza%20Electr%C3%B3nica/Ejercicio-2-Balanza-Electronica/src/main/java/ar/edu/unlp/info/oo1/Ejercicio_2_Balanza_Electronica/Balanza.java)
- [Producto](/Practica/Ejercicio%202%20Balanza%20Electr%C3%B3nica/Ejercicio-2-Balanza-Electronica/src/main/java/ar/edu/unlp/info/oo1/Ejercicio_2_Balanza_Electronica/Producto.java)
- [Ticket](/Practica/Ejercicio%202%20Balanza%20Electr%C3%B3nica/Ejercicio-2-Balanza-Electronica/src/main/java/ar/edu/unlp/info/oo1/Ejercicio_2_Balanza_Electronica/Ticket.java)
- [BalanzaTest](/Practica/Ejercicio%202%20Balanza%20Electr%C3%B3nica/Ejercicio-2-Balanza-Electronica/src/test/java/ar/edu/unlp/info/oo1/Ejercicio_2_Balanza_Electronica/BalanzaTest.java)
- [ProductoTest](/Practica/Ejercicio%202%20Balanza%20Electr%C3%B3nica/Ejercicio-2-Balanza-Electronica/src/test/java/ar/edu/unlp/info/oo1/Ejercicio_2_Balanza_Electronica/ProductoTest.java)

---

En el taller de programación ud programó una balanza electrónica. Volveremos a programarla, con algún requerimiento adicional. 

En términos generales, la Balanza electrónica recibe productos (uno a uno), y calcula dos totales: peso total y precio total. Además la balanza puede poner en cero todos sus valores. 

La balanza no guarda los productos. Luego emite un ticket que indica el número de productos considerados, peso total, precio total.

**Implemente:**

Cree un nuevo proyecto Maven llamado balanzaElectronica, siguiendo los pasos del documento “Trabajando con proyectos Maven, crear un proyecto Maven nuevo”. En el paquete correspondiente,  programe las clases que se muestran a continuación. 

<img width ='80%' src='https://user-images.githubusercontent.com/55964635/223011419-519a3c72-63d0-424c-8666-9e7ad1ff76f3.png'>

Observe que no se documentan en el diagrama los mensajes que nos permiten obtener y establecer los atributos de los objetos (accessors). Aunque no los incluimos, verá que los tests fallan si no los implementa. Consulte con el ayudante para identificar, a partir de los tests que fallan, cuales son los accessors necesarios (pista: todos menos los setters de balanza). 

Todas las clases son subclases de Object.

Nota: Para las fechas, utilizaremos la clase java.time.LocalDate. Para crear la fecha actual, puede utilizar LocalDate.now(). También es posible crear fechas distintas a la actual. Puede investigar más sobre esta clase en

https://docs.oracle.com/javase/8/docs/api/java/time/LocalDate.html

Probando su implementación:

Para realizar este ejercicio, utilice el recurso que se encuentra en el sitio de la cátedra. En este caso, se trata de dos clases, BalanzaTest y ProductoTest, las cuales debe agregar dentro del paquete tests. Haga las modificaciones necesarias para que el proyecto no tenga errores. 

Si todo salió bien, su implementación debería pasar las pruebas que definen las clases agregadas en el paso anterior. El propósito de estas clases es ejercitar una instancia de la clase Balanza y verificar que se comporta correctamente. 

<img src= 'https://i.gifer.com/origin/8c/8cd3f1898255c045143e1da97fbabf10_w200.gif' height="20" width="100%">

<h1 align="center"> 📝 Ejercicio 3: Presupuestos</h1>

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


