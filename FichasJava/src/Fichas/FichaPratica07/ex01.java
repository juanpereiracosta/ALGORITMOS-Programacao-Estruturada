package Fichas.FichaPratica07;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ex01 {

    /*
    Criei uma função do tipo void chamada imprimirFicheiro que tem como parâmetro uma
    String chamada path que vai armazenar o caminho até o ficheiro a ser lido. Incluí
    também uma instrução throws FileNotFoundException para o caso de o ficheiro não existir
     */
    public static void imprimirFicheiro(String path) throws FileNotFoundException {

        // Criei um Scanner chamado scannerFicheiro para ler o ficheiro
        Scanner scannerFicheiro = new Scanner(new File(path));

        /*
        Enquanto o scanner criado para ler o ficheiro tiver uma linha para ler, armazene essa
        linha na variável linhaAtual e exiba ela no System.out.println.
        */
        while(scannerFicheiro.hasNext()) {
            String linhaAtual = scannerFicheiro.nextLine();
            System.out.println(linhaAtual);
        }
    }

    // No main, invoco a função e exbido o conteúdo do ficheiro
    public static void main(String[] args) throws FileNotFoundException {
        imprimirFicheiro("FicheirosFicha07/exercicio_01.txt");
    }
}
