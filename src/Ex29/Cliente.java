package Ex29;


public class Cliente {
    public int id;
    public String nome;
    public int idade;
    public String email;
    public ContaBancaria conta;
   
    Cliente(){
       
    }
   
    Cliente(int id, String nome, int idade, String email, ContaBancaria conta){
        this.id = id;
        this.nome = nome;
        this.idade = idade;
        this.email = email;
        this.conta = conta;
    }
   
    public void atualizarEmail(String novoEmail) {
        this.email = novoEmail;
    }
   
    public String exibirNomeIdade() {
        return ("\nnome: " + this.nome + "\nidade: " + this.idade + "\nemail: " + this.email);
    }
   
    public String exibirDadosConta() {
        if(this.conta != null){
            return "\nConta: " + this.conta.numero + "\nAgência: " + this.conta.agencia + "\nSaldo: " + this.conta.saldo + "\n";
        }
        else {
            return("\nCliente sem conta cadastrada");
        }
    }
}
