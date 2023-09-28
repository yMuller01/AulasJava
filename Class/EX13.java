import java.util.Scanner;

public class EX13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número de crianças nascidas no período: ");
        int numCriancasNascidas = scanner.nextInt();

        int criancasFemininoMortas = 0;
        int criancasMasculinoMortas = 0;
        int criancasMenos24Meses = 0;

        for (int i = 1; i <= numCriancasNascidas; i++) {
            System.out.println("Digite as informações da criança #" + i);
            System.out.print("Sexo (M ou F): ");
            char sexo = scanner.next().charAt(0);
            System.out.print("Tempo de vida (em meses): ");
            int tempoVida = scanner.nextInt();

            if (sexo == 'F' && tempoVida == 0) {
                criancasFemininoMortas++;
            }

            if (sexo == 'M' && tempoVida == 0) {
                criancasMasculinoMortas++;
            }

            if (tempoVida <= 24) {
                criancasMenos24Meses++;
            }
        }

        double porcentagemFemininoMortas = (double) criancasFemininoMortas / numCriancasNascidas * 100;
        double porcentagemMasculinoMortas = (double) criancasMasculinoMortas / numCriancasNascidas * 100;
        double porcentagemMenos24Meses = (double) criancasMenos24Meses / numCriancasNascidas * 100;

        System.out.println("\nResultados:");
        System.out.println("Percentagem de crianças do sexo feminino mortas: " + porcentagemFemininoMortas + "%");
        System.out.println("Percentagem de crianças do sexo masculino mortas: " + porcentagemMasculinoMortas + "%");
        System.out.println("Percentagem de crianças que viveram 24 meses ou menos: " + porcentagemMenos24Meses + "%");

        scanner.close();
    }
}