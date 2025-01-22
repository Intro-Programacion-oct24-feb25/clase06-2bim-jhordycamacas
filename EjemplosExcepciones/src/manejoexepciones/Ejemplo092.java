/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manejoexepciones;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Ejemplo092 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        boolean bandera = true;
        while (bandera) {
            try {

                System.out.println("Ingrese un pais que inicie con una consonante: ");
                String valor1 = entrada.nextLine();
                String mayus = valor1.toUpperCase();
                char letra = mayus.charAt(0);
                String valor2 = String.valueOf(letra);

                if (valor2.equals("A") || valor2.equals("E") || valor2.equals("I")
                        || valor2.equals("O") || valor2.equals("U")) {

                    throw new Exception("Dato ingresado incorrecto, pais debe "
                            + "empezar con consonante");

                }
                System.out.printf("Pais: %s\n", valor1);
                bandera = false;
            } catch (Exception e) {
                System.out.printf("Ocurrió una excepción %s\n", e);

            }

        }

    }
}
