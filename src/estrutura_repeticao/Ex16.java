// Exercício 16 - Criar uma rotina de entrada que aceite somente um valor positivo.

package estrutura_repeticao;

import java.util.Scanner;

public class Ex16 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int num;
		
		System.out.printf("Digite um número positivo: ");
		num = ler.nextInt();
		
		while(num <= 0) {
			System.out.printf("ERRO!!, número negativo! Digite um número positivo: ");
			num = ler.nextInt();
		}
		System.out.printf("O valor digitado é %d", num);

	}

}
