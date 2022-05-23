import java.util.Scanner;

public class JJJJaumento {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Informe seu salário atual: R$ ");
        float salario_inicial = teclado.nextFloat();
        System.out.println("Informe seu genêro Masculino [1]/ Feminino[2]: ");
        int genero = teclado.nextInt();
        System.out.println("Infome há quantos anos você trabalha na empresa: ");
        int anos = teclado.nextInt();

        if ((genero == 2) && (anos < 15)){
            System.out.println("Seu novo salário será de R$" + (salario_inicial * 1.05));
        } else if ((genero == 2) && (anos >= 15) && (anos < 20)){
            System.out.println("Seu novo salário será de R$" + (salario_inicial * 1.12));
        } else if ((genero == 2) && (anos > 20)){
            System.out.println("Seu novo salário será de R$" + (salario_inicial * 1.23));
        } else if ((genero == 1) && (anos < 20)){
            System.out.println("Seu novo salário será de R$" + (salario_inicial * 1.03));
        } else if ((genero == 1) && (anos >= 20) && (anos < 30)){
            System.out.println("Seu novo salário será de R$" + (salario_inicial * 1.13));
        } else if ((genero == 1) && (anos > 30)){
            System.out.println("Seu novo salário será de R$" + (salario_inicial * 1.25));
        }

        teclado.close();

        /* Uma empresa precisa reajustar o salário dos seus funcionários dando um aumento de acordo com alguns fatores. Faça um programa que leia o salário atual, o gênero do funcionário e há quantos anos esse funcionário trabalha na empresa. No final, mostre o seu novo salário, baseado na tabela a seguir:
        * Mulheres:
        - menos de 15 anos de empresa: +5%
        - de 15 até 20 anos de empresa: +12%
        - mais de 20 anos de empresa: +23%
        * Homens:
        - menos de 20 anos de empresa: +3%
        - de 20 até 30 anos de empresa: +13%
        - mais de 30 anos de empresa: +25%*/
    }
}
