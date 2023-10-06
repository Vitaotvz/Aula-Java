// Entrar com 2 valores, realizar a soma deles e exibir o resultado

package entrada_processamento_saida;

import java.util.Scanner;

public class Exemplo01 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		int a, b, soma;
		
		System.out.printf("Informe o primeiro valor: ");
		a = ler.nextInt();
		
		System.out.printf("Informe o segundo valor: ");
		b = ler.nextInt();
		
		soma = a + b;
		
		System.out.printf("a soma dos número é de: %d", soma);
	}

}