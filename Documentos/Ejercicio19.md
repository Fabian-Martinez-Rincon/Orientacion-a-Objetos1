<h1 align="center"> 📝 Ejercicio 19. Mercado de Objetos</h1>

<img src= 'https://i.gifer.com/origin/8c/8cd3f1898255c045143e1da97fbabf10_w200.gif' height="20" width="100%">

<div align="center">

[Siguiente](/Documentos/Ejercicio20.md)<br>
[Anterior](/Documentos/Ejercicio18.md)
 </div>

<img src= 'https://i.gifer.com/origin/8c/8cd3f1898255c045143e1da97fbabf10_w200.gif' height="20" width="100%">

---

**Nota: este ejercicio es del estilo de los que encontrarán en la evaluación parcial**

Queremos programar en objetos una versión simplificada de un mercado on-line similar a e-Bay o MercadoLibre. 

El sistema ofrece la siguiente funcionalidad (que usted deberá implementar)

- **Registrar un vendedor:** Se indica el nombre del vendedor y su dirección. Se agrega el vendedor y se lo retorna. 
- **Buscar un vendedor:** Se indica el nombre del vendedor que se desea buscar/recuperar. Si existe lo retorna. Si no, retorna null. Asuma que no hay nombres repetidos.
- **Registrar un cliente:** Se indica el nombre del cliente y su dirección. Se agrega cliente y se lo retorna.  Asuma que no hay nombres repetidos.
- **Buscar un cliente:** Se indica el nombre del cliente que se desea buscar/recuperar. Si existe lo retorna. Si no, retorna null.
- **Poner un producto a la venta:** Se indica el nombre del producto, su descripción, su precio, la cantidad de unidades disponibles y el vendedor. Retorna el producto
- **Buscar un producto:** Se indica el nombre del producto que se desea buscar/recuperar. Retorna una colección con los productos que tienen ese nombre o una colección vacía.
- **Crear un pedido.** Se indica el cliente. Se indica el producto y la cantidad solicitada. Se indica la forma de pago elegida y el mecanismo de envío elegido. Si hay suficientes unidades disponibles del producto, el sistema registra el pedido y actualiza la cantidad de unidades disponibles del producto. Si no hay suficientes unidades disponibles, no se hace nada.  
    - Las opciones de pago posibles son: "al contado" o "6 cuotas". A futuro podrían agregarse otras formas de pago. 
    - Los mecanismos de envío posibles son: "retirar en el comercio", "retirar en sucursal del correo", ó "exprés a domicilio". A futuro podrían agregarse otros mecanismos de envío.
- **Calcular el costo total de un pedido.** Dado un pedido, se retorna su costo total que se calcula de la siguiente forma: (precio final en base a la forma de pago seleccionada) + (costo de envío en base al mecanismo de envío seleccionado).
    - si la forma de pago es "al contado", el precio final es el que se indica en el producto
    - si la forma de pago es "6 cuotas", el precio final se incrementa en un 20%
    - si el mecanismo de envío es  "retirar en el comercio" no hay costo adicional de envío.
    - si el mecanismo de envío es "retirar en sucursal del correo" el costo es $50.
    - si el mecanismo de envío es "express a domicilio" el costo es $0.5 por Km de distancia entre la dirección del vendedor y del cliente. Asuma que existe una clase Mapa, cuyas instancias entienden el mensaje #distanciaEntre que recibe dos direcciones y retorna la distancia en Km entre ellas. Por ahora trabaje con una implementación suya (de pruebas) de esa clase que siempre retorna 100 (sin importar las direcciones). 

Su tarea es diseñar y programar en Java lo que sea necesario para ofrecer la funcionalidad antes descrita.

- Diagrama de clases UML.
- Implementación en Java de la funcionalidad requerida.
- Implemente los tests que considere necesarios justificando su elección según lo visto en teoría respecto a valores de borde y particiones equivalentes