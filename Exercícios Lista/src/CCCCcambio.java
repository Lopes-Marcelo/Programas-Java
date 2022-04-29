import java.util.Scanner;

public class CCCCcambio {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite, reais, o valor que você possui: R$");
        float n1 = teclado.nextFloat();
        double din = n1 / 5.65;
        System.out.println("A quantia informada representa U$ " + din);
        teclado.close();

        //Faça um algoritmo que leia quanto dinheiro uma pessoa tem na carteira (em R$) e mostre quantos dólares ela pode comprar. Considere o câmbio atual.
    } 
}
