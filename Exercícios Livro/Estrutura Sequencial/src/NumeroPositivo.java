import java.util.Scanner;

public class NumeroPositivo {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite um número positivo e maior que zero: ");
        int numero = teclado.nextInt();
        double exp = java.lang.Math.pow(numero,2);
        double cub = java.lang.Math.pow(numero,3);
        double raiz2 = java.lang.Math.sqrt(numero);
        double raiz3 = java.lang.Math.cbrt(numero);
        System.out.println(numero + " ao quadrado é: " + exp);
        System.out.println(numero + " ao cubo é: " + cub);
        System.out.println("A raíz quadrada de " + numero + " é: " + raiz2);
        System.out.println("A raíz cúbica de " + numero + " é: " + raiz3);
        teclado.close();

        //Exercício 12
    }
    
}
