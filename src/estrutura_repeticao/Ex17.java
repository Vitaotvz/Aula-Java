// Exercício 17 - Entrar com dois valores via teclado, onde o segundo deverá ser maior que o primeiro. Caso contrário solicitar novamente apenas o segundo valor.

package estrutura_repeticao;

import java.util.Scanner;

public class Ex17 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int n1, n2;
		
		System.out.printf("Digite o primeiro valor: ");
		n1 = ler.nextInt();
		
		System.out.printf("Digite o segundo valor: ");
		n2 = ler.nextInt();
		
		while (n1 >= n2) {
			System.out.printf("ERRO! Digite um valor maior para o segundo: ");
			n2 = ler.nextInt();
		}

		

	}

}
