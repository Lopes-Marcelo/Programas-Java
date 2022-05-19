import java.util.Scanner;

public class GGsituacaoaluno {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Informe sua nota 1: ");
        float n1 = teclado.nextFloat();
        System.out.print("Informe sua nota 2: ");
        float n2 = teclado.nextFloat();
        
        double media = (n1 + n2)/2;

        if (media < 5){
            System.out.println("Média " + media + " : REPROVADO");
        }

        if ((media >= 5) && (media < 7)){
            System.out.println("Média " + media + " : RECUPERAÇÃO");
        }

        if (media > 7){
            System.out.println("Média " + media + " : APROVADO");
        }
        teclado.close();
        
        //Crie um programa que leia duas notas de um aluno e calcule a sua média, mostrando uma mensagem no final, de acordo com a média atingida. Média até 4.9: REPROVADO/ Média entre 5.0 e 6.9: RECUPERAÇÃO/ Média 7.0 ou superior: APROVADO.
    }
}
