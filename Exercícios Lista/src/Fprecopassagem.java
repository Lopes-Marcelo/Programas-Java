import java.util.Scanner;

public class Fprecopassagem {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Quantos quilômetros você deseja percorrer: ");
        float km = teclado.nextFloat();

        double s1 = km * 0.5;
        double s2 = km * 0.45;

        if (km <= 200){
            System.out.println("O valor da sua passagem será de R$" + s1);
        } else if (km > 200){
            System.out.println("O valor da sua passagem será de R$" + s2);
        }
        teclado.close();
        
        //Faça um algoritmo que pergunte a distância que um passageiro deseja percorrer em Km. Calcule o preço da passagem, cobrando R$0.50 por Km para viagens até 200Km e R$0.45 para viagens mais longas.
    }
}
