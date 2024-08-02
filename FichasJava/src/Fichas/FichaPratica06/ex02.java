package Fichas.FichaPratica06;

import java.util.Scanner;

public class ex02 {
    // Criar função com código a ser executado no main
    public static int lerPositivoInteiro() {
        Scanner input = new Scanner(System.in);
        int numeroLido;

        do {
            System.out.print("Introduza um número inteiro: ");
            numeroLido = input.nextInt();
        } while (numeroLido < 0);

        return numeroLido;
    }

    public static void linhaAsteriscos(int quantidadeAsteriscos) {
        for (int i = 0; i < quantidadeAsteriscos; i++) {
            System.out.print("*");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // A variável numeroUser vai armazenar o valor que a função lerPositivoInteiro() retornar
       int numeroUser = lerPositivoInteiro();
        linhaAsteriscos(numeroUser);
    }
}
