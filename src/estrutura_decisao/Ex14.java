// Exercício 14 - Entrar com o peso e a altura de uma determinada pessoa. Após a digitação, exibir se esta pessoa está ou não com seu peso ideal. Fórmula: peso/altura².

package estrutura_decisao;

import java.util.Scanner;


public class Ex14 {


    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
       
        double peso, altura, imc;
        
        System.out.printf("Digite o seu peso: ");
        peso = ler.nextInt();
       
        System.out.printf("Digite a sua altura: ");
        altura = ler.nextInt();
        
        imc = peso / (altura * altura);

        if (imc < 20)
        	System.out.printf("Abaixo do peso!");
        else if (imc <25)
        	System.out.printf("Peso ideal!");
        else
        	System.out.printf("Acima do peso!");
        ler.close();
        
    }
}