import java.util.Scanner;

public class SalarioBase {
     public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Informe seu salário: ");
        double salario = teclado.nextDouble();
        System.out.print("Você possui 5% de gratificação no valor base e 7% de imposto no valor total.");
        double salario2 = 1.05 * salario;
        double salario3 = salario2 * 0.93;
        System.out.println("Salário informado: R$" + salario);
        System.out.println("O salário com os reajustes será de R$" + salario3);
        teclado.close();
     }
}
