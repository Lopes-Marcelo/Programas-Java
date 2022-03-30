import java.util.Scanner;

public class MediaPonderada {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        float n1, n2, n3, media;
        System.out.print("Digite a primeira nota: ");
        n1 = teclado.nextFloat();
        System.out.print("Digite a segunda nota: ");
        n2 = teclado.nextFloat();
        System.out.print("Digite a terceira nota: ");
        n3 = teclado.nextFloat();
        media = ((n1 * 1) + (n2 * 2) + (n3 * 3))/6;
        System.out.println("A média das notas informadas é " + media + ". Lembrando que a primeira nota possui peso 1, a segunda peso 2 e a terceira peso 3.");
    }
}