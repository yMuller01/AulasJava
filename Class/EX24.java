import java.util.Scanner;

public class EX24 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int opcao;
        double salario;
        double imposto;
        double novoSalario;
        String classificacao;

        do {
            System.out.println("Menu de Opções:");
            System.out.println("1. Imposto");
            System.out.println("2. Novo salário");
            System.out.println("3. Classificação");
            System.out.println("4. Finalizar o programa");
            System.out.print("Digite a opção desejada: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Digite o salário do funcionário: ");
                    salario = scanner.nextDouble();

                    if (salario < 500) {
                        imposto = salario * 0.05;
                    } else if (salario >= 500 && salario <= 850) {
                        imposto = salario * 0.10;
                    } else {
                        imposto = salario * 0.15;
                    }

                    System.out.println("O valor do imposto é: R$" + imposto);
                    break;

                case 2:
                    System.out.print("Digite o salário do funcionário: ");
                    salario = scanner.nextDouble();

                    if (salario > 1500) {
                        novoSalario = salario + 25.0;
                    } else if (salario >= 750 && salario <= 1500) {
                        novoSalario = salario + 50.0;
                    } else if (salario >= 450 && salario < 750) {
                        novoSalario = salario + 75.0;
                    } else {
                        novoSalario = salario + 100.0;
                    }

                    System.out.println("O novo salário é: R$" + novoSalario);
                    break;

                case 3:
                    System.out.print("Digite o salário do funcionário: ");
                    salario = scanner.nextDouble();

                    if (salario <= 750) {
                        classificacao = "Mal remunerado";
                    } else {
                        classificacao = "Bem remunerado";
                    }

                    System.out.println("Classificação do funcionário: " + classificacao);
                    break;

                case 4:
                    System.out.println("Programa finalizado.");
                    break;

                default:
                    System.out.println("Opção inválida. Digite um número de 1 a 4.");
                    break;
            }

        } while (opcao != 4);

        scanner.close();
    }
}