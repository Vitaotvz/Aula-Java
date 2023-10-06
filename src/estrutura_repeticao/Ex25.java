package estrutura_repeticao;


import java.util.Scanner;


public class Ex25 {


    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
       
        double num, maior=0, soma=0, media, menor=0, por_pos, por_neg;
        int n, qtd_pos=0, qtd_neg=0;
       
        System.out.printf("Digite a qtd de valores à serem digitados: ");
        n = ler.nextInt();
       
        while ((n<=0) || (n>20)) {
            System.out.printf("Erro! A quantidade de valores deve estar entre 1 e 20!\n");
            System.out.printf("Digite a qtd de valores à serem digitados: ");
            n = ler.nextInt();
        }
       
        for(int i=1; i<=n; i++) {
            System.out.printf("Digite o %d° número: ", i);
            num = ler.nextDouble();


            if (i == 1) {
                maior = num;
                menor = num;
            }
           
            if (num > maior)
                maior = num;
               
            if (num < menor)
                menor = num;
           
            if (num >= 0)
                qtd_pos++;
            else
                qtd_neg++;
           
            soma = soma + num;
        }
       
        media = soma / n;
       
        por_pos = (qtd_pos * 100) / n;
       
        por_neg = (qtd_neg * 100) / n;
       
        System.out.printf("\n\nResultados:\n");
        System.out.printf("O maior número é: %.1f\n", maior);
        System.out.printf("O menor número é: %.1f\n", menor);
        System.out.printf("A soma dos números é: %.1f\n", soma);
        System.out.printf("A média aritmética é: %.1f\n", media);
        System.out.printf("A porcentagem dos valores positivos: %.2f\n", por_pos);
        System.out.printf("A porcentagem dos valores negativos: %.2f", por_neg);
       
        ler.close();
    }
}
