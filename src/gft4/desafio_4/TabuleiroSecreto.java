package gft4.desafio_4;

//Desafio
//        O senhor Milli, morador da cidade Petland,
//        é o famoso proprietário da maior fábrica de jogos de tabuleiros do mundo.
//
//        Recentemente, ele teve a ideia de lançar um novo jogo exclusivo de tabuleiro,
//        que ele apelidou de Tabuleiro da Frequência.
//
//        O jogo ocorre da seguinte forma.
//        Inicialmente, um tabuleiro com dimensões N × N é dado contendo apenas 0’s.
//        Depois disso, Q operações são propostas, podendo ser de 4 tipos:
//
//        1 X R: Atribuir o valor R a todos os números da linha X;
//
//        2 X R: Atribuir o valor R a todos os números da coluna X;
//
//        3 X: Imprimir o valor mais frequente na linha X;
//
//        4 X: Imprimir o valor mais frequente da coluna X.
//
//        Milli não é muito bom com computadores, mas é bastante preguiçoso.
//        Sabendo que você é um dos melhores programadores do mundo,
//        ele precisa sua ajuda para resolver este problema.
//
//        Entrada
//        A primeira linha da entrada é composta por dois inteiros N e Q (1 ≤ N, Q ≤ 105),
//        representando,
//        respectivamente, o tamanho do tabuleiro e a quantidade de operações.
//
//        As próximas Q linhas da entrada vão conter as Q operações.
//        O primeiro inteiro de cada linha vai indicar o tipo da operação.
//        Caso seja 1 ou 2, será seguido por mais dois inteiros X (1 ≤ X ≤ N) e R (0 ≤ R ≤ 50).
//        Caso seja 3 ou 4, será seguido por apenas mais um inteiro X.
//
//        Saída
//        Para cada operação do tipo 3 ou 4,
//        seu programa deve produzir uma linha,
//        contendo o valor da resposta correspondente.

//        Se uma linha ou coluna tiver dois ou mais valores que se repetem o mesmo número de vezes,
//        você deve imprimir o maior deles.

//        Por exemplo, se uma linha tem os valores [5,7,7,2,5,2,1,3],
//        tanto o 2, 5 e 7 se repetem duas vezes, então a resposta será 7, pois é o maior deles.
//
// Exemplo de Entrada
// 2 4 - tabuleiro 2x2 e 4 operaçoes
//
// 1 1 1  - operação 1  - colocar na linha 1 o valor 1
//
// 2 2 2 - operação 2  - colocar na coluna 2 o valor 2
//
// 3 1   - operação 3 - imprimir o valor mais frequente na linha 1
//
// 3 2   - operação 4 - impimir o valor mais frequente na linha 2
// Exemplo de saida
//2
//2


