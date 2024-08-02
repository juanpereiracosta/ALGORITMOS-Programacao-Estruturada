package Fichas.FichaPratica06;

import java.util.Scanner;

public class ex03c {

    public static boolean numPrimo(int num) {
        boolean primo = true;

        for (int i = 3; i < num; i++) {
            if (num % i == 0) {
                primo = false;
            }
        }

        if(primo) {
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

        if (numPrimo(numeroLido)){
            System.out.print("É primo");
        } else {
            System.out.print("Não é primo");
        }
    }
}


