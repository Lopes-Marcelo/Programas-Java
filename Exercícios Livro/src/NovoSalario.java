import java.util.Scanner;

public class NovoSalario {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Informe seu salário: ");
        double salario = teclado.nextDouble();
        double novo_salario = salario * 1.25;
        System.out.println("Com o reajuste, seu novo salário será de R$" + novo_salario);
    }
}
