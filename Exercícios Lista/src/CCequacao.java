import java.util.Scanner;

public class CCequacao {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Informe o valor a da equação: ");
        float n1 = teclado.nextFloat();
        System.out.print("Informe o valor b da equação: ");
        float n2 = teclado.nextFloat();
        System.out.print("Informe o valor c da equação: ");
        float n3 = teclado.nextFloat();
        float n4 = (n2*n2) - 4 * n1 * n3;
        
        System.out.println("O delta dessa equação é " + n4);
        teclado.close();
        
        //Desenvolva uma lógica que leia os valores de A, B e C de uma equação do segundo grau e mostre o valor de Delta.
    }
}
