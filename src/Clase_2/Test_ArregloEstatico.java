package Clase_2;

import static Clase_2.ArregloEstatico.insertar;
import static Clase_2.ArregloEstatico.mostrarArreglo;

public class Test_ArregloEstatico {

    public static void main(String[] args) {
        int[] A = {10, 20, 30, 40, 50};
        
        mostrarArreglo(A);
        insertar(A, 88, 2);
        mostrarArreglo(A);
    }

}
