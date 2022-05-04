import java.util.Scanner;

public class FFFcomposta {

    public static void main(String[] args) {
        //Exemplo 1
        
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite sua primeira nota: ");
        float n1 = teclado.nextFloat();
        System.out.print("Digite sua segunda nota: ");
        float n2 = teclado.nextFloat();
        float media = (n1 + n2)/2;
        System.out.println("Sua média é igual a " + media);
        teclado.close();

        if (media >= 7) {
            System.out.println("Parabéns!");
        }   
        else {
                System.out.println("Estude mais!");
        }

        //Exemplo 2

        Scanner tec = new Scanner(System.in);
        System.out.print("Digite o ano do seu nascimento: ");
        int ano_nasc = tec.nextInt();
        System.out.print("Digite o ano em que estamos: ");
        int ano_atual = tec.nextInt();
        int idade = ano_atual - ano_nasc;
        System.out.print("Você possui " + idade + " anos.");
        tec.close();

        if (idade >= 18) {
            System.out.println(" Portanto, já é maior de idade.");
        }   
        else {
            System.out.println(" Portanto, ainda é menor de idade.");
        }
        
        //Estrutura condicional composta
    }
}
