import java.util.Date

// Enumeración para los estados del pedido
enum class EstadoPedido {
    PENDIENTE, EN_PROCESO, ENVIADO, ENTREGADO, CANCELADO
}

// Definimos las Clases dentro del código
// Clase Cliente
class Cliente(
    val id: Int,
    val nombre: String,
    val direccion: String,
    val telefono: String,
    val email: String
)

// Clase Pedido con relaciones
class Pedido(
    val id: Int,
    val fecha: Date,
    val cliente: Cliente,
    var estado: EstadoPedido
) {
    private val lineasPedido = mutableListOf<LineaPedido>()
    // Método clave
    fun calcularCosteTotal(): Double {
        return lineasPedido.sumOf { it.calcularSubtotal() }
    }

    fun actualizarEstado(nuevoEstado: EstadoPedido) {
        estado = nuevoEstado
    }

    fun agregarLineaPedido(linea: LineaPedido) {
        lineasPedido.add(linea)
    }
}

// Clase base Pago y su herencia
open class Pago(
    val id: Int,
    val fecha: Date,
    val dinero: Double
)

class Cash(
    id: Int,
    fecha: Date,
    dinero: Double,
    val tipoMoneda: String
) : Pago(id, fecha, dinero)

class Cheque(
    id: Int,
    fecha: Date,
    dinero: Double,
    val nombre: String,
    val banco: String
) : Pago(id, fecha, dinero)

class Card(
    id: Int,
    fecha: Date,
    dinero: Double,
    val numero: String,
    val fechaCaducidad: Date,
    val tipoTarjeta: String
) : Pago(id, fecha, dinero)

// Clase LineaPedido
class LineaPedido(
    val producto: Producto,
    val cantidad: Int
) {
    fun calcularSubtotal(): Double {
        return cantidad * (producto.precio + producto.impuestos)
    }
}

// Clase Producto
class Producto(
    val id: Int,
    val nombre: String,
    val description: String,
    val precio: Double,
    val impuestos: Double,
    var stock: Int
)



