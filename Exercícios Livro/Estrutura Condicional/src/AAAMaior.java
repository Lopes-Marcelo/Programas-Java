import java.util.Scanner;

public class AAAMaior {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Informe o primeiro número: ");
        double num1 = teclado.nextDouble();
        System.out.println("Informe o segundo número: ");
        double num2 = teclado.nextDouble();

        if (num1 > num2){
            System.out.println("O maior número é " + num1);
        } else if (num2 > num1){
            System.out.print("O maior número é " + num2);
        } else if (num1 == num2){
            System.out.println("Os números " + num1 + " e " + num2 + " são iguais.");
        } else {
            System.out.println("Operação invalidada!");
        }

        teclado.close();
    }
}
