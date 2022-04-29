import java.util.Scanner;

public class BBBsucessor {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite um número inteiro qualquer: ");
        int n1 = teclado.nextInt();
        int ant = n1 - 1;
        int suc = n1 + 1;
        System.out.println("O antecessor desse número é " + ant + " e o sucessor é " + suc);
        teclado.close();

        //Faça um programa que leia um número inteiro e mostre o seu antecessor e seu sucessor.
    }
    
}
