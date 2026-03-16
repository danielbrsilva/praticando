import java.util.Random;
import java.util.Scanner;

public class GeradorSenha {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String caracteres =
        "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%&*";

        System.out.print("Digite o tamanho da senha: ");
        int tamanho = sc.nextInt();

        Random rand = new Random();

        String senha = "";

        for(int i = 0; i < tamanho; i++){

            int indice = rand.nextInt(caracteres.length());

            senha += caracteres.charAt(indice);
        }

        System.out.println("Senha gerada: " + senha);

        sc.close();
    }
}