import java.util.Scanner;

public class EX11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro maior que 1: ");
        int numero = scanner.nextInt();

        boolean primo = isPrimo(numero);

        if (primo) {
            System.out.println(numero + " é um número primo.");
        } else {
            System.out.println(numero + " não é um número primo.");
        }

        scanner.close();
    }

    public static boolean isPrimo(int numero) {
        if (numero <= 1) {
            return false; // Números menores ou iguais a 1 não são primos
        }

        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false; // Encontrou um divisor, não é primo
            }
        }

        return true; // Não encontrou nenhum divisor, é primo
    }
}