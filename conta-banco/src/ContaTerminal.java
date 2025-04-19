import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        // Cria o scanner para receber os dados do teclado do usuario.
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite sua Conta Bancaria: ");
        int numero = scanner.nextInt();
        
        System.out.println("Digite sua Agencia: ");
        String agencia = scanner.next();
        scanner.nextLine();

        System.out.println("Digite seu nome: ");
        String nomeCliente = scanner.nextLine();
        
        System.out.println("Digite o Saldo de sua conta: ");
        double saldo = scanner.nextDouble();
        
        // "Olá [Nome Cliente], obrigado por criar uma conta em nosso banco, sua agência é [Agencia], conta [Numero] e seu saldo [Saldo] já está disponível para saque".
        System.out.printf("%n Olá, %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo é R$ %.2f e já está disponível para saque.\n", nomeCliente, agencia, numero, saldo);

    }
}
