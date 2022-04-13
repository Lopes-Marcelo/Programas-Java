import java.util.Scanner;

public class NumeroExp {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int n1 = teclado.nextInt();
        System.out.print("Digite outro número: ");
        int n2 = teclado.nextInt();
        int quadrado1 =  (int) Math.pow(n1,n2);
        int quadrado2 = (int) Math.pow(n2,n1);
        System.out.println(n1 + " elevado a " + n2 + " é igual a: " + quadrado1);
        System.out.println(n2 + " elevado a " + n1 + " é igual a: " + quadrado2);
        teclado.close();
    }

    //Exercício 13
    
}
