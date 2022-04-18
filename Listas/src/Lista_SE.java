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
    public int tamaño() {
        int contador = 1;
        Nodos aux = inicio;
        while (aux.getSiguiente() != null) {
            contador++;
            aux = aux.getSiguiente();
        }
        if (contador != 0) {
            contador++;
        }
        return contador;
    }


    //valor ultimo nodos
    public Object ultimoDato(){
        Nodos aux=inicio;
        while (aux.getSiguiente() != null){
            aux = aux.getSiguiente();
        }
        return aux.getDato();
    }

    //Insertar
    public void InsetarInicio(Object dato){
        if (estaVacia()){
            this.inicio =new Nodos(dato,null);
        }else{
            Nodos aux=inicio;
            this.inicio=new Nodos(dato,aux);
        }
    }

    //Mostrar
    public void MostrarInicio(){
        if (estaVacia()){
            this.inicio=inicio.getSiguiente();
        }
    }

    public void Mostrar(){
        if (estaVacia()){
            System.out.printf("Esta vacia");
        }else{
            Nodos aux=inicio;
            while (aux!=null){
                System.out.println(aux.getDato()+" ");
            }
            System.out.println(" ");
        }
    }
}
