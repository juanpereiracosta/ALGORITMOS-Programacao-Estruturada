package Fichas.FichaPratica04;

import java.sql.SQLOutput;
import java.util.Scanner;

// Este é o exercício 4 da ficha 4 refeito

public class ex06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num;
        boolean primo = true;

        System.out.print("Introduza um número para saber se é primo: ");
        num = input.nextInt();

        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                primo = false;
            }
        }
        if (primo) {
            System.out.println("É primo");
        } else {
            System.out.println("Não é primo");
        }
    }
}
