package FichaPraticaExtraCiclos;

public class Ex04B {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {         // Primeiro ciclo para as linhas
            for (int j = 1; j <= i; j++) {     // Segundo ciclo para os asteriscos
                System.out.print("*");
            }
            System.out.println();  // Pula para a próxima linha
        }
    }
}
