import java.util.Scanner;

public class AAsalario {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite seu nome: ");
        String nome = teclado.nextLine();
        System.out.print("Informe seu salário: R$");
        double salario = teclado.nextDouble();
        System.out.println("Neste mês, o funcionário " + nome + " recebeu um salário de R$" + salario);
        teclado.close();

        //Exercício 3 
        /* Crie um programa que leia o nome e o salário de um funcionário, mostrando no
        final uma mensagem.*/
    }
    
}
