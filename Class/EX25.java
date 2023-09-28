import java.util.Scanner;

public class EX25 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double precoUnitario;
        int paisOrigem;
        char meioTransporte;
        char cargaPerigosa;
        double valorImpostoTotal = 0;
        double valorTransporteTotal = 0;

        while (true) {
            System.out.print("Digite o preço unitário do produto (ou valor negativo para encerrar): ");
            precoUnitario = scanner.nextDouble();

            if (precoUnitario <= 0) {
                break;
            }

            System.out.print("Digite o país de origem (1 - Estados Unidos, 2 - México, 3 - Outros): ");
            paisOrigem = scanner.nextInt();

            System.out.print("Digite o meio de transporte (T - terrestre, F - fluvial, A - aéreo): ");
            meioTransporte = scanner.next().charAt(0);

            System.out.print("Carga perigosa (S - Sim, N - Não): ");
            cargaPerigosa = scanner.next().charAt(0);

            // Calcular o imposto
            double imposto = 0;
            if (precoUnitario <= 100) {
                imposto = precoUnitario * 0.05;
            } else {
                imposto = precoUnitario * 0.10;
            }
            valorImpostoTotal += imposto;

            // Calcular o valor do transporte
            double valorTransporte = 0;
            if (cargaPerigosa == 'S') {
                if (paisOrigem == 1) {
                    valorTransporte = 50.00;
                } else if (paisOrigem == 2) {
                    valorTransporte = 21.00;
                } else if (paisOrigem == 3) {
                    valorTransporte = 24.00;
                }
            } else {
                if (paisOrigem == 1) {
                    valorTransporte = 12.00;
                } else if (paisOrigem == 2) {
                    valorTransporte = 21.00;
                } else if (paisOrigem == 3) {
                    valorTransporte = 60.00;
                }
            }
            valorTransporteTotal += valorTransporte;

            // Calcular o valor do seguro
            double valorSeguro = 0;
            if (paisOrigem == 2 || meioTransporte == 'A') {
                valorSeguro = precoUnitario / 2;
            }

            // Calcular o preço final
            double precoFinal = precoUnitario + imposto + valorTransporte + valorSeguro;

            System.out.println("Valor do imposto: R$" + imposto);
            System.out.println("Valor do transporte: R$" + valorTransporte);
            System.out.println("Valor do seguro: R$" + valorSeguro);
            System.out.println("Preço final: R$" + precoFinal);
        }

        System.out.println("Total dos impostos: R$" + valorImpostoTotal);

        scanner.close();
    }
}