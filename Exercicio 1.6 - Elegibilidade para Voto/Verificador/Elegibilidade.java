import java.util.Scanner;

public class Elegibilidade {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String Nome = input.nextLine();

        System.out.print("Digite sua idade: ");
        int Idade = input.nextInt();

        System.out.println("Digite sua nacionalidade [brasileiro] ou [estrangeiro]: ");
        String pais = input.next().toLowerCase();

        boolean brasileiro = pais.equals("brasileiro");

        System.out.println("\n========= Candidatos =========");
        System.out.println("[1] - para canditado 11");
        System.out.println("[2] - para canditado 22");
        System.out.println("[3] - para canditado 33");
        System.out.println("[4] - para canditado 44");
        System.out.print("Digite o número do candidato que você deseja votar: ");
        int voto = input.nextInt();

        System.out.println("\n===== Ficha de Voto =====");
        if (brasileiro && Idade >= 16) {
            System.out.println("Nome: " + Nome);
            System.out.println("Idade: " + Idade + " anos");
            if(voto == 1){
                System.out.println("você votou no canditato 11");
            }else if(voto == 2){
                System.out.println("você votou no canditato 22");
            }else if(voto == 3){
                System.out.println("você votou no canditato 33");
            }else if(voto == 4){
                System.out.println("você votou no canditato 44");
            }else{
                System.out.println("Este candidato não existe");
            }
            System.out.println("--- Seu voto foi confirmado ---");

        } else {
            System.out.println("Você não pode votar pois é menor de 16 anos ou estrangeiro");
        }
    }
}