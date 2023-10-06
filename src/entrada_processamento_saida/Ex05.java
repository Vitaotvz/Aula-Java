// Exercício 05 -  Entrar via teclado com o valor de uma temperatura em graus Celsius, calcular e exibir sua temperatura equivalente em Fahrenheit.

package entrada_processamento_saida;

 import java.util.Scanner;
 
public class Ex05 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		double c, f, r;
		
		System.out.printf("Digite a temperatura em graus Celsius: ");
		c = ler.nextDouble();
		
		r = (c * 1.8) + 32;
		
		System.out.printf("A temperatura em Fahrenheit é: %.1f° ", r);
		

	}

}
