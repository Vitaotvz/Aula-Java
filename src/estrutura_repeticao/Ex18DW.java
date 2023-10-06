package estrutura_repeticao;


import java.util.Scanner;


public class Ex18DW {


    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
       
        String s;
       
        do {
            System.out.printf("Digite o sexo (F ou M): ");
            s = ler.next();
           
            if ( (!s.equalsIgnoreCase("M")) && (!s.equalsIgnoreCase("F")) )
                System.out.printf("Erro! Digite apenas M ou F!\n");
        }
        while ( (!s.equalsIgnoreCase("M")) && (!s.equalsIgnoreCase("F")) );
       
        System.out.printf("Digitou o sexo correto!");
       
        ler.close();
    }
}

