package Fichas.FichaPratica02;

import java.util.Scanner;

public class ex15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1, num2, num3;

        System.out.print("Introduza o primeiro número: ");
        num1 = input.nextInt();
        String resposta;

        System.out.print("Introduza o segundo número: ");
        num2 = input.nextInt();

        System.out.print("Introduza o terceiro número: ");
        num3 = input.nextInt();

        System.out.println("Deseja ver a ordem crescente ou decrescente dos números digitados?");
        System.out.println("Crescente [C]");
        System.out.println("Descrescente [D]");
        System.out.println("Responda aqui: ");
        resposta = input.next();

        switch (resposta) {
            case "C":
                if (num1 < num2 && num1 < num3 && num2 < num3) {
                    System.out.print(num1 + ", " + num2 + ", " + num3);
                } else if (num2 < num1 && num2 < num3 && num1 < num3){
                    System.out.print(num2 + ", " + num1 + ", " + num3);
                } else if (num3 < num2 && num2 < num1) {
                    System.out.print(num3 + ", " + num2 + ", " + num1);
                } else if (num1 < num3 && num3 < num2) {
                    System.out.print(num1 + ", " + num3 + ", " + num2);
                } else if (num1 < num2 && num3 < num2 && num3 < num1) {
                    System.out.print(num3 + ", " + num1 + ", " + num2);
                } else {
                    System.out.print(num2 + ", " + num3 + ", " + num1);
                }
                  break;
            case "D":
                if (num1 > num2 && num1 > num3 && num2 > num3) {
                    System.out.print(num1 + ", " + num2 + ", " + num3);
                } else if (num2 > num1 && num2 > num3 && num1 > num3){
                    System.out.print(num2 + ", " + num1 + ", " + num3);
                } else if (num3 > num2 && num2 > num1) {
                    System.out.print(num3 + ", " + num2 + ", " + num1);
                } else if (num1 > num3 && num3 > num2) {
                    System.out.print(num1 + ", " + num3 + ", " + num2);
                } else if (num1 > num2 && num3 > num2 && num3 > num1) {
                    System.out.print(num3 + ", " + num1 + ", " + num2);
                } else {
                    System.out.print(num2 + ", " + num3 + ", " + num1);
                }
        }
    }
}
//321