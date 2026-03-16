import java.util.ArrayList;
import java.util.Scanner;

public class CadastroMusicas {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<String> musicas = new ArrayList<>();

        while(true){

            System.out.println("\nMenu");
            System.out.println("1 - Adicionar música");
            System.out.println("2 - Remover música");
            System.out.println("3 - Listar músicas");
            System.out.println("4 - Sair");

            int opcao = sc.nextInt();
            sc.nextLine();

            if(opcao == 1){

                System.out.print("Nome da música: ");
                String musica = sc.nextLine();

                musicas.add(musica);

            }

            else if(opcao == 2){

                System.out.print("Nome da música para remover: ");
                String musica = sc.nextLine();

                if(musicas.remove(musica)){
                    System.out.println("Música removida!");
                }else{
                    System.out.println("Música não encontrada");
                }

            }

            else if(opcao == 3){

                System.out.println("\nLista de músicas:");

                for(String m : musicas){
                    System.out.println("- " + m);
                }

            }

            else if(opcao == 4){
                break;
            }

        }

        sc.close();
    }
}