package Fichas.FichaPratica02;

import java.util.Scanner;

public class ex13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int horas, minutos;

        System.out.print("Introduza as horas: ");
        horas = input.nextInt();

        System.out.print("Introduza os minutos: ");
        minutos = input.nextInt();

        if (horas > 12) {
            horas = horas - 12;
            System.out.print(horas + ":" + minutos + " PM");
        } else {
            System.out.print(horas + ":" + minutos + " AM");
        }
    }
}
