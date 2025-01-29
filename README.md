# Diagrama UML COMPLETO

![Tablero en blanco](https://github.com/user-attachments/assets/6c65d522-3743-48c4-bcb6-4bd0c41f82d1)

# Pasos a seguir
- Identificación de Entidades Principales: Se analizaron los elementos clave del dominio, resultando en clases como Cliente, Pedido, Producto, Pago, etc.

- Definición de Relaciones:

- Asociación entre Pedido y Cliente (un cliente puede tener múltiples pedidos).

- Agregación entre Pedido y LineaPedido.

- Herencia en la jerarquía de Pago con sus subclases Cash, Cheque y Card.

- Optimización de Métodos y Atributos: Se agregaron métodos esenciales como calcularCosteTotal() en Pedido y calcularSubtotal() en LineaPedido.
