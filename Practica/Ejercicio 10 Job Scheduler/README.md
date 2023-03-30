<h1 align="center"> 📝 Ejercicio 10 - Job Scheduler</h1>

<img src= 'https://i.gifer.com/origin/8c/8cd3f1898255c045143e1da97fbabf10_w200.gif' height="20" width="100%">

<div align="center">

[Siguiente](/Practica/Ejercicio%2011%20El%20Inversor/)<br>
[Anterior](/Practica/Ejercicio%209%20Cuenta%20con%20ganchos/)
 </div>

<img src= 'https://i.gifer.com/origin/8c/8cd3f1898255c045143e1da97fbabf10_w200.gif' height="20" width="100%">

- [Fifo](/Practica/Ejercicio%2010%20Job%20Scheduler/Ejercicio-10-Job-Scheduler/src/main/java/ar/edu/unlp/info/oo1/Ejercicio_10_Job_Scheduler/Fifo.java)
- [HighestPriority](/Practica/Ejercicio%2010%20Job%20Scheduler/Ejercicio-10-Job-Scheduler/src/main/java/ar/edu/unlp/info/oo1/Ejercicio_10_Job_Scheduler/HighestPriority.java)
- [JobDescription](/Practica/Ejercicio%2010%20Job%20Scheduler/Ejercicio-10-Job-Scheduler/src/main/java/ar/edu/unlp/info/oo1/Ejercicio_10_Job_Scheduler/JobDescription.java)
- [JobScheduler](/Practica/Ejercicio%2010%20Job%20Scheduler/Ejercicio-10-Job-Scheduler/src/main/java/ar/edu/unlp/info/oo1/Ejercicio_10_Job_Scheduler/JobScheduler.java)
- [Lifo](/Practica/Ejercicio%2010%20Job%20Scheduler/Ejercicio-10-Job-Scheduler/src/main/java/ar/edu/unlp/info/oo1/Ejercicio_10_Job_Scheduler/Lifo.java)
- [MostEffort](/Practica/Ejercicio%2010%20Job%20Scheduler/Ejercicio-10-Job-Scheduler/src/main/java/ar/edu/unlp/info/oo1/Ejercicio_10_Job_Scheduler/MostEffort.java)
- [Strategy](/Practica/Ejercicio%2010%20Job%20Scheduler/Ejercicio-10-Job-Scheduler/src/main/java/ar/edu/unlp/info/oo1/Ejercicio_10_Job_Scheduler/Strategy.java)

---

El JobScheduler es un objeto cuya responsabilidad es determinar qué trabajo debe resolverse a continuación. El siguiente diseño ayuda a entender cómo funciona la implementación actual del JobScheduler.

![image](https://user-images.githubusercontent.com/55964635/224114749-e25f49c1-939b-4301-8771-4b1547b34c89.png)

- El mensaje schedule(job: JobDescription) recibe un job (trabajo) y lo agrega al final de la colección de trabajos pendientes.
- El mensaje next() determina cuál es el siguiente trabajo de la colección que debe ser atendido, lo retorna, y lo quita de la colección.

En la implementación actual del método next(), el JobScheduler utiliza el valor de la variable strategy para determinar cómo elegir el siguiente trabajo.

Dicha implementación presenta dos serios problemas de diseño:
- Secuencia de ifs (o sentencia switch o case) para implementar alternativas de un mismo comportamiento.
- Código duplicado.

Utilice el código y los tests provistos por la cátedra y aplique lo aprendido (en particular en relación a herencia y polimorfismo) para eliminar los problemas mencionados. Siéntase libre de agregar nuevas clases como considere necesario. También puede cambiar la forma en la que los objetos se crean e inicializan. Asuma que una vez elegida una estrategia para un scheduler no puede cambiarse.

Sus cambios probablemente hagan que los tests dejen de funcionar. Corríjalos y mejórelos como sea necesario.
