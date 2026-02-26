package mx.unam.fes.ejercicioUno

class Producto (var nombre:String="Protector solar", var marca:String="Tocobo", var precio:Double=336.75){

    init {
        println("El producto es $nombre de la marca $marca" +
                " con un costo de $$precio")
    }
}