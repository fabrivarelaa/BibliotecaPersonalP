# Biblioteca Personal

Aplicacion de consola en Java para gestionar una biblioteca personal de libros.

## Descripcion

Este proyecto fue desarrollado como segundo parcial de la materia Introduccion a la Programacion. La aplicacion permite agregar, listar, buscar y eliminar libros usando los conceptos de Programacion Orientada a Objetos vistos en clase.

## Estructura del proyecto

```
src/
  biblioteca/
    Main.java                    <- Clase principal, menu y logica de entrada
    modelo/
      Libro.java                 <- Clase modelo con atributos privados y getters/setters
    servicio/
      Biblioteca.java            <- Clase que gestiona la lista de libros
BibliotecaPersonal.jar           <- Ejecutable
Ejecutar.bat                     <- Script para correr la aplicacion
```

## Funcionalidades

- Agregar un libro (titulo, autor, año de publicacion, genero)
- Listar todos los libros cargados
- Buscar un libro por titulo
- Eliminar un libro por titulo

## Como ejecutar

Hacer doble click en `Ejecutar.bat`, o desde la terminal:

```
java -jar BibliotecaPersonal.jar
```

Requiere Java instalado.

## Conceptos aplicados

- Clases y objetos
- Encapsulamiento (atributos privados, getters y setters)
- Constructores
- Paquetes (`biblioteca`, `biblioteca.modelo`, `biblioteca.servicio`)
- Colecciones con `ArrayList`
- Entrada de datos con `Scanner`
- Manejo de errores con `try-catch`
- Menu con `do-while` y `switch-case`

## Autor

Fabricio Varela  
Instituto Superior Santo Domingo  
Introduccion a la Programacion - 2do Parcial
