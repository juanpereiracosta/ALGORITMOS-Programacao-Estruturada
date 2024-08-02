package Fichas.FichaPraticaExtraCiclos;

import java.util.Scanner;
/* Exercício criado por mim, não está em nenhuma ficha
Problema: solicitar uma quantidade indefinida de números ao utilizador
e mostrar se estão em ordem crescente ou decrescente */

public class ex12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Declarar variáveis
        int num;
        int ultimoNum;
        boolean crescente = true;

        //Inicializo a variável num
        System.out.print("Introduza um número [tecle 0 para sair]: ");
        num = input.nextInt();

        ultimoNum = num;

        while (num != 0) {
            System.out.print("Introduza um número [tecle 0 para sair]: ");
            num = input.nextInt();

            if (num < ultimoNum) {
                crescente = false;
            }
            ultimoNum = num;
        }
        if (crescente) {
            System.out.println("É crescente");
        } else {
            System.out.println("É decrescente");
        }
    }
}
