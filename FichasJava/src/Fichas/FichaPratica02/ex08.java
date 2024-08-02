package Fichas.FichaPratica02;

import java.util.Scanner;

public class ex08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double nota1, nota2, nota3, mediaPonderada;

        System.out.print("Introduza a primeira nota: ");
        nota1 = input.nextDouble();

        System.out.print("Introduza a segunda nota: ");
        nota2 = input.nextDouble();;

        System.out.print("Introduza a terceira nota: ");
        nota3 = input.nextDouble();

        mediaPonderada = (nota1 * 25/100) + (nota2 * 35/100) + (nota3 * 40/100);

        if (mediaPonderada >= 9.5) {
            System.out.print("Sua média ponderada é de " + mediaPonderada + ". Você está aprovado!");
        } else {
            System.out.print("Sua média ponderada é de " + mediaPonderada + ". Você está reprovado!");
        }
    }
}
