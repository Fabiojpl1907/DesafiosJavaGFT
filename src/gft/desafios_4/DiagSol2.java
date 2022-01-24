package gft.desafios_4;

import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Objects;
import java.util.Scanner;

public class DiagSol2 {
// solução  parte do principio que o resultado necessario
// é a soma ou media, dos valores recebidos
// e nao armazenar os valores recebidos

    public static void main(String[] args) throws IOException {

        Scanner leitor = new Scanner(System.in);

        float soma = 0;
        int contador = 0;
        float leitura;

        // controle de ciclo
        // e elemento a ser descartardo a cada ciclo
        int descartar = 1;
        int ciclo  = 1;

        //  apresentar resultado da soma ou média , com uma casa decimal
        DecimalFormat df = new DecimalFormat("##0.0");

        // ler tipo de ação Soma ou media
        String acao = leitor.next();

        // ler os 144 valores recebidos
        // serao analisados em grupos de 12
        for( int elemento = 1 ; elemento <= 144 ; ++elemento ){

            leitura = leitor.nextFloat();

            // se elemento estiver dentro do escopo deve ser somado
            if( elemento > descartar) {
                soma += leitura;
                ++contador;
            }

            // verificar em qual dos 12 ciclos estamos
            // e quais elementos descatar
            if ( elemento % 12 == 0) {
                ++ciclo;
                descartar = elemento + ciclo;
            }
        }

        //  apresentar resultado da soma ou média , com uma casa decimal
        if(Objects.equals(acao, "S")) System.out.println(df.format(soma));
        else System.out.println(df.format(soma/contador));
    }

}