<div align="center"> 

[![contributions welcome](https://img.shields.io/badge/contributions-welcome-brightgreen.svg?style=flat)](https://github.com/Fabian-Martinez-Rincon/Orientacion-a-Objetos1)
[![GitHub stars](https://img.shields.io/github/stars/Fabian-Martinez-Rincon/Orientacion-a-Objetos1)](https://github.com/Fabian-Martinez-Rincon/Orientacion-a-Objetos1/stargazers/)
[![GitHub repo size in bytes](https://img.shields.io/github/repo-size/Fabian-Martinez-Rincon/Orientacion-a-Objetos1)](https://github.com/Fabian-Martinez-Rincon/Orientacion-a-Objetos1)


<img src="https://readme-typing-svg.demolab.com?font=Fira+Code&size=34&duration=1700&pause=800&color=28CDF7&center=true&width=863&lines=☕ Orientación a Objetos 1"/>
 </div>

</div>

<img src= 'https://i.gifer.com/origin/8c/8cd3f1898255c045143e1da97fbabf10_w200.gif' height="20" width="100%">

- [Instalar Eclipse](https://www.eclipse.org/downloads/download.php?file=/oomph/epp/2022-12/R/eclipse-inst-jre-win64.exe)
- [Todas las autoEvaluaciones](/Documentos/autoevaluaciones.md)



- [1️⃣ Ejercicio 1 WallPost](/Documentos/cuadernillo.md)
- [2️⃣ Ejercicio 2 Balanza Electrónica](/Documentos/cuadernillo.md)
- [3️⃣ Ejercicio 3 Presupuestos y 3 Bis: Balanza mejorada](/Documentos/cuadernillo.md)
- [4️⃣ Ejercicio 4 Figuras y cuerpos](/Documentos/cuadernillo.md)
- [5️⃣ Ejercicio 5 Genealogía salvaje](/Documentos/cuadernillo.md)
- [6️⃣ Ejercicio 6 Red de Alumbrado](/Documentos/cuadernillo.md)
- [7️⃣ Ejercicio 7 Method lookup con Empleados](/Documentos/cuadernillo.md)
- [8️⃣ Ejercicio 8 Distribuidora Eléctrica](/Documentos/cuadernillo.md)
- [9️⃣ Ejercicio 9 Cuenta con ganchos](/Documentos/cuadernillo.md)
- [1️⃣0️⃣ Ejercicio 10 Job Scheduler](/Documentos/cuadernillo.md)
- [1️⃣1️⃣ Ejercicio 11 El Inversor](/Documentos/cuadernillo.md)
- [1️⃣2️⃣ Ejercicio 12 Volumen y superficie de sólidos](/Documentos/cuadernillo.md)
- [1️⃣3️⃣ Ejercicio 13 Cliente de correo con adjuntos](/Documentos/cuadernillo.md)
- [1️⃣4️⃣ Ejercicio 14 Intervalo de tiempo](/Documentos/cuadernillo.md)
- [1️⃣5️⃣ Ejercicio 15 Alquiler de propiedades](/Documentos/cuadernillo.md)
- [1️⃣6️⃣ Ejercicio 16 Políticas de cancelación](/Documentos/cuadernillo.md)
- [1️⃣7️⃣ Ejercicio 17 Facturación de llamadas](/Documentos/cuadernillo.md)
- [1️⃣8️⃣ Ejercicio 18 Liquidación de haberes](/Documentos/cuadernillo.md)
- [1️⃣9️⃣ Ejercicio 19 Mercado de Objetos](/Documentos/cuadernillo.md)
- [2️⃣0️⃣ Ejercicio 20 Farolas con focos](/Documentos/cuadernillo.md)



<img src= 'https://i.gifer.com/origin/8c/8cd3f1898255c045143e1da97fbabf10_w200.gif' height="20" width="100%">

## Contenido del APREF

La profe dijo que supuestamente cambiaron la forma de evaluar y que ahora no vamos tener un parcial normal sino que va a ser un codigo con errores y nosotros vamos a tener que corregir segun las euristicas dadas.

### Mercado Libre

<details><summary>Enunciado</summary>

![Pedidos de compra](/apref/MercadoOnLine.png)

</details>

***Resolución***

<details><summary>Sistema</summary>

```java
    public class Sistema{

    }
```
</details>

<details><summary>Usuario</summary></details>

<details><summary>Producto</summary></details>

### UML

![](/apref/MercadoOnLine.excalidraw.svg)

---

### Pedidos de Compra

<details><summary>Enunciado</summary>

![Veterinaria](/apref/Pedidos%20de%20compra.png)

</details>

### Veterinariua

<details><summary>Enunciado</summary>

![MercadoOnLine](/apref/Veterinaria.png)

</details>

---



### Parcial Cursada


Una distribuidora brinda la posibilidad de registrar los pedidos de compra de sus clientes. Cada cliente puede realizar pedidos en los cuales se especifican los productos deseados, incluyendo las cantidades necesarias.

El sistema debe permitir

- **Registrar Cliente**: Dado el nombre y e-mail, se crea y retorna el cliente con la fecha actual, como fecha de alta.
- **Registrar producto nacional** Dado el nombre, el costo unitario y descripción, se registra y retorna el producto.
- **Registrar producto importado** Dado el nombre, el costo unitario, descripción y el país de origen, se registra el producto y se retorna.
- **Registrar un pedido para un cliente:** Dado un cliente se registra un pedido nuevo con la fecha actual como fecha de pedido y se lo retorna.
- **Agregar un item para un pedido**: Dado un pedido y un producto junto con la cantidad necesaria del mismo, se registra el ítem en el pedido.
- **Calcular la cantidad total solicitada de un producto:** Dado un producto, determinar la cantidad todal de unidades solicitadas de ese producto, calculada como la suma de las cantidades pedidas de dicho producto en todos los pedidos registrados para todos los clientes.
- **Calcular el costo total de los pedidos de un cliente en un período** Dado un cliente, una fecha de inicio y una fecha de fin, se debe calcular el costo que tiene por sus pedidos realizados en dicho período, según la siguiente especificación:
- Cada pedido tiene como costo, la suma de los costos totales de sus items.
- El costo total de cada item se calcula multiplicando el costo unitario del producto por la cantidad y sumando el impuesto.
- El impuesto se calcula a partir de las siguientes reglas:
    - Si el producto es nacional el impuesto depende de la cantidad pedida. Hasta 10 unidades, se debe pagar el 5% del costo unitario. En caso contrario se exceptúa del pago de impuesto.
    - Si el producto es importado, el impuesto varía de acuerdo al país de origen y la cantidad de unidades. Si el pais pertenece al Mercosur (Brazil, Paraguay o Uruguay) y son más de 50 unidades, corresponde pagar 8%. De lo contrario, el impuesto es 21%.
- **Retornar los clientes del "top 5" de los últimos 30 dias:** se deben retornar los 5 clientes con mayor costo total en pedidos realizados en los últimos 30 dias.

Su tarea es diseñar y programar en Java lo que sea necesario para ofreceer la funcionalidad antes descrita. Se espera que entregue lo siguiente:
- **`1)`** Diseño de su solución en un diagrama de clases UML.
- **`2)`** Implementación en Java de la funcionalidad requerida
- **`3)`** Diseño de los casos de Prueba: Enfocándose en la funcionalidad que permite "calcular el costo total de los pedidos de un cliente en un periodo" (es decir, todos los métodos de todas las clases involucradas en conseguir esa funcionalidad), determine y enumero qué métodos, de qué clases, testear y con qué casos de prueba para cada método (teniendo en cuenta los conceptos de valores borded y particiones equivalentes)
    - Ejemplo: Clase CajaAhorro - Metodo Extraer(monto:double)
    - Casos de prueba identificados: saldo igual al monto, saldo menor al monto y saldo mayor al monto.
- **`4)`** Un ejemplo de código Java necesario para realizar el sistema, registrar un producto nacional, registrar un cliente, agregarle un pedido al cliente con un item para ese producto.

> Tenga en cuenta que los 4 items anteriores son **requeridos para aprobar**

---

![](/apref/parcial1.png)

---

### Final Objetos



