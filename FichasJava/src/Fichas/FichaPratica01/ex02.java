package Fichas.FichaPratica01;

import java.util.Scanner;

public class ex02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Introduza um número: ");
        int num1 = input.nextInt();
        System.out.print("Introduza outro número: ");
        int num2 = input.nextInt();
        int soma = num1 + num2;
        int sub = num1 - num2;
        int mult = num1 * num2;
        int div = num1 / num2;
        System.out.println("Soma: " + soma);
        System.out.println("Subtração: " + sub);
        System.out.println("Multiplicação: " + mult);
        System.out.println("Divisão: " + div);
    }
}
