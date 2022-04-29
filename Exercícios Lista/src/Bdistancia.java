import java.util.Scanner;

public class Bdistancia {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite uma medida qualquer em metros: ");
        int n1 = teclado.nextInt();
        float km = n1 / 1000;
        float cm = n1 * 100;
        float mm = n1 * 1000;
        System.out.println("A distância informada representa: " + km + " km," + cm + " cm," + mm + " mm.");
        teclado.close();
        
        //Desenvolva um programa que leia uma distância em metros e mostre os valores relativos em outras medidas.
    } 
}
