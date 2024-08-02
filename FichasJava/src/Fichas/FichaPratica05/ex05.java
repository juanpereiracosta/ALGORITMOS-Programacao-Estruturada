package Fichas.FichaPratica05;

import java.util.Scanner;

public class ex05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Declarar array
        double[] array = new double[4];

        // Declarar variável soma
        double soma = 0;

        //Ler array
        for (int i = 0; i < array.length; i++) {
            System.out.print("Digite o valor: ");
            array[i] = input.nextDouble();
            soma = soma + array[i];
        }

        //Calcular e mostrar a média
        double media = soma / array.length;
        System.out.print("A média é: " + media);
    }
}
