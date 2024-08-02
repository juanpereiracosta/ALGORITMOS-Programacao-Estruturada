package Fichas.FichaPratica06;

import java.util.Scanner;

public class ex03b {
    public static boolean numPositivo(int num) {
        if (num > 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int numLido;

        System.out.print("Introduza um número: ");
        numLido = input.nextInt();

        if (numPositivo(numLido)) {
            System.out.print("É positivo");
        } else {
            System.out.print("É negativo");
        }
    }
}
