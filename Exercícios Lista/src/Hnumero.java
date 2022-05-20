import java.util.Random;
import java.util.Scanner;

public class Hnumero {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Sorteei um número de 0 a 5, tente adivinhar!");
        System.out.println(" ");

        Random random = new Random();

        int n1 = random.nextInt(5);

        System.out.println("Qual número você acha que foi sorteado? ");
        int n2 = teclado.nextInt();

        if (n1 == n2){
            System.out.println("ACERTOU!!!");
        } else {
            System.out.println("Errou, tente outra vez!");
        }

        teclado.close();

        //Crie um jogo onde o computador vai sortear um número entre 1 e 5 o jogador vai tentar uma vez descobrir qual foi o valor sorteado.
    }
}
