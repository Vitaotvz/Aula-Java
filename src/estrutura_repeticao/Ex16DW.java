package estrutura_repeticao;


import java.util.Scanner;


public class Ex16DW {


    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
       
        int num;


        do {
            System.out.printf("Digite um número positivo: ");
            num = ler.nextInt();
           
            if (num <= 0)
                System.out.printf("Erro! Digite apenas número positivo!\n");
        }
        while(num <= 0);


        System.out.printf("Digitou número positivo!");
       
        ler.close();
    }

}