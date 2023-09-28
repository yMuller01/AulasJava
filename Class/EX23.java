import java.util.Scanner;

public class EX23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double salarioMinimo;
        double valorQuilowatt;
        double faturamentoGeral = 0;
        int consumidoresEntre500e1000 = 0;

        System.out.print("Digite o valor do salário mínimo: ");
        salarioMinimo = scanner.nextDouble();

        // Calcula o valor de cada quilowatt (um oitavo do salário mínimo)
        valorQuilowatt = salarioMinimo / 8.0;

        System.out.println("Tipo de Consumidor: ");
        System.out.println("1 - Residencial");
        System.out.println("2 - Comercial");
        System.out.println("3 - Industrial");

        while (true) {
            System.out.print("Digite o tipo de consumidor (ou 0 para encerrar): ");
            int tipoConsumidor = scanner.nextInt();

            if (tipoConsumidor == 0) {
                break;
            }

            System.out.print("Digite a quantidade de quilowatts gasta: ");
            double quilowattsGastos = scanner.nextDouble();

            // Calcula o valor a ser pago por cada consumidor com acréscimo
            double valorConta = quilowattsGastos * valorQuilowatt;

            switch (tipoConsumidor) {
                case 1:
                    valorConta += (5.0 / 100) * valorConta;
                    break;
                case 2:
                    valorConta += (10.0 / 100) * valorConta;
                    break;
                case 3:
                    valorConta += (15.0 / 100) * valorConta;
                    break;
            }

            // Atualiza o faturamento geral da empresa
            faturamentoGeral += valorConta;

            // Verifica se a conta está entre R$ 500,00 e R$ 1.000,00
            if (valorConta >= 500 && valorConta <= 1000) {
                consumidoresEntre500e1000++;
            }
        }

        System.out.println("Valor de cada quilowatt: R$" + valorQuilowatt);
        System.out.println("Faturamento geral da empresa: R$" + faturamentoGeral);
        System.out.println("Quantidade de consumidores que pagam entre R$ 500,00 e R$ 1.000,00: " + consumidoresEntre500e1000);

        scanner.close();
    }
}