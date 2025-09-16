import java.util.Scanner;

public class Conversor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        /* Fazemos a entrada de dados para a conversão de temperatura
           Escolhemos o tipo de temperatura que estamos dando entrada
           A temperatura atual que queremos realizar a conversão
           O codigo realiza a conversão automática conforme detalhado os calculos
           Imprime a temperatura já convertida
         */

        int[] Origem =  new int[2];
        double ValorConvertido = 0;

        System.out.print("--- Tipo de Temperatura ---");
        System.out.print("\n[1] - Celsius");
        System.out.print("\n[2] - Fahrenheit");
        System.out.print("\n[3] - Kelvin");
        System.out.print("\n---------------------------\n");
        System.out.print("Digite a unidade de origem: ");
        Origem[0] = input.nextInt();

        System.out.print("Digite a temperatura atual: ");
        double temperatura = input.nextDouble();

        System.out.print("Digite a unidade de destino: ");
        Origem[1] = input.nextInt();

        switch(Origem[0]) {
            case 1:
                if (Origem[1] == 2) {
                    ValorConvertido = (1.8 * temperatura) + 32;
                }else{
                    ValorConvertido = temperatura + 273.15;
                }break;
            case 2:
                if (Origem[1] == 1) {
                    ValorConvertido = (temperatura - 32) / 1.8;
                }else {
                    ValorConvertido = (temperatura - 32) / 1.83 + 273.15;
                }break;
            case 3:
                if (Origem[1] == 1) {
                    ValorConvertido = temperatura - 273.15;
                }else  {
                    ValorConvertido = (temperatura - 273.15) * 1.8 + 32;
                }break;

        }

        System.out.print("--------------------------\n");
        System.out.print("A temperatura convertida é: "+ValorConvertido);
    }
}