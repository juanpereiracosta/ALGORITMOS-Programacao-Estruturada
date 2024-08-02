package Fichas.FichaPratica04;

import java.util.Scanner;

public class ex04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num;
        Boolean primo = true;

        System.out.print("Introduza um número: ");
        num = input.nextInt();

        if (num <= 1) {
            primo = false;
        }

        //descobrir quais números entre 2 e o número menos 1 são divisíveis

        for (int divisor = 2; divisor < num ; divisor++) {
            if (num % divisor == 0) {
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
