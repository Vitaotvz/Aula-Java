// Exercício 13 - Entrar via teclado com três valores distintos. Exibir o maior deles.

package estrutura_decisao;

import java.util.Scanner;


public class Ex13 {


    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
       
        int n1, n2, n3;
        
        System.out.printf("Digite o primeiro valor: ");
        n1 = ler.nextInt();
       
        System.out.printf("Digite o segundo valor: ");
        n2 = ler.nextInt();
        
        System.out.printf("Digite o terceiro valor: ");
        n3 = ler.nextInt();

        if ((n1 > n2) && (n1 > n3))
        	System.out.printf("O primeiro valor é o maior!");
       
        else if ((n2 > n1) && (n2 > n3))
        	System.out.printf("O segundoo valor é o maior!");
        
        else 
        	System.out.printf("O terceiro valor é o maior!");
        ler.close();
        
    }
}