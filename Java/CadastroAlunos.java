import java.util.ArrayList;
import java.util.Scanner;

class Aluno{
    String nome;
    double nota;

    Aluno(String nome, double nota){
        this.nome = nome;
        this.nota = nota;
    }
}

public class CadastroAlunos {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Aluno> alunos = new ArrayList<>();

        while(true){

            System.out.print("Nome do aluno: ");
            String nome = sc.nextLine();

            System.out.print("Nota do aluno: ");
            double nota = sc.nextDouble();
            sc.nextLine();

            alunos.add(new Aluno(nome, nota));

            System.out.print("Cadastrar outro aluno? (s/n): ");
            String resp = sc.nextLine();

            if(!resp.equalsIgnoreCase("s")){
                break;
            }
        }

        double soma = 0;
        double maiorNota = 0;
        String melhorAluno = "";

        System.out.println("\nLista de alunos:");

        for(Aluno a : alunos){

            System.out.println(a.nome + " - " + a.nota);

            soma += a.nota;

            if(a.nota > maiorNota){
                maiorNota = a.nota;
                melhorAluno = a.nome;
            }
        }

        double media = soma / alunos.size();

        System.out.println("\nMédia da turma: " + media);
        System.out.println("Melhor aluno: " + melhorAluno + " - " + maiorNota);

        sc.close();
    }
}