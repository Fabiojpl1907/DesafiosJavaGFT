package gft.desafios_4;

import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Objects;
import java.util.Scanner;

public class Diagonal{

    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);

        float soma = 0;
        int contador = 0;

        //  apresentar resultado da soma ou média , com uma casa decimal
        DecimalFormat df = new DecimalFormat("##0.0");

        // definir matriz de n 12 linhas x 12 colunas
        Float[][] matrix = new Float[12][12];

        // ler tipo de ação Soma ou media
        String acao = leitor.next();

        // ler os 144 valores recebidos
        for( int linha = 0 ; linha <= 11; ++linha ){
            for ( int coluna = 0 ; coluna <=11; ++coluna){
                matrix[linha][coluna] = leitor.nextFloat();
            }
        }

        // somar elementos
        // contar quantos elementos foram somados

        for(int linha = 0; linha <= 10 ; ++linha ){
            for( int coluna = linha+1; coluna <= 11; ++coluna ){
                soma += matrix[linha][coluna];
                contador++;
            }
        }

        //  apresentar resultado da soma ou média , com uma casa decimal
        if(Objects.equals(acao, "S")) System.out.println(df.format(soma));
        else System.out.println(df.format(soma/contador));
    }
	
}