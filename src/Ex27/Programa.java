package Ex27;

import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		Produto[] produtos = new Produto[10];
		
		for(int i = 0; i<=9; i++) {
			Produto p = new Produto();
			
			System.out.printf("Digite o id do produto: ");
			p.id = ler.nextInt();
			
			System.out.printf("Digite a descrição do produto: ");
			p.descricao = ler.next();
			
			System.out.printf("Digite o valor do produto: ");
			p.valor = ler.nextDouble();
			
			System.out.printf("Digite a quantidade do produto: ");
			p.quantidade = ler.nextDouble();
			
			produtos[i] = p;
		}
		
		System.out.printf("Lista dos produtos com o valor menor de R$ 100,00:\n");
		
		for(int i = 0; i<=9; i++) {
			if (produtos[i].valor < 100)
				System.out.printf("Produtos: %s\n", produtos[i].descricao);
		}
		ler.close();
	}

}
