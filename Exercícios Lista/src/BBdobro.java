import java.util.Scanner;

public class BBdobro {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite um número inteiro qualquer: ");
        int n1 = teclado.nextInt();
        int dobro = n1 * 2;
        int terca = n1 / 3;
        System.out.println("O dobro do número digitado é igual a " + dobro + " e a terça parte desse número é " + terca);
        teclado.close();

        //Crie um algoritmo que leia um número real e mostre na tela o seu dobro e a sua terça parte.
    }
}
