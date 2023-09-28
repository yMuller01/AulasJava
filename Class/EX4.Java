import java.util.Scanner;

public class EX4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int maiorIndiceAcidentes = Integer.MIN_VALUE;
        int menorIndiceAcidentes = Integer.MAX_VALUE;
        String cidadeMaiorIndice = "";
        String cidadeMenorIndice = "";
        int totalVeiculos = 0;
        int totalAcidentes = 0;
        int cidadesComMenos2000Veiculos = 0;
        int totalVeiculosMenos2000 = 0;

        for (int i = 1; i <= 5; i++) {
            System.out.println("Informe os dados da cidade #" + i);
            System.out.print("Código da cidade: ");
            int codigoCidade = scanner.nextInt();
            System.out.print("Número de veículos de passeio (em 2007): ");
            int veiculosPasseio = scanner.nextInt();
            System.out.print("Número de acidentes de trânsito com vítimas (em 2007): ");
            int acidentesTransito = scanner.nextInt();

            totalVeiculos += veiculosPasseio;
            totalAcidentes += acidentesTransito;

            if (veiculosPasseio < 2000) {
                cidadesComMenos2000Veiculos++;
                totalVeiculosMenos2000 += veiculosPasseio;
            }

            int indiceAcidentes = acidentesTransito / veiculosPasseio;

            if (indiceAcidentes > maiorIndiceAcidentes) {
                maiorIndiceAcidentes = indiceAcidentes;
                cidadeMaiorIndice = "Cidade #" + i;
            }

            if (indiceAcidentes < menorIndiceAcidentes) {
                menorIndiceAcidentes = indiceAcidentes;
                cidadeMenorIndice = "Cidade #" + i;
            }
        }

        System.out.println("a) Maior índice de acidentes de trânsito: " + maiorIndiceAcidentes + " (Cidade: " + cidadeMaiorIndice + ")");
        System.out.println("   Menor índice de acidentes de trânsito: " + menorIndiceAcidentes + " (Cidade: " + cidadeMenorIndice + ")");
        System.out.println("b) Média de veículos nas cinco cidades: " + (totalVeiculos / 5.0));
        
        if (cidadesComMenos2000Veiculos > 0) {
            System.out.println("c) Média de acidentes de trânsito nas cidades com menos de 2.000 veículos de passeio: " + (totalAcidentes / (double)cidadesComMenos2000Veiculos));
        } else {
            System.out.println("c) Não há cidades com menos de 2.000 veículos de passeio.");
        }

        scanner.close();
    }
}