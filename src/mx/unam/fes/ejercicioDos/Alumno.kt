package mx.unam.fes.ejercicioDos

data class Alumno(var matricula: String = "00"): Persona("SinNombre", 0){
    override fun toString(): String {
        return "Alumno (matricula = '$matricula')" + super.toString()
    }
}