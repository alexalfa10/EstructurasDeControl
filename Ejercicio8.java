package com.mycompany.estructurasdecontrol;
import java.util.Scanner;
public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String contrasena;

        do {
            System.out.print("Ingrese la contrasena: ");
            contrasena = entrada.nextLine();

        } while (!contrasena.equals("java2026"));

        System.out.println("Acceso concedido.");
        entrada.close();
    }
}