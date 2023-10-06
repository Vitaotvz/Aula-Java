package estrutura_repeticao;


public class Ex23 {


    public static void main(String[] args) {
        int total=0;
       
        for(int i=1; i<=100; i++) {
            //total = total + i;
            total+=i;
        }
       
        System.out.printf("A soma dos números de 1 a 100 é: %d", total);
    }
}
