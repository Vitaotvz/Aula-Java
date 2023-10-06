package estrutura_repeticao;


import java.util.Scanner;


public class Checkpoint01 {


    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
       
        int x, a, b, r;
        String nome, historico="", exec="N";


        do {
            System.out.printf("Digite o nome do usuário: ");
            nome = ler.next();
           
            System.out.printf("Digite um número para obter a tabuada: ");
            x = ler.nextInt();
           
            while(x <= 0) {
                System.out.printf("Erro! Digite apenas números positivos!");
                System.out.printf("\nDigite um número para obter a tabuada: ");
                x = ler.nextInt();
            }
           
            System.out.printf("Digite o intervalo inicial da tabuada: ");
            a = ler.nextInt();
           
            System.out.printf("Digite o intervalo final da tabuada: ");
            b = ler.nextInt();
           
            while(b <= a) {
                System.out.printf("Erro! O intervalo final deve ser maior que o inicial!");
                System.out.printf("\nDigite o intervalo final da tabuada: ");
                b = ler.nextInt();
            }
           
            // Concatena as informações de execução no final do loop
            historico = historico + "Nome: " + nome + " - Tabuada: " + x + " - Intervalo: " + a + " a " + b + "\n";
               
            for(int i=b; i>=a; i--) {
                r = x * i;
                System.out.printf("%d X %d = %d\n", x, i, r);
            }
                       
            System.out.printf("Deseja executar novamente o programa (S/N)?\n");
            exec = ler.next();
           
        } while(exec.equalsIgnoreCase("S"));
       
        System.out.print("\n\nHistórico de Execuções:\n" + historico);


        ler.close();
    }
}

