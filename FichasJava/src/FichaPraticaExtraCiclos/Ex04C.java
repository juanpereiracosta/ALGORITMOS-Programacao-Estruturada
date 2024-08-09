package FichaPraticaExtraCiclos;

public class Ex04C {
    public static void main(String[] args) {

        // Número de linhas
        for (int i = 1; i <= 5; i++) {

            // Imprimir espaços
            for (int j = 1; j <= 5 - i; j++) {
                System.out.print(" ");
            }

            // Imprimir asteriscos
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            // Continuar com asteriscos
            for (int j = 1; j < i; j++) {
                System.out.print("*");
            }

            // Pula para a próxima linha
            System.out.println();
        }
    }
}
