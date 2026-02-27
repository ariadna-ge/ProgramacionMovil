# 🧱 Diseño de Clases

## 👤 Clase `Persona`

### 1️⃣ Constructor Principal
Cuando se crea un objeto `Persona`, ocurre lo siguiente:
1. Se asignan los valores recibidos.
2. Se ejecuta el bloque `init`.
3. Se inicializan propiedades adicionales.

### 2️⃣ Bloque `init`
* Convierte `nombre` a mayúsculas.
* Duplica la edad.
* Inicializa la propiedad `despues`.

⚠️ Importante:
El bloque `init` se ejecuta **una sola vez al crear el objeto**.
Si luego se modifican las propiedades manualmente, no vuelve a ejecutarse.

### 🧩 Constructor Secundario

1. Modifica el nombre usando `replaceAfter`.
2. Llama al constructor principal.
3. Se ejecuta `init`.
4. Luego se ejecuta `ocuparDespues()`.

### 📄 Método `obtenerDescripcion()`
1. Lee el archivo `descripcion.txt`.
2. Divide por líneas.
3. Mezcla las líneas.
4. Retorna una línea aleatoria.
⚠️ El archivo debe existir en la raíz del proyecto.

### 🕒 Uso de `lateinit`
* Se inicializa dentro del bloque `init`.
* Permite declarar una variable no nullable sin inicializarla en el constructor.

## 🎓 Clase `Alumno`
* Hereda de `Persona`.
* Sobrescribe `toString()`.
* Inicializa la clase base automáticamente.

---
# Dudas 

## 🔎 ¿Por qué "SinNombre" se convierte en mayúsculas pero "Pedro" no?
La clase `Alumno` hereda así:
* `"SinNombre"` pasa por `init`
* Se transforma en `"SINNOMBRE"`

Pero después en `main`:
```kotlin
alumno.nombre = "Pedro"
```
Esto ocurre **después de la construcción**, por lo tanto:
* No pasa por `init`
* No se convierte en mayúsculas


### 🔧 Forzar  mayúsculas
Solo necesitas definir un `setter` personalizado si deseas modificar el comportamiento.
```kotlin
var nombre: String = nombre
    set(value) {
        field = value.uppercase()
    }
```

Ahora cualquier asignación:
```kotlin
alumno.nombre = "Pedro"
```
Se convertirá automáticamente en: **PEDRO**

## 🔎 ¿Puedo ejecutar dos métodos en `by lazy`?
Sí. En el caso de: `println(alumno.descripcion)`, se ejecutan los dos métodos, y
`obtenerDescripcion()` es el valor que se almacena en descripcion.

### 🔧 ¿Cómo funciona?
El bloque puede contener:
* Una sola expresión
* Varias líneas
* Llamadas a múltiples métodos
* Lógica compleja

👉 **Nota importante:** Todo lo que esté dentro del bloque se ejecuta únicamente la primera vez que se accede a la propiedad.