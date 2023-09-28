import java.util.Scanner;

public class EX15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double custoTotalEstocagem = 0;

        for (int i = 1; i <= 12; i++) {
            System.out.println("Digite as informações do produto #" + i);
            System.out.print("Preço Unitário: R$");
            double precoUnitario = scanner.nextDouble();
            System.out.print("Refrigeração (S/N): ");
            char refrig = scanner.next().charAt(0);
            System.out.print("Categoria (A/L/V): ");
            char categoria = scanner.next().charAt(0);

            double custoEstocagem = calcularCustoEstocagem(precoUnitario, refrig, categoria);
            custoTotalEstocagem += custoEstocagem;

            System.out.println("Custo de Estocagem: R$" + custoEstocagem);
        }

        System.out.println("\nCusto Total de Estocagem: R$" + custoTotalEstocagem);

        scanner.close();
    }

    public static double calcularCustoEstocagem(double precoUnitario, char refrig, char categoria) {
        if (precoUnitario <= 20.0) {
            if (categoria == 'A') {
                return 2.0;
            } else if (categoria == 'L') {
                return 3.0;
            } else if (categoria == 'V') {
                return 4.0;
            }
        } else if (precoUnitario <= 50.0) {
            if (refrig == 'S') {
                return 6.0;
            } else {
                return 0.0;
            }
        } else {
            if (refrig == 'S') {
                if (categoria == 'A') {
                    return 5.0;
                } else if (categoria == 'L') {
                    return 2.0;
                } else if (categoria == 'V') {
                    return 4.0;
                }
            } else {
                if (categoria == 'A' || categoria == 'V') {
                    return 0.0;
                } else if (categoria == 'L') {
                    return 1.0;
                }
            }
        }

        return 0.0; // Valor padrão se nenhuma condição for atendida
    }
}