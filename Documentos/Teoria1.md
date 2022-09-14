## Teoria 1

- [Pagina anterior](/OO1/)

Resumen con notas y apuntes que tome en clase.

- [Programa Orientado a Objetos]()

## Programa Orientado a Objetos

¿Como es un software construido con objetos?

Es un conjunto de objetos que colaboran enviandose mensajes. Todo calculo/procesamiento ocurre **dentro** de los objetos. La **clave** del exito es poder agregar nueva funcionalidad (no prevista originalmente), reemplazar objetos o modificar objetos y que el sistema **no se entere**, ni se rompa.

- Los sistemas están compuestos (solamente) por un conjunto de
objetos que colaboran para llevar a cabo sus responsabilidades.
- Los objetos son **responsables** de:
    - Conocer sus propiedades,
    - Conocer otros objetos (con los que colaboran) y
    - Llevar a cabo ciertas acciones.
- No hay un objeto **"main"**. Esto se refiere a que no tenemos un objeto que sea nuestra "raiz", lo que si podemos tenen, son objetos con mas importancia que otros
- Cuando codificamos, describimos (programamos) clases
- Una jerarquia de clases no indica lo mismo que la jerarquia top-down
- Cuando se ejecuta el programa lo que tenemos son objetos que cooperan y que se crean dinámicamente durante la ejecución del programa
- Podemos pensar la interacción usuario/software de la misma manera
- Este mismo modelo nos permite entender (al menos en parte) otros modelos de computación: viendo a los objetos como proveedores de servicios por ejemplo
- Este mismo modelo no asume objetos localizados en el mismo espacio de memoria (pueden estar distribuidos)

Impacto enc omo **"pensamos el software"**

- La estructura general cambia: en vez de una jerarquía: Main/procedures/sub-procedures tenemos una red de “cosas” que se comunican.
- Pensamos en que **“cosas”** hay en nuestro software (los objetos) y como se comunican entre sí.
- Hay un **“shift”** mental crítico en forma en la cual pensamos el software como objetos
- ****Mientras que la estructura sintáctica es “lineal” el programa en ejecucion no lo és