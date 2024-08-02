package Fichas.FichaPratica06;

import java.util.Scanner;

public class ex03a {
    public static boolean numParImpar(int num){
        if (num % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite um número para saber se ele é par: ");
        int numLido = input.nextInt();

        if (numParImpar(numLido)) {
            System.out.print("É par");
        } else {
            System.out.print("É ímpar");
        }
    }
}
