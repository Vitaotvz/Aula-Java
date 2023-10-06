package estrutura_repeticao;


import java.util.Scanner;


public class Ex17DW {


    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
       
        int a, b;
       
        System.out.printf("Digite o primeiro valor: ");
        a = ler.nextInt();
       
        do {
            System.out.printf("Digite o segundo valor: ");
            b = ler.nextInt();
           
            if (b <= a)
                System.out.printf("Erro! O segundo valor deve ser maior que o primeiro!\n");
        }
        while (b <= a);
       
        System.out.printf("O segundo valor foi o maior!");
       
        ler.close();
    }
}
