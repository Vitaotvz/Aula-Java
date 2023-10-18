package Ex29;


import java.util.Scanner;


public class Programa {


    public static void main(String[] args) {
        int iter = 2;
       
        Scanner read = new Scanner(System.in);
        Cliente[] listaClientes = new Cliente[iter];
        Cliente c;
        String nome;
        int idade;
        String email;
       
        String hasAccount;
       
        ContaBancaria conta;
        String agencia;
        String numero;
        double saldo;
       
        for(int i=0; i<iter; i++) {
            System.out.printf("nome do %do cliente: ", i+1);
            nome = read.next();
            System.out.printf("idade do %do cliente: ", i+1);
            idade = read.nextInt();
            System.out.printf("email do %do cliente: ", i+1);
            email = read.next();
           
            System.out.printf("O cliente tem conta bancária? [S/N]");
            hasAccount = read.next();
           
            if(hasAccount.equals("S")) {
                System.out.printf("Informe os dados da conta:\n");
                System.out.printf("agencia: ");
                agencia = read.next();
                System.out.printf("núemro da conta: ");
                numero = read.next();
                System.out.printf("saldo: ");
                saldo = read.nextDouble();
                conta = new ContaBancaria(agencia, numero, saldo);
                c = new Cliente(i, nome, idade, email, conta);
            } else {
                c = new Cliente(i, nome, idade, email, null);
            }
            listaClientes[i] = c;
        }
       
        for(int i=0; i<iter; i++) {
            System.out.printf(listaClientes[i].exibirNomeIdade());
            System.out.printf(listaClientes[i].exibirDadosConta());
        }
       
        read.close();
    }
}
