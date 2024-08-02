import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {    
        //TODO: conhecer e importar a classe Scanner
        //Obter pelo scanner os valores digitados no terminal
      Scanner dados = new Scanner(System.in);
      System.out.println("Insira o numero da conta:");
      int numero = dados.nextInt();
      System.out.println("Insira a Agencia:" );
      String agencia = dados.next();
      dados.nextLine(); //consumindo linha
      System.out.println("Favor inserir Nome Completo:");
      String nomeCliente = dados.nextLine();
      System.out.println("Favor inserir saldo para Criação da conta:");
      double saldo = dados.nextDouble();
      //double saldo = 237.48;

      dados.close();
       // Exibir as mensagens para o nosso usuario

       System.out.println("Olá"+ " " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é"+" " + agencia + ", conta"+" " + numero + " "+"e seu saldo "+" " +saldo + " "+ "já está disponível para saque.");
       
     

       //Exibir as mensagens conta criada
       System.out.println("Conta Criada com Sucesso");
    }
}
