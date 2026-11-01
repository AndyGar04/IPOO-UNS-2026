# EJERCICIO 15. 
### a) 1. Defina el concepto de clase abstracta y muestre un ejemplo ilustrativo de una clase abstracta que no tenga métodos abstractos..
- Una clase abstracta es una clase creada artificialmente para lograr un modelo más adecuado al factorizar propiedades comunes de otras clases más específicas, sin que existan en el problema objetos concretos vinculados a esta clase más general. En ejecución no va a haber objetos de software de una clase abstracta.
### 2. Defina los conceptos de herencia, polimorfismo y vinculación dinámica. ¿Por qué la herencia favorece la productividad?
- Herencia: Es un mecanismo que permite crear clasificaciones que modelan una relación de generalización-especialización entre clases (relación esUn). Las clases derivadas heredan atributos y comportamiento de las clases generales y agregan o redefinen atributos y comportamiento específico.

- Polimorfismo: Es el mecanismo que permite que objetos de distintas clases puedan recibir un mismo mensaje y cada uno actúe de acuerdo al comportamiento establecido por su clase.

- Vinculación dinámica: Es la vinculación en ejecución de un mensaje con un método. El tipo dinámico de la variable determina qué método va a ejecutarse en respuesta a un mensaje.

- Productividad: La herencia favorece la productividad porque promueve la reusabilidad y la extensibilidad. Los cambios en la especificación del problema se resuelven incorporando nuevas clases especializadas, sin necesidad de modificar las que ya han sido implementadas, verificadas e integradas al sistema.
### 3. Defina los conceptos de sobrecarga y redefinición de métodos y relacione estos conceptos con la vinculación dinámica de código.
- Redefinición: Ocurre cuando en una clase derivada se define un método con el mismo nombre, número y tipo de parámetros que un método definido en la clase base. El método de la clase base queda derogado. La vinculación del mensaje con el método redefinido se resuelve en ejecución mediante vinculación dinámica, dependiendo del tipo dinámico del objeto.

- Sobrecarga: Ocurre cuando en una clase se define un método con el mismo nombre que otro de la misma clase o de alguna clase ancestro, pero con diferente número o tipo de parámetros. La ligadura la determina el compilador de manera estática de acuerdo al tipo estático.
### 4) Defina los conceptos de variable polimórfica, asignación polimórfica y método polimórfico. ¿Qué restricciones impone Java sobre las asignaciones polimórficas?
- Variable polimórfica: Es una variable que puede quedar asociada a objetos de diferentes clases (su tipo estático es diferente a su tipo dinámico).
- Asignación polimórfica: Asignación que liga un objeto de una clase a una variable declarada de otra clase.
- Método polimórfico: Método en el cual al menos uno de los parámetros formales es una variable polimórfica.
- Restricciones de Java: En una asignación polimórfica, el chequeo de tipos exige que la clase del objeto que aparece a la derecha del operador de asignación debe ser de la misma clase o de una clase descendiente de la clase de la variable que aparece a la izquierda del operador.