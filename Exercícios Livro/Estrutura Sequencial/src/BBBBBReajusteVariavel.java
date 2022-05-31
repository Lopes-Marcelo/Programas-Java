import java.util.Scanner;

public class ReajusteVariavel {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Informe seu salário: ");
        double salario = teclado.nextDouble();
        System.out.print("Informe a porcentagem do reajuste: ");
        double reajuste = teclado.nextDouble();
        double novo_reajuste = ((reajuste/100) + 1) * salario;
        System.out.println("Salário informado: R$" + salario);
        System.out.println("Reajuste informado: " + reajuste + " %.");
        System.out.println("O salário com o reajuste será de R$" + novo_reajuste);
        teclado.close();
        
        //Exercício 6
    }
}
