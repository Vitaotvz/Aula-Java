package classe_objeto;


import java.util.Scanner;


public class Programa {


    public static void main(String[] args) {
       
        Scanner ler = new Scanner(System.in);
       
        Pessoa[] listaPessoas = new Pessoa[10];
       
        for (int i=0; i<=2; i++) {
            Pessoa a = new Pessoa();
           
            System.out.printf("Digite o nome da %d° pessoa: ", i+1);
            a.nome = ler.next();
           
            System.out.printf("Digite a idade da %d° pessoa: ", i+1);
            a.idade = ler.nextInt();
           
            System.out.printf("Digite o e-mail da %d° pessoa: ", i+1);
            a.email = ler.next();
           
            listaPessoas[i] = a;
        }
       
        for (int i=0; i<=2; i++) {
            System.out.println(listaPessoas[i].nome);
        }
           
        ler.close();
    }


}

