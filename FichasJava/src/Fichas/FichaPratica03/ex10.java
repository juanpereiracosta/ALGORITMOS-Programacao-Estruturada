package Fichas.FichaPratica03;

import java.util.Scanner;

public class ex10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int numLido;
        int num = 2;

        System.out.print("Introduza um número maior que 2: ");
        numLido = input.nextInt();
        if (numLido > 2) {
            while(num <= numLido) {
                System.out.println(num);
                num = num + 2;
            }
        } else {
            System.out.print("Número inválido");
        }


    }
}
