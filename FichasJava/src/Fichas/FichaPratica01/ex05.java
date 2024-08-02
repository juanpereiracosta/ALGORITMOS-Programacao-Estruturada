package Fichas.FichaPratica01;

import java.util.Scanner;

public class ex05 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite a primeira nota:");
        int nota1 = input.nextInt();
        System.out.println("Digite a segunda nota:");
        int nota2 = input.nextInt();
        System.out.println("Digite a terceira nota:");
        int nota3 = input.nextInt();
        int media = (nota1 + nota2 + nota3) / 3;
        System.out.println("A média é " + media);
        int mediaPonderada = nota1 * 0 + nota2 * 0 + nota3 * 0 / 3;
        System.out.println("A média ponderada é " + mediaPonderada);
    }
}
