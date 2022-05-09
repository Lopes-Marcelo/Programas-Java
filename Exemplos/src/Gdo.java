import java.util.Scanner;

public class Gdo {
    public static void main(String[] args) {
        int cont = 1;
        do {
            System.out.println("Número " + cont);
            cont++;
        }   while (cont <= 10);

        Scanner teclado = new Scanner(System.in);
        int n, s = 0;
        String resp;
        do {
            System.out.println("Digite um número: ");
            n = teclado.nextInt();
            s = s + n;
            System.out.println("Quer continuar? [S/N]");
            resp = teclado.next();
        }   while (resp.equals("S"));
        teclado.close();

        System.out.println("A soma dos valores fornecidos é igual a: " + s);

        // Estrutura de repetição - do
    }
}
