package Clase_7;

public class Test_Lista_Enlazadas {
    public static void main(String[] args) {
        ListaEnlazada lista = new ListaEnlazada();

        lista.insertarAlInicio(3);
        lista.insertarAlInicio(5);
        lista.insertarAlInicio(7);

        System.out.println("Lista enlazada: ");
        lista.mostrarLista();
    }
}
