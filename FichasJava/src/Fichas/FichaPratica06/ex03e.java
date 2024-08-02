package Fichas.FichaPratica06;

import java.util.Scanner;

public class ex03e {

    public static boolean numTriangular(int num) {
        int somaConsecutivos = 0;
        boolean triangular = true;

        for (int i = 1; i < num; i++) {
            somaConsecutivos = somaConsecutivos + i;
            if (somaConsecutivos != num) {
                triangular = false;
            }
        }
        if (triangular) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numeroLido;
        int somaConsecutivos = 0;
        boolean triangular = true;

        System.out.print("Introduza um número inteiro: ");
        numeroLido = input.nextInt();

        if (numTriangular(numeroLido)) {
            System.out.print("É triangular");
        } else {
            System.out.print("Não é trinagular");
        }
    }
}

