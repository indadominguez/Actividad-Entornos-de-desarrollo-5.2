# Diagrama UML COMPLETO

![Tablero en blanco](https://github.com/user-attachments/assets/6c65d522-3743-48c4-bcb6-4bd0c41f82d1)

# Pasos a seguir
- Proceso refinado a diseño:
  - Proceso de Refinamiento
  - Identificación de Entidades Principales: Se analizaron los elementos clave del dominio, resultando en clases como Cliente, Pedido, Producto, Pago, etc.
  - Definición de Relaciones:
  - Asociación entre Pedido y Cliente (un cliente puede tener múltiples pedidos).
  - Agregación entre Pedido y LineaPedido.
  - Herencia en la jerarquía de Pago con sus subclases Cash, Cheque y Card.
  - Optimización de Métodos y Atributos: Se agregaron métodos esenciales como calcularCosteTotal() en Pedido y calcularSubtotal() en LineaPedido.

- Una breve lista de los conceptos que te has encontrado en los diagramas UML que se asemejan a los conceptos de programación orientada a objetos. Por ejemplo: Clases: GestorPedido
  - Pues lo más importante y primero que vemos son las clases, representadas en UML como rectángulos con el nombre arriba y ya debajo primero los atributos y seguidamente si tiene métodos.
  - Por ejemplo la clase cliente, tiene como atributos id, nombre, dirección, teléfono y dirección, y no tiene métodos en este caso.
  - También contiene las relaciones entre una clase y otra, en un ejemplo de nuestro UML: Asociación: Pedido tiene una relación con Cliente y LineaPedido.
  
- Explicación de la herramienta que has utilizado parra generar el diagrama UML, y si la has contrastado con otra y conclusiones de porque has elegido esa.
  - He utilizado como herramienta de trabajo lucidchart, desde mi educación segundaria, he utilizado esta herramienta de trabajo ya que, desde que un profesor la recomendó para un trabajo de
  clase ha sido siempre mi primera elección a la hora de hacer diagramas y esquemas en en ordenador.

- Una explicación sobre la conversión del diagrama UML al código.
  - Pues empecé estructurando las clases en kotlin, seguidamente definí las relaciones como el diagrama de clases establecia, he implementado los métodos y por último agregar lógica adicional, como el método calcularCosteTotal() en Pedido y realizar en una funcion main un ejemplo de como funciona el código.
