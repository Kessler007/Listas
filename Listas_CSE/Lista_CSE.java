package L_CSE;

public class Lista_CSE {
    Nodo inicio;

    public Lista_CSE() {
        inicio = null;
    }

    public boolean estaVacia() {
        return inicio == null;
    }

    public int tamaño() {
        int cont = 0;
        if (!estaVacia()) {
            Nodo ultimo = inicio;
            while (ultimo.getSiguiente() != inicio) {
                ultimo = ultimo.getSiguiente();

                cont++;
            }
            cont++;
        }
        return cont;
    }

    public void insertarFin(Object dato) {
        if (estaVacia()) {
            Nodo nuevo = new Nodo();
            nuevo.setDato(dato);
            nuevo.setSiguiente(nuevo);

            inicio = nuevo;
        } else {
            Nodo nuevo = new Nodo();
            nuevo.setDato(dato);
            nuevo.setSiguiente(inicio);

            Nodo ultimo = inicio;
            while (ultimo.getSiguiente() != inicio) {
                ultimo = ultimo.getSiguiente();
            }
            ultimo.setSiguiente(nuevo);
        }
    }

    public void eliminarFin() {
        if (!estaVacia()) {
            Nodo penultmo = inicio;
            while (penultmo.getSiguiente().getSiguiente() != inicio) {
                penultmo = penultmo.getSiguiente();
            }
            penultmo.setSiguiente(inicio);
        }
    }

    public void mostrar() {
        if (!estaVacia()) {
            Nodo ultimo = inicio;
            while (ultimo.getSiguiente() != inicio) {
                System.out.print(ultimo.getDato() + "  ");
                ultimo = ultimo.getSiguiente();
            }
            System.out.println(ultimo.getDato() + "  ");
            // System.out.println();
        }
    }

    public void mostraCircular(int vueltas) {
        if (!estaVacia()) {
            int contador = 0;
            Nodo temp = inicio;
            while (temp != null && contador < (tamaño() * vueltas)) {
                System.out.print(temp.getDato() + "  ");
                temp = temp.getSiguiente();
                contador++;
            }
            System.out.println();
        }
    }
}