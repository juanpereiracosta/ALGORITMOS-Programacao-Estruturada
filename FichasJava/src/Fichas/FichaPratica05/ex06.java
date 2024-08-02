package Fichas.FichaPratica05;

import java.util.Scanner;

public class ex06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        int[] array= new int[5];
        boolean crescente = true;

        // Ler primeiro valor do vetor fora do loop
        System.out.print("Digite o valor: ");
        array[0] = input.nextInt();

        // Ler restante dos valores e verificar se é crescente
        for (int i = 1; i < array.length; i++) {
            System.out.print("Digite o valor: ");
            array[i] = input.nextInt();
            if (array[i] <= array [(i - 1)]){
                crescente = false;
            }
        }

        // Mostrar se é crescente ou decrescente
        if (crescente == true) {
            System.out.println("Crescente");
        }

        if (crescente == false) {
            System.out.println("Decrescente");
        }
    }
}
