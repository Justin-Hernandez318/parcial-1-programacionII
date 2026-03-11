# Parcial I - Programación II

## Sistema de Gestión de Biblioteca

Este proyecto implementa un sistema básico de biblioteca utilizando principios de Programación Orientada a Objetos:

- Abstracción
- Encapsulamiento
- Herencia

El proyecto está construido utilizando **Java** y **estructura Maven**.

---

## Diagrama UML

```
                        ┌─────────────────┐
                        │     Libro       │
                        ├─────────────────┤
                        │ - titulo: String│
                        │ - autor: String │
                        │ - numEjemplares │
                        │ - numPrestados  │
                        ├─────────────────┤
                        │ + prestamo()    │
                        │ + devolucion()  │
                        │ + toString()    │
                        └────────┬────────┘
                                 │
                    ┌────────────┼────────────┐
                    │            │            │
                    ▼            ▼            ▼
         ┌──────────────────┐  ┌──────────────┐
         │  LibroTexto      │  │   Novela     │
         ├──────────────────┤  ├──────────────┤
         │ - curso: String  │  │ - tipo:      │
         └────────┬─────────┘  │   String     │
                  │            └──────────────┘
                  │
                  ▼
    ┌──────────────────────────┐
    │  LibroTextoUNIAC         │
    ├──────────────────────────┤
    │ - facultad: String       │
    └──────────────────────────┘
```

---

## Casos donde no se puede usar herencia

### 1. Clase final

Si una clase es declarada como `final`, no puede ser heredada por otras clases. 

```java
public final class Libro {
}
### 2. Constructor privado

Si una clase tiene su constructor declarado como `private`, no puede ser heredada correctamente porque las subclases no pueden acceder a ese constructor.

```java
public class Libro {

    private Libro() {
    }

}
```

---

## Atributos adicionales y método

Para mejorar la funcionalidad del sistema se agregaron dos atributos adicionales a la clase `Libro`.

### Nuevos atributos

- `annoPublicacion : int` → Permite conocer el año en que fue publicado el libro.  
- `editorial : String` → Indica la editorial que publicó el libro.

### Nuevo método

Se puede implementar un método que permita mostrar toda la información del libro.

```java
public String mostrarInformacion() {
    return "Titulo: " + titulo +
           ", Autor: " + autor +
           ", Ejemplares: " + numEjemplares +
           ", Prestados: " + numPrestados;
}
```