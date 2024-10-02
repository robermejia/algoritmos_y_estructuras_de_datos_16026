package Clase_8;

class ListaEnlazada {
    // ###################### RECORRIDO LE + INSERTAL AL FINAL #######################
    /*
    // Apunta al primer nodo de la lista
    Nodo cabeza; 
    
    // Inicialmente la lista está vacía
    public ListaEnlazada() {
        this.cabeza = null; 
    }

    public void insertarAlPrincipio(int dato) {
        Nodo nuevoNodo = new Nodo(dato); // Crea un nuevo nodo con el valor dado
        nuevoNodo.siguiente = cabeza; // El nuevo nodo apunta al nodo actual de la cabeza
        cabeza = nuevoNodo; // La cabeza ahora apunta al nuevo nodo
    }
    // INSERCIÓN AL FINAL
    public void insertarAlFinal(int dato) {
        Nodo nuevoNodo = new Nodo(dato); // Crea un nuevo nodo con el valor dado

        if (cabeza == null) { // Si la lista está vacía, el nuevo nodo es la cabeza
            cabeza = nuevoNodo;
            return;
        }

        Nodo actual = cabeza; // Comienza en la cabeza de la lista
        while (actual.siguiente != null) { // Recorre la lista hasta llegar al último nodo
            actual = actual.siguiente; // Avanza al siguiente nodo
        }
        actual.siguiente = nuevoNodo; // El último nodo apunta al nuevo nodo
    }

    public void recorrer() {
        Nodo actual = cabeza; // Comienza en la cabeza de la lista
        while (actual != null) { // Recorre la lista hasta llegar al final
            System.out.print(actual.dato + " "); // Imprime el dato del nodo actual
            actual = actual.siguiente; // Avanza al siguiente nodo
        }
        System.out.println(); // Imprime una nueva línea al final
    }
    */
    
