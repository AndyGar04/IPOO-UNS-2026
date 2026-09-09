EJERCICIO 6. Analice si las siguientes afirmaciones son correctas:

a. Un constructor es un método que se invoca cuando se crea un objeto. F

b. Un comando es un método que no retorna un resultado. F

c. Una consulta es un método que no modifica el estado interno del objeto. V

d. En Java, el pasaje de parámetros es por valor. V

e. Desde el punto de vista del diseño de un sistema orientado a objetos, una clase es un patrón que establece los atributos y el comportamiento de un objeto. F

f. En la implementación de un sistema orientado a objetos, una clase es un módulo de software que puede desarrollarse con cierta independencia del resto de los módulos. V

g. Si las variables a y b se declaran de clase Refugio y a == b, entonces a.equals(b) es true. F

h. Si las variables a y b se declaran de clase Refugio, a y b están ligadas y a == b, entonces a.equals(b) es true. V  

a. (F) - FALSO: Marcaste V, pero es falsa por una cuestión de taxonomía estricta del apunte. El texto clasifica a los servicios en dos categorías distintas: métodos y constructores. Un constructor es un servicio que se invoca para crear un objeto, pero no es un método (los métodos son comandos o consultas que se ejecutan en respuesta a un mensaje). Es una pregunta engañosa típica.  

b. (F) - CORRECTO: Es falsa porque el apunte aclara explícitamente que "un comando puede retornar también un valor". Su característica definitoria no es lo que retorna, sino que modifica el estado interno.  

c. (V) - CORRECTO: Es la definición exacta de consulta: un método que al ejecutarse no modifica el valor de ningún atributo.  

d. (V) - CORRECTO: Java pasa los parámetros estrictamente por valor (se copia el valor de la variable o se copia el valor de la referencia a memoria).  

e. (F) - CORRECTO: Agarraste perfecto la sutileza. Una clase establece los atributos y comportamiento de un conjunto de objetos, no de "un" objeto.  

f. (V) - CORRECTO: La modularidad permite que cada clase (módulo) se implemente, verifique y depure con independencia del resto.  

g. (F) - CORRECTO: Si a y b se declaran pero no están ligadas (ambas valen null), la expresión a == b es true. Sin embargo, intentar ejecutar a.equals(b) lanzará un error de ejecución (NullPointerException) porque no podés enviarle un mensaje a algo que es null.

h. (V) - CORRECTO: Al aclarar que están ligadas, descartamos que sean null. Si a == b es true, significa que tienen la misma identidad (apuntan exactamente al mismo objeto en memoria). Un objeto siempre tiene el mismo estado interno que sí mismo, por lo que equals lógicamente va a retornar true.