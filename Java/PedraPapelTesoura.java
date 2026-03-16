import java.util.Random;
import java.util.Scanner;

public class PedraPapelTesoura {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        String[] opcoes = {"pedra", "papel", "tesoura"};

        System.out.println("Escolha pedra, papel ou tesoura:");
        String usuario = sc.nextLine();

        String computador = opcoes[rand.nextInt(3)];

        System.out.println("Computador escolheu: " + computador);

        if(usuario.equals(computador)){
            System.out.println("Empate!");
        }
        else if(
            (usuario.equals("pedra") && computador.equals("tesoura")) ||
            (usuario.equals("tesoura") && computador.equals("papel")) ||
            (usuario.equals("papel") && computador.equals("pedra"))
        ){
            System.out.println("Você venceu!");
        }
        else{
            System.out.println("Computador venceu!");
        }

        sc.close();
    }
}