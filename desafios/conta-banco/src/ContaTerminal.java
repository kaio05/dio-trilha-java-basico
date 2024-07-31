import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        // Conhecer e importar a classe Scanner
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        // Exibir as mensagens para o nosso usuário
        // Obter pela scanner os valores digitados no terminal
        System.out.println("Por favor, digite o número da sua agência: ");
        int numeroAgencia = scanner.nextInt();
        System.out.println("Qual o nome da sua agência? ");
        String nomeAgencia = scanner.next();
        System.out.println("Por favor, digite o seu nome: ");
        String nomeCliente = scanner.next();
        System.out.println("Agora entre com o seu saldo: ");
        double saldoCliente = scanner.nextDouble();
        // Exibir a mensagem conta criada
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + nomeAgencia + ", conta " + numeroAgencia + " e seu saldo de R$" + saldoCliente + " já está disponível para saque.");
        scanner.close();
    }
}
