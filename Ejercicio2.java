package com.mycompany.estructurasdecontrol;
import java.util.Scanner;
public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero1, numero2;
        int suma, resta, multiplicacion, residuo;
        double division;
        
        System.out.print("Ingrese el primer numero entero: ");
        numero1 = entrada.nextInt();

        System.out.print("Ingrese el segundo numero entero: ");
        numero2 = entrada.nextInt();

        suma = numero1 + numero2;
        resta = numero1 - numero2;
        multiplicacion = numero1 * numero2;

        System.out.println("\n--- RESULTADOS ---");
        System.out.println("Suma: " + suma);
        System.out.println("Resta: " + resta);
        System.out.println("Multiplicacion: " + multiplicacion);

        if (numero2 != 0) {
            division = (double) numero1 / numero2;
            residuo = numero1 % numero2;

            System.out.println("Division: " + division);
            System.out.println("Residuo: " + residuo);
        } else {
            System.out.println("Division: No se puede dividir para cero.");
            System.out.println("Residuo: No se puede calcular.");
        }
        entrada.close();
    }
}
