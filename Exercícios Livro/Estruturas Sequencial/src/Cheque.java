import java.util.Scanner;

public class Cheque {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Informe a quantia a ser depositada na conta : R$");
        double salario = teclado.nextDouble();
        System.out.print("Retirada via cheque (taxa de 0.38% do valor): R$");
        double cheque1 = teclado.nextDouble();
        System.out.print("Retirada via cheque (taxa de 0.38% do valor): R$");
        double cheque2 = teclado.nextDouble();
        double saldo = salario - (cheque1 * 1.0038) - (cheque2 * 1.0038);
        System.out.println("Saldo atualizado: R$" + saldo);
        teclado.close();

        // Exercício 18
    }
    
}
