package estrutura_repeticao;


import java.util.Scanner;


public class Ex20DW {


    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
       
        int num, t, i;
       
        do {
            System.out.printf("Digite um número positivo: ");
            num = ler.nextInt();
           
            if (num <= 0)
                System.out.printf("Erro, número negativo!\n");
        }
        while(num <= 0);
       
        i = 1;
       
        do {
            t = num * i;
            System.out.printf("\n%d X %d = %d", num, i, t);
            i++;
        }
        while(i <= 10);
    }
}

