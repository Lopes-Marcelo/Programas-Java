import java.util.Scanner;

public class ImpostoDez {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Informe seu salário: ");
        double salario = teclado.nextDouble();
        System.out.print("Você possui R$50,00 de gratificação no salário final e 10% de imposto no valor do salário base.");
        double salario2 = salario * 0.9;
        double salario3 = 50 + salario2;
        System.out.println("Salário informado: R$" + salario);
        System.out.println("O salário com os reajustes será de R$" + salario3);
        teclado.close();    
    }    
}
