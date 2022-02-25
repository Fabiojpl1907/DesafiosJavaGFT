package gftAssurance.desafios_intermediarios_GFT_QA_1;


//Desafio
//		Uma das técnicas mais poderosas usadas pelos ninjas, chamada de Kage Bunshin no Jutsu
//		e conhecida também como "Técnica dos clones de sombra",
//		é capas de produzir uma cópia idêntica da pessoa que utilizar essa técnica.
//
//		É como uma espécie de mitose, na qual um ninja vira dois,
//		sem possibilidade de diferenciar qual é o original e qual é a cópia.
//
//		E por se tratar de uma cópia fidedigna,
//		essa cópia por si só também é capaz de realizar a técnica de clone de sombra e,
//		portanto, se o original e a cópia o fizeram,
//		isso resultaria em 4 ninjas no total.
//		E assim por diante, numa multiplicidade quase infinita a depender da habilidade do ninja.
//
//		Há N ninjas diante de você, mas ao invés de contá-los usando seus reflexos,
//		o que seria muito difícil, você irá usar seus conhecimentos em programação
//		para determinar quantos existem.
//
//		Entrada
//		A entrada contém vários casos de teste. Cada caso contém uma linha
//		com o número N (1 ≤ N ≤ 106).
//		É garantido que o valor de N é tal que é possível obter exatamente N cópias de um ninja
//		utilizando a técnica (incluindo o original).
//
//		Saída
//		Para cada caso de teste,
//		imprima uma linha contendo o número de vezes que a técnica foi utilizada
//Exemplo de Entrada	Exemplo de Saída
//		1				0
//		2				1
//		4				2
//      8				4

import java.util.Scanner;

public class KageBunshin {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cont = 0;

		while (true ) {

			int entrada = sc.nextInt();
			while (entrada != 1) {

				if (entrada % 2 == 0) {
					cont += 1;
				}
				entrada /= 2;
			}
			System.out.println(cont);
	}
//		sc.close();
	}
}

//original
//		import java.util.Scanner;
//
//public class KageBunshin {
//
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//
//		//Escreva o seu código aqui
//
//		sc.close();
//	}
//}