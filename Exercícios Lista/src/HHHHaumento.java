import java.util.Scanner;

public class HHHHaumento {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Informe seu nome: ");
        String nome = teclado.nextLine();
        System.out.print("Informe seu salário: ");
        float salario = teclado.nextFloat();
        System.out.print("Informe a quantos anos trabalha na empresa: ");
        int anos = teclado.nextInt();
        
        double s1 = salario * 1.03;
        double s2 = salario * 1.125;
        double s3 = salario * 1.2;

        if (anos < 3){
            System.out.println(nome + ", seu novo salário será de: R$" + s1);
        }

        if ((anos > 3) && (anos < 10)){
            System.out.println(nome + ", seu novo salário será de: R$" + s2);
        }

        if (anos > 10){
            System.out.println(nome + ", seu novo salário será de: R$" + s3);
        }
        teclado.close();
        
        //Desenvolva um programa que leia o nome de um funcionário, seu salário, quantos anos ele trabalha na empresa e mostre seu novo salário, reajustado de acordo com a tabela a seguir. Até 3 anos de empresa: aumento de 3%.Entre 3 e 10 anos: aumento de 12.5%. 10 anos ou mais: aumento de 20%.
    }
}
