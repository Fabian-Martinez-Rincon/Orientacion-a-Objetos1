<h1 align="center"> 📝 Ejercicio 8: Distribuidora Eléctrica</h1>

<img src= 'https://i.gifer.com/origin/8c/8cd3f1898255c045143e1da97fbabf10_w200.gif' height="20" width="100%">

<div align="center">

[Siguiente](/Documentos/Ejercicio9.md)<br>
[Anterior](/Documentos/Ejercicio7.md)
 </div>

<img src= 'https://i.gifer.com/origin/8c/8cd3f1898255c045143e1da97fbabf10_w200.gif' height="20" width="100%">



---

Una distribuidora eléctrica desea un sistema para el registro de los consumos de sus usuarios y para la emisión de facturas de cobro.
 
El sistema permite registrar usuarios, para los cuales se indica nombre y dirección. Por simplificación, un usuario puede estar relacionado con un solo domicilio (para el que se registran los consumos).
 
El sistema permite registrar los consumos para los usuarios. Los consumos que se registran para los usuarios tienen dos componentes: el consumo de energía activa y el consumo de energía reactiva.
 
Una vez al mes, la empresa distribuidora realiza el proceso de facturación. Por cada usuario se emite una factura (el proceso completo retorna una colección).
 
Para emitir la factura de un cliente se tiene en cuenta su último consumo y se calcula su factor de potencia para determinar si hay alguna bonificación para aplicar. El costo del consumo se calcula multiplicando el consumo de energía activa por el precio del kwh (Kilowatt/hora) de la empresa. La energía reactiva no tiene costo para el usuario. Si el factor de potencia estimado (pfe) del último consumo del usuario es mayor a 0.8, el usuario es bonificado con el 10%.
 
El factor de potencia se calcula de acuerdo a la siguiente fórmula:


![image](https://user-images.githubusercontent.com/55964635/224113217-65a882f4-d67b-4f2e-8c44-3bc1e59cac6e.png)

Además, la empresa está interesada en poder saber cuál fue el total de energía activa consumida por toda la red en el último periodo medido (es decir, teniendo en cuenta sólo la última medición de cada usuario). 

El siguiente diagrama de clases muestra el diseño para este problema. Agregue los métodos que considere necesarios.

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
