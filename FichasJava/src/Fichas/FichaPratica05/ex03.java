package Fichas.FichaPratica05;

import java.util.Scanner;

public class ex03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Declarar vetor
        int array[] = new int[10];

        //Declarar variáveis
        int arrayMaior = 0;

        //Ler vetor
        for (int i = 0; i < array.length; i++) {
            System.out.print("Digite o valor do array ["+i+"]: ");
            array[i] = input.nextInt();

            /* Se o valor do array mais recente for maior do que o valor do array maior
            (que foi inicializado com zero), o array maior passa a ser o array mais recente */
            if (array[i] > arrayMaior) {
                arrayMaior = array[i];
            }
        }
        System.out.println("Maior array digitado: " + arrayMaior);
    }
}
