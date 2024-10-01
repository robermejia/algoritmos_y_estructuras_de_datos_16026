package Clase_4;

public class Test_Arreglo_Bidimensional {

    public static void main(String[] args) {
        
    // RECORRIDO ARREGLO BIDIMENSIONAL
    // ---------------------------------------------------------------------
    // Declaración e inicialización del arreglo bidimensional
        int[][] matriz = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        // Recorrer el arreglo bidimensional
        for (int[] matriz1 : matriz) {
            // Recorrer filas
            for (int j = 0; j < matriz1.length; j++) {
                // Recorrer columnas
                System.out.print(matriz1[j] + " ");
            }
            System.out.println(); // Salto de línea después de cada fila
        }

    }
}
