import java.util.Scanner;

public class EX19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int soma = 0;

        while (true) {
            System.out.print("Digite o valor de m (inteiro e positivo): ");
            int m = scanner.nextInt();

            System.out.print("Digite o valor de n (inteiro e positivo): ");
            int n = scanner.nextInt();

            if (m >= n) {
                break; // Termina o loop se m for maior ou igual a n
            }

            for (int i = m; i <= n; i++) {
                soma += i;
            }
        }

        System.out.println("A soma de todos os números inteiros entre m e n é: " + soma);

        scanner.close();
    }
}