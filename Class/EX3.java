import java.util.Scanner;

public class EX3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número N de valores a serem lidos: ");
        int N = scanner.nextInt();

        for (int i = 1; i <= N; i++) {
            System.out.print("Digite o valor #" + i + ": ");
            int valor = scanner.nextInt();
            long fatorial = calcularFatorial(valor);
            System.out.println("Valor: " + valor + " | Fatorial: " + fatorial);
        }

        scanner.close();
    }

    public static long calcularFatorial(int n) {
        if (n == 0) {
            return 1;
        }

        long fatorial = 1;
        for (int i = 1; i <= n; i++) {
            fatorial *= i;
        }

        return fatorial;
    }
}