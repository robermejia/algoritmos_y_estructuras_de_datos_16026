package Clase_6;
// Clase de prueba
public class Test_TDA {
  
    public static void main(String[] args) {
        Pila pila = new Pila();
        // Apilar elementos en la pila
        pila.apilar(10);
        pila.apilar(20);
        pila.apilar(30);
        // Mostrar la cima de la pila
        System.out.println("Cima de la pila: " + pila.cima());
        // Desapilar elementos de la pila y mostrarlos 
        while (!pila.estaVacia()) {
            System.out.println("Desapilando: " + pila.desapilar());
        }
    }

}
