package Ex26;


import java.util.Scanner;


public class Programa {


    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
       
        Cliente[] clientes = new Cliente[5];
           
        for(int i=0; i<=4; i++) {
            Cliente c = new Cliente();
           
            System.out.printf("Digite o id do cliente: ");
            c.id = ler.nextInt();
           
            System.out.printf("Digite o nome do cliente: ");
            c.nome = ler.next();
           
            System.out.printf("Digite a idade do cliente: ");
            c.idade = ler.nextInt();
           
            System.out.printf("Digite o email do cliente: ");
            c.email = ler.next();
           
            clientes[i] = c;        
        }
       
        System.out.printf("Lista dos clientes que tem mais de 18 anos:\n");
       
        for(int i=0; i<=4; i++) {
            if (clientes[i].idade > 18)
                System.out.printf("Nome: %s\n", clientes[i].nome);
        }
       
        ler.close();
    }
}

