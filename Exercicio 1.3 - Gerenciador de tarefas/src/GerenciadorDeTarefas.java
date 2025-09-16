import java.util.Scanner;

public class GerenciadorDeTarefas {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Entrada da quantidade tarefas, este valor entra no vetor de "Qtd_tarefas" para que possamos entrar posteriormente com as tarefas.
        System.out.print("Digite a quantidade de tarefas: ");
        int Qtd_tarefas = input.nextInt();
        input.nextLine();

        // Criamos uma Array que armazena strings, com o Qtd_tarefa definindo o tamanho da array
        String[] tarefas = new String[Qtd_tarefas];

        System.out.println("-----------------");
        for (int i = 0; i < Qtd_tarefas; i++) {
            System.out.print("Digite a tarefa " + (i + 1) + ": ");
            tarefas[i] = input.nextLine(); // lê a tarefa completa
        }

        System.out.println("---- Lista de Tarefas ----");
        for (int i = 0; i < Qtd_tarefas; i++) {
            System.out.println(i+1+ "° - "+tarefas[i]);
        }
    }
}