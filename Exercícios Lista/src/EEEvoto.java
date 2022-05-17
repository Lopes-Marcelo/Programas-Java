import java.util.Scanner;

public class EEEvoto {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Informe o ano do seu nascimento: ");
        int ano_nascimento = teclado.nextInt();
        System.out.print("Informe o ano atual: ");
        int ano_atual = teclado.nextInt();

        int idade = ano_atual - ano_nascimento;
        
        if (idade >= 16) {
            System.out.println("Você já pode votar!");
        } else {
            System.out.println("Você ainda não pode votar!");
        }
        teclado.close();
        
        //Faça um programa que leia o ano de nascimento de uma pessoa, calcule a idade dela e depois mostre se ela pode ou não votar.
    }
}
