package TP5.Ejercicio_2;

/*
La clase ConsumoEdificio modela una tabla de objetos de clase MedicionServicios.
Impleméntela considerando que desde las clases cliente, el primer piso se denota con 1.
*/

public class ConsumoEdificio {

    //<<Atributos de instancia>>
    private MedicionServicios[] consumoXPiso;

    //<<Constructor>>
    //• ConsumoEdificio(pisos : entero). Requiere pisos mayor a 1
    public ConsumoEdificio(int pisos){
        consumoXPiso = new MedicionServicios[pisos];
    }

    /* • registrarConsumo(m: MedicionServicios, p: entero): boolean . Si p es un piso válido, asigna m al 
    piso p y retorna true, sino retorna false. */
    public boolean registrarConsumo(MedicionServicios m, int p){
        boolean rExitoso=false;
        if (p>0 && p <= cantPosiciones()+1 && m != null){
            consumoXPiso[p-1]=m;
            rExitoso = true;
        }
        return rExitoso;
    }

    /* • eliminarConsumo(p: entero): boolean. Si p es un piso válido, asigna una referencia nula al piso p y
    retorna true, sino retorna falso */
    public boolean eliminarConsumo(int p){
        boolean dExitoso=false;
        if (p>0 && p <= cantPosiciones()+1){
            consumoXPiso[p-1]=null;
            dExitoso = true;
        }
        return dExitoso;
    }

    /* • eliminarCeros(). Asigna referencias nulas a todos los pisos asociados a Mediciones de Servicio que
    mantienen dos o tres valores de consumo en 0. */
    public void eliminarCeros(){
        for (int i = 0; i < cantPosiciones(); i++) {
            if (consumoXPiso[i] != null) {
                int ceros = 0;
                if (consumoXPiso[i].obtenerAgua() == 0){
                    ceros++;
                } 
                if (consumoXPiso[i].obtenerGas() == 0){
                    ceros++;
                }    
                if (consumoXPiso[i].obtenerElectricidad() == 0){
                    ceros++;
                }
                
                if (ceros >= 2) {
                    consumoXPiso[i] = null;
                }
            }
        }
    }

    /* obtenerMedicionServicios(p: entero): MedicionServicios . Requiere p válido */
    public MedicionServicios obMedicionServicios(int p){
        MedicionServicios ms = null;
        if (p>0 && p <= cantPosiciones()){
            ms = consumoXPiso[p];
        }
        return ms;
    }

    /* • hayMayorConsumo(c: entero): boolean. Retorna true si el costo de algún piso del edificio 
    fue mayor a c. */
    public boolean hayMayorConsumo(int c){
        boolean algunCM = false;
        for (int i=0; i < cantPosiciones() && !algunCM ;i++){
            if(consumoXPiso[i] != null && consumoXPiso[i].costoServicios() > c){
                algunCM = true;
            }
        }
        return algunCM;
    }

    /* • cuantasMayores(c: entero): entero. Calcula cuántos pisos del edificio tuvieron un costo mayor a c. */
    public int cuantasMayores(int c){
        int cont = 0;
        for (int i=0; i < cantPosiciones() ;i++){
            if(consumoXPiso[i] != null && consumoXPiso[i].costoServicios() > c){
                cont++;
            }
        }
        return cont;
    }

    /* • primerPisoMayor(c : entero): entero. Retorna el primer piso del edificio que tiene un costo mayor 
    a c. Si no hay ningún piso con costo mayor a c retorna -1. */
    public int primerPisoMayor(int c){
        int PPM = -1;
        boolean algunCM = false;
        for (int i=0; i < cantPosiciones() && !algunCM ;i++){
            if(consumoXPiso[i] != null && consumoXPiso[i].costoServicios() > c){
                algunCM = true;
                PPM = i+1;
            }
        }
        return PPM;
    }

    /* • ultimoPisoMayor(c : entero): entero. Retorna el último piso del edificio que registra un costo mayor
    a c. Si no hay ningún piso con costo mayor a c retorna -1. */
    public int ultimoPisoMayor(int c){
        int UPM = -1;
        boolean algunCM = false;
        for (int i=cantPosiciones()-1; i >= 0 && !algunCM ;i--){
            if(consumoXPiso[i] != null && consumoXPiso[i].costoServicios() > c){
                algunCM = true;
                UPM = i+1;
            }
        }
        return UPM;
    }

    /* • nMayores(c: entero, n: entero): boolean. Determina si hay n pisos con costos mayores a c */
    public boolean nMayores(int c, int n){
        int pisosAEvaluar = n - 1;
        int cont = 0;
        if (pisosAEvaluar > 0 && pisosAEvaluar < cantPosiciones()){
            for (int i=0; i < cantPosiciones() && cont < n ;i++){
                if(consumoXPiso[i] != null && consumoXPiso[i].costoServicios() > c){
                    cont++;
                }
            }
        }
        return (cont==pisosAEvaluar);
    }

    // • todosMayores(c : entero): boolean. Retorna true si todos los pisos tuvieron un costo mayor a c.
    public boolean todosMayores(int c){
        boolean todos = true;
        int cont = 0;
        for (int i=0; i < cantPosiciones() && todos ; i++){
            if(consumoXPiso[i] != null && consumoXPiso[i].costoServicios() <= c){
                todos = false;
            }
        }
        return (cont==cantPosiciones());
    }

    /* • todosMayores(m: MedicionServicios): boolean. Determina si en cada uno de los pisos en los que se
    registró una medición, los consumos de gas, agua y electricidad son mayores a los registrados en la
    medición m. Requiere m ligada. */
    public boolean todosMayores(MedicionServicios m) {
        boolean todos = true;
        if (m != null) {
            for (int i = 0; i < cantPosiciones() && todos; i++) {
                if (consumoXPiso[i] != null) {
                    // Se comparan individualmente los servicios, no el costo total
                    if (consumoXPiso[i].obtenerAgua() <= m.obtenerAgua() ||
                        consumoXPiso[i].obtenerGas() <= m.obtenerGas() ||
                        consumoXPiso[i].obtenerElectricidad() <= m.obtenerElectricidad()) {
                        todos = false;
                    }
                }
            }
        } else {
            todos = false;
        }
        return todos;
    }

    public int cantPosiciones(){
        return consumoXPiso.length;
    }
}
