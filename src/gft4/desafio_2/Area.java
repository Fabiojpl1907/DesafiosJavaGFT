package gft4.desafio_2;

//A fórmula para calcular a área de uma circunferência é: area = π . raio2.
// Considerando para este problema que π = 3.14159:
//
//		- Efetue o cálculo da área, elevando o valor de raio ao quadrado e multiplicando por π.
//
//		Entrada
//		A entrada contém um valor de ponto flutuante (dupla precisão), no caso, a variável raio.
//
//		Saída
//		Apresentar a mensagem "A=" seguido pelo valor da variável area, conforme exemplo abaixo,
//		com 4 casas após o ponto decimal.
//		Utilize variáveis de dupla precisão (double).
//		Como todos os problemas, não esqueça de imprimir o fim de linha após o resultado,
//		caso contrário, você receberá "Presentation Error"
// entrada
//		2 ;  100.64; 150
// Saida
//		A=12.5664; A=31819.3103; A=70685.7750

import java.util.Scanner;

public class Area{

	// Calculo de ára de circunferencia
	// dado o raio da cirsunferencia
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);

		double area, raio;

		raio = scan.nextDouble();

		//A fórmula para calcular a área de uma circunferência é: area = π . raio2.
		// Considerando para este problema que π = 3.14159:

		area = 3.14159 * (Math.pow(  raio  ,2));

		System.out.printf("A=%.4f\n", area);
	}
}