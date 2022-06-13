import java.util.Scanner;

public class Ldigiteesome {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int cont = 1;
        int soma = 0;

        while (cont <= 7){
            System.out.println("Digite o " + cont + "º valor: ");
            int numero = teclado.nextInt();
            soma = soma + numero;
            cont += 1;
        }

        System.out.println("A soma desses valores é igual a " + soma);

        teclado.close();

        //Crie um programa que leia 7 números inteiros e no final mostre o somatório entre eles.
    }
}
