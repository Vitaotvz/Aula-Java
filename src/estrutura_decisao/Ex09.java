// Exercício 09 - Entrar via teclado, com dois valores distintos. Exibir o menor deles.

package estrutura_decisao;

import java.util.Scanner;

public class Ex09 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		double n1, n2;
		
		System.out.printf("Digite o primeiro valor: ");
		n1 = ler.nextDouble();
		
		System.out.printf("Digite o segundo valor: ");
		n2 = ler.nextDouble();
		
		if (n1 < n2) {
			System.out.printf("O menor valor é: %.1f", n1 );
		}
		else {
			System.out.printf("O menor valor é: %.1f", n2 );
		}
			
	}

}