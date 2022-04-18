public class Nodos {
    //datos
    Object dato;
    Nodos siguiente;
    //metodo constructor
    public Nodos (Object dato,Nodos siguiente) {
        this. dato=dato;
        this. siguiente= siguiente;
    }

    public Object getDato() {
        return this.dato;
    }

    public void setDato(Object dato) {
        this.dato=dato;
    }
    public Nodos getSiguiente(){
        return this.siguiente;
    }
    public void setSiguiente(Nodos siguiente){
        this.siguiente=siguiente;

    }
}
