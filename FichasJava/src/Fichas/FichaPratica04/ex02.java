package Fichas.FichaPratica04;

import java.util.Scanner;

public class ex02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int opcao;

        do {
            System.out.println("Escolha a opção desejada: ");
            System.out.println("1");
            System.out.println("2");
            System.out.println("3");
            System.out.println("4");
            opcao = input.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Criar");
                    break;
                case 2:
                    System.out.println("Atualizar");
                    break;
                case 3:
                    System.out.println("Eliminar");
                    break;
                case 4:
                    System.out.println("Sair");
                    break;
                default:
                    System.out.println("Resposta inválida.");
            }
        } while (opcao != 4);

    }
}
