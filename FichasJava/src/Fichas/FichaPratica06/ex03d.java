package Fichas.FichaPratica06;

import java.util.Scanner;

//
public class ex03d {

    /* Os números perfeitos são iguais à soma dos seus divisores: 6 pode ser dividido
    por 1, 2 e 3 e, quando soma esses números, o resultado é 6 */

    public static boolean numPerfeito(int num) {
        int somaDivisores = 0;
        boolean perfeito = true;

        for (int i = 1; i < num; i++) {
            if ((num % i) == 0) {
                somaDivisores = somaDivisores + i;
            }
        }
        if (somaDivisores != num) {
            perfeito = false;
        }

        if (perfeito) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int numeroLido;

        System.out.print("Introduza um número inteiro: ");
        numeroLido = input.nextInt();

        if (numPerfeito(numeroLido)) {
            System.out.print("É perfeito");
        } else {
            System.out.println("Náo é perfeito");
        }
    }
}
