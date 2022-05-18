import java.util.Scanner;

public class FFFidadealistamento {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Informe o ano do seu nascimento: ");
        int ano_nascimento = teclado.nextInt();
        System.out.print("Informe o ano atual: ");
        int ano_atual = teclado.nextInt();

        int idade = ano_atual - ano_nascimento;
        int idade_1 = 18 - idade;
        int idade_2 = idade - 18;

        if (idade < 18) {
            System.out.println("Faltam " + idade_1 + " anos para seu alistamento.");
        } else if (idade > 18) {
            System.out.println("Já se passaram " + idade_2 + " anos do seu alistamento.");
        } else {
            System.out.println("Seu alistamento é esse ano!");
        }
        teclado.close();
        
        //Escreva um programa que leia o ano de nascimento de um rapaz e mostre a sua situação em relação ao alistamento militar.
    }
}