// Exercício 10 - Entrar com dois valores quaisquer. Exibir o maior deles, se existir, caso contrário, enviar mensagem avisando que os números são idênticos.

package estrutura_decisao;


import java.util.Scanner;


public class Ex10 {


    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
       
        int a, b;
       
        System.out.printf("Digite o primeiro valor: ");
        a = ler.nextInt();
       
        System.out.printf("Digite o segundo valor: ");
        b = ler.nextInt();
       
        if (a > b)
            System.out.printf("O maior valor é %d (primeiro valor)", a);
        else if (a == b)
            System.out.printf("Números idênticos!");
        else
            System.out.printf("O maior valor é %d (segundo valor)", b);
       
        ler.close();
    }
}
