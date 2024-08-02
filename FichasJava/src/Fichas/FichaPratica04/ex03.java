package Fichas.FichaPratica04;

import java.util.Scanner;

public class ex03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int palpiteJogador1, palpiteJogador2 ;

        int cont = 0;
        System.out.print("JOGADOR 1 dê um palpite entre 0 e 100: ");
        palpiteJogador1 = input.nextInt();
        if (palpiteJogador1 < 0 || palpiteJogador1 > 100) {
            System.out.println("Número inválido");
        } else {
            do {
                System.out.print("JOGADOR 2 tente adivinhar o palpite dado pelo JOGADOR 1: ");
                palpiteJogador2 = input.nextInt();
                cont = cont + 1;

                if (palpiteJogador2 < palpiteJogador1) {
                    System.out.println("Palpite do JOGADOR 1 é maior");
                } else if (palpiteJogador2 > palpiteJogador1) {
                    System.out.println("Palpite do JOGADOR 1 é menor");
                }
            } while(palpiteJogador2 != palpiteJogador1);
            System.out.println("ACERTOU!!!");
            System.out.println("Foram dados " + cont + " palpites pelo JOGADOR 2");
        }
    }
}


