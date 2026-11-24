package com.mycompany.estructurasdecontrol;
import java.util.Scanner;
public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double nota;

        System.out.print("Ingrese la nota del estudiante: ");
        nota = entrada.nextDouble();

        if (nota >= 7) {
            System.out.println("Aprobado.");
        } else {
            System.out.println("Reprobado.");
        }
        entrada.close();
    }
}