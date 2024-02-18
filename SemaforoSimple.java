import java.util.Scanner;

public class SemaforoSimple {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String entradaDatos;

        // Inicialización del semáforo en estado rojo
        String estadoSemaforo = "rojo";

        while (true) {
            // Mostrar estado actual del semáforo
            System.out.println("El semáforo está en estado " + estadoSemaforo);

            // Esperar a que el usuario presione Enter
            System.out.println("Presiona Enter para cambiar de estado (Escribe FIN para terminar)");
            entradaDatos = scanner.nextLine();

            // Verificar si el usuario quiere terminar el programa
            if (entradaDatos.equalsIgnoreCase("FIN")) {
                System.out.println("Programa terminado.");
                break;
            }

            // Cambiar el estado del semáforo al precionar enter
            if (estadoSemaforo.equals("rojo")) {
                estadoSemaforo = "amarillo";
            } else if (estadoSemaforo.equals("amarillo")) {
                estadoSemaforo = "verde";
            } else {
                estadoSemaforo = "rojo";
            }
        }

        // Cerrar el escáner
        scanner.close();
    }
}
