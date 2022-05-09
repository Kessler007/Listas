import lcde.Lista_circular_doblemente_enlazada;

public class Main {
    public static void main(String[] args) {
        Lista_circular_doblemente_enlazada lista_circular_doblemente_enlazada=new Lista_circular_doblemente_enlazada();
        System.out.println(lista_circular_doblemente_enlazada.estaVacio());
        for (int i=1;i<=5;i++){
            lista_circular_doblemente_enlazada.insertarFinal(i);
        }
        lista_circular_doblemente_enlazada.mostrar();
        lista_circular_doblemente_enlazada.eliminarFinal();
        lista_circular_doblemente_enlazada.eliminarFinal();
        lista_circular_doblemente_enlazada.mostrar();
        lista_circular_doblemente_enlazada.mostrarAdelante(8);
        lista_circular_doblemente_enlazada.mostrarAdelante(8);
    }
}
