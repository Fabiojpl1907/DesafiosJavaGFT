package gftAssurance.desafio_1;

// DEsafio
//
//     Paulinho tem em suas mãos um pequeno problema.
//     A professora lhe pediu que ele construísse um programa para verificar,
//     à partir de dois valores inteiros A e B,
//     se B corresponde aos últimos dígitos de A.
//
//		Entrada
//		A entrada consiste de vários casos de teste.
//		A primeira linha de entrada contém um inteiro N que indica a quantidade de casos de teste.
//		Cada caso de teste consiste de dois inteiros A (1 ≤ A < 231 ) e B (1 ≤ B < 231) positivos.
//
//		Saída
//		Para cada caso de entrada imprima uma mensagem indicando
//		se o segundo valor encaixa no primeiro valor, confome exemplo abaixo.

//Exemplo de Entrada	Exemplo de Saída
//		4
//		5678690 78690 - encaixa
//		5434554 543   - nao encaixa
//		1243 1243     - encaixa
//		54 654        - nao encaixa


//String("test").equals("test")
//String str_x = String.valueOf(x);
// Extrair os caracteres a partir do índice 6 até o final
//System.out.printf("Caracteres a partir do índice 6: \"%s\"%n",frase.substring(6));

// Extrair os caracteres a partir do índice 6 até a posição 17 (índice 18)
//System.out.printf("%s \"%s\"%n","Substring do índice 6 até o 17: ",frase.substring(6, 18));


import java.util.Scanner;

public class Pertence{

	public static void main(String[] args) throws Exception {
		Scanner scan = new Scanner(System.in);
		
		int count = scan.nextInt();
		
		for (int i = 0; i < count; i++) {
			int a = scan.nextInt();
			int b = scan.nextInt();

			// trasnforma inteiro em string
			String str_a = String.valueOf(a);
			String str_b = String.valueOf(b);

			// captura o comprimnto de cada string
			int lenght_a = str_a.length();
			int lenght_b = str_b.length();

			// compara comprimento das strings a deve ser igual ou maior que b
			// verificar se substring final da A é ou não igual a string B
			if( (lenght_b > lenght_a)  || !(str_a.substring( lenght_a - lenght_b  ).equals( str_b)) )
			System.out.println("nao encaixa");
			else System.out.println("encaixa");
		}

	}
}

//original
//		import java.util.Scanner;
//
//public class Pertence{
//
//	public static void main(String[] args) throws Exception {
//		Scanner scan = new Scanner(System.in);
//
//		int count = scan.nextInt();
//
//		for (int i = 0; i < count; i++) {
//			//complete a resolução do problema com sua solução
//
//			if (           ) System.out.println("encaixa");
//			else System.out.println("nao encaixa");
//		}
//
//	}
//}