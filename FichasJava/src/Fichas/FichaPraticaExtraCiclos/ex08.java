package Fichas.FichaPraticaExtraCiclos;

import java.util.Scanner;

public class ex08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1, num2;
        int produto = 1;

        System.out.print("Introduza um número: ");
        num1 = input.nextInt();

        System.out.print("Introduza outro número: ");
        num2 = input.nextInt();

        //5 elevado ao cubo é 5 x 5 x 5

        for (int i = 0; i < num2; i++) {
            System.out.println(num1);
            produto = produto * num1;
        }
        System.out.println(produto);
    }
}
