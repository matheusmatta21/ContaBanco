import java.util.Locale;
import java.util.Scanner;
public class ContaTerminal {

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        scanner.useDelimiter(System.getProperty("line.separator")); //para evitar incompatibilidade de entrada ao digitar strings com um espaço no texto
        int numeroConta;
        String numeroAgencia;
        String nomeCliente;
        double saldo;

        System.out.println("Por favor, digite o número da Conta !");
        numeroConta = scanner.nextInt();

        System.out.println("Por favor, digite o número da Agência !");
        numeroAgencia = scanner.next();

        System.out.println("Por favor, digite o nome do Cliente !");
        nomeCliente = scanner.next();

        System.out.println("Por favor, digite o saldo da Conta !");
        saldo = scanner.nextDouble();

        scanner.close();

        System.out.println(
            "Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + numeroAgencia +
            ", conta " + numeroConta + " e seu saldo " + saldo + " já está disponível para saque");
    }
}