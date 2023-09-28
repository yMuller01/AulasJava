import java.util.Scanner;

public class EX6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final double SALARIO_MINIMO = 450.0;

        int numFuncionarios = 10;
        String[] codigo = new String[numFuncionarios];
        int[] horasTrabalhadas = new int[numFuncionarios];
        char[] turnoTrabalho = new char[numFuncionarios];
        char[] categoria = new char[numFuncionarios];
        double[] valorHoraTrabalhada = new double[numFuncionarios];
        double[] salarioInicial = new double[numFuncionarios];
        double[] auxilioAlimentacao = new double[numFuncionarios];
        double[] salarioFinal = new double[numFuncionarios];

        for (int i = 0; i < numFuncionarios; i++) {
            System.out.println("Digite as informações do funcionário #" + (i + 1));
            System.out.print("Código: ");
            codigo[i] = scanner.next();
            System.out.print("Número de horas trabalhadas no mês: ");
            horasTrabalhadas[i] = scanner.nextInt();
            System.out.print("Turno de trabalho (M - Matutino, V - Vespertino, N - Noturno): ");
            turnoTrabalho[i] = scanner.next().charAt(0);
            System.out.print("Categoria (O - Operário, G - Gerente): ");
            categoria[i] = scanner.next().charAt(0);

            // Calcular valor da hora trabalhada
            if (categoria[i] == 'G') {
                if (turnoTrabalho[i] == 'N') {
                    valorHoraTrabalhada[i] = 0.18 * SALARIO_MINIMO;
                } else if (turnoTrabalho[i] == 'M' || turnoTrabalho[i] == 'V') {
                    valorHoraTrabalhada[i] = 0.15 * SALARIO_MINIMO;
                } else {
                    System.out.println("Turno de trabalho inválido para a categoria Gerente.");
                    valorHoraTrabalhada[i] = 0;
                }
            } else if (categoria[i] == 'O') {
                if (turnoTrabalho[i] == 'N') {
                    valorHoraTrabalhada[i] = 0.13 * SALARIO_MINIMO;
                } else if (turnoTrabalho[i] == 'M' || turnoTrabalho[i] == 'V') {
                    valorHoraTrabalhada[i] = 0.10 * SALARIO_MINIMO;
                } else {
                    System.out.println("Turno de trabalho inválido para a categoria Operário.");
                    valorHoraTrabalhada[i] = 0;
                }
            } else {
                System.out.println("Categoria de funcionário inválida.");
                valorHoraTrabalhada[i] = 0;
            }

            // Calcular salário inicial
            salarioInicial[i] = valorHoraTrabalhada[i] * horasTrabalhadas[i];

            // Calcular auxílio-alimentação
            if (salarioInicial[i] <= 300.0) {
                auxilioAlimentacao[i] = 0.20 * salarioInicial[i];
            } else if (salarioInicial[i] <= 600.0) {
                auxilioAlimentacao[i] = 0.15 * salarioInicial[i];
            } else {
                auxilioAlimentacao[i] = 0.05 * salarioInicial[i];
            }

            // Calcular salário final
            salarioFinal[i] = salarioInicial[i] + auxilioAlimentacao[i];
        }

        // Exibir informações dos funcionários
        System.out.println("\nInformações dos funcionários:");
        System.out.println("Código | Horas Trabalhadas | Valor Hora | Salário Inicial | Auxílio-Alimentação | Salário Final");
        for (int i = 0; i < numFuncionarios; i++) {
            System.out.printf("%s | %d | R$%.2f | R$%.2f | R$%.2f | R$%.2f%n", codigo[i], horasTrabalhadas[i],
                    valorHoraTrabalhada[i], salarioInicial[i], auxilioAlimentacao[i], salarioFinal[i]);
        }

        scanner.close();
    }
}
