package Fichas.FichaPratica01;

import java.util.Scanner;

public class ex01 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Insira um número: ");
        int num1 = input.nextInt();
        System.out.print("Insira um número: ");
        int num2 = input.nextInt();
        int soma = num1 + num2;
        System.out.println("Soma:" + soma);
    }
}
