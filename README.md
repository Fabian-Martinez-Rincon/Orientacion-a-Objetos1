<h1 align="center">  Orientación a Objetos 1</h1>

<p><img width="250" align='right' src="https://media.giphy.com/media/kDO5RDvqN0nLUxzN1i/giphy.gif"></p>

Tanto la Orientación a objetos como cualquier otro paradigma de desarrollo es muy independiente del lenguaje de programación. Nosotros tenemos un activo mucho mas importante aparte de aprender el lenguaje, y este es el aprender los conceptos y de arquitectura y de diseño de software, principalmente porque los lenguajes estan constantemente evolucionando.


- [Pacto para aprobar](/Documentos/Condiciones.md)
- [Criterios y heurísticas de diseño](/Documentos/Criterios.md)
- [Diagrama de clases UML](/Documentos/Diagramasuml.md)
- [Teoria]()
	- [Teoria 1](/Documentos/Teoria1.md)
- [Ejercicios](#ejercicios)
	- [1) WallPost](#1️⃣ejercicio-1-wallpost)
	- [2) Balanza Electronica](#2️⃣-ejercicio-2-balanza-electrónica)
		- [Balanza](#balanza)
		- [Producto](#producto)
		- [Ticket](#ticket)
	- [3) Presupuestos](#3️⃣-ejercicio-3-presupuestos)
	- [3-Bis) Balanza Mejorada](#3️⃣-ejercicio-3-bis-balanza-mejorada)
	- [4) Figuras y cuerpos](#4️⃣-ejercicio-4-figuras-y-cuerpos)
	- [5) Genealogía salvaje](#5️⃣-ejercicio-5-genealogía-salvaje)

# Ejercicios

## 1️⃣Ejercicio 1: WallPost

```java
package ar.edu.unlp.oo1.ejercicio1.impl;
import ar.edu.unlp.oo1.ejercicio1.WallPost;

public class WallPostImpl implements WallPost {

	private String text = "Undefined post";
	private int likes;
	private boolean featured;

    @Override
    public String toString() {
        return "WallPost {" +
            "text: " + getText() +
            ", likes: '" + getLikes() + "'" +
            ", featured: '" + isFeatured() + "'" +
            "}";
    }

	@Override
	public String getText() {
		return this.text;
	}

	@Override
	public void setText(String text) {
		this.text = text;
		
	}

	@Override
	public int getLikes() {
		return this.likes;
	}

	@Override
	public void like() {
		this.likes++;
		
	}

	@Override
	public void dislike() {
		if (this.likes > 0){
			this.likes--;
		}
	}

	@Override
	public boolean isFeatured() {
		if (this.featured) {
			return true;
		}
		return false;
	}

	@Override
	public void toggleFeatured() {
		this.featured = !this.featured;
	}
}
```

## 2️⃣ Ejercicio 2: Balanza Electrónica

### Balanza

```java
package ar.edu.unlp.info.oo1.Ejercicio2;
import java.time.LocalDate;

public class Balanza {
	private int cantidadDeProductos;
	private double precioTotal;
	private double pesoTotal;
	
	public void ponerEnCero(){
		this.cantidadDeProductos = 0;
		this.precioTotal = 0;
		this.pesoTotal = 0;
	}
	
	public void agregarProducto(Producto producto) {
		this.cantidadDeProductos++;
		this.pesoTotal += producto.getPeso();
		this.precioTotal += producto.getPrecio();
	}
	
	public Ticket emitirTicket() {
		Ticket t = new Ticket(LocalDate.now() ,this.cantidadDeProductos,this.precioTotal,this.pesoTotal);
		return t;
	}
	public int getCantidadDeProductos() {
		return this.cantidadDeProductos;
	}
	public double getPrecioTotal() {
		return this.precioTotal;
	}
	public double getPesoTotal() {
		return this.pesoTotal;
	}
}
```

### Producto

```java
package ar.edu.unlp.info.oo1.Ejercicio2;

public class Producto {
	private double peso;
	private double precioPorKilo;
	private String descripcion;
	
	public double getPrecio(){
		return this.peso * this.precioPorKilo;
	}
	
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	
	public double getPrecioPorKilo() {
		return precioPorKilo;
	}
	public void setPrecioPorKilo(double precioPorKilo) {
		this.precioPorKilo = precioPorKilo ;
	}
	
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

}
```

### Ticket

```java
package ar.edu.unlp.info.oo1.Ejercicio2;
import java.time.LocalDate;

public class Ticket {
	private LocalDate fecha;
	private int cantidadDeProductos;
	private double pesoTotal = 0;
	private double precioTotal;
	
	public double impuesto() {
		return this.precioTotal*(0.21);
	}
	
	public Ticket(LocalDate fecha, int cantidadDeProductos, double precioTotal, double pesoTotal) {
		this.fecha = fecha;
		this.cantidadDeProductos = cantidadDeProductos;
		this.pesoTotal = pesoTotal;
		this.precioTotal = precioTotal;
	}
	
	public int getCantidadDeProductos() {
		return cantidadDeProductos;
	}
	public LocalDate getFecha() {
		return this.fecha;
	}

	public double getPrecioTotal() {
		return this.precioTotal;
	}
	public double getPesoTotal() {
		return this.pesoTotal;
	}

}
```

## 3️⃣ Ejercicio 3: Presupuestos

```java

```

## 3️⃣ Ejercicio 3-Bis: Balanza mejorada

```java

```

## 4️⃣ Ejercicio 4: Figuras y cuerpos

```java

```

## 5️⃣ Ejercicio 5: Genealogía salvaje

```java

```