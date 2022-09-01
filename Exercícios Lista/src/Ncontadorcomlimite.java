import java.util.Scanner;

public class Ncontadorcomlimite {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int num = 0;
        int n = 0;
        System.out.println("Contador. Para sair digite 111");

        while (n != 111) {

            System.out.println("Digite um número: ");
            n = teclado.nextInt();
            num = num + n;

        }

        System.out.println("Saindo....");
        System.out.println("O resultado da somátoria dos números digitados é " + num);
        teclado.close();
        ////Crie um programa que leia vários números pelo teclado e mostre no final o somatório entre eles. Obs: O programa será interrompido quando o número 111 for digitado.
    }
}
