        /*
       Definir variaveis de saldo
       entrada de receita
       entrada de despesas
       Caso o saldo seja negativo exibir alerta
        * */
import java.util.Scanner;

public class ControleFinanceiro {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double Saldo, Receita =0, Despesa=0;

        System.out.print("---- Orcamento Pessoal ----\n");
        System.out.print("\t --> Receitas <--\n");
        System.out.print("Digite a quantidade de receitas no mês: ");
        double qtd_receita = input.nextDouble();

        for (int i = 1; i <= qtd_receita; i++) {
            System.out.print("Digite a " + i + "° receita do mês: ");
            Receita +=input.nextDouble();
        }
        System.out.print("\t --> Despesas <-- \n");
        System.out.print("Digite a quantidade de despesas no mês: ");
        double qtd_despesas = input.nextDouble();

        for (int i = 1; i <= qtd_despesas; i++) {
            System.out.print("Digite a " + i + "° despesa do mês: ");
            Despesa +=input.nextDouble();
        }

        Saldo = Receita - Despesa;

        System.out.printf("\nSaldo: R$ %.2f\n", Saldo);
        if (Saldo < 0) {
            System.out.println("--> Seu saldo está negativo, tome cuidado com as finanças!");
        }else  {
            System.out.printf("--> Parabéns seu saldo está positivo, continue assim!");
        }

    }
}