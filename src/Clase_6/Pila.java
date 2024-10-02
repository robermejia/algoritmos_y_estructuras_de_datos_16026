package Clase_6;

class Pila {
    private Nodo cima;

    // Constructor para crear una pila vacía 
    public Pila() {
        this.cima = null;
    }

    // Método para eliminar y devolver el elemento en la cima 
    public int desapilar() {
        if (estaVacia()) {
            System.out.println("La pila está vacía");
            return -1; // Valor arbitrario para indicar error
        }
        int valorCima = cima.valor;
        cima = cima.siguiente;
        return valorCima; 
    }

    // Método para verificar si la pila está vacía 
    public boolean estaVacia() {
        return cima == null;
    }

    // Método para agregar un elemento a la pila (apilar)
    public void apilar(int elemento) {
        Nodo nuevoNodo = new Nodo(elemento);
        nuevoNodo.siguiente = cima;
        cima = nuevoNodo;
    }

    // Método para obtener el elemento en la cima de la pila 
    public int cima() {
        if (estaVacia()) {
            System.out.println("La pila está vacía");
            return -1; // Valor arbitrario para indicar error
        }
        return cima.valor;
    }
} 
