import java.util.Scanner;

public class EX16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Calculadora de Área de Triângulo");
        System.out.print("Digite o valor da base (maior que 0): ");
        double base = lerMedidaValida(scanner);

        System.out.print("Digite o valor da altura (maior que 0): ");
        double altura = lerMedidaValida(scanner);

        double area = calcularAreaTriangulo(base, altura);

        System.out.println("A área do triângulo é: " + area);

        scanner.close();
    }

    public static double lerMedidaValida(Scanner scanner) {
        double medida = scanner.nextDouble();

        while (medida <= 0) {
            System.out.println("Valor inválido. Digite um valor maior que 0: ");
            medida = scanner.nextDouble();
        }

        return medida;
    }

    public static double calcularAreaTriangulo(double base, double altura) {
        return (base * altura) / 2.0;
    }
}