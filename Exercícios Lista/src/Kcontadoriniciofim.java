import java.util.Scanner;

public class Kcontadoriniciofim {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Informe o valor inicial: ");
        int valor_inicial = teclado.nextInt();
        System.out.print("Informe o valor final: ");
        int valor_final = teclado.nextInt();
        System.out.print("Informe o valor do incremento: ");
        int valor_salto = teclado.nextInt();

        for (int cont = valor_inicial ; cont <= valor_final ; cont += valor_salto){
            System.out.println(cont);
        }
        System.out.println("Acabou!");

        teclado.close();

        //Crie um programa que leia um valor inicial da contagem, o valor final e o salto(incremento), mostrando em seguida todos os valores do intervalo.
    }
}
