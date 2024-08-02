package Fichas.FichaPratica07;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class ex04 {
    // Criei a função void com um parâmetro para encontrar o ficheiro e outro parâmetro com o conteúdo do ficheiro
    public static void lerFicheiroCSV(String path) throws FileNotFoundException {

        // Criei um scanner para armazenar o conteudo do ficheiro
        Scanner scannerFicheiro = new Scanner(new File(path));

        // Enquanto existir uma linha de conteúdo no ficheiro, exibo esta linha na tela
        while (scannerFicheiro.hasNextLine()){
            String linhaAtual = scannerFicheiro.nextLine();
            System.out.println(linhaAtual);
        }
    }

    // Invoco a função no main para que seja exibido o conteudo do ficheiro
    public static void main(String[] args) throws FileNotFoundException {
        lerFicheiroCSV("FicheirosFicha07/exercicio04.csv");
    }
}
