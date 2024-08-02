package Fichas.FichaPratica03;

import java.sql.SQLOutput;
import java.util.Scanner;

public class ex08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num, numAntes,numDepois;
        System.out.println("Introduza um número: ");
        num = input.nextInt();

        numAntes = num - 5;
        numDepois = num + 5;

        while (numAntes < num || numDepois > num) {
            System.out.println(numAntes);
             numAntes = numAntes + 1;
            System.out.println(numDepois);
            numDepois = numDepois - 1;
        }
    }
}
