import java.util.Scanner;

public class Login {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String usuarioCorreto = "admin";
        String senhaCorreta = "1234";

        int tentativas = 3;

        while (tentativas > 0) {

            System.out.print("Usuário: ");
            String usuario = scanner.nextLine();

            System.out.print("Senha: ");
            String senha = scanner.nextLine();

            if (usuario.equals(usuarioCorreto) && senha.equals(senhaCorreta)) {
                System.out.println("Acesso permitido");
                break;
            } else {
                tentativas--;
                System.out.println("Usuário ou senha incorretos");

                if (tentativas > 0) {
                    System.out.println("Tentativas restantes: " + tentativas);
                }
            }
        }

        if (tentativas == 0) {
            System.out.println("Conta bloqueada");
        }

        scanner.close();
    }
}