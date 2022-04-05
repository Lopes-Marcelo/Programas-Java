import java.util.Scanner;

public class NumeroReal {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double num, i , f, a;
        System.out.print("Digite um número real e positivo qualquer: ");
        num = teclado.nextDouble();
        i = Math.floor(num); 
        f = num / 100;
        a = Math.ceil(num);
        System.out.println("O valor inteiro desse número é " + i);
        System.out.println("O valor fracionário desse número é " + f);
        System.out.println("O valor arredondado desse número é " + a);
        teclado.close();

        //Exercício 23
    }
    
}
