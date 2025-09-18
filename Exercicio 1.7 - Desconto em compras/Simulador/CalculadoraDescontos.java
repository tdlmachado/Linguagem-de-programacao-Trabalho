import java.util.Scanner;

public class CalculadoraDescontos {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int Valor;
        double ValorFinal;

        System.out.print("Digite o Valor da sua compra: ");
        Valor = input.nextInt();

        if (Valor > 0 && Valor < 100) {
            System.out.print("Sua compra não se enquadra em nosso desconto!");
            System.out.print("Valor final: "+Valor);

        }else if (Valor >= 100 && Valor < 500) {
            ValorFinal = Valor + (Valor * 0.1);
            System.out.println("Sua compra recebeu um desconto de 10% no valor");
            System.out.print("Valor final: "+ValorFinal);

        }else if (Valor >= 500) {
            ValorFinal = Valor + (Valor * 0.2);
            System.out.println("Sua compra recebeu um desconto de 20% no valor");
            System.out.print("Valor final: "+ValorFinal);
        }
    }
}