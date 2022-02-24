package gftAssurance.desafio_1;

//  Desafio
//  Leia 2 valores inteiros (A e B).
//  Após, o programa deve mostrar uma mensagem "Sao Multiplos" ou "Nao sao Multiplos",
//  indicando se os valores lidos são múltiplos entre si.
//
//        Entrada
//        A entrada contém valores inteiros.
//
//        Saída
//        A saída deve conter uma das mensagens conforme descrito acima

import java.io.IOException;
import java.util.Scanner;

public class Multiplos{
    // a divisao entre multiplos é exata
    // nao tem resto
    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);

        int  a = leitor.nextInt();
        int  b = leitor.nextInt();

        // garantir que em qualuer ordem que o par seja fonecido
        // o teste ocorrerá
        int maior = a ;
        int menor = b;
        if( Math.abs(b) > Math.abs(a) ) {
           maior = b;
           menor = a;
       }

       if ( maior % menor == 0  ) {
            System.out.println("Sao Multiplos");
       } else { System.out.println("Nao sao Multiplos");

        }
    }
}