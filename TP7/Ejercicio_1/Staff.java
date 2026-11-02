package TP7.Ejercicio_1;

public class Staff {

    protected Rubrica[] s;
    protected int cant;

    public Staff(int max){
        if (max > 0){
            s = new Rubrica[max];
        }else{
            s = new Rubrica[1];
        }
        cant = 0;            
    }

    /* 
    ● agregarRubrica(r: Rubrica): boolean. Si r está ligada y la colección no está llena, asigna r a la 
    posición cant, incrementa cant en 1 y retorna true, sino retorna false. 
    */
    public boolean agregarRubrica(Rubrica r){
        boolean seAgrego = false;
        if (r != null && cant < s.length){
            s[cant] = r;
            cant++;
            seAgrego = true;
        }
        return seAgrego;
    }
    
    /*
    ● eliminar(p: entero). Asigna nulo a todas las posiciones de la colección que están ligadas a rubricas
    con productividad menor a p y luego comprime la estructura para que continúe siendo una colección. 
    */
    public void eliminar(int p){
        int posLibres = 0;

        for (int i = 0; i < cant; i++){
            if(s[i].productividad() >=p){
                s[posLibres] = s[i];
                posLibres++;
            }
        }

        for(int i = posLibres; i < cant; i++){
            s[i] = null;
        }

        cant = posLibres;
    }

    public boolean estaLlena(){
        return cant == s.length;
    }

    public int cantPosiciones(){
        return s.length;
    }

    public int cantRubricas(){
        return cant;
    }

    /*
    ● obtenerRubrica(p: entero): Rubrica. Requiere p válida, retorna la rúbrica ligada a la posición p de
    la colección. 
    */
    public Rubrica obtenerRubrica(int p){
        return s[p];
    }

    /*
    ● contarMayorP(p: entero): entero. Cuenta la cantidad de rubricas con productividad mayor a p.
    */
    public int contarMayorP(int p){
        int cont = 0;
        for (int i=0; i < cant; i++){
            if (s[i].productividad() > p){
                cont++;
            }
        }
        return cont;
    }

    /*
    ● totalMayorT(t: entero): Staff. Genera una nueva colección con el mismo tamaño que la colección que 
    recibe el mensaje y agrega las referencias a todas las rubricas cuyo total es mayor a t.
    */
    public Staff totalMayorT(int t){
        Staff sAux = new Staff(s.length);

        for (int i=0; i < cant; i++){
            if (s[i].total() > t){
                sAux.agregarRubrica(s[i]);
            }
        }
        return sAux;
    }


}