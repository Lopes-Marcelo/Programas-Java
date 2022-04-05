import java.util.Scanner;

public class AreaCirculo {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Informe o raio do círculo em cm: ");
        int raio = teclado.nextInt();
        double area = (raio * raio) * 3.14;
        System.out.println("A área do cícurlo é: " + area + " cm². (Considerando PI = 3,14).");
        teclado.close();
    }
}
