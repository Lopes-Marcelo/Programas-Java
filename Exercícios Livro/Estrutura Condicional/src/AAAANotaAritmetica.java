import java.util.Scanner;

public class AAAANotaAritmetica {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Informe a primeira nota: ");
        double nota1 = teclado.nextDouble();
        System.out.println("Informe a segunda nota: ");
        double nota2 = teclado.nextDouble();
        System.out.println("Informe a terceira nota: ");
        double nota3 = teclado.nextDouble();

        double media = (nota1 + nota2 + nota3)/ 10;

        System.out.println("Média Aritmética: " + media);

        if ((media >= 0) && (media < 3)){
            System.out.println("Reprovado.");
        } else if ((media >= 3) && (media < 6)){
            System.out.print("Recuperação: ");
            double nota_exame = 12 - media;
            System.out.println("Deve tirar nota igual ou superior a " + nota_exame + " para ser aprovado.");
        } else if ((media >= 7) && (media <= 10)){
            System.out.println("Aprovado.");
        } else {
            System.out.println("Notas inválidas!");
        }

        teclado.close();
    }
}
