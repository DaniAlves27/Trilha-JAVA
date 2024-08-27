import java.util.InputMismatchException;
import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {

        Scanner terminal = new Scanner(System.in);

        System.out.print("Digite o primeiro parâmetro: ");
        int parametroUm;
        // Se digitar um parametro invalido repete até ser um numero Inteiro.
        while (true) {
            try {
                parametroUm = terminal.nextInt();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Digite um número inteiro válido.");
                terminal.next();

            }
        }

        System.out.print("Digite o segundo parâmetro: ");
        int parametroDois;
        // Se digitar um parametro invalido repete até ser um numero Inteiro.
        while (true) {
            try {
                parametroDois = terminal.nextInt();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Digite um número inteiro válido.");
                terminal.next();

            }
        }
        // Dispara a exceção.
        try {
            contar(parametroUm, parametroDois);

        } catch (InvalidParametersException e) {
            System.out.println(e.getMessage());

        }

    }

    static void contar(int parametroUm, int parametroDois) throws InvalidParametersException {
        // Validar se parametroUm é MAIOR que parametroDois e lançar a exceção
        if (parametroUm > parametroDois) {
            throw new InvalidParametersException("O segundo parâmetro deve ser maior que o primeiro.");
        }

        // Imprimir os números com base na variável contagem
        int contagem = parametroDois - parametroUm;
        for (int i = 1; i <= contagem; i++) {
            System.out.println("Imprimindo o número " + i);
        }
    }
}