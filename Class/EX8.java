import java.util.Scanner;

public class EX8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número de termos da série: ");
        int numTermos = scanner.nextInt();

        int valor = 2;

        for (int i = 0; i < numTermos; i++) {
            if (i % 2 == 0) {
                valor *= 3;
            } else {
                valor *= 4;
            }

            if (i < numTermos - 1) {
                System.out.print(valor + ", ");
            } else {
                System.out.print(valor);
            }
        }

        System.out.println();

        scanner.close();
    }
}