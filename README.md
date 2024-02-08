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
- [Cuadernillo con todos los ejercicios](/Documentos/cuadernillo.md)

<img src= 'https://i.gifer.com/origin/8c/8cd3f1898255c045143e1da97fbabf10_w200.gif' height="20" width="100%">

## Contenido del APREF

La profe dijo que supuestamente cambiaron la forma de evaluar y que ahora no vamos tener un parcial normal sino que va a ser un codigo con errores y nosotros vamos a tener que corregir segun las euristicas dadas.

![Pedidos de compra](https://github.com/Fabian-Martinez-Rincon/Fabian-Martinez-Rincon/assets/55964635/e21c3b0b-dac5-42dd-9d40-32a6ef9ddf48)
![Veterinaria](https://github.com/Fabian-Martinez-Rincon/Fabian-Martinez-Rincon/assets/55964635/d63ca0d3-ee56-4616-904c-09a5ffaa2972)
![MercadoOnLine](https://github.com/Fabian-Martinez-Rincon/Fabian-Martinez-Rincon/assets/55964635/0c164ff9-43ae-41e6-84e3-b1a5ff81e71a)


### Sistema

```java
public class Sistema {
    private List<Usuario> usuarios;
    
    public Sistema() {
        this.usuarios = new ArrayList<Usuario>();
    }

    void registrarUsuario(Usuario usuario) {
        this.usuarios.add(nuevoUsuario);
    }
}

```

### Usuario

```java
public class Usuario {
    private String email;
    private String localidad;
    private List<Publicacion> publicaciones;
    
    public Usuario(String email, String localidad) {
        this.email = email;
        this.localidad = localidad;
    }
    
    public void publicarProducto(Producto producto) {
        this.publicaciones.add(publicacion);
    }
}
```

### Producto

```java
public abstract class Producto {
    private String nombre;
    private String descripcion;
    private String formaEntrega;

    public Producto(String nombre, String descripcion, String formaEntrega) {
        this.nombre = nombre;
        this.descripcion = descripcion;
    }
}
```

### Nuevo

```java
public class Nuevo extends Producto {
    private double precioUnitario;
    private int cantidadDisponible;
    
    
    public Nuevo(String nombre, String descripcion, String precioUnitario, String cantidadDisponible, double formaEntrega) {
        super(nombre, descripcion);
        this.precioUnitario = precioUnitario;
        this.cantidadDisponible = cantidadDisponible;
        this.formaEntrega = formaEntrega;
    }


}
```

### Usado

```java
public class Usado extends Producto {
    private double precio;
    private Integer cantidad;
    
    public Usado(String nombre, String descripcion, double precio) {
        super(nombre, descripcion);
        this.precio = precio;
        this.cantidad = 1;
    }
}
```

### Publicación

### Servicio

![](/apref/MercadoOnLine.excalidraw.svg)