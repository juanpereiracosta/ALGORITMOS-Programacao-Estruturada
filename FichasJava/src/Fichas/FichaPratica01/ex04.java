package Fichas.FichaPratica01;

import java.util.Scanner;

public class ex04 {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite o valor do raio:");
        double raio = input.nextDouble();
        double pi = 3.14;
        double area = pi * raio * raio;
        System.out.print("A área da circunferência é " + area);
    }
}
