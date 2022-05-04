import java.util.Scanner;

public class FFencadeada {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Qual o ano do seu nascimento? ");
        int ano_nasc = teclado.nextInt();
        System.out.print("Qual é o ano atual? ");
        int ano_atual = teclado.nextInt();
        int idade = ano_atual - ano_nasc;
        System.out.print("Você possui " + idade + " anos. ");
        teclado.close();

        if (idade < 16) {
            System.out.println("Portanto, você não pode votar.");
        }   else {
                if ((idade >= 16 && idade < 18 ) || (idade > 70)) {
                    System.out.println("Portanto, seu voto é opcional.");
                }   else {
                        System.out.println("Portanto, seu voto é obrigatório.");
                }
        }

        //Estrutura condicional encadeada
    } 
}