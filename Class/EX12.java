import java.util.Scanner;

public class  EX12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final double SALARIO_MINIMO = 450.0;
        final int NUM_OPERARIOS = 15;

        int operarioComMaiorSalario = -1;
        double maiorSalario = 0;
        int totalPecasFabricadas = 0;
        int totalPecasHomens = 0;
        int totalPecasMulheres = 0;
        double totalFolhaPagamento = 0;

        for (int i = 1; i <= NUM_OPERARIOS; i++) {
            System.out.println("Digite as informações do operário #" + i);
            System.out.print("Número de peças fabricadas no mês: ");
            int pecasFabricadas = scanner.nextInt();
            System.out.print("Sexo do operário (M/F): ");
            char sexo = scanner.next().charAt(0);

            double salario = calcularSalario(sexo, pecasFabricadas, SALARIO_MINIMO);
            totalFolhaPagamento += salario;

            if (salario > maiorSalario) {
                maiorSalario = salario;
                operarioComMaiorSalario = i;
            }

            totalPecasFabricadas += pecasFabricadas;

            if (sexo == 'M') {
                totalPecasHomens += pecasFabricadas;
            } else if (sexo == 'F') {
                totalPecasMulheres += pecasFabricadas;
            }
        }

        double mediaPecasHomens = (double) totalPecasHomens / (NUM_OPERARIOS / 2); // Assumindo que metade são homens
        double mediaPecasMulheres = (double) totalPecasMulheres / (NUM_OPERARIOS / 2); // Assumindo que metade são mulheres

        System.out.println("\nResumo da Fábrica:");
        System.out.println("Total da folha de pagamento da fábrica: R$" + totalFolhaPagamento);
        System.out.println("Número total de peças fabricadas no mês: " + totalPecasFabricadas);
        System.out.println("Média de peças fabricadas pelos homens: " + mediaPecasHomens);
        System.out.println("Média de peças fabricadas pelas mulheres: " + mediaPecasMulheres);
        System.out.println("Operário ou operária de maior salário: Operário #" + operarioComMaiorSalario);

        scanner.close();
    }

    public static double calcularSalario(char sexo, int pecasFabricadas, double salarioMinimo) {
        if (pecasFabricadas <= 30) {
            return salarioMinimo;
        } else if (sexo == 'M') {
            return salarioMinimo + 0.03 * salarioMinimo * (pecasFabricadas - 30);
        } else if (sexo == 'F') {
            return salarioMinimo + 0.05 * salarioMinimo * (pecasFabricadas - 30);
        }
        return salarioMinimo;
    }
}