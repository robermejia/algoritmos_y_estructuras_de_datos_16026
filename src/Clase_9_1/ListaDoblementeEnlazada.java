package Clase_9_1;

// Clase para la lista doblemente enlazada
class ListaDoblementeEnlazada {
    Nodo head; // Nodo cabeza de la lista
    Nodo tail; // Nodo cola de la lista (nuevo puntero)


    // Método para insertar un nodo al final de la lista
    public void insertarAlFinal(int data) {
        Nodo nuevoNodo = new Nodo(data);
        if (head == null) { // Si la lista está vacía
            head = nuevoNodo;
            tail = nuevoNodo; // Inicializar también tail
        } else {
            tail.next = nuevoNodo;
            nuevoNodo.prev = tail;
            tail = nuevoNodo; // Actualizar el nodo tail
        }
    }

    // Método para eliminar un nodo con un valor específico
    public void eliminarNodo(int data) {
        if (head == null) return; // Si la lista está vacía, no hacer nada

        // Si el nodo a eliminar es el nodo cabeza
        if (head.data == data) {
            head = head.next;
            if (head != null) {
                head.prev = null; // Actualizar el puntero prev del nuevo head
            } else {
                tail = null; // Si la lista se queda vacía, tail también debe ser null
            }
            return;
        }


        Nodo temp = head;
        while (temp != null && temp.data != data) { // Corrección: usar '!=' para la comparación
            temp = temp.next;
        }
        if (temp == null) return; // No se encontró el nodo a eliminar

        if (temp.next != null) temp.next.prev = temp.prev; // Actualizar el puntero prev del nodo siguiente
        if (temp.prev != null) temp.prev.next = temp.next; // Actualizar el puntero next del nodo anterior

        // Si se elimina el último nodo, actualizar tail
        if (temp == tail) {
            tail = temp.prev;
        }
    }
    
    // Método para recorrer la lista de adelante hacia atrás
    public void recorrerHaciaAdelante() {
        Nodo temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    // Método para recorrer la lista de atrás hacia adelante usando tail
    public void recorrerHaciaAtras() {
        Nodo temp = tail;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.prev;
        }
        System.out.println();
    }
}
