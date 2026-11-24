package com.mycompany.estructurasdecontrol;
import java.util.Scanner;
public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String nombre;
        int edad;
        String carrera;
        double estatura;

        System.out.print("Ingrese su nombre: ");
        nombre = entrada.nextLine();

        System.out.print("Ingrese su edad: ");
        edad = entrada.nextInt();
        entrada.nextLine();

        System.out.print("Ingrese su carrera: ");
        carrera = entrada.nextLine();

        System.out.print("Ingrese su estatura en metros: ");
        estatura = entrada.nextDouble();

        System.out.println("\n--- DATOS PERSONALES ---");
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad + " años");
        System.out.println("Carrera: " + carrera);
        System.out.println("Estatura: " + estatura + " metros");

        entrada.close();
    }
}
