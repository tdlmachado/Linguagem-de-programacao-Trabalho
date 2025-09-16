import java.util.Scanner;

public class CalculadoraIMC {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double imc = 0;

        // Entrada de dados para o calculo
        System.out.print("----- Entrada de Dados -----\n");
        System.out.print("Digite seu peso: ");
        double peso = input.nextDouble();

        System.out.print("Digite sua altura: ");
        double altura = input.nextDouble();

        // Calculo
        imc = peso/(altura*altura);

        // Imprime o resultado do calculo de IMC
        System.out.print("\n----- Resultado do seu IMC -----\n");
        System.out.printf("IMC = %.2f", imc);

        // If e Else para verificação da Classificação
        if  (imc<18.5) {
            System.out.println("\nClassificação: Magreza");
        }else if  (imc<24.9) {
            System.out.println("\nClassificação: Normal");
        }else if  (imc<29.9) {
            System.out.println("\nClassificação: Sobrepeso");
        }else if  (imc<34.9) {
            System.out.println("\nClassificação: Sobrepeso I");
        }else if  (imc<40) {
            System.out.println("\nClassificação: Sobrepeso II");
        }else{
            System.out.println("Obesidade gravissima");
        }
    }
}