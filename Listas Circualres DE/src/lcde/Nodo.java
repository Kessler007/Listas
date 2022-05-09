package lcde;

public class Nodo {
    private Nodo anterior;
    private Object dato;
    private Nodo siguiente;

    public Nodo(){

    }

    public lcde.Nodo getAnterior() {
        return anterior;
    }

    public void setAnterior(lcde.Nodo anterior) {
        this.anterior = anterior;
    }

    public Object getDato() {
        return dato;
    }

    public void setDato(Object dato) {
        this.dato = dato;
    }

    public lcde.Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(lcde.Nodo siguiente) {
        this.siguiente = siguiente;
    }
}
