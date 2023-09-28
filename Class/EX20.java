import java.util.Scanner;

public class EX20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int codigo;
        char sexo;
        double salarioBruto;
        double salarioLiquido;
        double somaSalarioM = 0;
        double somaSalarioF = 0;
        int countM = 0;
        int countF = 0;

        System.out.println("Calculadora de Salário de Professores");
        System.out.println("-------------------------------------");

        while (true) {
            System.out.print("Digite o código do professor (ou 99999 para sair): ");
            codigo = scanner.nextInt();

            if (codigo == 99999) {
                break;
            }

            System.out.print("Digite o sexo do professor (M/F): ");
            sexo = scanner.next().charAt(0);

            System.out.print("Digite o número de horas/aula dadas mensalmente: ");
            int horasAula = scanner.nextInt();

            salarioBruto = horasAula * 30.0;

            if (sexo == 'M') {
                salarioLiquido = salarioBruto * 0.9;
                somaSalarioM += salarioLiquido;
                countM++;
            } else if (sexo == 'F') {
                salarioLiquido = salarioBruto * 0.95;
                somaSalarioF += salarioLiquido;
                countF++;
            } else {
                System.out.println("Sexo inválido. Digite M ou F.");
                continue; // Volta para o início do loop
            }

            System.out.println("Código: " + codigo);
            System.out.println("Salário Bruto: R$" + salarioBruto);
            System.out.println("Salário Líquido: R$" + salarioLiquido);
            System.out.println("-------------------------------------");
        }

        if (countM > 0) {
            double mediaSalarioM = somaSalarioM / countM;
            System.out.println("Média de Salários Líquidos dos Professores Masculinos: R$" + mediaSalarioM);
        } else {
            System.out.println("Nenhum professor masculino informado.");
        }

        if (countF > 0) {
            double mediaSalarioF = somaSalarioF / countF;
            System.out.println("Média de Salários Líquidos dos Professores Femininos: R$" + mediaSalarioF);
        } else {
            System.out.println("Nenhum professor feminino informado.");
        }

        scanner.close();
    }
}