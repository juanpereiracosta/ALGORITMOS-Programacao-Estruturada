package Fichas.FichaPratica03;

import java.util.Scanner;

public class ex12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num;
        int count = 0;

        System.out.print("Introduza um número: ");
        num = input.nextInt();

        while (num >= 0) {
            System.out.print("Introduza um número: ");
            num = input.nextInt();
            //criar uma variável cont para cada ciclo
            if (num >= 0 && num <= 25){
                count = count + 1;
            }
        }
        System.out.println("0 a 25: " + count);
    }
}


