package src.pagamentos;

import java.util.Scanner;

public class DinheiroPagamento implements Pagamento {

    @Override
    public void processar(double valor, Scanner scanner) {

        System.out.println("\n===== PAGAMENTO DINHEIRO =====");

        System.out.printf("Valor da compra: R$ %.2f%n", valor);

        System.out.print("Valor recebido: R$ ");

        double recebido;

        try {
            recebido = Double.parseDouble(
                scanner.nextLine().replace(",", ".")
            );

        } catch (NumberFormatException e) {
            System.out.println("Valor recebido invalido!");
            return;
        }

        if (recebido < valor) {

            System.out.println("Valor insuficiente!");
            return;
        }

        double troco = recebido - valor;

        System.out.printf("Valor recebido: R$ %.2f%n", recebido);
        System.out.printf("Troco: R$ %.2f%n", troco);

        System.out.println("\nPagamento simulado com sucesso!");
    }
}
