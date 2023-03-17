<h1 align="center"> 📝 Ejercicio 2: Balanza Electrónica</h1>

<img src= 'https://i.gifer.com/origin/8c/8cd3f1898255c045143e1da97fbabf10_w200.gif' height="20" width="100%">

<div align="center">

[Siguiente](/Practica/Ejercicio%203%20Presupuestos%20y%203%20Bis%20Balansa%20Mejorada/)<br>
[Anterior](/Practica/Ejercicio%201%20WallPost/)
 </div>

<img src= 'https://i.gifer.com/origin/8c/8cd3f1898255c045143e1da97fbabf10_w200.gif' height="20" width="100%">

No tengo idea del porque me salen las cruces azules, el test esta todo correcto por lo que veo

![image](https://user-images.githubusercontent.com/55964635/225507031-db09b66e-7268-4c14-aa2a-9382e82f17fb.png)

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

---