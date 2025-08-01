     import java.util.Scanner;    // Importa a classe Scanner para ler a entrada do usuário
     import java.util.Locale;    // Importa a classe Locale para configurar o padrão de números decimais

public class Main {
    //Estrtura Principal da Classe. Envelope da nossa Receita.
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in).useLocale(new Locale("pt", "BR"));

        double saldo = 1000.00; //Saldo incial da conta (ex)

     
        System.out.printf("Seu saldo incial é: R$ %.2f", saldo); //Exibe o saldo inicial formatado
        System.out.println("---------------------------------------");

        // Menu Principal e Leitura da Opção - Interação e Decisão
        System.out.println("--- MENU DE OPÇÕES ---");
        System.out.println("1 - Consultar Saldo");
        System.out.println("2 - Realizar Saque");
        System.out.println("3 - Realizar Depósito");
        System.out.println("4 - Sair");
        System.out.println("----------------------------------------\n");

        System.out.println("Digite a opção desejada (1-4):");
        int opcao = scanner.nextInt(); // Lê a opção do usuário
        scanner.nextLine(); // Consome o ENTER que sobrou após nextInt()

        // Processamento da opção com switch - Múltiplos Caminhos de Decisão
        switch (opcao) {
            case 1: // Opção: Consultar Saldo
                System.out.println("\n--- CONSULTA DE SALDO ---");
                System.out.printf("Seu saldo atual é: R$ %.2f\n", saldo);
                break; // Sai do switch

            case 2: // Opção: Realizar Saque
                System.out.println("\n--- REALIZE SAQUE ---");
                System.out.println("Digite o valor do saque: R$");
                double valorSaque = scanner.nextDouble(); // Lê o valor do saque
                scanner.nextLine(); // Consome o ENTER que sobrou

                // Validação do Saque (usando if e else)
                if (valorSaque <= 0) {
                    System.out.println("ERRO: O valor do saque deve ser maior que zero.");}

                else if (saldo >= valorSaque){ // Verifica se há saldo suficiente
                    saldo -= valorSaque; // Realiza o saque (saldo - saldo valorSaque)
                        System.out.println("Saque de R$" + String.format(Locale.of("pt", "BR"), "%.2f", valorSaque)
                                + " realizado com sucesso!");
                        System.out.printf("Novo saldo: R$ %.2f\n", saldo);}

                else { // Saldo insuficiente
                    System.out.println("ERRO: Saldo insuficiente para realizar o saque.");
                    System.out.printf("Seu saldo atual é: R$ %.2f\n, saldo");
                }
                break; // Sai do case
            case 3: // Opção: Realizar Depósito
                System.out.println("\n--- REALIZAR DEPÓSITO ---");
                System.out.println("Digite o valor do depósito: R$");
                double valorDeposito = scanner.nextDouble(); // Lê o valor do depósito
                scanner.nextLine(); // Consome o ENTER que sobrou

                // Validação do Depósito (usando if e else)
                if (valorDeposito <- 0){
                    System.out.println("ERRO: O valor do depósito deve ser maior que zero.");
                } else {
                    saldo += valorDeposito; // Realiza o depósito (saldo = saldo + valorDeposito)
                    System.out.println("Depósito de R$" + String.format(Locale.of("pt", "BR"), "%.2f", valorDeposito)
                    + "realizado com sucesso!");
                    System.out.printf("novo saldo: R$ %.2f\n", saldo);
                }
                break; // Sai do switch
            case 4: // Opção: Sair
                System.out.println("\n--- SAIR ---");
                System.out.println("Obrigado por usar nosso Caixa Eletônico! Volte sempre!");
                break;
            default: // Opção: Inválida (se o usuário digitar algo foira de 1-4)
                System.out.println("\nERRO: Opção inválida. Por favor, escolha um número de 1 a 4.");
                break;
        }
        System.out.println("\n---------------------------------------");
        System.out.println("Fim da operação.");

        scanner.close(); // Fecha o Scanner para liberar os recursos do sistema

    }
}