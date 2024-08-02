import java.util.Scanner;

public class ex11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double saldo, montante;

        System.out.print("Digite o saldo da sua conta: ");
        saldo = input.nextDouble();

        System.out.print("Digite o valor valor a movimentar: ");
        montante = input.nextDouble();

        if (saldo < montante) {
            System.out.print("Saldo insuficiente.");
            System.out.print(" Saldo atual: " + saldo);
        } else if (montante > 0){
            saldo = saldo + montante;
            System.out.print("Saldo atual: " + saldo);
        } else {
            saldo = saldo + montante;
            System.out.print("Saldo atual: " + saldo);
        }


        /*if (montante > 0) {
            saldo = saldo + montante;
            System.out.print("Saldo atual: " + saldo);
        } else if (montante > saldo && montante < 0){
            System.out.print("Saldo insuficiente");
            System.out.print("Saldo atual: " + saldo);
        } else {
            saldo = saldo + montante;
            System.out.print("Saldo atual: " + saldo);
        }
    }*/
}
}
