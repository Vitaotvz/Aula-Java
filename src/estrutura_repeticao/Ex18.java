// Exercício 18 - Entrar via teclado com o sexo de determinado usuário, aceitar somente “F” ou “M” como respostas válidas.

package estrutura_repeticao;


import java.util.Scanner;


public class Ex18 {


    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
       
        String s;
       
        System.out.printf("Digite o sexo (F ou M): ");
        s = ler.next();
           
        while ( (!s.equalsIgnoreCase("M")) && (!s.equalsIgnoreCase("F")) ) {
            System.out.printf("Erro! Digite apenas M ou F!\n");
            System.out.printf("Digite o sexo (F ou M): ");
            s = ler.next();
        }
       
        System.out.printf("Digitou o sexo correto!");
       
        ler.close();
    }
}

