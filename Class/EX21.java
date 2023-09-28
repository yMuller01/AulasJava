import java.util.Scanner;

public class EX21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numero;
        int soma = 0;
        int quantidade = 0;
        int maior = Integer.MIN_VALUE;
        int menor = Integer.MAX_VALUE;
        int somaPares = 0;
        int quantidadePares = 0;
        int quantidadeImpares = 0;

        System.out.println("Digite números para calcular estatísticas (digite 30.000 para encerrar):");

        while (true) {
            numero = scanner.nextInt();

            if (numero == 30000) {
                break;
            }

            soma += numero;
            quantidade++;

            if (numero > maior) {
                maior = numero;
            }

            if (numero < menor) {
                menor = numero;
            }

            if (numero % 2 == 0) {
                somaPares += numero;
                quantidadePares++;
            } else {
                quantidadeImpares++;
            }
        }

        double media = (double) soma / quantidade;
        double mediaPares = (quantidadePares > 0) ? (double) somaPares / quantidadePares : 0;
        double percentagemImpares = (double) (quantidadeImpares * 100) / quantidade;

        System.out.println("Soma dos números digitados: " + soma);
        System.out.println("Quantidade de números digitados: " + quantidade);
        System.out.println("Média dos números digitados: " + media);
        System.out.println("Maior número digitado: " + maior);
        System.out.println("Menor número digitado: " + menor);
        System.out.println("Média dos números pares: " + mediaPares);
        System.out.println("Percentagem dos números ímpares: " + percentagemImpares + "%");

        scanner.close();
    }
}