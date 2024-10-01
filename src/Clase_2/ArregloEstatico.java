package Clase_2;
public class ArregloEstatico {
    
// Función para mostrar los elementos del arreglo
    public static void mostrarArreglo(int[] arreglo) {
        System.out.print("Arreglo: ");
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print(arreglo[i] + " ");
        }
        System.out.println(); 
    }

    // Función para insertar un elemento en un arreglo estático
    public static void insertar(int[] arreglo, int valor, int posicion) {
        if (posicion >= 0 && posicion < arreglo.length) {
            // Desplazar los elementos a la derecha de la posición de inserción
            for (int i = arreglo.length - 1; i > posicion; i--) {
                arreglo[i] = arreglo[i - 1];
            }
            // Insertar el nuevo valor en la posición especificada
            arreglo[posicion] = valor;
        } else {
            System.out.println("Posición inválida para insertar.");
        }
    }
}
