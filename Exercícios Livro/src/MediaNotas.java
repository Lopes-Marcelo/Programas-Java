//import java.text.DecimalFormat;
import java.util.Scanner;

public class MediaNotas {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        //DecimalFormat casas; 
        //casas = new DecimalFormat("0.00");
        float n1, n2, n3, media;
        System.out.print("Digite a primeira nota: ");
        n1 = teclado.nextFloat();
        System.out.print("Digite a segunda nota: ");
        n2 = teclado.nextFloat();
        System.out.print("Digite a terceira nota: ");
        n3 = teclado.nextFloat();
        media = (n1 + n2 + n3)/3;
        System.out.println("A média das notas informadas é " + media); //(casas.format(media)));
    }
}
