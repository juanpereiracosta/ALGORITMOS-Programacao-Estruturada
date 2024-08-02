package Fichas.FichaPratica04;

import java.util.Scanner;

// Este é o exercício 3 da ficha 4 refeito

public class ex05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int valorJogador1;
        int palpiteJogador2;
        int cont = 0;

        System.out.print("JOGADOR1: introduza um número entre 0 e 100: ");
        valorJogador1 = input.nextInt();

        if (valorJogador1 < 0 || valorJogador1 > 100) {
            System.out.println("Número inválido");
        }
            do {
                System.out.print("JOGADOR2: tente adivinhar o número do JOGADOR1: ");
                palpiteJogador2 = input.nextInt();
                cont = cont + 1;
                if (palpiteJogador2 > valorJogador1) {
                    System.out.println("Seu palpite é maior");
                } else if (palpiteJogador2 < valorJogador1) {
                    System.out.println("Seu palpite é menor");
                }
            } while (palpiteJogador2 != valorJogador1);
            System.out.println("Foram necessárias " + cont + " tentativas.");
    }
}
