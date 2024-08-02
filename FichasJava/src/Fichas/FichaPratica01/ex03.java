package Fichas.FichaPratica01;

import java.util.Scanner;

public class ex03 {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o valor da base:");
        int base = input.nextInt();
        System.out.println("Digite o valor da altura:");
        int altura = input.nextInt();
        int area = base * altura;
        System.out.println("A base é:" + area);
        System.out.println("Digite o valor do primeiro lado:");
        int ladoA = input.nextInt();
        System.out.println("Digite o valor do segundo lado:");
        int ladoB = input.nextInt();
        System.out.println("Digite o valor do terceiro lado:");
        int ladoC = input.nextInt();
        int perimetro = ladoA + ladoB + ladoC;
        System.out.println("O perímetro é: " + perimetro);
    }
}
