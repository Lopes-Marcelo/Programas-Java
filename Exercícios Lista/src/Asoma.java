import java.util.Scanner;

public class Asoma {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite um número inteiro qualquer: ");
        int n1 = teclado.nextInt();
        System.out.print("Digite outro número inteiro qualquer: ");
        int n2 = teclado.nextInt();
        int soma = n1 + n2;
        System.out.println("A soma dos valores digitados é " + soma);
        teclado.close();

        //Exercício 4
        /*Desenvolva um algoritmo que leia dois números inteiros e mostre o somatório
        entre eles.*/
    }
    
}
