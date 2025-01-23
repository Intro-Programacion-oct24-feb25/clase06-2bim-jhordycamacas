/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package manejoexepciones;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author utpl
 */
public class Ejemplo12 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese cuantas operaciones quiere realizar");
        int valor = entrada.nextInt();
        int[] resultados = new int[valor];
        boolean bandera = true;
        while (bandera) {
            try {
                for (int i = 0; i < resultados.length; i++) {
                    System.out.println("Ingrese valor 1");
                    int valor1 = entrada.nextInt();
                    System.out.println("Ingrese valor 2");
                    int valor2 = entrada.nextInt();

                    int resultado = valor1 / valor2;

                    resultados[i] = resultado;
                }
                bandera = false;

            } catch (InputMismatchException inputMismatchException) {
                System.out.printf("Existe un error de tipo %s\n",
                        inputMismatchException);
                entrada.nextLine();
            } catch (ArithmeticException arithmeticException) {
                // enviar un correo programa
                System.out.println("Lo sentimos hay un error");
                System.out.printf("De tipo %s\n", arithmeticException);

            }

        }
        for (int i = 0; i < resultados.length; i++) {
            System.out.printf("%d\n", resultados[i]);
        }
        /*Realizar un proceso repetitivo que permita realizar la división de 
        números ingresados por teclado; el resultado de cada división debe ir 
        almacenandose en cada posición del arreglo. Considerar las excepciones
        posibles*/
        //RECORDAR-Hacer sin el for en casa
        //Los catch no vuelven a donde los llamaron, siguen ejecutando las 
        //siguientes lineas de codigo
    }
}
