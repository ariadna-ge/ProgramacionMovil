package mx.unam.fes.ejercicioDos

import java.io.File

open class Persona(var nombre : String, var edad: Int){
    lateinit var despues : String
    val descripcion by lazy {
        validarArchivo()
        obtenerDescripcion()}

    init {
        this.nombre = nombre.uppercase()
        this.edad = this.edad*2
        despues = "inicio despues"
    }

    constructor(nombre: String): this(nombre.replaceAfter('e', "*"), 12){
        ocuparDespues()
    }

    private fun ocuparDespues(){
        if (::despues.isInitialized){
            println("Se inicio despues ($despues)")
        }
    }

    private fun validarArchivo() = println("Verificando el archivo")

    private fun obtenerDescripcion() = File("descripcion.txt")
        .readText()
        .split('\n')
        .shuffled()
        .first()

    override fun toString(): String {
        return " Hola $nombre ya tienes $edad años"
    }
}