/**
 *
 * @author netosolis.com
 */
public class Nodo {
    private int dato;
    private Nodo izq,der;
    public Nodo(int dato){
        this.dato = dato;
        izq = null;
        der = null;
    }

    public int getDato() {
        return dato;
    }

    public Nodo getIzq() {
        return izq;
    }

    public Nodo getDer() {
        return der;
    }

    public void setDato(int dato) {
        this.dato = dato;
    }

    public void setIzq(Nodo izq) {
        this.izq = izq;
    }

    public void setDer(Nodo der) {
        this.der = der;
    } 
}
