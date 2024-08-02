package Fichas.FichaPratica03;

import java.util.Scanner;

public class ex09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num = 0;
        int soma = 0;

        while (num != -1) {
            System.out.println("Introduza um número:");
            num = input.nextInt();
            if (num != -1) {
                soma = soma + num;
            }
        }
        System.out.println(soma);
    }
}
