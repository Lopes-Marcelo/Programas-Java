import java.util.Scanner;

public class AAordemcrescente {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite 3 números inteiros e diferentes entre si!!");

        System.out.print("Informe o primeiro número: ");
        int num1 = teclado.nextInt();
        System.out.print("Informe o segundo número: ");
        int num2 = teclado.nextInt();
        System.out.print("Informe o terceiro número: ");
        int num3 = teclado.nextInt();

        if(num1 < num2 && num1 < num3){
            if(num2 < num3){
                System.out.println("A ordem crescente é: " + num1 + " - " + num2 + " - " + num3);
            } else{
                System.out.println("A ordem crescente é: " + num1 + " - " + num3 + " - " + num2);
            }
        }

        if(num2 < num1 && num2 < num3){
            if(num1 < num3){
                System.out.println("A ordem crescente é: " + num2 + " - " + num1 + " - " + num3);
            } else{
                System.out.println("A ordem crescente é: " + num2 + " - " + num3 + " - " + num1);
            }
        }

        if(num3 < num1 && num3 < num2){
            if(num1 < num2){
                System.out.println("A ordem crescente é: " + num3 + " - " + num1 + " - " + num2);
            } else{
                System.out.println("A ordem crescente é: " + num3 + " - " + num2 + " - " + num1);
            }
        }

        teclado.close();
    }
}
