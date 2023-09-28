import java.util.Scanner;

public class EX22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int idade;
        char sexo;
        char experiencia;
        int totalCandidatos = 0;
        int totalFeminino = 0;
        int totalMasculino = 0;
        int totalHomensComExperiencia = 0;
        int somaIdadeHomensComExperiencia = 0;
        int totalHomensMaisDe45 = 0;
        int totalMulheresMenosDe21ComExperiencia = 0;
        int menorIdadeMulherExperiencia = Integer.MAX_VALUE;

        System.out.println("Digite as informações dos candidatos (digite 0 para encerrar a entrada de dados):");

        while (true) {
            System.out.print("Idade: ");
            idade = scanner.nextInt();

            if (idade == 0) {
                break;
            }

            System.out.print("Sexo (M/F): ");
            sexo = scanner.next().charAt(0);

            System.out.print("Experiência (S/N): ");
            experiencia = scanner.next().charAt(0);

            totalCandidatos++;

            if (sexo == 'M') {
                totalMasculino++;

                if (experiencia == 'S') {
                    totalHomensComExperiencia++;
                    somaIdadeHomensComExperiencia += idade;

                    if (idade > 45) {
                        totalHomensMaisDe45++;
                    }
                }
            } else if (sexo == 'F') {
                totalFeminino++;

                if (idade < 21 && experiencia == 'S') {
                    totalMulheresMenosDe21ComExperiencia++;
                }

                if (experiencia == 'S' && idade < menorIdadeMulherExperiencia) {
                    menorIdadeMulherExperiencia = idade;
                }
            }
        }

        double idadeMediaHomensComExperiencia = (totalHomensComExperiencia > 0)
                ? (double) somaIdadeHomensComExperiencia / totalHomensComExperiencia
                : 0;

        double percentagemHomensMaisDe45 = (totalHomensComExperiencia > 0)
                ? (double) totalHomensMaisDe45 * 100 / totalHomensComExperiencia
                : 0;

        System.out.println("Número de candidatos do sexo feminino: " + totalFeminino);
        System.out.println("Número de candidatos do sexo masculino: " + totalMasculino);
        System.out.println("Idade média dos homens com experiência: " + idadeMediaHomensComExperiencia);
        System.out.println("Percentagem de homens com mais de 45 anos: " + percentagemHomensMaisDe45 + "%");
        System.out.println("Número de mulheres com menos de 21 anos e com experiência: " + totalMulheresMenosDe21ComExperiencia);
        System.out.println("Menor idade entre as mulheres com experiência: " + ((menorIdadeMulherExperiencia != Integer.MAX_VALUE) ? menorIdadeMulherExperiencia : "N/A"));

        scanner.close();
    }
}