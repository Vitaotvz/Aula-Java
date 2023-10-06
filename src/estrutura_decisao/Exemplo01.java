package estrutura_decisao;


import java.util.Scanner;


public class Exemplo01 {


    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
       
        double p1, p2, media;
       
        System.out.printf("Digite o valor da P1: ");
        p1 = ler.nextDouble();
       
        System.out.printf("Digite o valor da P2: ");
        p2 = ler.nextDouble();
       
        media = (p1 + p2) / 2;
       
        if (media >= 5) {
            System.out.printf("Aprovado!");
        }
        else if (media >= 3) {
            System.out.printf("Recuperação!");
        }
        else {
            System.out.printf("Reprovado!");
        }
       
        ler.close();
    }
}
