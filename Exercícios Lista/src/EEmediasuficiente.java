import java.util.Scanner;

public class EEmediasuficiente {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Informe seu nome: ");
        String nome_aluno = teclado.nextLine();
        System.out.print("Informe sua nota 1: ");
        float nota_1 = teclado.nextFloat();
        System.out.print("Informe sua nota 2: ");
        float nota_2 = teclado.nextFloat();

        float media_notas = (nota_1 + nota_2)/2;
        
        System.out.println("Nome do Aluno: " + nome_aluno);
        System.out.println("Nota da primeira prova: " + nota_1); 
        System.out.println("Nota da segunda prova: " + nota_2);

        if (media_notas >= 7){
            System.out.println("Parabéns! Seu aproveitamento foi de " + media_notas + ", considerado bom.");
        } else {
            System.out.println("Seu aproveitamento foi de " + media_notas + ", considerado ruim.");
        }
        
        teclado.close();
        
        //Crie um algoritmo que leia o nome e duas notas de um determinado aluno, calcule a sua média e mostre na tela. No final, analise a média e mostre se o aluno teve ou não um bom aproveitamento (se ficou acima da média 7.0).
    }
}
