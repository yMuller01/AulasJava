import java.util.Scanner;

public class EX14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor da dívida: R$");
        double valorDivida = scanner.nextDouble();

        System.out.println("\nTabela de Pagamento:");
        System.out.println("Valor da Dívida | Valor dos Juros | Quantidade de Parcelas | Valor da Parcela");

        for (int parcelas = 1; parcelas <= 12; parcelas += 3) {
            double juros = calcularJuros(valorDivida, parcelas);
            double valorParcela = calcularValorParcela(valorDivida, juros, parcelas);

            System.out.printf("R$%.2f | R$%.2f | %d | R$%.2f%n", valorDivida, juros, parcelas, valorParcela);
        }

        scanner.close();
    }

    public static double calcularJuros(double valor, int parcelas) {
        double percentualJuros = 0;

        if (parcelas == 1) {
            percentualJuros = 0;
        } else if (parcelas == 3) {
            percentualJuros = 10;
        } else if (parcelas == 6) {
            percentualJuros = 15;
        } else if (parcelas == 9) {
            percentualJuros = 20;
        } else if (parcelas == 12) {
            percentualJuros = 25;
        }

        return (percentualJuros / 100) * valor;
    }

    public static double calcularValorParcela(double valor, double juros, int parcelas) {
        return (valor + juros) / parcelas;
    }
}