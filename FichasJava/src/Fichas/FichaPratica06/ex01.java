package Fichas.FichaPratica06;

import java.util.Scanner;

public class ex01 {
    // Criar função com código a ser executado no main
    public static void fazerBarulho(String animal){

            switch (animal) {
                case "cao":
                case "cão":
                    System.out.println("Au au au ");
                    break;

                case "gato":
                    System.out.println("Miau");
                    break;

                case "peixe":
                    System.out.println("Glub glub glub");
                    break;

                case "vaca":
                    System.out.println("Muuuuu");
                    break;

                case "porco":
                    System.out.println("Oinc oinc");
                    break;

                default:
                    System.out.println("Barulho estranho");
                    break;
            }
        }

        public static void main (String[] args) {
            Scanner input = new Scanner(System.in);

            String animalEscolhido;


                System.out.print("Introduz um animal: ");
                animalEscolhido = input.next();

                fazerBarulho(animalEscolhido);

    }
}
