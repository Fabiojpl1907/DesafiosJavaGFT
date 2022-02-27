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
		Scanner entrada = new Scanner(System.in);

		// o tema é sobre PG - progressão geometrica
		// considerendo o termo geral de PG
		// An = A1·Q^(n – 1)
		// onde q é a razão = 2 - a sempre uma dobra da quantidade de ninjas
		// a1 é o inico da série = 1
		// an é um elemento em uma posição especifica da prograssão
		// em nosso caso a ultima posição é fornecida - "an"
		// nos resta descobrir a posição que este elemento esta "n"
		// o que nos dará a quantidade de vezes que a técnica foi utilizada
		// para entender o raciocinio assita : https://www.youtube.com/watch?v=S9W-xqhYzQA

		while(entrada.hasNext())
		{
			int usoTecnica = 0;
			int an  = entrada.nextInt();
			// fatorar em base 2
			// pois nossa razão 2
			while( an > 1){
				usoTecnica += 1;
				an /= 2;
			}

			System.out.println( usoTecnica );

		}

		entrada.close();
	}
}


// A Math.ceil()função sempre arredonda um número até o próximo maior inteiro.
// exemplo : Math.ceil(7.004);  // 8
// Math.log(x) = ln ( x ) = o único y de tal modo que e^y = x
// ^ -> potenciação , ou seja "e" elevado a Y

//			System.out.println((int)Math.ceil(Math.log(termo)));