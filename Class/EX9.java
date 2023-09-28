import java.util.Scanner;

public class EX9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numAlunos = 6;
        int totalAprovados = 0;
        int totalExame = 0;
        int totalReprovados = 0;
        double somaMedias = 0;

        for (int i = 1; i <= numAlunos; i++) {
            System.out.println("Digite as notas do aluno #" + i);
            System.out.print("Nota 1: ");
            double nota1 = scanner.nextDouble();
            System.out.print("Nota 2: ");
            double nota2 = scanner.nextDouble();

            double media = (nota1 + nota2) / 2;
            somaMedias += media;

            System.out.println("Média aritmética: " + media);
            
            if (media <= 3.0) {
                System.out.println("Mensagem: Reprovado");
                totalReprovados++;
            } else if (media <= 7.0) {
                System.out.println("Mensagem: Exame");
                totalExame++;
            } else {
                System.out.println("Mensagem: Aprovado");
                totalAprovados++;
            }
            
            System.out.println(); // Linha em branco para separar os resultados dos alunos
        }

        double mediaClasse = somaMedias / numAlunos;

        System.out.println("Total de alunos aprovados: " + totalAprovados);
        System.out.println("Total de alunos de exame: " + totalExame);
        System.out.println("Total de alunos reprovados: " + totalReprovados);
        System.out.println("Média da classe: " + mediaClasse);

        scanner.close();
    }
}