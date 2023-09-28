public class EX17 {
    public static void main(String[] args) {
        double salarioCarlos = 3000.0; // Salário de Carlos em reais
        double salarioJoao = salarioCarlos / 3.0; // Salário de João em reais
        double rendimentoMensalCarlos = salarioCarlos * 0.02; // Rendimento mensal da poupança de Carlos em reais
        double rendimentoMensalJoao = salarioJoao * 0.05; // Rendimento mensal do fundo de renda fixa de João em reais
        int meses = 0;

        while (salarioJoao <= salarioCarlos) {
            salarioCarlos += rendimentoMensalCarlos;
            salarioJoao += rendimentoMensalJoao;
            meses++;
        }

        System.out.println("Levará " + meses + " meses para que o valor pertencente a João iguale ou ultrapasse o valor pertencente a Carlos.");
    }
}