import java.util.Scanner;

public class GGGnumeros {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int n1 = teclado.nextInt();
        System.out.print("Digite outro número: ");
        int n2 = teclado.nextInt();
        
        if (n1 > n2){
            System.out.println("O número " + n1 + " é maior que o número " + n2);
        }

        if (n1 < n2){
            System.out.println("O número " + n2 + " é maior que o número " + n1);
        }

        if (n1 == n2){
            System.out.println("Os números são iguais.");
        }
        teclado.close();
        
        //Escreva um algoritmo que leia dois números inteiros e compare-os, mostrando na tela uma das mensagens abaixo: O primeiro valor é o maior. O segundo valor é o maior. Não existe valor maior, os dois são iguais.
    }
}
