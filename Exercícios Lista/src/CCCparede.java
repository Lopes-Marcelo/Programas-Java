import java.util.Scanner;

public class CCCparede {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Informe, em metros, a largura da parede: ");
        float n1 = teclado.nextFloat();
        System.out.print("Informe, em metros, a altura da parede: ");
        float n2 = teclado.nextFloat();
        double area = n1 * n2;
        double tinta = (n1 * n2)/2;
        System.out.println("A área da parede informada é de " + area + " metros, e serão necessários " + tinta + " litros de tinta para pinta-lá.");
        teclado.close();
        
        //Faça um algoritmo que leia a largura e altura de uma parede, calcule e mostre a área a ser pintada e a quantidade de tinta necessária para o serviço, sabendo que cada litro de tinta pinta uma área de 2metros quadrados.
    }
}
