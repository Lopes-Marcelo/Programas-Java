import java.util.Scanner;

public class Idade {
   public static void main(String[] args) {
       Scanner teclado = new Scanner(System.in);
       System.out.print("Informe seu ano de nascimento: ");
       int ano_nasc = teclado.nextInt();
       System.out.print("Informe o ano atual: ");
       int ano_atual = teclado.nextInt();
       int idade = ano_atual - ano_nasc;
       int idadefut = (2050 - ano_atual) + idade;
       System.out.println("Sua idade é de " + idade + " anos.");
       System.out.println("Em 2050, você terá " + idadefut + " anos.");
       teclado.close();     
   }    

   //Exercício 15
    
}
