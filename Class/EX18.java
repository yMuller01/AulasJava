import java.util.Scanner;

public class EX18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Tabela de Valores, Quadrados, Cubos e Raiz Quadrada");
        System.out.println("---------------------------------------------------");
        System.out.println("Valor   | Quadrado |  Cubo   | Raiz Quadrada");
        System.out.println("--------------------------------------------");

        while (true) {
            System.out.print("Digite um valor (negativo ou 0 para sair): ");
            double valor = scanner.nextDouble();

            if (valor <= 0) {
                break; // Sai do loop quando o valor for negativo ou zero
            }

            double quadrado = valor * valor;
            double cubo = valor * valor * valor;
            double raizQuadrada = Math.sqrt(valor);

            System.out.printf("%.2f  | %.2f    | %.2f  | %.2f%n", valor, quadrado, cubo, raizQuadrada);
        }

        scanner.close();
    }
}