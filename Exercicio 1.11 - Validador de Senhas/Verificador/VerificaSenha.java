import java.util.Scanner;

/*
Validador de Senhas: Leia uma senha e verifique critérios (comprimento >=8, tem maiúscula, número) com if-else. Use switch
para níveis de força. Extensão: Integre em segurança de software para autenticação.
 */

public class VerificaSenha {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int ContNumero = 0, ContMaiusculo = 0;
        String forcaSenha = "";
        boolean achouNumero = false;
        boolean achouMaiuscula = false;

        System.out.println("-----------------------");
        System.out.println("=== Pagina de login ===");
        System.out.println("-----------------------");
        System.out.println("Requisitos de senha ");
        System.out.println("[8 digitos] [Letra maiuscula] [um número] ");
        System.out.println("-----------------------");
        System.out.print("Digite sua senha: ");
        String senha = input.nextLine();

        System.out.println("-----------------------");

        for (char VerificaSenha : senha.toCharArray()) {
            if (VerificaSenha >= '0' && VerificaSenha <= '9') {
                achouNumero = true;
                ContNumero++;
            } else if (VerificaSenha >= 'A' && VerificaSenha <= 'Z') {
                achouMaiuscula = true;
                ContMaiusculo++;
            }
        }

        if (senha.length() >= 8 && achouNumero && achouMaiuscula) {
            System.out.println("Senha válida!");
            System.out.println("Senha cadastrada: "+senha);

            if((ContNumero <= 2 && ContNumero >= 1) || (ContMaiusculo <= 2 && ContMaiusculo >= 1)){
                forcaSenha = "Facil";
            }else if(ContNumero > 2 && ContMaiusculo > 2){
                forcaSenha = "Forte";
            }

            switch (forcaSenha) {
                case "Facil":
                    System.out.println("Sua senha é de simples segurança!");
                    break;
                case "Forte":
                    System.out.println("Sua senha é de forte segurança!");
                    break;
            }
        } else {
            System.out.println("Senha inválida!");
        }
    }
}