package estrutura_repeticao;


import java.util.Scanner;


public class Ex24 {


    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
       
        double num, maior=0, soma=0, media;
       
        for(int i=1; i<=10; i++) {
            System.out.printf("Digite o %d° número: ", i);
            num = ler.nextDouble();
           
            while(num <= 0) {
                System.out.printf("Erro! Digite apenas números positivos!\n");
                System.out.printf("Digite o %d° número: ", i);
                num = ler.nextDouble();
            }
           
            // Atribui o número digitado como maior, apenas no primeiro loop
            if (i == 1)
                maior = num;
            // Verifica se o número digitado é maior do que o valor da variável "maior", se for maior, atualiza a variável
            else if (num > maior)
                maior = num;
           
            soma = soma + num;
        }
       
        media = soma / 10;
       
        System.out.printf("\n\nO maior número é: %.1f\n", maior);
        System.out.printf("A soma dos números é: %.1f\n", soma);
        System.out.printf("O média aritmética é: %.1f", media);
       
        ler.close();
    }
}

