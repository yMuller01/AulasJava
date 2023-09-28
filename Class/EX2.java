import java.util.Scanner;

public class EX2 {
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um valor inteiro positivo N: ");
        int N = scanner.nextInt();

        double E = 1.0;
        double fatorial = 1.0;

        for (int i = 1; i <= N; i++) {
            fatorial *= i;
            E += 1.0 / fatorial;
        }

        System.out.println("O valor de E é: " + E);

        scanner.close();
    }
}
