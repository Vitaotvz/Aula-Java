// Exercício 04 - Calcular e exibir a média aritmética de quatro valores quaisquer que serão digitados.

package entrada_processamento_saida;

import java.util.Scanner;
public class Ex04 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int n1, n2, n3, n4, m;
		
		System.out.printf("\nOlá! vamos ver qual é a média aritmética dos valores que você irá digitar :) \n");
		
		System.out.printf("\nDigite o primeiro valor: ");
		n1 = ler.nextInt();
		
		System.out.printf("\nDigite o segundo valor: ");
		n2 = ler.nextInt();
		
		System.out.printf("\nDigite o terceiro valor: ");
		n3 = ler.nextInt();
		
		System.out.printf("\nDigite o quarto e ultimo valor: ");
		n4 = ler.nextInt();
	
		m = (n1 + n2 + n3 + n4) /4;
		
		System.out.printf("\nA média aritmética dos valores é: %d", m);
	}

}