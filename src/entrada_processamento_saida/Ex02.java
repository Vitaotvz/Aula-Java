// Exercício 02 - Calcular e exibir a área de um quadrado, a partir do valor de sua aresta que será digitado.

package entrada_processamento_saida;

import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		
		int lado, resultado;
		
		System.out.printf("Digite o lado do quadrado: ");
		lado = ler.nextInt();
		
		resultado = lado * lado;
		
		System.out.printf("A aérea do quadrado é $d", resultado);
	}
}
