import java.util.Scanner;

public class Quadro{
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        // x = altura que deseja pregar o quadro
        // y = distância em que deverá ficar a escada
        // z = tamanho da escada
        System.out.print("Informe o tamanho da escada em metros: ");
        double z = teclado.nextDouble();
        System.out.print("Informe a altura que deseja pregar o quadro: ");
        double x = teclado.nextDouble();
        double y = (z * z) - (x * x);
        double y2 = Math.sqrt(y);
        System.out.println("A distância da escada e da parede é de " + y2);
        teclado.close();

        //Exercício 22 
    }
}
