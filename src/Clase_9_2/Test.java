package Clase_9_2;
// lista doblemente enlazada circular
public class Test {
    public static void main(String[] args) {
        ListaDoblementeEnlazada lista = new ListaDoblementeEnlazada();

        // Insertar algunos nodos
        lista.insertarAlInicio(1);
        lista.insertarAlFinal(2);
        lista.insertarAlInicio(3);

        // Recorrer la lista
        System.out.println("Recorrer la lista:");
        lista.recorrerHaciaAdelante();

        // Eliminar un nodo
        lista.eliminarNodo(2);

        // Recorrer la lista nuevamente
        System.out.println("Recorrer la lista después de eliminar un nodo:");
        lista.recorrerHaciaAdelante();
    }
}
