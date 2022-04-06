import java.util.Scanner;

public class Bemvindo {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Qual é o seu nome? ");
        String resp = teclado.nextLine();
        System.out.println("Seja Bem-Vindo, " + resp + "!");
        teclado.close();

        //Exercício 1
        /* Faça um programa que leia o nome de uma pessoa e mostre uma mensagem de boasvindas para ela*/
    }
}