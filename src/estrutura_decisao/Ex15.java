// Exercício 15 - A partir de três valores que serão digitados, verificar se formam ou não um triângulo. Em caso positivo, exibir sua classificação: “Isósceles, escaleno ou eqüilátero”. Um triângulo escaleno possui todos os lados diferentes, o isósceles, dois lados iguais e o eqüilátero, todos os lados iguais. Para existir triângulo é necessário que a soma de dois lados quaisquer seja maior que o outro, isto, para os três lados.

package estrutura_decisao;

import java.util.Scanner;


public class Ex15 {


    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
       
        int a, b, c;
        
        System.out.printf("Digite o primeiro lado do triângulo: ");
        a = ler.nextInt();
       
        System.out.printf("Digite o segundo lado do triângulo: ");
        b = ler.nextInt();
        
        System.out.printf("Digite o terceiro lado do triângulo: ");
        c = ler.nextInt();
        
        if ( ((a + b) > c) && ((a + c) > b) && ((b + c) > a) )
        	if ( (a == b) && (a == c) )
				System.out.printf("Triângulo equilátero!");
			else if ( (a!= b) && (a != c) && (b != c) )
				System.out.printf("Triângulo escaleno!");
			else
				System.out.printf("Triângulo isóceles!");
        else
        	System.out.printf("NÃO É UM TRIÂNGULO!");
        ler.close();
        
    }
}