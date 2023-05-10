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

<h1 align="center"> 📝 Ejercicio 4: Figuras y Cuerpos</h1>

<img src= 'https://i.gifer.com/origin/8c/8cd3f1898255c045143e1da97fbabf10_w200.gif' height="20" width="100%">



- [Circulo](/Practica/Ejercicio%204%20Figuras%20y%20cuerpos/Ejercicio-4-Figuras-y-Cuerpos/src/main/java/ar/edu/unlp/info/oo1/Ejercicio_4_Figuras_y_Cuerpos/Circulo.java)
- [Cuadrado](/Practica/Ejercicio%204%20Figuras%20y%20cuerpos/Ejercicio-4-Figuras-y-Cuerpos/src/main/java/ar/edu/unlp/info/oo1/Ejercicio_4_Figuras_y_Cuerpos/Cuadrado.java)
- [Cuerpo3D](/Practica/Ejercicio%204%20Figuras%20y%20cuerpos/Ejercicio-4-Figuras-y-Cuerpos/src/main/java/ar/edu/unlp/info/oo1/Ejercicio_4_Figuras_y_Cuerpos/Cuerpo3D.java)
- [Figura](/Practica/Ejercicio%204%20Figuras%20y%20cuerpos/Ejercicio-4-Figuras-y-Cuerpos/src/main/java/ar/edu/unlp/info/oo1/Ejercicio_4_Figuras_y_Cuerpos/Figura.java)
- [CuerpoTest](/Practica/Ejercicio%204%20Figuras%20y%20cuerpos/Ejercicio-4-Figuras-y-Cuerpos/src/test/java/ar/edu/unlp/info/oo1/Ejercicio_4_Figuras_y_Cuerpos/CuerpoTest.java)
- [TestCirculo](/Practica/Ejercicio%204%20Figuras%20y%20cuerpos/Ejercicio-4-Figuras-y-Cuerpos/src/test/java/ar/edu/unlp/info/oo1/Ejercicio_4_Figuras_y_Cuerpos/TestCirculo.java)
- [TestCuadrado](/Practica/Ejercicio%204%20Figuras%20y%20cuerpos/Ejercicio-4-Figuras-y-Cuerpos/src/test/java/ar/edu/unlp/info/oo1/Ejercicio_4_Figuras_y_Cuerpos/TestCuadrado.java)

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

Fórmulas útiles:

- El área o superficie exterior de un cuerpo es: 
- 2* área-cara-basal + perímetro-cara-basal * altura-del-cuerpo
- El volumen de un cuerpo es: área-cara-basal * altura

Más info interesante: A la figura que da forma al cuerpo (el círculo o el cuadrado en nuestro caso) se le llama directriz. Y a la recta en la que se mueve se llama generatriz. En wikipedia (Cilindro) se puede aprender un poco más al respecto.

**Pruebas automatizadas**

Siguiendo los ejemplos de ejercicios anteriores, ejecute las pruebas automatizadas provistas. En este caso, se trata de tres clases que debe agregar dentro del paquete tests. Haga las modificaciones necesarias para que el proyecto no tenga errores.  Si algún test no pasa, consulte al ayudante. 

**Discuta y reflexione**

Discuta con el ayudante sus elecciones de variables de instancia y métodos adicionales. ¿Es necesario todo lo que definió?

<img src= 'https://i.gifer.com/origin/8c/8cd3f1898255c045143e1da97fbabf10_w200.gif' height="20" width="100%">

### UML

<img src= 'https://user-images.githubusercontent.com/55964635/228714700-40d365ec-a774-4187-b069-e981a17d4c98.jpg' width="100%">

<img src= 'https://i.gifer.com/origin/8c/8cd3f1898255c045143e1da97fbabf10_w200.gif' height="20" width="100%">

<h1 align="center"> 📝 Ejercicio 5: Genealogía salvaje</h1>

<img src= 'https://i.gifer.com/origin/8c/8cd3f1898255c045143e1da97fbabf10_w200.gif' height="20" width="100%">

- [Mamifero](/Practica/Ejercicio%205%20Genealog%C3%ADa%20salvaje/Ejercicio-5-Genealogia-salvaje/src/main/java/ar/edu/unlp/info/oo1/Ejercicio_5_Genealogia_salvaje/Mamifero.java)
- [MamiferoTest](/Practica/Ejercicio%205%20Genealog%C3%ADa%20salvaje/Ejercicio-5-Genealogia-salvaje/src/test/java/ar/edu/unlp/info/oo1/Ejercicio_5_Genealogia_salvaje/MamiferoTest.java)

---

