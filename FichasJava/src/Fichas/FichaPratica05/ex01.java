package Fichas.FichaPratica05;

import java.util.Scanner;

public class ex01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Declarar o vetor
        int[] array = new int[10];

        // Ler o vetor
        for (int i = 0; i < array.length; i++) {
            System.out.println("Insira um número no array [" + i + "]: ");
            array[i] = input.nextInt();
        }

        // Imprimir vetor
        for (int i = 0; i < array.length; i++) {
            System.out.println("Array ["+ i +"] = " + array[i]);
        }
    }
}
