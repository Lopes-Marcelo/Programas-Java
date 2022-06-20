import java.util.Scanner;

public class BBBBBparouimpar{
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Informe um número inteiro: ");
        int num = teclado.nextInt();

        if (num % 2 == 0){
            System.out.println("O número informado é PAR!!");
        } else{
            System.out.println("O número informado é ÍMPAR!!");
        }

        teclado.close();
    }
}