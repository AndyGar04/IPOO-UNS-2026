# TP9
## 1 - Describa las principales características de la programación basada en eventos y la relación entre objetos y eventos cuando la GUI incluye un botón. 

### Características de la programación basada en eventos:
- Flujo controlado por el usuario: El orden de ejecución de las instrucciones no lo fija el programador de forma secuencial, sino las acciones que realiza el usuario al interactuar con la interfaz.
- Eventos como señales: Un evento es una señal que indica que algo ocurrió (por ejemplo, un clic o presionar una tecla).
- Componentes reactivas: La interfaz se compone de elementos gráficos capaces de percibir estas acciones externas y disparar reacciones específicas en el sistema.

### Relación entre objetos y eventos al incluir un botón (`JButton`):

- 1) Acción externa y Objeto Fuente de Evento: El botón (`JButton`) actúa como objeto fuente de evento; cuando el usuario hace clic sobre él, percibe esa acción externa.


- 2) Creación implícita del Objeto Evento: Al detectar el clic, el botón dispara un evento interno creando implícitamente un objeto de la clase `ActionEvent`, el cual guarda información sobre la acción ocurrida.


- 3) Notificación al Objeto Oyente (Listener): Previamente, el programador registró un objeto oyente (instancia de una clase que implementa la interfaz `ActionListener`) al botón mediante `addActionListener()`.


- 4) Reacción: El objeto oyente recibe automáticamente como parámetro el objeto `ActionEvent` y ejecuta el código definido en su método `actionPerformed()`, concretando la respuesta del sistema.

## 2 - Explique el significado de las siguientes instrucciones que forman parte del constructor de una clase que extiende a JFrame:

JButton botonRojo = new JButton("Rojo");
OyenteBotonR ponerRojo = new OyenteBotonR();
botonRojo.addActionListener(ponerRojo);

### JButton botonRojo = new JButton("Rojo");
  Declara una variable de tipo `JButton` y crea un objeto gráfico (botón) en memoria, inicializando su rótulo o texto visible con la cadena `"Rojo"`. Este botón funcionará como un **objeto fuente de evento** capaz de percibir las acciones del usuario.

### OyenteBotonR ponerRojo = new OyenteBotonR();  
  Crea una instancia de la clase `OyenteBotonR` (la cual debe implementar la interfaz `ActionListener`). Este es el **objeto oyente** encargado de definir la reacción del sistema (mediante su método `actionPerformed`) cuando ocurra un evento.

### botonRojo.addActionListener(ponerRojo);  
  Registra (vincula) el objeto oyente `ponerRojo` al objeto fuente de evento `botonRojo`. A partir de esta instrucción, cuando el usuario haga clic sobre el botón, se generará implícitamente un objeto `ActionEvent` y se notificará automáticamente al oyente para que ejecute su respuesta[cite: 27, 28, 62, 65].