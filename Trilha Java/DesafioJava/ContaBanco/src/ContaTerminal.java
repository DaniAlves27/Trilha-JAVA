import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        System.out.println("Seja Bem vindo");
        System.out.println("- Preencha seus dados abaixo -");

        System.out.println("Digite o Número da Conta: ");
        int numero = sc.nextInt();

        System.out.println("Informe o numero da Agencia: ");
        String agencia = sc.next();

        System.out.println("Digite seu Nome Completo: ");
        String nome = sc.next();

        System.out.println("Digite seu Saldo: ");
        Double saldo = sc.nextDouble();

        System.out.println("Olá  " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia
                + ", conta " + numero + " e seu saldo " + saldo + " ,já está disponível para saque");
    }
}