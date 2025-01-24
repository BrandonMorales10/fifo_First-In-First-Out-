import java.util.LinkedList;
import java.util.Scanner;

class ColaSimple {
    private LinkedList<Integer> cola;

    public ColaSimple() {
        cola = new LinkedList<>();
    }

    // Método para encolar un elemento
    public void encolar(int elemento) {
        cola.addLast(elemento);
    }

    // Método para desencolar un elemento
    public int desencolar() {
        if (estaVacia()) {
            System.out.println("La cola está vacía.");
            return -1; // Indicador de error
        }
        return cola.removeFirst();
    }

    // Método para mostrar el primer elemento
    public int frente() {
        if (estaVacia()) {
            System.out.println("La cola está vacía.");
            return -1; // Indicador de error
        }
        return cola.getFirst();
    }

    // Método para verificar si la cola está vacía
    public boolean estaVacia() {
        return cola.isEmpty();
    }

    // Método para mostrar los elementos de la cola
    public void mostrar() {
        if (estaVacia()) {
            System.out.println("La cola está vacía.");
        } else {
            System.out.println("Contenido de la cola: " + cola);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ColaSimple cola = new ColaSimple();
        int opcion;

        do {
            System.out.println("\n--- Menú Cola Simple ---");
            System.out.println("1. Encolar");
            System.out.println("2. Desencolar");
            System.out.println("3. Mostrar frente");
            System.out.println("4. Mostrar cola");
            System.out.println("5. Salir");
            System.out.print("Selecciona una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Ingresa el elemento a encolar: ");
                    int elemento = scanner.nextInt();
                    cola.encolar(elemento);
                    System.out.println("Se agregó " + elemento + " a la cola.");
                    break;

                case 2:
                    int desencolado = cola.desencolar();
                    if (desencolado != -1) {
                        System.out.println("Elemento desencolado: " + desencolado);
                    }
                    break;

                case 3:
                    int frente = cola.frente();
                    if (frente != -1) {
                        System.out.println("Frente de la cola: " + frente);
                    }
                    break;

                case 4:
                    cola.mostrar();
                    break;

                case 5:
                    System.out.println("¡Adiós!");
                    break;

                default:
                    System.out.println("Opción no válida, intenta de nuevo.");
            }
        } while (opcion != 5);

        scanner.close();
    }
}
