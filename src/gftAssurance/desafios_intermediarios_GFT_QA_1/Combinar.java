package gftAssurance.desafios_intermediarios_GFT_QA_1;

//
//Desafio
//        Crie um algoritmo que receba dois inputs que sejam strings e combine-as
//        alternando as letras de cada string.
//
//        Deve começar pela primeira letra da primeira string,
//        seguido pela primeira letra da segunda string,
//        em seguida pela segunda letra da primeira string e continuar dessa forma sucessivamente.
//
//        As letras restantes da cadeia mais longa devem ser adicionadas
//        ao fim da string resultante e retornada.
//
//        Entrada
//        A entrada contém vários casos de teste.
//        A primeira linha contém um inteiro N que indica a quantidade de casos de
//        teste que vem a seguir.
//        Cada caso de teste é composto por uma linha que contém duas cadeias de caracteres,
//        cada cadeia de caracteres contém entre 1 e 50 caracteres inclusive.
//
//        Saída
//        Combine as duas cadeias de caracteres da entrada como mostrado no
//        exemplo abaixo e exiba a cadeia resultante

//Exemplo de Entrada	Exemplo de Saída
//        2
//        aA Bb         aBAb
//        aa bb         abab


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Combinar {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		// ler quantidade de casos de teste
		int casos = Integer.parseInt(br.readLine());

		// repetir entradas de cadeias quantos forem os
		// acasos de estudos informados
		for( int i = 1 ; i <= casos ; i++){

			// variavel que ira receber a combinação
			String combinar = "";

			// ler a entrada
			// e quebrar a entrada em 2 string com espaço como separador
			String[] cadeia = br.readLine().split(" ");

			// verificando comprimentos das strings
			int a = cadeia[0].length();
			int b = cadeia[1].length();

			// identificar qual é a menor cadeia
			int menor  = b ;
			if( b > a ) menor = a;

			// repetir loop de combinação
			// dentro do comprimento da menor cadeia
			for( int x = 0 ; x < menor ; x++){
				combinar += String.valueOf(cadeia[0].charAt(x))
						    + String.valueOf(cadeia[1].charAt(x));
			}

			// se comprimento de cadeias não forem iguais
			// inserir os caracteres restantes da cadeia maior na combinação
			if( a != b ){
				if( a > b ){
					combinar += cadeia[0].substring(menor,a );
				} else combinar += cadeia[1].substring(menor,b);
			}

			// apresentar combinação
			System.out.println(combinar);
		}
	}
}


//Original
//import java.util.Scanner;
//
//public class Combinar {
//
//	public static void main(String[] args) {
//		Scanner leitor = new Scanner(System.in);
//		int N = leitor.nextInt();
//		for (int i = 0; i < N; i++) {
//
//			if (       >           ) {
//
//			} else {
//
//			}
//			for (  int j=0; j <  ; j++) {
//
//			}
//			resultado +=  ;
//			System.out.println(resultado);
//		}
//	}
//
//}

// versão Lendro Silva - DalUz
//import java.io.BufferedReader;
//		import java.io.IOException;
//		import java.io.InputStreamReader;
//		import java.util.StringTokenizer;
//
//public class Main{
//
//	public static void main(String[] args) throws IOException {
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		StringBuilder strResult = new StringBuilder();
//		String[] strArray;
//		String readLine;
//		int minLength;
//
//		// Número de casos de testes.
//		StringTokenizer st = new StringTokenizer(br.readLine());
//		int testCases = Integer.parseInt(st.nextToken());
//
//		for (int i = 0; i < testCases; i++) {
//			readLine = br.readLine();
//			strArray = readLine.split(" ");
//
//			minLength = Math.min(strArray[0].length(), strArray[1].length());
//
//			for (int j = 0; j < minLength; j++) {
//				strResult.append(strArray[0], j, j + 1).append(strArray[1], j, j + 1);
//			}
//
//			if (strArray[0].length() != strArray[1].length()) {
//				if (strArray[0].length() < strArray[1].length()) {
//					strResult.append(strArray[1].substring(minLength));
//				} else {
//					strResult.append(strArray[0].substring(minLength));
//				}
//			}
//
//			System.out.println(strResult);
//
//			strResult.delete(0, strResult.length());
//		}
//	}
//}