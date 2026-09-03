# Libro Digital

## Descripción

Este programa implementa una clase `LibroDigital` que permite gestionar la información de un libro digital, controlar la cantidad de descargas y calcular el espacio total consumido.

## Funcionamiento

La clase utiliza cuatro atributos privados:

* `isbn`: identifica el libro.
* `titulo`: almacena el título del libro.
* `tamanioMB`: representa el tamaño del libro en megabytes.
* `descargasTotales`: almacena la cantidad de descargas realizadas.

El constructor valida que el tamaño y la cantidad de descargas no sean negativos.

La clase contiene los siguientes métodos:

* `get` y `set`: permiten consultar y modificar los atributos.
* `registrarDescarga()`: aumenta en uno la cantidad de descargas.
* `calcularEspacioConsumido()`: calcula el espacio total utilizado multiplicando el tamaño del libro por la cantidad de descargas.
* `mostrarDatos()`: muestra toda la información del libro y el espacio consumido.

## Ejemplo

<img width="247" height="117" alt="image" src="https://github.com/user-attachments/assets/25d0282f-1e6f-492a-9c13-4e03a6df8da3" />


## Conceptos utilizados

* Clases y objetos
* Encapsulamiento
* Constructores
* Getters y setters
* Métodos
* Validación de datos
* Condicionales `if`
* Excepciones `IllegalArgumentException`
* Incremento de variables
* Operaciones matemáticas
