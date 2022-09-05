<h1 align="center">  Orientación a Objetos 1</h1>

<p><img width="250" align='right' src="img/3.png"></p>

- [Condiciones](/Documentos/Condiciones.md)
- [Ejercicio 1 WallPost](#1️⃣ejercicio-1-wallpost)




## 📒 Cuadernillo

### 1️⃣Ejercicio 1: WallPost


<details > <summary>  Primera Parte</summary>

### Enunciado

Se está construyendo una red social como Facebook o Twitter. Debemos definir una clase Wallpost con los siguientes atributos: un texto que se desea publicar, cantidad de likes (“me gusta”) y una marca que indica si es destacado o no. La clase es subclase de Object. 

Para realizar este ejercicio, utilice el recurso que se encuentra en el sitio de la cátedra. Para importar el proyecto, siga los pasos explicados en el documento “Trabajando con proyectos Maven, importar un proyecto”. Allí verá que existe la interface Wallpost y la clase WallpostImpl que implementa la interfaz anterior. Una vez importado, dentro del mismo, debe completar la clase WallPostImpl para que entienda: 


```Java
/* 
* Permite construir una instancia del WallpostImpl. 
* Luego de la invocación, debe tener como texto: “Undefined post”, 
* no debe estar marcado como destacado y la cantidad de “Me gusta” deben ser 0. 
*/ 

public WallpostImpl() 
```

E implemente el protocolo definido en la interfaz Wallpost como se detalla a continuación 

```Java
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
 * Incrementa la cantidad de likes en uno y retorna la instancia de Wallpost. 
*/ 

public WallPost like()  

/* 
 * Decrementa la cantidad de likes en uno. Si ya es 0, no hace nada. Retorna la instancia de Wallpost. 
*/ 

public WallPost dislike() 


/* 
 * Retorna true si el post está marcado como destacado, false en caso contrario 
*/ 

public boolean isFeatured()  

/* 
 * Cambia el post del estado destacado a no destacado y viceversa. Retorna la instancia de Wallpost. 
*/ 

public WallPost toggleFeatured() 
```

</details>

<details > <summary> Segunda Parte</summary>

### Enunciado

Utilice los tests provistos por la cátedra para comprobar que su implementación de Wallpost es correcta. Éstos se encuentran en el mismo proyecto, en la carpeta test, clase WallPostTest. 

Para ejecutar los tests simplemente haga click derecho sobre el proyecto y utilice la opción Run As >> JUnit Test. Al ejecutarlo, se abrirá una ventana con el resultado de la evaluación de los tests. Siéntase libre de investigar la implementación de la clase de test. Ya veremos en detalle cómo implementarlas.  

![](/img/1.PNG)

En el informe, Runs indica la cantidad de test que se ejecutaron. En Errors se indica la cantidad que dieron error y en Failures se indica la cantidad que tuvieron alguna falla, es decir,  los resultados no son los esperados. Abajo, se muestra el Failure Trace del test que falló. Si lo selecciona, mostrará el mensaje de error correspondiente a ese test, que le ayudará a encontrar la falla. Si hace click sobre alguno de los test, se abrirá su implementación en el editor. 

</details>

<details> <summary> Tercera Parte</summary>

### Enunciado

Una vez que su implementación pasa los tests de la primera parte puede utilizar la ventana que se muestra a continuación, la cual permite inspeccionar y manipular el post (definir su texto, hacer like / dislike y marcarlo como destacado). 



![image](https://user-images.githubusercontent.com/55964635/185828929-6082a5c1-84f6-4911-b6a2-7e1623d394c5.png)


Para visualizar la ventana, sobre el proyecto, usar la opción del menú contextual Run As >> Java Application. La ventana permite cambiar el texto del post, incrementar la cantidad de likes, etc. El botón Print to Console imprimirá los datos del post en la consola.  

</details>