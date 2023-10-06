// Exercício 03 -  A partir dos valores da base e altura de um triângulo, calcular e exibir sua área.

package entrada_processamento_saida;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		double b, a, r;
		
		System.out.printf("Digite o valor da base: ");
		b = ler.nextDouble();
		
		System.out.printf("Digite o valor da altura: ");
		a = ler.nextDouble();
		
		r = (b *a) / 2;
		
		System.out.printf("A área do triângulo é $f", r);
		

	}

}