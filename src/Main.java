import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int matricula;
        double nota;
        int maiorMatricula01 = 0;
        double maiorNota01 = 0.0;
        int maiorMatricula02 = 0;
        double maiorNota02 = 0.0;

        for (int i = 0; i < 3; i++){
            System.out.println("Informe a nota do aluno " + (i + 1) + ":");
            nota = input.nextDouble();
            System.out.println("Informe o número da matricula do aluno " + (i + 1) + ":");
            matricula = input.nextInt();

            if (nota > maiorNota01) {
                maiorNota02 = maiorNota01;
                maiorMatricula02 = maiorMatricula01;

                maiorNota01 = nota;
                maiorMatricula01 = matricula;

            }else if (nota > maiorNota02) {
                maiorNota02 = nota;
                maiorMatricula02 = matricula;
            }
        }
        System.out.println("Aluno com a maior nota:");
        System.out.println("Matricula: " + maiorMatricula01 + " - Nota: " + maiorNota01);

        System.out.println("Aulo com seguna maior nota:");
        System.out.println("Matricula: " + maiorMatricula02 + " - Nota: " + maiorNota02);
        input.close();
    }
}