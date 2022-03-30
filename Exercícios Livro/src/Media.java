import java.util.Scanner;

public class Media {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int n1, n2, n3, n4; 
        System.out.print("Digite o primerio número: ");
        n1 = teclado.nextInt();
        System.out.print("Digite o segundo número: ");
        n2 = teclado.nextInt();
        System.out.print("Digite o terceiro número: ");
        n3 = teclado.nextInt();
        System.out.print("Digite o quarto número: ");
        n4 = teclado.nextInt();
        int soma = n1 + n2 + n3 + n4;
        System.out.print("A soma dos números digitados é igual a " + soma);
        teclado.close();
    }
}