    // ################################## BUSQUEDA LE ##################################
    /*
    Nodo cabeza; // Apunta al primer nodo de la lista

    public ListaEnlazada() {
        this.cabeza = null; // Inicialmente la lista está vacía
    }

    public void insertarAlPrincipio(int dato) {
        Nodo nuevoNodo = new Nodo(dato); // Crea un nuevo nodo con el valor dado
        nuevoNodo.siguiente = cabeza; // El nuevo nodo apunta al nodo actual de la cabeza
        cabeza = nuevoNodo; // La cabeza ahora apunta al nuevo nodo
    }

    public void insertarAlFinal(int dato) {
        Nodo nuevoNodo = new Nodo(dato); // Crea un nuevo nodo con el valor dado

        if (cabeza == null) { // Si la lista está vacía, el nuevo nodo es la cabeza
            cabeza = nuevoNodo;
            return;
        }

        Nodo actual = cabeza; // Comienza en la cabeza de la lista
        while (actual.siguiente != null) { // Recorre la lista hasta llegar al último nodo
            actual = actual.siguiente; // Avanza al siguiente nodo
        }
        actual.siguiente = nuevoNodo; // El último nodo apunta al nuevo nodo
    }

    public boolean buscar(int dato) {
        Nodo actual = cabeza; // Comienza en la cabeza de la lista
        while (actual != null) { // Recorre la lista hasta llegar al final
            if (actual.dato == dato) { // Si el dato del nodo actual coincide con el buscado
                return true; // Se encontró el dato
            }
            actual = actual.siguiente; // Avanza al siguiente nodo
        }
        return false; // No se encontró el dato
    }

    public void recorrer() {
        Nodo actual = cabeza; // Comienza en la cabeza de la lista
        while (actual != null) { // Recorre la lista hasta llegar al final
            System.out.print(actual.dato + " "); // Imprime el dato del nodo actual
            actual = actual.siguiente; // Avanza al siguiente nodo
        }
        System.out.println(); // Imprime una nueva línea al final
    }
    */
    // ########################### ELIMINACIÓN 1 ELEMENTO LE ###########################
    /*

    Nodo cabeza; // Apunta al primer nodo de la lista

    public ListaEnlazada() {
        this.cabeza = null; // Inicialmente la lista está vacía
    }

    public void insertarAlPrincipio(int dato) {
        Nodo nuevoNodo = new Nodo(dato); // Crea un nuevo nodo con el valor dado
        nuevoNodo.siguiente = cabeza; // El nuevo nodo apunta al nodo actual de la cabeza
        cabeza = nuevoNodo; // La cabeza ahora apunta al nuevo nodo
    }

    public void insertarAlFinal(int dato) {
        Nodo nuevoNodo = new Nodo(dato); // Crea un nuevo nodo con el valor dado

        if (cabeza == null) { // Si la lista está vacía, el nuevo nodo es la cabeza
            cabeza = nuevoNodo;
            return;
        }

        Nodo actual = cabeza; // Comienza en la cabeza de la lista
        while (actual.siguiente != null) { // Recorre la lista hasta llegar al último nodo
            actual = actual.siguiente; // Avanza al siguiente nodo
        }
        actual.siguiente = nuevoNodo; // El último nodo apunta al nuevo nodo
    }

    public boolean buscar(int dato) {
        Nodo actual = cabeza; // Comienza en la cabeza de la lista
        while (actual != null) { // Recorre la lista hasta llegar al final
            if (actual.dato == dato) { // Si el dato del nodo actual coincide con el buscado
                return true; // Se encontró el dato
            }
            actual = actual.siguiente; // Avanza al siguiente nodo
        }
        return false; // No se encontró el dato
    }

    public void borrar(int dato) {
        if (cabeza == null) { // Si la lista está vacía, no hay nada que borrar
            return;
        }

        if (cabeza.dato == dato) { // Si el dato a borrar está en la cabeza
            cabeza = cabeza.siguiente; // La cabeza ahora apunta al siguiente nodo
            return;
        }

        Nodo actual = cabeza; // Comienza en la cabeza de la lista
        while (actual.siguiente != null) { // Recorre la lista hasta llegar al último nodo
            if (actual.siguiente.dato == dato) { // Si el dato a borrar está en el siguiente nodo
                actual.siguiente = actual.siguiente.siguiente; // El nodo actual apunta al nodo después del que se borró
                return;
            }
            actual = actual.siguiente; // Avanza al siguiente nodo
        }
    }

    public void recorrer() {
        Nodo actual = cabeza; // Comienza en la cabeza de la lista
        while (actual != null) { // Recorre la lista hasta llegar al final
            System.out.print(actual.dato + " "); // Imprime el dato del nodo actual
            actual = actual.siguiente; // Avanza al siguiente nodo
        }
        System.out.println(); // Imprime una nueva línea al final
    }
    */
    // ########################### ELIMINACIÓN 2 LE ###########################
    /*
    Nodo cabeza; // Apunta al primer nodo de la lista

    public ListaEnlazada() {
        this.cabeza = null; // Inicialmente la lista está vacía
    }

    public void insertarAlPrincipio(int dato) {
        Nodo nuevoNodo = new Nodo(dato); // Crea un nuevo nodo con el valor dado
        nuevoNodo.siguiente = cabeza; // El nuevo nodo apunta al nodo actual de la cabeza
        cabeza = nuevoNodo; // La cabeza ahora apunta al nuevo nodo
    }

    public void insertarAlFinal(int dato) {
        Nodo nuevoNodo = new Nodo(dato); // Crea un nuevo nodo con el valor dado

        if (cabeza == null) { // Si la lista está vacía, el nuevo nodo es la cabeza
            cabeza = nuevoNodo;
            return;
        }

        Nodo actual = cabeza; // Comienza en la cabeza de la lista
        while (actual.siguiente != null) { // Recorre la lista hasta llegar al último nodo
            actual = actual.siguiente; // Avanza al siguiente nodo
        }
        actual.siguiente = nuevoNodo; // El último nodo apunta al nuevo nodo
    }

    public boolean buscar(int dato) {
        Nodo actual = cabeza; // Comienza en la cabeza de la lista
        while (actual != null) { // Recorre la lista hasta llegar al final
            if (actual.dato == dato) { // Si el dato del nodo actual coincide con el buscado
                return true; // Se encontró el dato
            }
            actual = actual.siguiente; // Avanza al siguiente nodo
        }
        return false; // No se encontró el dato
    }

    public void borrar(int dato) {
        if (cabeza == null) { // Si la lista está vacía, no hay nada que borrar
            return;
        }

        if (cabeza.dato == dato) { // Si el dato a borrar está en la cabeza
            cabeza = cabeza.siguiente; // La cabeza ahora apunta al siguiente nodo
            return;
        }

        Nodo anterior = cabeza; // El nodo anterior al que se va a borrar
        Nodo actual = cabeza.siguiente; // El nodo actual, comienza en el siguiente a la cabeza

        while (actual != null && actual.dato != dato) { // Recorre la lista hasta llegar al final o encontrar el dato
            anterior = actual; // Actualiza el nodo anterior
            actual = actual.siguiente; // Avanza al siguiente nodo
        }

        if (actual != null) { // Si se encontró el nodo con el dato
            anterior.siguiente = actual.siguiente; // El nodo anterior apunta al siguiente del que se va a borrar
        } else { // Si no se encontró el nodo con el dato
            System.out.println("El elemento no se encuentra en la lista");
        }
    }

    public void recorrer() {
        Nodo actual = cabeza; // Comienza en la cabeza de la lista
        while (actual != null) { // Recorre la lista hasta llegar al final
            System.out.print(actual.dato + " "); // Imprime el dato del nodo actual
            actual = actual.siguiente; // Avanza al siguiente nodo
        }
        System.out.println(); // Imprime una nueva línea al final
    }
    */
    // ########################### ORDENAMIENTO LE ############################
}
