package Fichas.FichaPratica05;

import java.util.Scanner;

public class ex11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        int matriz[][] = new int[3][3];

        // Ler valores
        for (int linhas = 0; linhas < matriz.length; linhas++) {
            for (int colunas = 0; colunas < matriz[0].length; colunas++) {
                System.out.print("Digite um valor para a matriz ["+linhas+"]["+colunas+"]: ");
                matriz[linhas][colunas] = input.nextInt();
            }
        }

        // Inicializa as variáveis com o primeiro valor da matriz
        int numMaior = matriz[0][0];
        int numMenor = matriz[0][0];

        // Encontrar o menor e o maior
        for (int linhas = 0; linhas < matriz.length; linhas++) {
            for (int colunas = 0; colunas < matriz[0].length; colunas++) {
                if (matriz[linhas][colunas] > numMaior) {
                    numMaior = matriz[linhas][colunas];
                } else if (matriz[linhas][colunas] < numMenor) {
                    numMenor = matriz[linhas][colunas];
                }
            }
        }

        // Imprimir matriz
        for (int linhas = 0; linhas < matriz.length; linhas++) {
            for (int colunas = 0; colunas < matriz[0].length; colunas++) {
                System.out.print(matriz[linhas][colunas] + "\t | \t");
            }
            System.out.println();
        }
        System.out.print("Menor número é " + numMenor + " e maior número é " + numMaior);
    }
}
