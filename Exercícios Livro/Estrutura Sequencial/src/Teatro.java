import java.util.Scanner;

public class Teatro {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int custo, convite, qtd;
        System.out.print("Informe o custo do espetáculo: R$");
        custo = teclado.nextInt();
        System.out.println("Informe o valor do convite individual: R$");
        convite = teclado.nextInt();
        qtd = custo/convite;
        System.out.println("O espetáculo precisa de " + qtd + " vendas de convite, no mínimo.");
        teclado.close(); 

        // Exercício 26
    }
    
}
