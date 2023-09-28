public class EX7 {
    public static void main(String[] args) {
        int n = 8; // Número de termos a serem gerados
        int primeiroTermo = 0;
        int segundoTermo = 1;

        System.out.print("Sequência de Fibonacci (primeiros " + n + " termos): ");
        
        for (int i = 0; i < n; i++) {
            if (i < n - 1) {
                System.out.print(primeiroTermo + " - ");
            } else {
                System.out.print(primeiroTermo);
            }

            int proximoTermo = primeiroTermo + segundoTermo;
            primeiroTermo = segundoTermo;
            segundoTermo = proximoTermo;
        }

        System.out.println();
    }
}