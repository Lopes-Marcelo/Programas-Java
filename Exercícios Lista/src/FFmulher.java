import java.util.Scanner;

public class FFmulher {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Informe seu nome: ");
        String nome = teclado.nextLine();
        System.out.print("Informe seu sexo (masculino[1] /feminino[2]): ");
        int sexo = teclado.nextInt();
        System.out.println("Qual é o valor total das suas compras? R$");
        float valor_inicial = teclado.nextFloat();
        double cupom;

        switch (sexo) {
            case 1:
                cupom = valor_inicial * 0.95;
                break;
            case 2:
                cupom = valor_inicial * 0.87;
                break;
            default:
                cupom = valor_inicial;
                break; 
        }

        System.out.println(nome + ", o valor da sua compra já com o cupom aplicado é de R$" + cupom);
        teclado.close();
        
        //Numa promoção exclusiva para o Dia da Mulher, uma loja quer dar descontos para todos, mas especialmente para mulheres. Faça um programa que leia nome, sexo e o valor das compras do cliente e calcule o preço com desconto. Sabendo que: Homens ganham 5% de desconto. Mulheres ganham 13% de desconto.
    }
}
