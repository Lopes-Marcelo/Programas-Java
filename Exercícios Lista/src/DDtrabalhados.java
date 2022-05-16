import java.util.Scanner;

public class DDtrabalhados {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Por quantos você trabalhou esse mês? ");
        int dias_trabalhados = teclado.nextInt();
        double sal_final = dias_trabalhados * 200;
        
        System.out.println("Seu salário esse mês será de R$" + sal_final);
        teclado.close();
        
        //Crie um programa que leia o número de dias trabalhados em um mês e mostre o salário de um funcionário, sabendo que ele trabalha 8 horas por dia e ganha R$25 por hora trabalhada.
    }
}
