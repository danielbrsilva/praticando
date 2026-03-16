import java.util.ArrayList;
import java.util.Scanner;

class Produto{
    String nome;
    double preco;

    Produto(String nome, double preco){
        this.nome = nome;
        this.preco = preco;
    }
}

public class CarrinhoCompras {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Produto> carrinho = new ArrayList<>();

        while(true){

            System.out.print("Nome do produto: ");
            String nome = sc.nextLine();

            System.out.print("Preço do produto: ");
            double preco = sc.nextDouble();
            sc.nextLine();

            carrinho.add(new Produto(nome, preco));

            System.out.print("Adicionar outro produto? (s/n): ");
            String resp = sc.nextLine();

            if(!resp.equalsIgnoreCase("s")){
                break;
            }
        }

        double total = 0;

        System.out.println("\nProdutos no carrinho:");

        for(Produto p : carrinho){

            System.out.println(p.nome + " - R$ " + p.preco);

            total += p.preco;
        }

        System.out.println("\nTotal da compra: R$ " + total);
        System.out.println("Quantidade de produtos: " + carrinho.size());

        sc.close();
    }
}