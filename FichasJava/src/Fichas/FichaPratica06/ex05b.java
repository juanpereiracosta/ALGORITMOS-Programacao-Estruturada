package Fichas.FichaPratica06;

import java.util.Scanner;

public class ex05b {

    public static int menor(int[] array) {
        int numMenor = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] < numMenor) {
                numMenor = array[i];
            }
        }
        return numMenor;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] array = new int[4];
        for (int i = 0; i < array.length; i++) {
            System.out.print("Introduza o valor do array: ");
            array[i] = input.nextInt();
        }
        System.out.println("Menor: " + menor(array));
    }
}
