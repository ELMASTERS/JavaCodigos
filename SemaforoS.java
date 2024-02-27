
import java.util.Scanner;

public class SemaforoS {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String entradaDatos;

        // Inicialización del semáforo en estado rojo
        String estadoSemaforo = "rojo";
        String calle;

        // Pedir por teclado la calle donde está ubicado el semáforo
        System.out.print("Ingrese la calle donde está ubicado el semáforo: ");
        calle = scanner.nextLine();
        System.out.println("El semáforo está ubicado en la calle: " + calle);
		  System.out.println("-------------------------------------------"  );

        int contadorCambios = 0;

        while (true) {
       
			//Cambiar el estado del semáforo
			  switch (estadoSemaforo) {
                case "rojo":
				System.out.println("El semáforo está en estado " + estadoSemaforo+ " --- Deténgase..." );
                
                    break;
                case "amarillo":
				System.out.println("El semáforo está en estado " + estadoSemaforo+ " --- Precaución..." );
                  
                    break;
                case "verde":
				System.out.println("El semáforo está en estado " + estadoSemaforo+ " --- Continúe..." );
              
                    break;
            }

            // Esperar a que el usuario presione Enter
            System.out.println("Presiona Enter para cambiar de estado (Escribe FIN para terminar)");
            entradaDatos = scanner.nextLine();

            // Verificar si el usuario quiere terminar el programa
            if (entradaDatos.equalsIgnoreCase("FIN")) {
                System.out.println("-------Programa terminado-------.");
                break;
            }

            // Cambiar el estado del semáforo al presionar enter
            if (estadoSemaforo.equals("rojo")) {
                estadoSemaforo = "amarillo";
            } else if (estadoSemaforo.equals("amarillo")) {
                estadoSemaforo = "verde";
            } else {
                estadoSemaforo = "rojo";
            }

            contadorCambios++;
        }

        // Mostrar la calle y la cantidad de veces que el semáforo cambió de color
		System.out.println("El semáforo está ubicado en la calle: " + calle + " , cambió de color " + contadorCambios + " veces.");
   

        // Cerrar el escáner
        scanner.close();
    }
}
