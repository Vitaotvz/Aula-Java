// Exercício 01 - Entrar via teclado com a base e a altura de um retângulo, calcular e exibir sua área.

package entrada_processamento_saida;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		int a, b, area;
		
		System.out.printf("Digite o valor da base do retângulo:\n ");
		b = ler.nextInt();
		
		System.out.printf("Digite o valor da altura do retângulo:\n ");
		a = ler.nextInt();
		
		area = b * a;
		
		System.out.printf("A área do retângulo é de %d", area);
	}

}