import java.util.Scanner;

public class CaixaEletronico {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double saldo = 1000;
        int opcao;

        do {

            System.out.println("\n--- Caixa Eletrônico ---");
            System.out.println("1 - Ver saldo");
            System.out.println("2 - Depositar");
            System.out.println("3 - Sacar");
            System.out.println("4 - Sair");

            opcao = sc.nextInt();

            switch(opcao){

                case 1:
                    System.out.println("Saldo: R$ " + saldo);
                    break;

                case 2:
                    System.out.print("Valor do depósito: ");
                    double deposito = sc.nextDouble();
                    saldo += deposito;
                    System.out.println("Depósito realizado!");
                    break;

                case 3:
                    System.out.print("Valor do saque: ");
                    double saque = sc.nextDouble();

                    if(saque > saldo){
                        System.out.println("Saldo insuficiente!");
                    }else{
                        saldo -= saque;
                        System.out.println("Saque realizado!");
                    }
                    break;

                case 4:
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("Opção inválida!");

            }

        } while(opcao != 4);

        sc.close();
    }
}