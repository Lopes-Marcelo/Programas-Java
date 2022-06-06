import java.util.Scanner;

public class AAAAANotaFinal {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Informe a nota do trabalho de laboratório: ");
        double nota_trab = teclado.nextDouble();
        System.out.println("Informe a nota da avaliação semestral: ");
        double aval_sem = teclado.nextDouble();
        System.out.println("Informe a nota do exame: ");
        double exame = teclado.nextDouble();

        double media = (nota_trab * 2 + aval_sem * 3 + exame * 5)/ 10;

        System.out.println("Média Ponderada: " + media);

        if ((media >= 8) && (media <= 10)){
            System.out.println("Obteve conceito A.");
        } else if ((media >= 7) && (media < 8)){
            System.out.println("Obteve conceito B.");
        } else if ((media >= 6) && (media <= 7)){
            System.out.println("Obteve conceito C.");
        } else if ((media >= 5) && (media <= 6)){
            System.out.println("Obteve conceito D.");
        } else {
            System.out.println("Obteve conceito E.");
        }

        teclado.close();
    }
}
