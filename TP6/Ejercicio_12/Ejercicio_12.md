# EJERCICIO 8. 
## Dada la instrucción “C v = new D(); ” donde D es una clase derivada de C, indique cuáles de las siguientes afirmaciones son correctas:
### a) Una clase abstracta puede no tener métodos abstractos.
- Verdadero. En Java podés declarar una clase como abstract simplemente para evitar que sea instanciada (que se creen objetos directamente de ella), incluso si todos sus métodos tienen código implementado.
### b) Una  clase  que  extiende  a  una  clase  abstracta  debe  implementar  todos  los  métodos  abstractos heredados. 
- Falso. La afirmación absoluta es falsa exactamente por la excelente aclaración que hiciste: si la clase hija también se declara como abstracta, no está obligada a implementarlos. Solo está obligada si quiere ser una clase concreta (instanciable)
### c) Un método p definido en una clase A se dice sobrecargado si existe una clase B que hereda de A y brinda un método p con el mismo número y tipo de parámetros que A. 
- Falso. Si hereda y utiliza exactamente el mismo número y tipo de parámetros (misma signatura), está haciendo una redefinición (override), no una sobrecarga.
### d) El ambiente de referenciamiento de una clase D que extiende a una clase C, incluye a todos los atributos de instancia declarados en D y en C. 
- Falso. Acá está la trampa del encapsulamiento de caja negra. Si los atributos declarados en C son private, quedan completamente ocultos y no forman parte del ambiente de referenciamiento directo de D. La clase D no los "ve" ni los puede nombrar directamente en su código.
### e) Los métodos privados no pueden ser redefinidos.
- Verdadero (no pueden redefinirse). Como los métodos private no son visibles para las clases derivadas, ni siquiera se heredan. Al no heredarse, es imposible redefinirlos. Si en la clase hija escribís un método con el mismo nombre y parámetros, Java lo compila como un método totalmente nuevo e independiente, sin vinculación dinámica con el de la superclase. 