// Exemplo de Entrada
//        3 6  - tabuleiro 3x3  - 6 operações
//
//        1 1 2 - operação 1   colocar na linha 1 o valor 2
//
//        1 2 3 - operação 2 -   colocar na linha 2 o valor 3
//
//        1 3 4  - operação 3   colocar na linha 3 o valor 4
//
//        4 3  - operação 4 - Imprimir o valor mais frequente da coluna 3
//
//        1 3 0 - peração 5 - colocar na linha 3 o valor 0
//
//        4 3  - operação 6 - - Imprimir o valor mais frequente da coluna 3
// Exemplo de saida
//4
//3

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class TabuleiroSecreto {
    public static void main(String[] args) throws IOException {

        // ler a linha
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // quebrar a linha lida em 2 string com espaço como separador
        String[] nq = br.readLine().split(" ");

        // definir variaveis para
        // tamanho do tabuleiro e quantidade de operações
        // a partir da string nq
        int dimTabuleiro = Integer.parseInt(nq[0]);
        int numOp = Integer.parseInt(nq[1]);

        // definir matriz tabuleiro
        int[][] tabuleiro = new int[dimTabuleiro][dimTabuleiro];

        // preencher tabulçeiro com 0s
        for (int i = 0; i < dimTabuleiro ; i++) {
            for (int j = 0; j < dimTabuleiro; j++) {
                tabuleiro[i][j] = 0;
            }
        }

        // loop de leitura dos parametros de cada operação
        // e executar a ação proposta em cada operação
        for (int i = 0; i < numOp; i++) {

            // ler operações
            // quebrar a linha lida em string com espaço como separador
            String[] entradaOp = br.readLine().split(" ");

            //
            int operacao = Integer.parseInt(entradaOp[0]);
            int linha = Integer.parseInt(entradaOp[1]);
            int valor = 0;

            // se operação for 1 ou 2
            // pegar valor informado na posição 2 da  string
            if(entradaOp.length == 3) {
                valor = Integer.parseInt(entradaOp[2]);
            }

            // executar ação conforme operação indicada
            if( operacao == 1 ) linhaX(linha, valor, tabuleiro);
            if( operacao == 2 ) colunaX(linha, valor, tabuleiro);
            if( operacao == 3 ) imprimirFrequenteLinhaX(linha, tabuleiro);
            if( operacao == 4 ) imprimirFrequenteColunaX(linha, tabuleiro);
        }
    }
// Metodos de trataivas das operações ---------------------------------------------------------

    // preencher <linha> com o <valor> informado - operação 1
    private static void linhaX(int linha, int valor, int[][] tabuleiro) {
        // preencher todas as colunas do tabuleiro ( tabuleiro.length )
        // na linha e com valor indicado
        for (int i = 0; i < tabuleiro.length; i++) {
            tabuleiro[linha-1][i] = valor;
        }
    }
 //--------------------------------------------------------------------------------------------
    // preencher coluna X com o valor informado  - operação 2
    private static void colunaX(int col, int valor, int[][] tabuleiro) {

        // preencher todas as linhas do tabuleiro ( tabuleiro.length )
        // na coluna  e com valor indicado
        for (int i = 0; i < tabuleiro.length; i++) {
            tabuleiro[i][col-1] = valor;
        }
    }

//--------------------------------------------------------------------------------------------
/*     para operações 3 e 4 é utilizada a collection Map do tipo hasmap
     São usadas para armazenar, recuperar, manipular e comunicar dados/objetos armazenado
     hasmap não permite chaves duplicadas
     cada valor da linha / coluna do tabuleiro sera tratada com uma chava unica
     e um contador ira acumular a frequencia de ocorrencia deste valor
*/

//--------------------------------------------------------------------------------------------
    // apresentar valor mais frequente na linha - operação 3
    private static void imprimirFrequenteLinhaX(int linha, int[][] tabuleiro) {
        Map<Integer, Integer> map = new HashMap<>();
       //  inserir um mapeamento
        // a chave sera o valor contido em determinada posição do tabuleiro
        // e valor contem  contador da frequencia que a chave aparece
        map.put(tabuleiro[linha-1][0], 1);

        // mapear os valores da linha do tabuleiro
        for (int i = 1; i < tabuleiro.length; i++) {
            if(map.containsKey(tabuleiro[linha-1][i])){
                // havendo repetição de valor na linha do tabuleiro
                // ira incrementar o contador daquele  chave do mapa
                map.put(tabuleiro[linha-1][i], map.get(tabuleiro[linha-1][i])+1);
            } else {
                // se for um novo valor na linha do tabuleiro
                // criar nova chave no mapa e incia o contador
                map.put(tabuleiro[linha-1][i], 1);
            }
        }

        // verificar qual chave tem o maior valor ( contador de frequencia)
        var freq = map.entrySet().stream().max((entry1, entry2) -> entry1.getValue() > entry2.getValue() ? 1 : -1).get().getKey();

        // se 2 chaves ou mais  tiverem a mesma frequencia , qual chave é maior ( maior valor do tabuleiro )
        if(map.get(freq) == 1){
            freq = map.entrySet().stream().max((entry1, entry2) -> entry1.getKey() > entry2.getKey() ? 1 : -1).get().getKey();
        }

        System.out.println(freq);
    }

//--------------------------------------------------------------------------------------------
    // apresentar valor mais frequenta na coluna - operação 4
    private static void imprimirFrequenteColunaX(int col, int[][] tabuleiro) {
        Map<Integer, Integer> map = new HashMap<>();
        //  inserir um mapeamento
        // a chave sera o valor contido em determinada linha x coluna do tabuleiro
        // e valor contem  contador da frequencia que a chave aparece
        map.put(tabuleiro[0][col-1], 1);

        // mapear os valores da coluna do tabuleiro
        for (int i = 1; i < tabuleiro.length; i++) {
            if(map.containsKey(tabuleiro[i][col-1])){
                // havendo repetição de valor na coluna do tabuleiro
                // ira incrementar o contador daquele  chave do mapa
                map.put(tabuleiro[i][col-1], map.get(tabuleiro[i][col-1])+1);
            } else {
                // se for um novo valor na linha do tabuleiro
                // criar nova chave no mapa e incia o contador
                map.put(tabuleiro[i][col-1], 1);
            }
        }
        // verificar qual chave tem o maior valor ( contador de frequencia)
        var freq = map.entrySet().stream().max((entry1, entry2) -> entry1.getValue() > entry2.getValue() ? 1 : -1).get().getKey();

        // se 2 chaves ou mais  tiverem a mesma frequencia , qual chave é maior ( maior valor do tabuleiro )
        if(map.get(freq) == 1){
            freq = map.entrySet().stream().max((entry1, entry2) -> entry1.getKey() > entry2.getKey() ? 1 : -1).get().getKey();
        }

        System.out.println(freq);
    }
}