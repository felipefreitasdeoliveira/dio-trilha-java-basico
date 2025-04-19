// Importa a classe Locale para definir o padrão de formatação (como ponto decimal em vez de vírgula)
import java.util.Locale;
// Importa a classe Scanner para ler dados do teclado
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        // Cria o objeto Scanner para capturar entradas do usuário via terminal
        // Usa o Locale.US para garantir que os números usem ponto como separador decimal
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        
        // Solicita e lê o número da conta bancária (inteiro)
        System.out.println("Digite sua Conta Bancaria: ");
        int numero = scanner.nextInt();
        
        // Solicita e lê o número da agência (como texto)
        System.out.println("Digite sua Agencia: ");
        String agencia = scanner.next();
        scanner.nextLine(); // Limpa o buffer do scanner (ENTER pendente do next() anterior)
        
        // Solicita e lê o nome completo do cliente (incluindo espaços)
        System.out.println("Digite seu nome: ");
        String nomeCliente = scanner.nextLine();
        
        // Solicita e lê o saldo da conta (com casas decimais)
        System.out.println("Digite o Saldo de sua conta: ");
        double saldo = scanner.nextDouble();
        
        /* Exibe uma mensagem final formatada com os dados do cliente
        * Exemplo da Mensagem
        * "Olá [Nome Cliente], obrigado por criar uma conta em nosso banco, sua agência é [Agencia], conta [Numero] e seu saldo [Saldo] já está disponível para saque".
        */

        System.out.printf("%n Olá, %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo é R$ %.2f e já está disponível para saque.\n", nomeCliente, agencia, numero, saldo);

    }
}
