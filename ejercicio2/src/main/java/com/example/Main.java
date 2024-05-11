package com.example;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        adivinarNumero(1, 100, 5);
    }

    // Método para calcular las deducciones
    public static void adivinarNumero(int min_numero, int max_numero, int max_intentos) {
        // Generar número aleatorio
        Random random = new Random();
        int numero_aleatorio = random.nextInt(max_numero - min_numero + 1) + min_numero;

        // Inicio del juego
        System.out.println("Comienza el juego. Adivina el número entre " + min_numero + " y " + max_numero + ".");

        // Bucle de adivinanzas
        for (int i = 1; i <= max_intentos; i++) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Introduce un número: ");
            int numero_usuario = scanner.nextInt();

            // Comprobar si el número es igual al número aleatorio
            if (numero_usuario == numero_aleatorio) {
                System.out.println("¡Felicidades! Has adivinado el número en " + i + " intentos.");
                break;
            } else {
                // Dar una pista al usuario
                if (numero_usuario > numero_aleatorio) {
                    System.out.println("El número es menor.");
                } else {
                    System.out.println("El número es mayor.");
                }
            }

            // Comprobar si se ha alcanzado el número máximo de intentos
            if (i == max_intentos) {
                System.out.println("Lo siento, no has adivinado el número. El número era " + numero_aleatorio + ".");
            }
        }
    }
}