En una reserva de vida salvaje (como la estación de cría ECAS, en el camino Centenario), los cuidadores quieren llevar registro detallado de los animales que cuidan y sus familias. Para ello nos han pedido ayuda. Debemos: 

a) Modelar en objetos y programar la clase Mamífero (como subclase de Object). El siguiente diagrama de clases (incompleto) nos da una idea de los mensajes que un mamífero entiende. *Deje tieneComoAncestroA para el final y discuta su solución con el ayudante.*

<img src= 'https://user-images.githubusercontent.com/55964635/224107160-5bb25af2-0d06-4465-a8be-7f615d36212a.png' height="290px">

b) Complete el diagrama de clases para reflejar los atributos y relaciones requeridos. 

c) Siguiendo los ejemplos de ejercicios anteriores, ejecute las pruebas automatizadas provistas. En este caso, se trata de una clase, MamiferoTest, que debe agregar dentro del paquete tests. En esta clase se trabaja con la familia mostrada en la siguiente figura. 

![image](https://user-images.githubusercontent.com/55964635/224107787-7df35fe8-5130-4a08-9fe4-711b153d03a6.png)

En el diagrama se puede apreciar el nombre/identificador de cada uno de ellos (por ejemplo Nala, Mufasa, Alexa, etc). 

Haga las modificaciones necesarias para que el proyecto no tenga errores.  Si algún test no pasa, consulte al ayudante. 

<img src= 'https://i.gifer.com/origin/8c/8cd3f1898255c045143e1da97fbabf10_w200.gif' height="20" width="100%">

### UML

<img src= 'https://user-images.githubusercontent.com/55964635/228714889-17b402c3-4d3f-4e1f-ba27-bb762175a42b.jpg' width="75%">

<img src= 'https://i.gifer.com/origin/8c/8cd3f1898255c045143e1da97fbabf10_w200.gif' height="20" width="100%">

<h1 align="center"> 📝 Ejercicio 6: Red de Alumbrado</h1>

<img src= 'https://i.gifer.com/origin/8c/8cd3f1898255c045143e1da97fbabf10_w200.gif' height="20" width="100%">


- [Farola](/Practica/Ejercicio%206%20Red%20de%20alumbrado/Ejercicio-6-Red-de-alumbrado/src/main/java/ar/edu/unlp/info/oo1/Ejercicio_6_Red_de_alumbrado/Farola.java)
- [FarolaTest](/Practica/Ejercicio%206%20Red%20de%20alumbrado/Ejercicio-6-Red-de-alumbrado/src/test/java/ar/edu/unlp/info/oo1/Ejercicio_6_Red_de_alumbrado/FarolaTest.java)

---

Imagine una red de alumbrado donde cada farola está conectada a una o varias vecinas formando un grafo conexo. Cada una de las farolas tiene un interruptor. Es suficiente con encender o apagar una farola cualquiera para que se enciendan o apaguen todas las demás. Sin embargo, si se intenta apagar una farola apagada (o si se intenta encender una farola encendida) no habrá ningún efecto, ya que no se propagará esta acción hacia las vecinas.

La funcionalidad a proveer permite:

- crear farolas (inicialmente están apagadas)
- conectar farolas a tantas vecinas como uno quiera (las conexiones son bi-direccionales) 
- encender una farola (y obtener el efecto antes descrito)
- apagar una farola (y obtener el efecto antes descrito)

**Tareas:**

1. Realice el diagrama UML de clases de la solución al problema. 
2. Implemente en Java, la clase Farola, como subclase de Object, con los siguientes métodos:

```java
/*
* Crear una farola. Debe inicializarla como apagada
*/
public Farola ()
/*
* Crea la relación de vecinos entre las farolas. La relación de vecinos entre las farolas es recíproca, es decir el receptor del mensaje será vecino de otraFarola, al igual que otraFarola también se convertirá en vecina del receptor del mensaje
*/
public void pairWithNeighbor( Farola otraFarola )
/*
* Retorna sus farolas vecinas
*/
public List<Farola> getNeighbors ()


/*
* Si la farola no está encendida, la enciende y propaga la acción.
*/
public void turnOn()

/*
* Si la farola no está apagada, la apaga y propaga la acción.
*/
public void turnOff()

/*
* Retorna true si la farola está encendida.
*/
public boolean isOn()


```

3. Utilice los tests provistos por la cátedra para probar las implementaciones del punto 3.

<img src= 'https://i.gifer.com/origin/8c/8cd3f1898255c045143e1da97fbabf10_w200.gif' height="20" width="100%">

### UML

<img src= 'https://user-images.githubusercontent.com/55964635/228714899-0bba96bf-5080-4f2c-b4b1-afb037f49916.jpg' width="75%">

<img src= 'https://i.gifer.com/origin/8c/8cd3f1898255c045143e1da97fbabf10_w200.gif' height="20" width="100%">

<h1 align="center"> 📝 Ejercicio 7: Method lookup con Empleados</h1>

<img src= 'https://i.gifer.com/origin/8c/8cd3f1898255c045143e1da97fbabf10_w200.gif' height="20" width="100%">

Aca queria preguntar sobre la pregunta teorica

- [Empleado](/Practica/Ejercicio%207%20Method%20Lookup%20con%20empleados/Ejercicio-7-Method-Lookup-con-empleados/src/main/java/ar/edu/unlp/info/oo1/Ejercicio_7_Method_Lookup_con_empleados/Empleado.java)
- [EmpleadoJerarquico](/Practica/Ejercicio%207%20Method%20Lookup%20con%20empleados/Ejercicio-7-Method-Lookup-con-empleados/src/main/java/ar/edu/unlp/info/oo1/Ejercicio_7_Method_Lookup_con_empleados/EmpleadoJerarquico.java)
- [Gerente](/Practica/Ejercicio%207%20Method%20Lookup%20con%20empleados/Ejercicio-7-Method-Lookup-con-empleados/src/main/java/ar/edu/unlp/info/oo1/Ejercicio_7_Method_Lookup_con_empleados/Gerente.java)
- [Main](/Practica/Ejercicio%207%20Method%20Lookup%20con%20empleados/Ejercicio-7-Method-Lookup-con-empleados/src/main/java/ar/edu/unlp/info/oo1/Ejercicio_7_Method_Lookup_con_empleados/main.java)


---

Sea la jerarquía de Empleado como muestra la figura de la izquierda, cuya implementación de referencia se incluye en la tabla de la derecha.

![image](https://user-images.githubusercontent.com/55964635/224112649-6c8e72f0-552c-4208-a520-30eb7c545072.png)

Analice cada uno de los siguientes fragmentos de código y resuelva las tareas indicadas abajo:

![image](https://user-images.githubusercontent.com/55964635/224112807-3647249a-6a42-4463-bf96-5b852e6d950b.png)

**Tareas**

- Liste los métodos que son ejecutados como resultado del envío del último mensaje (por ejemplo, método #aportes de la clase X, ...)
- Responda qué valores tendrán las variables aportesDeAlan y sueldoBasicoDeAlan.
- `aportesDeAlan` 2850.0
- `sueldoBasicoDeAlan` 67850.0

<img src= 'https://i.gifer.com/origin/8c/8cd3f1898255c045143e1da97fbabf10_w200.gif' height="20" width="100%">
<h1 align="center"> 📝 Ejercicio 8: Distribuidora Eléctrica</h1>
<img src= 'https://i.gifer.com/origin/8c/8cd3f1898255c045143e1da97fbabf10_w200.gif' height="20" width="100%">

- [Distribuidora](/Practica/Ejercicio%208%20Distribuidora%20El%C3%A9ctrica/Ejercicio-8-Distribuidora-Electrica/src/main/java/ar/edu/unlp/info/oo1/Ejercicio_8_Distribuidora_Electrica/Distribuidora.java)
- [Usuario](/Practica/Ejercicio%208%20Distribuidora%20El%C3%A9ctrica/Ejercicio-8-Distribuidora-Electrica/src/main/java/ar/edu/unlp/info/oo1/Ejercicio_8_Distribuidora_Electrica/Usuario.java)
- [Factura](/Practica/Ejercicio%208%20Distribuidora%20El%C3%A9ctrica/Ejercicio-8-Distribuidora-Electrica/src/main/java/ar/edu/unlp/info/oo1/Ejercicio_8_Distribuidora_Electrica/Factura.java)
- [Consumo](/Practica/Ejercicio%208%20Distribuidora%20El%C3%A9ctrica/Ejercicio-8-Distribuidora-Electrica/src/main/java/ar/edu/unlp/info/oo1/Ejercicio_8_Distribuidora_Electrica/Consumo.java)
- [DistribuidoraTest](/Practica/Ejercicio%208%20Distribuidora%20El%C3%A9ctrica/Ejercicio-8-Distribuidora-Electrica/src/test/java/ar/edu/unlp/info/oo1/Ejercicio_8_Distribuidora_Electrica/DistribuidoraTest.java)
- [UsuarioTest](/Practica/Ejercicio%208%20Distribuidora%20El%C3%A9ctrica/Ejercicio-8-Distribuidora-Electrica/src/test/java/ar/edu/unlp/info/oo1/Ejercicio_8_Distribuidora_Electrica/UsuarioTest.java)
- [FacturaTest](/Practica/Ejercicio%208%20Distribuidora%20El%C3%A9ctrica/Ejercicio-8-Distribuidora-Electrica/src/test/java/ar/edu/unlp/info/oo1/Ejercicio_8_Distribuidora_Electrica/FacturaTest.java)




---

- Una distribuidora eléctrica desea un sistema para el registro de los consumos de sus usuarios y para la emisión de facturas de cobro.
- El sistema permite registrar usuarios, para los cuales se indica nombre y dirección. Por simplificación, un usuario puede estar relacionado con un solo domicilio (para el que se registran los consumos).
- El sistema permite registrar los consumos para los usuarios. Los consumos que se registran para los usuarios tienen dos componentes: el consumo de energía activa y el consumo de energía reactiva.
- Una vez al mes, la empresa distribuidora realiza el proceso de facturación. Por cada usuario se emite una factura (el proceso completo retorna una colección).
- Para emitir la factura de un cliente se tiene en cuenta su último consumo y se calcula su factor de potencia para determinar si hay alguna bonificación para aplicar. El costo del consumo se calcula multiplicando el consumo de energía activa por el precio del kwh (Kilowatt/hora) de la empresa. La energía reactiva no tiene costo para el usuario. Si el factor de potencia estimado (pfe) del último consumo del usuario es mayor a 0.8, el usuario es bonificado con el 10%.
- El factor de potencia se calcula de acuerdo a la siguiente fórmula:


![image](https://user-images.githubusercontent.com/55964635/224113217-65a882f4-d67b-4f2e-8c44-3bc1e59cac6e.png)

- Además, la empresa está interesada en poder saber cuál fue el total de energía activa consumida por toda la red en el último periodo medido (es decir, teniendo en cuenta sólo la última medición de cada usuario). 

- El siguiente diagrama de clases muestra el diseño para este problema. Agregue los métodos que considere necesarios.

![image](https://user-images.githubusercontent.com/55964635/224113395-7117d942-825f-4b64-825d-e63ff84da8a4.png)

**Tareas**
 
Siguiendo el diseño que se muestra en el diagrama de clases, implemente la funcionalidad que se describe en el enunciado, en particular en lo referente a:

- Establecer (setear) el precio del KWh de la empresa
- Agregar usuarios
- Agregar mediciones
- Emitir facturas
- Obtener el consumo total en KWh de la red para el último período
 
En una clase de test, cree los test de unidad necesarios para poder evaluar:

- Iniciar el sistema
- Agregar un usuario
- Agregar un consumo para ese usuario
- Emitir las facturas
- Calcular el consumo total de la red para el último período

<img src= 'https://i.gifer.com/origin/8c/8cd3f1898255c045143e1da97fbabf10_w200.gif' height="20" width="100%">

<h1 align="center"> 📝 Ejercicio 9 : Cuenta con ganchos</h1>

<img src= 'https://i.gifer.com/origin/8c/8cd3f1898255c045143e1da97fbabf10_w200.gif' height="20" width="100%">



- [CajaDeAhorro](/Practica/Ejercicio%209%20Cuenta%20con%20ganchos/Ejercicio-9-Cuenta-con-ganchos/src/main/java/ar/edu/unlp/info/oo1/Ejercicio_9_Cuenta_con_ganchos/CajaDeAhorro.java)
- [Cuenta](/Practica/Ejercicio%209%20Cuenta%20con%20ganchos/Ejercicio-9-Cuenta-con-ganchos/src/main/java/ar/edu/unlp/info/oo1/Ejercicio_9_Cuenta_con_ganchos/Cuenta.java)
- [CuentaCorriente](/Practica/Ejercicio%209%20Cuenta%20con%20ganchos/Ejercicio-9-Cuenta-con-ganchos/src/main/java/ar/edu/unlp/info/oo1/Ejercicio_9_Cuenta_con_ganchos/CuentaCorriente.java)
- [CajaDeAhorroTest](/Practica/Ejercicio%209%20Cuenta%20con%20ganchos/Ejercicio-9-Cuenta-con-ganchos/src/test/java/ar/edu/unlp/info/oo1/Ejercicio_9_Cuenta_con_ganchos/CajaDeAhorroTest.java)
- [CuentaCorrienteTest](/Practica/Ejercicio%209%20Cuenta%20con%20ganchos/Ejercicio-9-Cuenta-con-ganchos/src/test/java/ar/edu/unlp/info/oo1/Ejercicio_9_Cuenta_con_ganchos//CuentaCorrienteTest.java)

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

![](/Documentos/Imagenes/Ejercicio9.jpg)