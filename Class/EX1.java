public class EX1 {
    public static void main(String[] args) {
        int anoContratacao = 2005;
        double salarioInicial = 1000.0;
        double percentualAumento = 0.015; // 1.5%
        int anoAtual = 2023; // Ano atual (você pode alterar este valor conforme necessário)

        double salarioAtual = salarioInicial;

        for (int ano = anoContratacao + 1; ano <= anoAtual; ano++) {
            percentualAumento *= 2; // O aumento do ano atual é o dobro do ano anterior
            salarioAtual += salarioAtual * percentualAumento; // Aumento do salário
        }

        System.out.println("O salário atual do funcionário em " + anoAtual + " é de R$" + salarioAtual);
    }
}
