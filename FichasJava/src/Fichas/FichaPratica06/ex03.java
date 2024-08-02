package Fichas.FichaPratica06;

import java.util.Scanner;

public class ex03 {
    public static boolean par (int num) {
        if (num % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num;
        System.out.print("Digite um número: " );
        num = input.nextInt();
        
    }
}
