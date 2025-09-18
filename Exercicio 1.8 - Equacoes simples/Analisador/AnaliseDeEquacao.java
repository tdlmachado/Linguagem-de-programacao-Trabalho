import java.util.Scanner;

public class AnaliseDeEquacao {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("=== Equação Simples ===");

        System.out.print("Digite o valor do coeficiente A: ");
        double a = input.nextDouble();

        System.out.print("Digite o valor do coeficiente B: ");
        double b = input.nextDouble();

        System.out.print("Digite o valor do coeficiente C: ");
        double c = input.nextDouble();

        double delta = Math.pow(b, 2) - (4 * a * c);

        if (delta > 0) {
            System.out.println("\nA equação possui pelo menos uma raiz real!");
            System.out.println("Valor da equação: "+delta);
        }else {
            System.out.println("\nA equação não possui nenhuma raiz real!");
            System.out.println("Valor da equação: "+ delta);
        }
    }
}