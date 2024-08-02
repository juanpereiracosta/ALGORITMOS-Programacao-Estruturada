package Fichas.FichaPratica05;

import java.util.Scanner;

public class ex12 {
    public static void main(String[] args) {

        // Import Scanner
        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        int[] vetor1 = new int[10];
        int[] vetor2 = new int[10];
        int[][] matriz = new int[10][2];

        // Ler vetor1
        for (int i = 0; i < vetor1.length; i++) {
            System.out.print("Insira no Vetor1[" + i + "]: ");
            vetor1[i] = input.nextInt();
        }

        // Ler vetor2
        for (int i = 0; i < vetor2.length; i++) {
            System.out.print("Insira no Vetor2[" + i + "]: ");
            vetor2[i] = input.nextInt();
        }

        // Preencher a matriz com os valores dos vetores
        for (int linha = 0; linha < matriz.length; linha++) {
           matriz[linha][0] = vetor1[linha];
           matriz[linha][1] = vetor2[linha];
        }

        // Imprimir matriz
        for (int linha = 0; linha < matriz.length; linha++) {
            for (int coluna = 0; coluna < matriz[0].length; coluna++) {
                System.out.print(matriz[linha][coluna] + "\t|\t");
            }
            System.out.println();
        }

    }
}
