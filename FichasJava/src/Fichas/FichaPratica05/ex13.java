package Fichas.FichaPratica05;

import java.util.Scanner;

public class ex13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        int[][] matriz = new int[4][4];
        int soma = 0;

        // Ler valores da matriz
        for (int linhas = 0; linhas < matriz.length; linhas++) {
            for (int colunas = 0; colunas < matriz[0].length; colunas++) {
                System.out.print("Digite o valor da matriz ["+linhas+"]["+colunas+"]: ");
                matriz[linhas][colunas] = input.nextInt();
            }
        }

        // Somar elementos
        for (int linhas = 0; linhas < matriz.length; linhas++) {
            for (int colunas = 0; colunas < matriz[0].length; colunas++) {
                if (linhas == colunas) {
                    soma = soma + matriz[linhas][colunas];
                }
            }
        }
        System.out.print("A soma dos elementos da diagonal é de " + soma);
    }
}
