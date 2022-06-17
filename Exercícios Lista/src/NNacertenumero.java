import java.util.Random;
import java.util.Scanner;

public class NNacertenumero {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Sorteei um número de 0 a 10, tente adivinhar!");
        System.out.println(" ");

        Random random = new Random();
        int n1 = random.nextInt(5);
        int cont = 1;

        while(cont <= 4 ){
            System.out.print("Qual número você acha que foi sorteado? ");
            int n2 = teclado.nextInt();

            if (n1 == n2){
                System.out.println("ACERTOU!!!");
                break;
            } else {
                System.out.println("Errou, tente outra vez!");
            }
            cont ++;
        }   
        teclado.close();

        //Vamos melhorar o jogo que fizemos no exercício 32. A partir de agora, o computador vai sortear um número entre 1 e 10 e jogador vai ter 4 chances para tentar acertar.
    }
}
