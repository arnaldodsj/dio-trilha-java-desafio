import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        // Importar a classe Scanner
        Scanner scanner = new Scanner(System.in);

        //  Exibir mensagens para os nossos usuários
        System.out.println("Bem-vindo ao Banco Digital!");
        
        // Obter os valores digitados no terminal
        System.out.print("Por favor, digite o número da Agência: ");
        String agencia = scanner.nextLine();
        
        System.out.print("Por favor, digite o número da Conta: ");
        int numero = scanner.nextInt();
        
        // Limpar o caractere de nova linha do buffer
        scanner.nextLine();
        
        System.out.print("Por favor, digite o nome do Titular: ");
        String titular = scanner.nextLine();
        
        System.out.print("Por favor, digite o saldo inicial: ");
        double saldo = scanner.nextDouble();
        
        // Exibir a mensagem conta criada
        System.out.println("\nConta criada com sucesso!");
        System.out.println("Agência: " + agencia);
        System.out.println("Número: " + numero);
        System.out.println("Titular: " + titular);
        System.out.println("Saldo: R$ " + saldo);
        
        // Fechar o scanner para evitar vazamento de recursos
        scanner.close();
    }
}
