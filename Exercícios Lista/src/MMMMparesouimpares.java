import java.util.Scanner;

public class MMMMparesouimpares {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int cont = 1;
        int par = 0;
        int impar = 0;

        while (cont <= 6){
            System.out.println("Digite o " + cont + "º valor: ");
            int numero = teclado.nextInt();
            cont += 1;
            if (numero % 2 == 0){
                par += 1;
            } else{
                impar += 1;
            }
        }

        System.out.println(par + " números são pares e " + impar + " são ímpares.");

        teclado.close();

        //Crie um programa que leia 6 números inteiros e no final mostre quantos deles são pares e quantos são ímpares.
    }
}
