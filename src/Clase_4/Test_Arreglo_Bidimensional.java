package Clase_4;

public class Test_Arreglo_Bidimensional {

    public static void main(String[] args) {
        
    // ################## RECORRIDO ARREGLO BIDIMENSIONAL ######################
    // -------------------------------------------------------------------------
    /*
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
    */    
    // ###################### MATRIZ TRIANGULAR INFERIOR #######################
    // -------------------------------------------------------------------------  
    /*
        int n = 4; // Tamaño de la matriz cuadrada
        int[][] matriz = new int[n][n];

        // Inicializando la matriz triangular inferior
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i >= j) {
                    matriz[i][j] = i + j; // Ejemplo simple de valor
                } else {
                    matriz[i][j] = 0;
                }
            }
        }

        // Imprimiendo la matriz
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    */
    // ###################### MATRIZ TRIANGULAR SUPERIOR #######################
    // -------------------------------------------------------------------------  
    /*
        int n = 4; // Tamaño de la matriz cuadrada
        int[][] matriz = new int[n][n];

        // Inicializando la matriz triangular superior
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i <= j) {
                    matriz[i][j] = i + j; // Ejemplo simple de valor
                } else {
                    matriz[i][j] = 0;
                }
            }
        }

        // Imprimiendo la matriz
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    */    
    // ####################### MATRIZ TRIANGULAR TRIDIAGONAL ###################
    // -------------------------------------------------------------------------
    /*
        int n = 5; // Tamaño de la matriz
        int[][] matriz = new int[n][n];

        // Inicializando la matriz tridiagonal
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (Math.abs(i - j) <= 1) {
                    matriz[i][j] = i + j; // Ejemplo simple de valor
                } else {
                    matriz[i][j] = 0;
                }
            }
        }

        // Imprimiendo la matriz
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    */    
    // ####################### MATRIZ TRIANGULAR SIMÉTRICAS ####################
    // -------------------------------------------------------------------------
    /*
        int n = 4; // Tamaño de la matriz cuadrada
        int[][] matriz = new int[n][n];

        // Inicializando la matriz simétrica
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i <= j) {
                    matriz[i][j] = i + j; // Ejemplo simple de valor
                    matriz[j][i] = matriz[i][j]; // Asegurando la simetría
                }
            }
        }

        // Imprimiendo la matriz
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    */    
    // ###################### MATRIZ TRIANGULAR ASIMÉTRICA #####################
    // -------------------------------------------------------------------------
        int n = 4; // Tamaño de la matriz cuadrada
        int[][] matriz = new int[n][n];

        // Inicializando la matriz asimétrica
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j) { // Diagonal principal con ceros
                    matriz[i][j] = 0;
                } else if (i < j) { // Parte triangular superior
                    matriz[i][j] = i + j; // Ejemplo simple de valor
                } else { // Parte triangular inferior
                    matriz[i][j] = i * j; // Ejemplo simple de valor diferente a la parte superior
                }
            }
        }

        // Imprimiendo la matriz
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}
