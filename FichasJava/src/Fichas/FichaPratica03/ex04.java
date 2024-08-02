package Fichas.FichaPratica03;

import java.util.Scanner;
public class ex04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numIntroduzido, num;

        System.out.print("Introduza um número: ");
        numIntroduzido = input.nextInt();
        num = 0;
        while (num <= numIntroduzido) {
            System.out.println(num);
            num = num + 1;
        }
    }
}
