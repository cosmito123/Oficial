package PrograAvan.NoLineal;

import PrograAvan.Lineal.Pila;

public class ArbolRB<Llave extends Comparable<Llave>, Valor> {
    private static final boolean ROJO = true;
    private static final boolean NEGRO = false;
    private Nodo raiz;

    private class Nodo {
        private Llave llave;
        private Valor valor;
        private Nodo izquierda, derecha;
        private boolean color;
        private int tam;

        public Nodo(Llave llave, Valor val, boolean color, int size) {
            this.llave = llave;
            this.valor = val;
            this.color = color;
            this.tam = size;
        }
    }

    public ArbolRB() {
    }

    private boolean es_rojo(Nodo x) {
        if (x == null) return false;
        return x.color == ROJO;
    }

    private int get_tam(Nodo x) {
        if (x == null) return 0;
        return x.tam;
    }

    public int get_tam() {
        return get_tam(raiz);
    }

    public boolean es_vacio() {
        return raiz == null;
    }


    /*********************** rutinas arbol ***********/
    public Valor getValorByLlave(Llave llave) {
        return getValorByLlave(raiz, llave);
    }

    private Valor getValorByLlave(Nodo x, Llave llave) {
        while (x != null) {
            int cmp = llave.compareTo(x.llave);
            if (cmp < 0) x = x.izquierda;
            else if (cmp > 0) x = x.derecha;
            else return x.valor;
        }
        return null;
    }

    public boolean contiene(Llave llave) {
        return getValorByLlave(llave) != null;
    }

    /***************** INSERTAR ***************************************/
    public void insertar(Llave llave, Valor val) {
        raiz = insertar(raiz, llave, val);
        raiz.color = NEGRO;
    }

    private Nodo insertar(Nodo x, Llave llave, Valor val) {
        if (x == null) return new Nodo(llave, val, ROJO, 1);

        int cmp = llave.compareTo(x.llave);
        if (cmp < 0) x.izquierda = insertar(x.izquierda, llave, val);
        else if (cmp > 0) x.derecha = insertar(x.derecha, llave, val);
        else x.valor = val;

        if (es_rojo(x.derecha) && !es_rojo(x.izquierda)) x = rotarIzquierda(x);
        if (es_rojo(x.izquierda) && es_rojo(x.izquierda.izquierda)) x = rotarDerecha(x);
        if (es_rojo(x.izquierda) && es_rojo(x.derecha)) cambiar_color(x);
        x.tam = get_tam(x.izquierda) + get_tam(x.derecha) + 1;

        return x;
    }
    /*********************** rotaciones *****************************************************/

    private Nodo rotarDerecha(Nodo x) {
        // assert (h != null) && isRed(h.left);
        Nodo aux = x.izquierda;
        x.izquierda = aux.derecha;
        aux.derecha = x;
        aux.color = aux.derecha.color;
        aux.derecha.color = ROJO;
        aux.tam = x.tam;
        x.tam = get_tam(x.izquierda) + get_tam(x.derecha) + 1;
        return aux;
    }

    private Nodo rotarIzquierda(Nodo x) {
        Nodo aux = x.derecha;
        x.derecha = aux.izquierda;
        aux.izquierda = x;
        aux.color = aux.izquierda.color;
        aux.izquierda.color = ROJO;
        aux.tam = x.tam;
        x.tam = get_tam(x.izquierda) + get_tam(x.derecha) + 1;
        return aux;
    }

    private void cambiar_color(Nodo x) {
        x.color = !x.color;
        x.izquierda.color = !x.izquierda.color;
        x.derecha.color = !x.derecha.color;
    }

    private Nodo rojo_a_izquierda(Nodo x) {
        cambiar_color(x);
        if (es_rojo(x.derecha.izquierda)) {
            x.derecha = rotarDerecha(x.derecha);
            x = rotarIzquierda(x);
            cambiar_color(x);
        }
        return x;
    }

    private Nodo rojo_a_derecha(Nodo x) {
        cambiar_color(x);
        if (es_rojo(x.izquierda.izquierda)) {
            x = rotarDerecha(x);
            cambiar_color(x);
        }
        return x;
    }

    private Nodo balancear(Nodo x) {
        if (es_rojo(x.derecha)) x = rotarIzquierda(x);
        if (es_rojo(x.izquierda) && es_rojo(x.izquierda.izquierda)) x = rotarDerecha(x);
        if (es_rojo(x.izquierda) && es_rojo(x.derecha)) cambiar_color(x);
        x.tam = get_tam(x.izquierda) + get_tam(x.derecha) + 1;
        return x;
    }

    private void profundidad(Nodo y){
       /* Pila<Nodo>pila=new Pila<>();
        pila.empilar(raiz);
        y=pila.desempilar();
        while(!pila.esta_vacia()){
            pila.empilar();
        }*/
    }
}

