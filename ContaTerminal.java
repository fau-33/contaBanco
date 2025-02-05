import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {

        // Cria um objeto Scanner para ler entradas do terminal
        Scanner scanner = new Scanner(System.in);

        // Solicita e lê o número da agência
        System.out.print("Por favor, digite o número da Agência: ");
        String agencia = scanner.nextLine();

        // Solicita e lê o número da conta
        System.out.print("Por favor, digite o número da Conta: ");
        int numero = scanner.nextInt();
        scanner.nextLine(); // Limpa o buffer

        // Solicita e lê o nome do cliente
        System.out.print("Por favor, digite o nome do Cliente: ");
        String nomeCliente = scanner.nextLine();

        // Solicita e lê o saldo da conta
        System.out.print("Por favor, digite o Saldo da Conta: ");
        double saldo = scanner.nextDouble();

        // Fecha o scanner para liberar recursos
        scanner.close();

        // Exibe a mensagem final com os dados inseridos
        String saldoFormatado = String.format("%.2f", saldo);
        String mensagem = "Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldoFormatado + " já está disponível para saque.";
            System.out.println(mensagem);
        }
}
