//Persona.java

import java.util.Random;

public class Persona {
    private String nombre;
    private int edad;
    private double altura;
    private double peso;
    private char sexo;

    // Constructor que recibe todos los parámetros
    public Persona(String nombre, int edad, double altura, double peso, char sexo) {
        this.nombre = nombre;
        this.edad = edad;
        this.altura = altura;
        this.peso = peso;
        this.sexo = sexo;
    }

    // Constructor sin argumentos 
    public Persona() {
        Random rand = new Random();
        String[] nombresHombre = {"Hugo", "Martin", "Mateo", "Lucas", "Leo", "Daniel", "Alejandro", "Manuel", "Pablo", "Álvaro", "Enzo", "Adrian", "Mario", "Diego", "David", "Thiago", "Oliver", "Alex", "Bruno", "Marcos"};
        String[] nombresMujer = {"Lucía", "Sofía", "Martina", "Maria", "Julia", "Valeria", "Paula", "Emma", "Daniela", "Carla", "Alma", "Sara", "Carmen", "Alba", "Vega", "Noa", "Olivia", "Lara", "Mia", "Valentina"};

        // Generar nombre aleatorio
        int index = rand.nextInt(nombresHombre.length + nombresMujer.length);
        if (index < nombresHombre.length) {
            nombre = nombresHombre[index];
            sexo = 'M';
        } else {
            nombre = nombresMujer[index - nombresHombre.length];
            sexo = 'F';
        }

        // Generar edad aleatoria entre 18 y 100 años
        edad = rand.nextInt(83) + 18;

        // Generar altura aleatoria entre 1 y 2 metros
        altura = rand.nextDouble() + 1;

        // Generar peso aleatorio entre 100 y 230 libras
        peso = rand.nextDouble() * 130 + 100;
    }

    // Getters y setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    // Método para desplegar la información de la persona
    public void desplegarPersona() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad + " años");
        System.out.println("Altura: " + altura + " metros");
        System.out.println("Peso: " + peso + " libras");
        System.out.println("Sexo: " + sexo);
        System.out.println();
    }
}
