import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, digite o número da agência: ");
        String agencia = scanner.nextLine();

        System.out.println("Agora digite o número de sua conta: ");
        int numeroConta = Integer.parseInt(scanner.nextLine());

        System.out.println("Digite o seu nome: ");
        String nomeCliente = scanner.nextLine().toUpperCase();

        System.out.println("Digite o saldo de sua conta: ");
        Float saldo = Float.parseFloat(scanner.nextLine());

        System.out.printf("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é "
                + agencia + ", conta " + numeroConta + " e seu saldo " + saldo + " já está disponível para saque.");

        scanner.close();
    }
}
