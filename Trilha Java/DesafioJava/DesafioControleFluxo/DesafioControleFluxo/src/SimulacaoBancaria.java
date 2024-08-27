import java.util.Scanner;

public class SimulacaoBancaria {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double saldo = 0;
        int saque = 0;
        boolean continuar = true;

        System.out.println("Selecione sua opção:");
        System.out.println("1.Depositar");
        System.out.println("2.Sacar");
        System.out.println("3.Consultar Saldo");
        System.out.println("0.Encerrar");

        while (continuar) {

            int opcao = scanner.nextInt();

            switch (opcao) {

                case 1:

                    System.out.println("Digite o valor a ser depositador: ");
                    saldo = scanner.nextInt();
                    break;

                case 2:

                    System.out.println("Quanto vai sacar: ");
                    saque = scanner.nextInt();
                    break;

                case 3:

                    System.out.println("Seu saldo é: " + (saldo - saque));
                    break;
                case 0:
                    System.out.println("Programa encerrado.");
                    continuar = false;
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
        scanner.close();
    }
}