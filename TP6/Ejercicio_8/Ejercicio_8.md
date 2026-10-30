# EJERCICIO 8. 
## Dada la instrucción “C v = new D(); ” donde D es una clase derivada de C, indique cuáles de las siguientes afirmaciones son correctas:
### a) El constructor de la clase D debe incluir una instrucción super que invoca al constructor de la clase C.
- Falso, puede usar el de su padre o java provee uno.
### b) C es el tipo estático de la variable y determina los mensajes que el objeto ligado a la variable v puede recibir. 
- Verdadero.
### c) D puede redefinir cualquiera de los métodos provistos por C, excepto aquellos que se definan con el modificador “final”.
- Falsa.
### d) Los métodos de la clase D pueden acceder a todos los atributos y servicios definidos en C.
- Verdadero, siempre y cuando este, en protected.