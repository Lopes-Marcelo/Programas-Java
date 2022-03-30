import java.util.Scanner;

public class DepositoJuros {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Informe a a quantia a ser depositada: R$" );
        double deposito = teclado.nextDouble();
        System.out.println("A taxa para depósitos é de 3% do valor total.");
        double total = deposito * 1.03;
        System.out.println("O valor total da operação é de: R$" + total);
        teclado.close();
    }
    
}
