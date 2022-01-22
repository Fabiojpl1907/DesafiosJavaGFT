package gft.desafios_2;
//Desafio
//        Crie um programa que leia 6 valores, os quais poderão ser negativos e/ou positivos.
//        Em seguida, apresente a quantidade de valores positivos digitados


import java.util.Scanner;

public class PositivoNegativo{

        public static void main(String[] args) {

            Scanner scan = new Scanner(System.in);

            int positivo = 0;

            for (int i = 0 ; i < 6; i++) {
                Double n = scan.nextDouble();
                if (n > 0)
                    positivo += 1;
            }

            System.out.println(positivo + " valores positivos");

            scan.close();
        }
    }