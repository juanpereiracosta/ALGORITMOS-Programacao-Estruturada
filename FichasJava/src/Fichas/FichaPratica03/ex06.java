package Fichas.FichaPratica03;

import java.util.Scanner;
public class ex06 {
    public static void main(String[] args) {
        Scanner input =  new Scanner(System.in);
        int num, numInicio, numFim;

        System.out.print("Introduza um número:");
        numInicio = input.nextInt();

        System.out.print("Introduza outro número:");
        numFim = input.nextInt();

        num = numInicio + 1;
        while (num <= numFim) {
            System.out.println(num);
            num = num + 1;
        }
    }
}
