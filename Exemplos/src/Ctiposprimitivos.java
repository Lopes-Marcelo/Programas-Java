import java.util.Scanner;

public class Ctiposprimitivos {
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
         
        System.out.print("Digite o nome do aluno: ");
        String nomee = teclado.nextLine();
        System.out.print("Digite a nota do aluno: ");
        float notaa = teclado.nextFloat();
        String nome = "Marcelo";
        float nota = 8.5f;
        System.out.println("Sua nota é " + nota);
        System.out.printf("Sua nota é %.3f \n", nota);
        System.out.format("A nota de %s é %.2f \n", nome, nota);
        System.out.println("sua nota é " + notaa);
        System.out.printf("sua nota é %.3f \n", notaa);
        System.out.format("a nota de %s é %.3f \n", nomee, notaa);
        teclado.close();

        //Outros exemplos de tipos primitivos do Java são: byte;short;int;long;boolean;char;float;double
    }
}

