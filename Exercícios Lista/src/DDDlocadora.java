import java.util.Scanner;

public class DDDlocadora {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Informe o seu salário atual: R$");
        double sal_inicial = teclado.nextDouble();
        double sal_final = sal_inicial * 1.15;
        
        System.out.println("O seu novo salário com o aumento será de R$" + sal_final);
        teclado.close();
        
        //Faça um algoritmo que leia o salário de um funcionário, calcule e mostre o seu novo salário, com 15% de aumento.
    }
}
