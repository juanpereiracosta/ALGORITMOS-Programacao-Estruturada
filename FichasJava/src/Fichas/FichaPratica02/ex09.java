import java.util.Scanner;

//O enunciado pedia para mostrar o menor número, mas, sem querer, fiz para mostrar o maior

public class ex09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num1, num2, num3;

        System.out.print("Introduza o primeiro número: ");
        num1 = input.nextInt();

        System.out.print("Introduza o segundo número: ");
        num2 = input.nextInt();

        System.out.print("Introduza o terceiro número: ");
        num3 = input.nextInt();

        if (num1 > num2 && num1 > num3) {
            System.out.print(num1 + " é maior que " + num2 + " e " + num3);
        } else if (num2 > num1 && num2 > num3) {
            System.out.print(num2 + " é maior que " + num1 + " e " + num3);
        } else {
            System.out.print(num3 + " é maior que " + num1 + " e " + num2);
        }
    }
}
