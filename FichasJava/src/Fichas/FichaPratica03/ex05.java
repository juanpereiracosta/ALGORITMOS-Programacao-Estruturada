package Fichas.FichaPratica03;

import java.util.Scanner;

public class ex05 {
    public static void main(String[] args) {
        Scanner input =  new Scanner(System.in);

        int numIntroduzido;
        String mensagem;

        System.out.print("Introduza um número:");
        numIntroduzido = input.nextInt();
        input.nextLine();
        System.out.print("Introduza uma mensagem: ");
        mensagem = input.nextLine();
        int num = 1;
        while (num <= numIntroduzido){
            System.out.println(mensagem);
            num = num + 1;
        }
    }
}
