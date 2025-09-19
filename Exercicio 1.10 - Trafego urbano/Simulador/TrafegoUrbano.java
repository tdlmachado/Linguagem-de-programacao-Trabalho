import java.util.Scanner;

public class TrafegoUrbano {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int LimiteDeVelocidade = 60;

        System.out.print("Digite sua velocidade: ");
        double Velocidade = input.nextDouble();

        System.out.print("--- Sinal de transito ---");
        System.out.print("\n\t [Vermelho]");
        System.out.print("\n\t [Amarelo]");
        System.out.print("\n\t  [Verde]");
        System.out.print("\n-------------------------\n");
        System.out.print("Digite o sinal do semáforo: ");
        String sinal = input.next().toLowerCase();
        System.out.print("-------------------------\n");

        if(Velocidade > LimiteDeVelocidade){
            if (Velocidade <= LimiteDeVelocidade + 10){
                System.out.println("\nMulta leve por excesso de velocidade!");
            }else{
                System.out.println("Multa grave por excesso de velocidade!");
            }
        }else{
            System.out.println("Você está dentro do limite de velocidade!");
        }

        switch (sinal){
            case "vermelho":
                System.out.println("--> O sinal está fechado, aguarde ele abrir!");
                break;
            case "amarelo":
                System.out.println("--> O sinal está amarelo, diminua a velocidade!");
                break;
            case "verde":
                System.out.println("--> O sinal está aberto, pode prosseguir!");
                break;
        }
    }
}