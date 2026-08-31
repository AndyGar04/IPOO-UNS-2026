# Apuntes: Java - Identificadores, Tipos y Casting

### A. Reglas para nombrar identificadores
- Tienen que arrancar con una letra, el signo peso (`$`) o guion bajo (`_`). Después le podés meter números.
- Ojo con las mayúsculas: `Variable` y `variable` son dos cosas distintas (case sensitive).
- No podés usar palabras reservadas del lenguaje (como `class`, `int`, `while`, `true`, `null`).

### B. Tipos de datos primitivos
*(Nota: el valor por defecto solo aplica si son variables de clase/atributos, no en variables locales dentro de un método).*

| Tipo | Qué guarda | Valor por defecto |
| :--- | :--- | :--- |
| **byte** | Enteros chicos (8 bits, -128 a 127) | `0` |
| **short** | Enteros (16 bits) | `0` |
| **int** | Enteros estándar (32 bits) | `0` |
| **long** | Enteros grandes (64 bits) | `0L` |
| **float** | Decimales simples | `0.0f` |
| **double** | Decimales precisión doble | `0.0d` |
| **char** | Un solo caracter | `' '` (nulo) |
| **boolean** | Verdadero o falso | `false` |

### C. Compatibilidad y Casting
- **Automática (Widening):** Pasa sola cuando metés un tipo de dato chico en uno más grande (ej. de `int` a `long`). Como hay espacio de sobra, Java lo hace sin que le digas nada.
- **Forzada (Casting / Narrowing):** Cuando querés meter algo grande en un contenedor más chico (ej. de `double` a `int`). Java te obliga a confirmarlo explícitamente poniendo el tipo destino entre paréntesis, por ejemplo: `int numero = (int) 8.99;`. Ojo porque acá perdés información (el número te queda en `8` porque recorta los decimales).
- **Boolean:** Va por su cuenta. No podés convertir un número a boolean ni un boolean a número, son totalmente incompatibles con el resto.