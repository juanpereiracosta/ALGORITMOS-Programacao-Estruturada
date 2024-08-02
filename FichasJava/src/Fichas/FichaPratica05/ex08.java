package Fichas.FichaPratica05;

import java.util.Scanner;

public class ex08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Declarar a matriz 3x3
        int[][] matriz = new int[3][3];

        // Ler 9 números inteiros do utilizador e adicioná-los à matriz
        System.out.println("Digite 9 números inteiros da matriz");

        for (int linha = 0; linha < matriz.length; linha++) {
            for (int coluna = 0; coluna < matriz[0].length; coluna++) {
                System.out.print("Valor matriz ["+linha+"]["+coluna+"]: " );
                matriz[linha][coluna] = input.nextInt();
            }
        }

        // Imprimir a matriz no formato desejado
        for (int linha = 0; linha < matriz.length; linha++) {
            for (int coluna = 0; coluna < matriz[0].length; coluna++) {
                System.out.print(matriz[linha][coluna] + "\t | \t");
            }
            System.out.println();
        }
    }
}
