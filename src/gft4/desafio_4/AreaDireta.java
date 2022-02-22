package gft4.desafio_4;

//Desafio
//        Leia um caractere maiúsculo,
//        que indica uma operação que deve ser realizada e uma matriz M[12][12].
//        Em seguida, calcule e mostre a soma ou a média
//        considerando somente aqueles elementos que estão na área direita da matriz,
//        conforme ilustrado abaixo (área verde).
//
//Entrada
//        A primeira linha de entrada contem um único caractere Maiúsculo O ('S' ou 'M'),
//        indicando a operação (Soma ou Média) que deverá ser realizada com os elementos da matriz.
//        Seguem os 144 valores de ponto flutuante que compõem a matriz.
//
//Saída
//        Imprima o resultado solicitado (a soma ou média),
//        com 1 casa após o ponto decimal.
//
//Exemplo de Entrada	Exemplo de Saída
//        S                   111.4
//        1.0
//        330.0
//        -3.5
//        2.5
//        4.1
//        ...

import java.io.IOException;
import java.util.Scanner;

public class  AreaDireta {

    public static void main(String[] args) throws IOException {

        Scanner leitor = new Scanner(System.in);

        // ler instrução de soma (S) ou média(M)
        char tipo = leitor.next().toUpperCase().charAt(0);

        // inicializar soma e controlador de soma
        double soma = 0;
        int ctr = 13 ;

        // inicializar matriz quadrada de 144 elementos
        double[][] M = new double[12][12];

        for ( int l = 0 ; l <= 11 ; l++  ) {

            // atualiza posição a partir de qual coluna entra na soma
            if( l <= 5 ) ctr -= 1; // da coluna 1 a 5 vai aumentando quais elementos entra na soma
            if( l >= 7 ) ctr += 1; // da coluna 7 a seguir vai dimunuindo quais elementos entra na soma

            for (  int c = 0 ; c <= 11 ; c++ ) {
                M[l][c] = leitor.nextDouble();

                // somar itens que estejam dentro da faixa direita do quadrado
                // ctr ira controlar as colunas que tem elemento a ser somado
                // so entra na soma / media numeros a partir da linha 1
                // cujas colunas estejam tambem na área prevista
                if( l > 0 && c >= ctr ) {
                    soma += M[l][c];
                }
            }
        }

        // apresentar resultado
        if ( Character.compare(tipo , 'M') == 0  ) soma /= 30;
        System.out.println(String.format("%.1f", soma));

    }

}


//original
//        import java.io.IOException;
//        import java.util.Scanner;
//
//public class  AreaDireta {
//
//    public static void main(String[] args) throws IOException {
//        Scanner leitor = new Scanner(System.in);
//        double soma = 0;
//        char O = leitor.next().toUpperCase().charAt(0);
//        double[][] M = new double[12][12];
//        for (               ) {
//            for (                 ) {
//                M[i][j] = leitor.nextDouble();
//            }
//        }
//
//        for (                    ) {
//            for (                     ) {
//                if (                  ) soma += M[i][j];
//            }
//        }
//
//        if (                     ) soma /= 30;
//        System.out.println(String.format("%.1f", soma));
//    }
//
//}