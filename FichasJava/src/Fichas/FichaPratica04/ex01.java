package Fichas.FichaPratica04;

import java.util.Scanner;

public class ex01 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int num1, num2, resultado;
        String opcao;
        String sair;

        do {
            System.out.print("Introduza um número: ");
            num1 = input.nextInt();

            System.out.print("Introduza outro número: ");
            num2 = input.nextInt();

            System.out.println("Escolha uma opção;");
            System.out.println("[+] soma");
            System.out.println("[-] subtração");
            System.out.println("[*] multiplicação");
            System.out.println("[/] divisão");
            System.out.println("[s] sair");
            opcao = input.next();

            switch (opcao) {
                case "+":
                    resultado = num1 + num2;
                    System.out.println("A soma entre " + num1 + " e " + num2 + " é " + resultado);
                    break;
                case "-":
                    resultado = num1 - num2;
                    System.out.println("A subtração entre " + num1 + " e " + num2 + " é " + resultado);
                    break;
                case "*":
                    resultado = num1 * num2;
                    System.out.println("A multiplicão entre " + num1 + " e " + num2 + " é " + resultado);
                    break;
                case "/":
                    resultado = num1 / num2;
                    System.out.println("A divisão entre " + num1 + " e " + num2 + " é " + resultado);
                    break;
            }
            System.out.println("Quer continuar?");
            System.out.println("sim");
            System.out.println("não");
            sair = input.next();
        } while (!sair.equals("não"));
    }
}
