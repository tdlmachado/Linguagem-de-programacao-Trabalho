import java.util.Scanner;

public class NotasAcademicas {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String conceito = "";

        System.out.print("Digite sua nota de [0 até 10]: ");
        double nota = input.nextDouble();

        if (nota >= 7 && nota <= 10) {
             conceito = "A";
        }else if (nota >= 4 && nota < 7) {
             conceito = "B";
        }else if (nota >= 0 && nota < 4) {
             conceito = "C";
        }

        switch (conceito) {
            case "A":
                System.out.println("Você está aprovado");
                break;
            case "B":
                System.out.println("Você ficou de recuperação");
                break;
            case "C":
                System.out.println("Você está reprovado");
                break;
        }
    }
}