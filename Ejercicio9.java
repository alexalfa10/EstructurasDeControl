package com.mycompany.estructurasdecontrol;
import java.util.Scanner;
public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero;
        int resultado;

        System.out.print("Ingrese un numero entero: ");
        numero = entrada.nextInt();

        System.out.println("--- TABLA DE MULTIPLICAR ---");

        for (int i = 1; i <= 12; i++) {
            resultado = numero * i;
            System.out.println(numero + " x " + i + " = " + resultado);
        }
        entrada.close();
    }
}
