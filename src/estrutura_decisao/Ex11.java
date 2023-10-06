// Exercício 11 -Calcular e exibir a área de um retângulo, a partir dos valores da base e altura que serão digitados. Se a área for maior que 100, exibir a mensagem “Terreno grande”.

package estrutura_decisao;


import java.util.Scanner;


public class Ex11 {


    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
       
        int a, b, area;
        
        System.out.printf("Digite o valor da base do retângulo: ");
        b = ler.nextInt();
       
        System.out.printf("Digite o valor da altura do retângulo: ");
        a = ler.nextInt();

        area = b * a; 
        
        if (area >=100)
        	System.out.printf("\nTerreno Grande!");
        ler.close();
    }
}