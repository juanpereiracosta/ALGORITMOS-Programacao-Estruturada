package Fichas.FichaPraticaExtraCiclos;

import java.util.Scanner;

public class ex06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num;
        int numMaior = 0;
        int numMenor = 0;

        System.out.print("Introduza um número: ");
        num = input.nextInt();

        numMaior = num;
        numMenor = num;

        while (num != 0) {
            System.out.print("Introduza um número: ");
            num = input.nextInt();
            if (num > numMaior && num != 0) {
                numMaior = num;
            }
            if (num < numMenor && num != 0) {
                numMenor = num;
            }
        }
        System.out.println("O maior número é " + numMaior + " e o menor número é " + numMenor);
    }
}
