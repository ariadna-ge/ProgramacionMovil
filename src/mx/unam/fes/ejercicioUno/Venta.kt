package mx.unam.fes.ejercicioUno

class Venta(var numeroCliente: Int, var cantidad: Int, var producto: Producto) {

    constructor(numeroCliente: Int) : this(numeroCliente, 1, Producto())
    val total: Double get() = cantidad * producto.precio

    override fun toString(): String {
        return "Cliente:$numeroCliente | Cantidad:$cantidad | Costo total: $$total"
    }
}