// Exercício 19 - Exibir a tabuada do número cinco no intervalo de um a dez.

package estrutura_repeticao;

import java.util.Scanner;

public class Ex19 {


    public static void main(String[] args) {    
    	Scanner ler = new Scanner(System.in);
    	int num = 5, i = 1, t;
       
        while (i <= 10) {
            t = num * i;
            System.out.printf("%d X %d = %d\n", num, i, t);
            i++;
        }
    }
}
