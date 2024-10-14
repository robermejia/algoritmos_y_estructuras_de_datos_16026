package Clase_9_1;

// Lista doblemente enlazada normal
public class Test {
    public static void main(String[] args) {
        ListaDoblementeEnlazada lista = new ListaDoblementeEnlazada();

        // Insertar algunos nodos
        lista.insertarAlFinal(1);
        lista.insertarAlFinal(2);
        lista.insertarAlFinal(3);

        // Recorrer hacia adelante
        System.out.println("Recorrer hacia adelante:");
        lista.recorrerHaciaAdelante();

        // Recorrer hacia atrás
        System.out.println("Recorrer hacia atrás:");
        lista.recorrerHaciaAtras();

        // Eliminar un nodo
        lista.eliminarNodo(2);

        // Recorrer hacia adelante de nuevo
        System.out.println("Recorrer hacia adelante (después de eliminar):");
        lista.recorrerHaciaAdelante();
    }
}


