import java.util.Scanner;

public class Ccupomaplicado {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Informe o valor a do produto: R$");
        double preco_inicial = teclado.nextDouble();
        double preco_final = preco_inicial * 0.95;
        
        System.out.println("O preço do produto com o cupom aplicado é de R$" + preco_final);
        teclado.close();
        
        //Crie um programa que leia o preço de um produto, calcule e mostre o seu PREÇO PROMOCIONAL, com 5% de desconto.
    }
}
