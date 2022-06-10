import java.util.Scanner;

public class KKKusuarioinputcontador {
    
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Informe um número inteiro e positivo qualquer: ");
        int num = teclado.nextInt();
        int cont = 0;

        while (cont <= num){
            System.out.println(cont);
            cont += 1;
        }
        
        teclado.close();

        //Crie um programa que pergunte ao usuário um número inteiro e positivo qualquer e mostre uma contagem até esse valor.
    }
}
