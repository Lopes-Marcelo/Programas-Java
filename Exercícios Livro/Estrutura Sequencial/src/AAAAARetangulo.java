import java.util.Scanner;

public class AAAAARetangulo {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite o valor da altura do retângulo: ");
        float alt = teclado.nextFloat();
        System.out.print("Digite o valor do comprimento do retângulo: ");
        float com = teclado.nextFloat();
        float area = alt * com;
        float perimetro = (alt * 2) + (com * 2);
        System.out.println("O valor da área é: " + area);
        System.out.print("O valor do perímetro é: " + perimetro);
        teclado.close();

        //Exercício 1
    }
}
