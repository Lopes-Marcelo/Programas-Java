import java.util.Scanner;

public class Dvicio {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Quantos cigarros você fuma por dia? ");
        int cigarro_por_dia = teclado.nextInt();
        System.out.print("Há quantos anos você fuma? ");
        int cigarro_anos = teclado.nextInt();  
        int qtd_de_dias = cigarro_anos * 365;
        int total = qtd_de_dias * cigarro_por_dia;
        int min_total = 10 * total;
        int dias_perdidos = min_total/1440;
        
        System.out.println("Você já perdeu um total de " + dias_perdidos  + " dias de vida por causa do cigarro, visto que a cada 1 cigarro se perde 10 minutos de vida.");
        teclado.close();
        
        // Escreva um programa para calcular a redução do tempo de vida de um fumante. Pergunte a quantidade de cigarros fumados por dias e por quantos anos ele já fumou. Considere que um fumante perde 10 min de vida a cada cigarro. Então calcule quantos dias de vida um fumante perderá e exiba o total em dias.
    }
}
