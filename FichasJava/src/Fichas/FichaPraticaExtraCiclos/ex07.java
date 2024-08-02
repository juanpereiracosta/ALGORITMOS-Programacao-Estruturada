package Fichas.FichaPraticaExtraCiclos;

import java.util.Scanner;

public class ex07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num = 1;
        int contNegativos = 0;
        int contPositivos = 0;

        while (num!= 0) {
            System.out.print("Introduza um número: ");
            num = input.nextInt();
            if (num < 0) {
                contNegativos++;
            } else if (num != 0){
                contPositivos++;
            }
        }
        System.out.println("Foram digitados " + contNegativos + " negativos e " + contPositivos + " positivos");
    }
}
