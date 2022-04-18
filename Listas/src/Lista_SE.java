public class Lista_SE {
    Nodos inicio;

    // Metodo constructor
    public Lista_SE() {
        this.inicio = null;
    }

    //vacia
    public boolean estaVacia() {
        return inicio == null;
    }

    //tamaño de la lista
    public int contador() {
        int contador = 0;
        Nodos aux = inicio;
        while (aux.getSiguiente() != null) {
            contador++;
            aux = aux.getSiguiente();
        }
        if (contador != 0) contador++;
        {
            return contador;
        }
    }

    //Tamaño lista 2
    public int tamaño() {
        int tamaño = 0;
        Nodos aux = inicio;
        while (aux != null) {
            tamaño += 1;
            aux = aux.getSiguiente();
        }
        return tamaño;
    }

    public class ListaSE{
        //valor ultimo nodos
        public Object ultimoDato(){
            Nodos aux=inicio;
            while (aux.getSiguiente() != null){
                aux = aux.getSiguiente();
            }
            return aux.getDato();
        }
    }
}
