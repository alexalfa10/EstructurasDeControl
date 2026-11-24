package com.mycompany.estructurasdecontrol;
import java.util.Scanner;
public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero;
        int cantidad = 0;
        int suma = 0;

        System.out.println("Ingrese numeros positivos.");
        System.out.println("Para terminar, ingrese un numero negativo.");
        
        do {
            System.out.print("Ingrese un numero: ");
            numero = entrada.nextInt();
            
            if (numero >= 0) {
                suma = suma + numero;
                cantidad++;
            }
        } while (numero >= 0);

        System.out.println("\n--- RESULTADOS ---");
        System.out.println("Cantidad de numeros ingresados: " + cantidad);
        System.out.println("Suma total: " + suma);
        
        entrada.close();
    }
}
