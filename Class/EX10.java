import java.util.Scanner;

public class EX10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numTimes = 5;
        int numJogadoresPorTime = 11;
        int totalJogadores = numTimes * numJogadoresPorTime;
        int jogadoresMenos18Anos = 0;
        double somaAlturas = 0;
        double mediaAlturaCampeonato = 0;
        int jogadoresMais80Kg = 0;

        for (int i = 1; i <= numTimes; i++) {
            System.out.println("Time #" + i);
            for (int j = 1; j <= numJogadoresPorTime; j++) {
                System.out.println("Digite os dados do jogador #" + j);
                System.out.print("Idade: ");
                int idade = scanner.nextInt();
                System.out.print("Peso (em quilos): ");
                double peso = scanner.nextDouble();
                System.out.print("Altura (em metros): ");
                double altura = scanner.nextDouble();

                if (idade < 18) {
                    jogadoresMenos18Anos++;
                }

                somaAlturas += altura;

                if (peso > 80.0) {
                    jogadoresMais80Kg++;
                }
            }
        }

        mediaAlturaCampeonato = somaAlturas / totalJogadores;

        System.out.println("Quantidade de jogadores com idade inferior a 18 anos: " + jogadoresMenos18Anos);
        System.out.println("Média das alturas de todos os jogadores do campeonato: " + mediaAlturaCampeonato + " metros");
        System.out.println("Percentagem de jogadores com mais de 80 quilos entre todos os jogadores do campeonato: " + 
                           ((double)jogadoresMais80Kg / totalJogadores) * 100 + "%");

        scanner.close();
    }
}