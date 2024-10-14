package Clase_9_2;

// Clase para la lista doblemente enlazada
class ListaDoblementeEnlazada {
    Nodo head; // Nodo cabeza de la lista
    Nodo tail; // Nodo cola de la lista (nuevo puntero)

    //------

    // Método para insertar un nodo al inicio de la lista
    public void insertarAlInicio(int data) {
        Nodo nuevoNodo = new Nodo(data);
        if (head == null) { // Si la lista está vacía
            head = nuevoNodo;
            tail = nuevoNodo;
            tail.next = head; // Conectar el último nodo al primero
        } else {
            nuevoNodo.next = head;
            head = nuevoNodo;
            tail.next = head; // Actualizar el puntero del último nodo
        }
    }
    //--

    // Método para insertar un nodo al final de la lista
    public void insertarAlFinal(int data) {
        Nodo nuevoNodo = new Nodo(data);
        if (head == null) { // Si la lista está vacía
            head = nuevoNodo;
            tail = nuevoNodo;
            tail.next = head; // Conectar el último nodo al primero
        } else {
            tail.next = nuevoNodo;
            nuevoNodo.prev = tail;
            tail = nuevoNodo;
            tail.next = head; // Conectar el último nodo de nuevo al primero
        }
    }
    //---

    // Método para eliminar un nodo con un valor específico
    public void eliminarNodo(int data) {
        if (head == null) return; // Si la lista está vacía, no hacer nada

        Nodo temp = head;
        Nodo prev = null;

        // Caso especial: Si el nodo a eliminar es el nodo head
        if (head.data == data) {
            if (head == tail) { // Si solo hay un nodo en la lista
                head = null;
                tail = null;
            } else {
                head = head.next;
                tail.next = head; // Actualizar el último nodo para mantener la circularidad
            }
            return;
        }

        //------

        // Buscar el nodo a eliminar en la lista
        do {
            prev = temp;
            temp = temp.next;
        } while (temp != head && temp.data != data);

        if (temp == head) return; // Si no se encuentra el nodo

        prev.next = temp.next;
        // Si el nodo a eliminar es el último nodo, actualizar tail
        if (temp == tail) {
            tail = prev;
        }
    }
    //---------

    // Método para recorrer la lista de adelante hacia atrás
    public void recorrerHaciaAdelante() {
        if (head == null) return; // Si la lista está vacía, no hacer nada

        Nodo temp = head;
        do {
            System.out.print(temp.data + " ");
            temp = temp.next;
        } while (temp != head); // Continuar hasta volver al nodo head
        System.out.println();
    }
}
