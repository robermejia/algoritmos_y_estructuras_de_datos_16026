package Clase_3;
import java.util.Arrays;

public class Test_Metodos_EDE {
    public static void main(String[] args) {
        
        // Método copyOf
        // ---------------------------------------------------------------------
        
        int[] arregloOriginal = {1, 2, 3};

        // Crea una copia del arreglo original
        int[] arregloNuevo = Arrays.copyOf(arregloOriginal, arregloOriginal.length);

        // Imprime los arreglos
        System.out.println("Arreglo Original: " + Arrays.toString(arregloOriginal));
        System.out.println("Arreglo Copiado: " + Arrays.toString(arregloNuevo));
        
        
        
        // Método copyOfRange
        // ---------------------------------------------------------------------
        /*
        int[] arregloOriginal = {1, 2, 3, 4, 5};

        // Crea un nuevo arreglo con elementos del índice 1 (inclusive) al 3 (exclusivo)
        int[] arregloNuevo = Arrays.copyOfRange(arregloOriginal, 1, 3);

        System.out.println("Arreglo Original: " + Arrays.toString(arregloOriginal));
        System.out.println("Arreglo Nuevo: " + Arrays.toString(arregloNuevo));
        */
        
        
        // Método equals
        // ---------------------------------------------------------------------
        /*
        int[] arregloA = {1, 2, 3};
        int[] arregloB = {1, 2, 3};
        int[] arregloC = {1, 2, 4};

        System.out.println("¿Arreglo A es igual a Arreglo B?: " + Arrays.equals(arregloA, arregloB));
        System.out.println("¿Arreglo A es igual a Arreglo C?: " + Arrays.equals(arregloA, arregloC));
        */
        
        
        // Método fill
        // ---------------------------------------------------------------------
        /*
        int[] arreglo = new int[5];

        // Rellena el arreglo con el valor 10
        Arrays.fill(arreglo, 10);

        System.out.println("Arreglo después de llenar con 10: " + Arrays.toString(arreglo));
        */
        
        
        // Método sort
        // ---------------------------------------------------------------------
        /*
        int[] arregloDesordenado = {5, 2, 8, 1, 9};

        // Ordena el arreglo en orden ascendente
        Arrays.sort(arregloDesordenado);

        System.out.println("Arreglo ordenado: " + Arrays.toString(arregloDesordenado));
        */
        
        
        // Método toString
        // ---------------------------------------------------------------------
        /*
        int[] arreglo = {1, 2, 3, 4, 5};

        // Convierte el arreglo a una cadena de texto
        String cadenaArreglo = Arrays.toString(arreglo);

        System.out.println("Arreglo como cadena de texto: " + cadenaArreglo);
        */
        
        
        // Método compare
        // ---------------------------------------------------------------------
        /*
        int[] arregloA = {1, 2, 3};
        int[] arregloB = {1, 2, 3};
        int[] arregloC = {1, 2, 4};

        // Comparación entre arregloA y arregloB
        int comparacionAB = Arrays.compare(arregloA, arregloB);
        System.out.println("Comparación entre arregloA y arregloB: " + comparacionAB); // Salida: 0

        // Comparación entre arregloA y arregloC
        int comparacionAC = Arrays.compare(arregloA, arregloC);
        System.out.println("Comparación entre arregloA y arregloC: " + comparacionAC); // Salida: -1

        // Comparación entre arregloC y arregloA
        int comparacionCA = Arrays.compare(arregloC, arregloA);
        System.out.println("Comparación entre arregloC y arregloA: " + comparacionCA); // Salida: 1
        */
        
        
        // Método binarySearch
        // ---------------------------------------------------------------------
        /*
        int[] arregloOrdenado = {1, 3, 5, 7, 9};
        int valorBuscado = 5;

        // Busca el valor 5 en el arreglo ordenado
        int indice = Arrays.binarySearch(arregloOrdenado, valorBuscado);

        System.out.println("El índice del valor buscado es: " + indice); // Salida: 2
        */
        
        
        // Método arraycopy
        // ---------------------------------------------------------------------
        /*
        int[] arregloFuente = {1, 2, 3, 4, 5};
        int[] arregloDestino = new int[10];

        // Copia los elementos del arregloFuente al arregloDestino,
        // comenzando desde el índice 2 del arregloDestino
        System.arraycopy(arregloFuente, 0, arregloDestino, 2, arregloFuente.length);

        System.out.println("Arreglo Destino: " + Arrays.toString(arregloDestino)); // Salida: [0, 0, 1, 2, 3, 4, 5, 0, 0, 0]
        */
    }
    
}