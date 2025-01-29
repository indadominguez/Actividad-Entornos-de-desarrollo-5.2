# Instrucciones Diagrama de Clases
Para diseñar un sistema que gestione los pedidos de la empresa, es necesario considerar los siguientes requerimientos:

- Los pedidos los realizan los clientes, y pueden contener uno o varios productos.
- Debe registrar la información de cada pedido, incluyendo la fecha en que se realizó.
- Estos productos deben estar registrados en el sistema junto con su información correspondiente (nombre, descripción, precio, impuestos, etc.).
- El sistema debe ser capaz de calcular el coste total de cada pedido, teniendo en cuenta la cantidad de cada producto incluido en el pedido, sus precios individuales y los impuestos       
  correspondientes.
- Debe haber un registro actualizado del stock de cada producto, de forma que se pueda informar al cliente si habrá algún retraso en la entrega debido a falta de stock.
- Cada pedido puede ser pagado de una sola vez o en varios pagos. 
- Se debe ser capaz de registrar la información de cada pago realizado por el cliente.
- Las formas de pago aceptadas por el sistema son: Card (número, fecha de caducidad y tipo de tarjeta), Cash  (Tipo de moneda) y cheque (nombre y banco).
- Cada pedido puede estar en uno de los siguientes estados: pdte, pgdo, pcdo, envdo, entgdo. El estado de cada pedido debe ser actualizado en el sistema en función de su evolución.

---

# Segunda parte a realizar
- Una breve lista de los conceptos que te has encontrado en los diagramas UML que se asemejan a los conceptos de programación orientada a objetos. Por ejemplo: Clases: GestorPedidos
  - Pues lo más importante y primero que vemos son las clases, representadas en UML como rectángulos con el nombre arriba y ya debajo primero los atributos y seguidamente si tiene métodos.
  - Por ejemplo la clase cliente, tiene como atributos id, nombre, dirección, teléfono y dirección, y no tiene métodos en este caso.
  - También contiene las relaciones entre una clase y otra, en un ejemplo de nuestro UML: Asociación: Pedido tiene una relación con Cliente y LineaPedido.
  
- Explicación de la herramienta que has utilizado parra generar el diagrama UML, y si la has contrastado con otra y conclusiones de porque has elegido esa.
  - He utilizado como herramienta de trabajo lucidchart, desde mi educación segundaria, he utilizado esta herramienta de trabajo ya que, desde que un profesor la recomendó para un trabajo de
  clase ha sido siempre mi primera elección a la hora de hacer diagramas y esquemas en en ordenador.
  
- Una explicación sobre la conversión del diagrama UML al código.
  - Pues empecé estructurando las clases en kotlin, seguidamente definí las relaciones como el diagrama de clases establecia, he implementado los métodos y por último agregar lógica adicional,    como el método calcularCosteTotal() en Pedido y realizar en una funcion main un ejemplo de como funciona el código.
