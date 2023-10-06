package estrutura_repeticao;

import java.util.Scanner;
public class Ex19DW {


    public static void main(String[] args) {    
    	Scanner ler = new Scanner(System.in);
    	int num = 5, i = 1, t;
       
        do {
            t = num * i;
            System.out.printf("%d X %d = %d\n", num, i, t);
            i++;
        }
        while (i <= 10);
    }
}
