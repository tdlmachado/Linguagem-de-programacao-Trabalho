import java.util.Scanner;

public class CalculadoraJuros {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double montante;
        double juros;
        double tempo;
        int n;

        System.out.print("Digite o montante atual: ");
        montante = input.nextDouble();

        System.out.print("Digite a taxa de juros (Ex: Digite 5% para 0.05%): ");
        juros = input.nextDouble();

        System.out.print("Digite o tempo total do juros: ");
        tempo = input.nextInt();

        System.out.print("Digite quantas vezes os juros são capitalizados: ");
        n = input.nextInt();

        juros = juros / 100;

        double total = montante * Math.pow(1 + (juros / n), n * tempo);

        System.out.printf("O total atual: %.2f ",total);


    }
}