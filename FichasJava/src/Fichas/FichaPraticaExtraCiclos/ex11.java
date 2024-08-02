package Fichas.FichaPraticaExtraCiclos;

import java.util.Scanner;
/*Exercício criado por mim, não está em nenhuma ficha
Problema: solicitar uma quantidade indefinida de números ao utilizador
e mostrar o maior e menor números digitados */

public class ex11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Declarar variáveis
        int num;
        int numMaior = 0;
        int numMenor = 0;

        //Inicializo a variável num
        System.out.print("Introduza um número [tecle 0 para sair]: ");
        num = input.nextInt();

        // numMaior e numMenor se tornam o primeiro número digitado, já que o loop ainda não começou
       numMaior = num;
       numMenor = num;

        while (num != 0) {
            System.out.print("Introduza um número [tecle 0 para sair]: ");
            num = input.nextInt();

            // Se o número digitado for MAIOR que o anterior, é porque o número maior é ele
            if (num > numMaior && num != 0) {
                numMaior = num;
            }
            // Se o número digitado for MENOR que o anterior, é porque o número menor é ele
            else if (num < numMenor && num != 0) {
                numMenor = num;
            }
        }
        System.out.println("Menor: " + numMenor);
        System.out.println("Maior: " + numMaior);
    }
}
