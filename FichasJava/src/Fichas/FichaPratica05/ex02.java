package Fichas.FichaPratica05;

import java.util.Scanner;

public class ex02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Declarar o vetor
        int[] comissoes = new int[12];

        // Declarar variável
        int soma = 0;

        // Ler o vetor
        for (int i = 0; i < comissoes.length; i++) {
            System.out.print("Digite o valor da comissão: ");
            comissoes[i] = input.nextInt();
            soma = soma + comissoes[i];
        }
        System.out.print("Total anual: " + soma);
    }
}
