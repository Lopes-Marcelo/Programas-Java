import java.util.Scanner;

public class Aordemcrescenteobrigatoria {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite 3 números inteiros e diferentes entre si e em ordem crescente!!");

        System.out.print("Informe o primeiro número: ");
        int num1 = teclado.nextInt();
        System.out.print("Informe o segundo número: ");
        int num2 = teclado.nextInt();
        System.out.print("Informe o terceiro número: ");
        int num3 = teclado.nextInt();

        System.out.print("Digite um número inteiro qualquer(fora de ordem): ");
        int num4 = teclado.nextInt();

        if(num4 > num3){
            System.out.println("A ordem decrescente é: " + num4 + " - " + num3 + " - " + num2 + " - " + num1);
        } else if(num4 > num2 && num4 < num3){
            System.out.println("A ordem decrescente é: " + num3 + " - " + num4 + " - " + num2 + " - " + num1);
        } else if(num4 > num1 && num4 < num2){
            System.out.println("A ordem decrescente é: " + num3 + " - " + num2 + " - " + num4 + " - " + num1);
        } else if(num4 < num1){
            System.out.println("A ordem decrescente é: " + num3 + " - " + num2 + " - " + num1 + " - " + num4);
        }

        teclado.close();
    }
}
