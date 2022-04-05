import java.util.Scanner;

public class Escada {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Informe a altura da parede em metros: ");
        double alt = teclado.nextDouble();
        System.out.print("Informe o ângulo formado em graus: ");
        double ang = teclado.nextDouble();
        double radiano = (ang * 3.14) /180;
        double escada = (alt)/ Math.sin(radiano);
        System.out.println("A medida da escada é de " + escada + " metros.");
        teclado.close();

        // Exercício 20 
    }
    
}
