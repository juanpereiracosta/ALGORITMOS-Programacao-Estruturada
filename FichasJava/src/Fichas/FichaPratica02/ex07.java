package Fichas.FichaPratica02;

import java.util.Scanner;

public class ex07 {
     public static void main(String[] args) {
     Scanner input = new Scanner(System.in);

     int numero;

     System.out.print("Introduza um número: ");
     numero = input.nextInt();

     if (numero % 2 == 0) {
          System.out.print(numero + " é par");
     } else {
          System.out.print(numero + " é ímpar");
     }
    }
}
