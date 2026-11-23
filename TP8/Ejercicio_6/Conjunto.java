package TP8.Ejercicio_6;

public class Conjunto {
    private Elemento[] ce;
    private int cantElementos;

    /* • Conjunto(max: entero). Crea un conjunto vacío que puede tener hasta max elementos. */
    public Conjunto(int max) {
        if (max >= 0) {
            ce = new Elemento[max];
        } else {
            ce = new Elemento[1];
        }
        cantElementos = 0;
    }

    /* • insertar(e: Elemento). Inserta un elemento al final e incrementa cantElementos.
         Si el elemento ya existe insertar no tiene ningún efecto. */
    public void insertar(Elemento e) {
        if (e != null && cantElementos < ce.length && !pertenece(e)) {
            ce[cantElementos] = e;
            cantElementos++;
        }
    }

    /* • obtener(pos: entero): Elemento. Si pos es válida, devuelve el elemento de la posición pos.
         En caso contrario, devuelve null. */
    public Elemento obtener(int pos) {
        Elemento e = null;
        if (pos >= 0 && pos < cantElementos) {
            e = ce[pos];
        }
        return e;
    }

    public boolean pertenece(Elemento e) {
        boolean existe = false;
        if (e != null) {
            for (int i = 0; i < cantElementos && !existe; i++) {
                if (ce[i] != null && ce[i].esEquivalente(e)) {
                    existe = true;
                }
            }
        }
        return existe;
    }

    public boolean vacio() {
        return cantElementos == 0;
    }

    public int cardinalidad() {
        return cantElementos;
    }

    /* Retorna true si todos los elementos de este conjunto pertenecen a c */
    public boolean incluido(Conjunto c) {
        boolean estaIncluido = false;
        if (c != null && cantElementos <= c.cardinalidad()) {
            estaIncluido = true;
            for (int i = 0; i < cantElementos && estaIncluido; i++) {
                if (!c.pertenece(ce[i])) {
                    estaIncluido = false;
                }
            }
        }
        return estaIncluido;
    }

    public boolean esEquivalente(Conjunto c) {
        boolean eq = false;
        if (c != null) {
            if (c == this) {
                eq = true;
            } else {
                eq = this.incluido(c) && c.incluido(this);
            }
        }
        return eq;
    }

    public boolean disjunto(Conjunto c) {
        boolean sonDisjuntos = false;
        if (c != null) {
            sonDisjuntos = true;
            for (int i = 0; i < cantElementos && sonDisjuntos; i++) {
                if (c.pertenece(ce[i])) {
                    sonDisjuntos = false;
                }
            }
        }
        return sonDisjuntos;
    }

    public Conjunto union(Conjunto c) {
        Conjunto resultado = null;
        if (c != null) {
            resultado = new Conjunto(this.cantElementos + c.cardinalidad());
            for (int i = 0; i < this.cantElementos; i++) {
                resultado.insertar(this.ce[i]);
            }
            for (int j = 0; j < c.cardinalidad(); j++) {
                resultado.insertar(c.obtener(j));
            }
        }
        return resultado;
    }

    public Conjunto interseccion(Conjunto c) {
        Conjunto resultado = null;
        if (c != null) {
            int minCap = Math.min(this.cantElementos, c.cardinalidad());
            resultado = new Conjunto(minCap);
            for (int i = 0; i < this.cantElementos; i++) {
                if (c.pertenece(this.ce[i])) {
                    resultado.insertar(this.ce[i]);
                }
            }
        }
        return resultado;
    }

    public Conjunto diferencia(Conjunto c) {
        Conjunto resultado = null;
        if (c != null) {
            resultado = new Conjunto(this.cantElementos);
            for (int i = 0; i < this.cantElementos; i++) {
                if (!c.pertenece(this.ce[i])) {
                    resultado.insertar(this.ce[i]);
                }
            }
        }
        return resultado;
    }
}