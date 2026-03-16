import java.util.Scanner;

public class Contador{

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite uma frase: ");
        String texto = scanner.nextLine();

        String[] palavras = texto.trim().split("\\s+");

        int total = texto.trim().isEmpty() ? 0 : palavras.length;

        System.out.println("Total de palavras: " + total);

        scanner.close();
    }

}