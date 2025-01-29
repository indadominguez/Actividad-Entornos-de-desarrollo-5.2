import java.util.Date

// Enumeración para los estados del pedido
// Define los posibles estados de un pedido.
enum class EstadoPedido {
    PENDIENTE, EN_PROCESO, ENVIADO, ENTREGADO, CANCELADO
}

// Clase Cliente: Representa a un cliente que realiza un pedido.
class Cliente(
    val id: Int, 
    val nombre: String, 
    val direccion: String, 
    val telefono: String, 
    val email: String 
)

// Clase Pedido: Representa un pedido realizado por un cliente.
class Pedido(
    val id: Int, 
    val fecha: Date, 
    val cliente: Cliente, 
    var estado: EstadoPedido 
) {
    private val lineasPedido = mutableListOf<LineaPedido>() // Lista de las líneas del pedido

    // Método para calcular el coste total del pedido sumando los subtotales de cada línea de pedido.
    fun calcularCosteTotal(): Double {
        return lineasPedido.sumOf { it.calcularSubtotal() }
    }

    // Método para actualizar el estado del pedido.
    fun actualizarEstado(nuevoEstado: EstadoPedido) {
        estado = nuevoEstado
    }

    // Método para agregar una línea de pedido (producto + cantidad) al pedido.
    fun agregarLineaPedido(linea: LineaPedido) {
        lineasPedido.add(linea)
    }
}

// Clase base Pago: Representa un pago realizado para un pedido.
open class Pago(
    val id: Int, 
    val fecha: Date, 
    val dinero: Double 
)

// Subclase Cash: Representa un pago realizado en efectivo.
class Cash(
    id: Int, 
    fecha: Date, 
    dinero: Double, 
    val tipoMoneda: String 
) : Pago(id, fecha, dinero)

// Subclase Cheque: Representa un pago realizado mediante cheque.
class Cheque(
    id: Int,
    fecha: Date,
    dinero: Double,
    val nombre: String, 
    val banco: String 
) : Pago(id, fecha, dinero)

// Subclase Card: Representa un pago realizado mediante tarjeta de crédito o débito.
class Card(
    id: Int, 
    fecha: Date,
    dinero: Double,
    val numero: String, 
    val fechaCaducidad: Date, 
    val tipoTarjeta: String 
) : Pago(id, fecha, dinero)

// Clase LineaPedido: Representa una línea de un pedido, que incluye un producto y su cantidad.
class LineaPedido(
    val producto: Producto,
    val cantidad: Int 
) {
    // Método para calcular el subtotal de una línea de pedido (precio * cantidad + impuestos)
    fun calcularSubtotal(): Double {
        return cantidad * (producto.precio + producto.impuestos)
    }
}

// Clase Producto: Representa un producto que está disponible para la venta.
class Producto(
    val id: Int, 
    val nombre: String, 
    val description: String, 
    val precio: Double, 
    val impuestos: Double, 
    var stock: Int 
)

// Ejemplo de cómo funciona el código
fun main() {
    // Crear un cliente
    val cliente = Cliente(
        1, 
        "Inda Domínguez",
        "Calle Manolete 123", 
        "697245689", 
        "idomhit1411@g.educaand.es"
    )

    // Crear un producto
    val producto = Producto(
        101,
        "Móvil", 
        "Iphone i7 16GB RAM", 
        1200.0,
        120.0, 
        10 
    )

    // Crear un pedido
    val pedido = Pedido(
        1001,
        Date(), 
        cliente, 
        EstadoPedido.PENDIENTE 
    )

    // Agregar una línea de pedido con el producto y cantidad deseada
    pedido.agregarLineaPedido(LineaPedido(producto, 2)) // 2 unidades del producto

    // Imprimir el costo total del pedido
    println("Costo total del pedido: $${pedido.calcularCosteTotal()}")

    // Realizar un pago con tarjeta
    val pago = Card(
        5001, // 
        Date(), // 
        pedido.calcularCosteTotal(),
        "4111111111111111", 
        Date(), // 
        "Visa" // 
    )
}
