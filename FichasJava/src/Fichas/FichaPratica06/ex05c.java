package Fichas.FichaPratica06;

import java.util.Scanner;

public class ex05c {
    public static boolean crescente(int[] array) {
        boolean crescenteVar = true;
        int  numAnterior = array[0];

        for (int i = 1; i < array.length; i++) {
            numAnterior = array[i - 1];
            if (array[i] < numAnterior) {
                crescenteVar = false;
            }
        }
        if (crescenteVar) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] array = new int[4];

        for (int i = 1; i < array.length; i++) {
            System.out.print("Introduza o valor do array: ");
            array[i] = input.nextInt();
        }
        if (crescente(array)) {
            System.out.println("Ordem crescente");
        } else {
            System.out.println("Ordem descrescente");
        }
    }
}
