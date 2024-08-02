package Fichas.FichaPratica03;

import java.util.Scanner;
public class ex07 {
        public static void main(String[] args) {
        Scanner input =  new Scanner(System.in);

        int count = 1;
        int soma = 0;

        while (count <= 100) {
            System.out.println(count);
            soma = soma + count;
            count = count +1;
        }
        System.out.print("Somatório: " + soma);
    }
}
