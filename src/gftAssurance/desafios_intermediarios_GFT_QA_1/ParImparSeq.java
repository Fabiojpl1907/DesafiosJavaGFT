package gftAssurance.desafios_intermediarios_GFT_QA_1;

//Desafio
//        Crie um programa onde você receberá valores inteiros não negativos como entrada.
//
//        Ordene estes valores de acordo com o seguinte critério:
//
//        Primeiro os Pares
//        Depois os Ímpares
//        Você deve exibir os pares em ordem crescente e na sequência os ímpares em ordem decrescente.
//
//        Entrada
//        A primeira linha de entrada contém um único inteiro positivo N (1 < N < 10000) Este é o número de linhas de entrada que vem logo a seguir. As próximas N linhas terão, cada uma delas, um valor inteiro não negativo.
//
//        Saída
//        Exiba todos os valores lidos na entrada segundo a ordem apresentada acima. Cada número deve ser impresso em uma linha, conforme exemplo de saída abaixo.

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class ParImparSeq {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        int tamanho = leitor.nextInt();

        int numeros[] = new int[tamanho];

        // recebdndo os numeros
        for( int x =0 ; x <= tamanho-1 ;  x++ ) {

            numeros[x] = leitor.nextInt();
        }
        // colocar em ordem crescente

        // improrar pares
        Arrays.sort(numeros);
        for(int x =0 ; x <= tamanho-1 ;  x++ ) {
            if(  numeros[x] % 2 == 0  ) System.out.println( numeros[x]);
        }

        // imprimir impares em ordem descescente
        for(int x = tamanho-1 ; x >= 0 ;  x-- ) {
            if(  numeros[x] % 2 != 0  ) System.out.println( numeros[x]);
        }

    }
}