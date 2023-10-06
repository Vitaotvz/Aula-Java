//Exercício 20 - Entrar via teclado com um valor qualquer. Travar a digitação, no sentido de aceitar somente valores positivos. Após a digitação, exibir a tabuada do valor solicitado, no intervalo de um a dez.

package estrutura_repeticao;


import java.util.Scanner;


public class Ex20 {


    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
       
        int num, t, i;
       
        System.out.printf("Digite um número positivo: ");
        num = ler.nextInt();
       
        while(num <= 0) {
            System.out.printf("Erro, número negativo! Digite um número positivo: ");
            num = ler.nextInt();
        }
       
        i = 1;
               
        while (i <= 10) {
            t = num * i;
            System.out.printf("\n%d X %d = %d", num, i, t);
            i = i + 1;
        }
    }
}
