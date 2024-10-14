package Clase_9_2;

// Clase Nodo para la lista doblemente enlazada
class Nodo {
    int data; // Dato que contiene el nodo
    Nodo prev; // Puntero al nodo anterior
    Nodo next; // Puntero al nodo siguiente

    // Constructor para crear un nuevo nodo
    Nodo(int data) {
        this.data = data;
        this.prev = null;
        this.next = null;
    }
}
