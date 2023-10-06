// Exercício 12 - Calcular e exibir a área de um retângulo, a partir dos valores da base e altura que serão digitados. Se a área for maior que 100, exibir a mensagem “Terreno grande”, caso contrário, exibir a mensagem “Terreno pequeno”.


package estrutura_decisao;


import java.util.Scanner;


public class Ex12 {


    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
       
        int a, b, area;
        
        System.out.printf("Digite o valor da base do retângulo: ");
        b = ler.nextInt();
       
        System.out.printf("Digite o svalor da altura do retângulo: ");
        a = ler.nextInt();

        area = b * a; 
        
        if (area >=100)
        	System.out.printf("\nTerreno Grande!");
       
        else 
        	System.out.printf("\nTerreno Pequeno!");
        ler.close();
        
    }
}