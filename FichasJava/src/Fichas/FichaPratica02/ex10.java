package Fichas.FichaPratica02;

import java.util.Scanner;

public class ex10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double num1, num2, soma, sub, multi, div;
        String operacao;

        System.out.print("Introduza um número: ");
        num1 = input.nextDouble();

        System.out.print("Introduza outro número: ");
        num2 = input.nextDouble();

        System.out.println("Qual o peração deseja realizar entre eles?");
        operacao = input.next();

        soma = num1 + num2;
        sub = num1 - num2;
        multi = num1 * num2;
        div = num1 / num2;
        
        switch (operacao) {
            case "soma": System.out.print("A soma entre " + num1 + " e " + num2 + " é " + soma);
                         break;
            case "subtração": System.out.print("A subtração entre " + num1 + " e " + num2 + " é " + sub);
                         break;
            case "multiplicação": System.out.print("A multiplicação entre " + num1 + " e " + num2 + " é " + multi);
                         break;
            case "divisão": System.out.print("A divisão entre " + num1 + " e " + num2 + " é " + div);
        }
    }
}
