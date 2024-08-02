package Fichas.FichaPratica03;

import java.util.Scanner;

public class ex11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int limite, salto;
        int num = 0;

        System.out.print("Introduza um limite: ");
        limite = input.nextInt();

        System.out.print("Introduza um salto: ");
        salto = input.nextInt();

        while (num <= limite){
            System.out.println(num);
            num = num + salto;
        }
    }
}
