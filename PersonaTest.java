//PersonaTest.java


public class PersonaTest {
    public static void main(String[] args) {
        // Crear 10 personas con constructor 
        Persona[] personas1 = new Persona[10];
        personas1[0] = new Persona("Juan", 30, 1.75, 160, 'M');
        personas1[1] = new Persona("María", 25, 1.60, 120, 'F');
        personas1[2] = new Persona("Carlos", 40, 1.80, 180, 'M');
        personas1[3] = new Persona("Laura", 35, 1.70, 140, 'F');
        personas1[4] = new Persona("Pedro", 22, 1.68, 150, 'M');
        personas1[5] = new Persona("Ana", 28, 1.65, 130, 'F');
        personas1[6] = new Persona("Luis", 45, 1.78, 170, 'M');
        personas1[7] = new Persona("Elena", 33, 1.72, 155, 'F');
        personas1[8] = new Persona("Miguel", 38, 1.75, 175, 'M');
        personas1[9] = new Persona("Sara", 27, 1.63, 135, 'F');

        // Desplegar información de las personas
        System.out.println("Personas creadas con constructor que recibe argumentos:");
        for (Persona persona : personas1) {
            persona.desplegarPersona();
			 System.out.println("---------------------------------------");
        }

        // Crear 10 personas aleatorias
        Persona[] personas2 = new Persona[10];
        for (int i = 0; i < 10; i++) {
            personas2[i] = new Persona();
			
        }

        // Desplegar información de las personas
        System.out.println("Personas aleatorias:");
        for (Persona persona : personas2) {
            persona.desplegarPersona();
			 System.out.println("---------------------------------------");
        }
    }
}
