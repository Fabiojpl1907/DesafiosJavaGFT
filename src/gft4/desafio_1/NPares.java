package gft4.desafio_1;

//Desafios
//        Crie um programa que leia um número e mostre os números pares até esse número,
//        inclusive ele mesmo.
//
//        Entrada
//        Você receberá 1 valor inteiro N, onde N > 0.
//
//        Saída
//        Exiba todos os números pares até o valor de entrada, sendo um em cada linha.
//
//
//        Exemplo de Entrada	Exemplo de Saída
//        6
//        2
//        4
//        6
import java.io.IOException;
import java.util.Scanner;

public class NPares {

    public static void main(String[] args) throws IOException {

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        // so entra no loop se o numero for maior ou igual a 2
        // se o numero fornecido for 1 , não havera numeros pares a serem mostrados
        // se numero for 2 ou maior , o loop inicia com o numero 2
        // vai acrescentando a cad nova passada + 2
        // ira imprimir os pares dento do limite
        // Exemplo : 7
        // 2 , 2+2 = 4 , 4+2 = 6 , 6+ 2 =8 ( nao imprime pois é maior que 7 e encerra o loop

        for (int i = 2; i <= n; i += 2) {

            if (i <= n) System.out.println(i);
        }
    }
}