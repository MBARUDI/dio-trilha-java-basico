import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Por favor, digite o número da conta: ");
        int numeroConta = scanner.nextInt();
        scanner.nextLine(); // Consumir a quebra de linha deixada pelo nextInt()

        System.out.print("Por favor, digite o número da agência: ");
        String numeroAgencia = scanner.nextLine();

        System.out.print("Por favor, digite o nome do cliente: ");
        String nomeCliente = scanner.nextLine();

        System.out.print("Por favor, digite o saldo inicial: ");
        double saldo = scanner.nextDouble();

        // Exibir mensagem formatada
        String mensagem = String.format(
            "Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque.",
            nomeCliente, numeroAgencia, numeroConta, saldo
        );
        System.out.println(mensagem);

        scanner.close();
    }
}
