package Fichas.FichaPratica05;

import java.util.Scanner;

public class ex04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Declarar vetor
        int array[] = new int[4];

        //Ler vetor
        for (int i = 0; i < array.length; i++) {
            System.out.print("Digite o valor do array [" + i + "]: ");
            array[i] = input.nextInt();
        }

        //Declarar variável arrayMenor igual ao primeiro array digitado que é array[0]
        int arrayMenor = array[0];

        //Verificar qual o menor array
        for (int i = 0; i < array.length; i++) {
            if (array[i] < arrayMenor) {
                arrayMenor = array[i];
            }
        }
        System.out.println("Menor array digitado: " + arrayMenor);
    }
}

