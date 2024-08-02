package Fichas.FichaPratica06;

import java.util.Scanner;

public class ex05a {

    public static int maior(int[] array) {
        int numMaior;
        numMaior = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] > numMaior) {
                numMaior = array[i];
            }
        }
        return numMaior;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[]array = new int[4];

        for (int i = 0; i < array.length; i++) {
            System.out.print("Introduza o valor do array: ");
            array[i] = input.nextInt();
        }
        System.out.print("Maior número: " + maior(array));
    }
}
