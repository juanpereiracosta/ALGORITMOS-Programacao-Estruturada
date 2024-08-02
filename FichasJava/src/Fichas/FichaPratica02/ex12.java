package Fichas.FichaPratica02;

import java.util.Scanner;

public class ex12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int resposta;

        System.out.println("Escolha uma das opções:");
        System.out.println("Criar [1]");
        System.out.println("Atualizar [2]");
        System.out.println("Eliminar [3]");
        System.out.println("Sair [4]");
        System.out.print("Responda aqui: ");
        resposta = input.nextInt();

        switch (resposta) {
            case 1: System.out.print("Criar");
                      break;
            case 2: System.out.print("Atualizar");
                      break;
            case 3: System.out.print("Eliminar");
                      break;
            case 4: System.out.print(" ");
                      break;
            default: System.out.print("Opção inválida");
        }


    }
}
