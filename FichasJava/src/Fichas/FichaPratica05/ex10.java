package Fichas.FichaPratica05;

import java.util.Scanner;

public class ex10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Declarar matriz
        int[][] matriz = new int[3][5];

        // Declarar variável
        int numPesquisa;
        int cont = 0;

        // Ler valores de cada índice da matriz
        for (int linhas = 0; linhas < matriz.length; linhas++) {
            for (int colunas = 0; colunas < matriz[0].length; colunas++) {
                System.out.print("Insira na matriz[" + linhas + "][" + colunas + "]: ");
                matriz [linhas][colunas] = input.nextInt();
            }
        }

        System.out.println("Digite um número para pesquisar:");
        numPesquisa = input.nextInt();

        // Imprimir valores e verificar se número de pesquisa é igual ao da matriz
        for (int linhas = 0; linhas < matriz.length; linhas++) {
            for (int colunas = 0; colunas < matriz[0].length; colunas++) {
                System.out.print(matriz [linhas][colunas] + " ");
                if (numPesquisa == matriz [linhas][colunas]) {
                    cont = cont + 1;
                }
            }
            System.out.println();
        }
        System.out.print("Há " + cont + " posições com o número " + numPesquisa);
    }
}
