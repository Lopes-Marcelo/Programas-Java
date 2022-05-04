import java.util.Scanner;

public class Fsimples {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        float n1 = teclado.nextFloat();
        float n2 = teclado.nextFloat();
        float m = (n1 + n2)/2;
        System.out.println("Sua média é igual a " + m);
        teclado.close();

        if (m > 7) {
            System.out.println("Parabéns");
        }
        
        //Estrutura condicional simples
    }
}

