import java.util.Scanner;

public class FFFFsimples {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Informe a sua primeira nota: ");
        float n1 = teclado.nextFloat();
        System.out.println("Informe a sua segunda nota: ");
        float n2 = teclado.nextFloat();
        float m = (n1 + n2)/2;
        System.out.println("A sua média é igual a " + m);
        teclado.close();

        if (m > 7) {
            System.out.println("Parabéns, você passou!");
        }
        
        //Estrutura condicional simples
    }
}

