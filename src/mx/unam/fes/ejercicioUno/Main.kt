package mx.unam.fes.ejercicioUno

fun main(args: Array<String>) {
    val producto = Producto()
    println()

    val productoDos = Producto("Serúm Niacinamida", "The Ordinary", 309.99)
    val venta = Venta(101, 3, producto)
    println(venta)

    println()
    val ventaDos= Venta(304)
    println(ventaDos)
}
