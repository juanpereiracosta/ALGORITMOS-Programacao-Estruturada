package Fichas.FichaPratica07;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class ex03 {

    public static void lerEGravarFicheiro(String caminhoOrigem, String caminhoDestino) throws FileNotFoundException {

        // Criei um scanner para ler o que for escrito no ficheiro
        Scanner scannerFicheiro = new Scanner(new File(caminhoOrigem));

        // Criei outro ficheiro
        File file2 = new File(caminhoDestino);

        // Criei uma variável para exibir o conteúdo no novo ficheiro criado
        PrintWriter maquinaEscrever = new PrintWriter(file2);

        // Enquanto existir uma linha de conteúdo no ficheiro, exibo esta linha na tela
        while (scannerFicheiro.hasNextLine()){
            String linhaAtual = scannerFicheiro.nextLine();
            maquinaEscrever.println(linhaAtual);
        }
        maquinaEscrever.close();
    }

    public static void main(String[] args) throws FileNotFoundException {
        lerEGravarFicheiro("FicheirosFicha07/exercicio03.txt","FicheirosFicha07/exercicio03-ficheiroconteudo.txt");
    }
}
