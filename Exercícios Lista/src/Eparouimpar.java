import java.util.Scanner;

public class Eparouimpar {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Informe um número: ");
        int num = teclado.nextInt();

        if (num % 2 == 0){
            System.out.println("O número informado é par!");
        } else {
            System.out.println("O número informado é ímpar!");
        }
        
        teclado.close();
        
        //Desenvolva um programa que leia um número inteiro e mostre se ele é PAR ou ÍMPAR.
    }
}
