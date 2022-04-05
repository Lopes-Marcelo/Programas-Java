import java.util.Scanner;

public class Racao {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Informe o peso da ração em Kg: ");
        double peso_saco = teclado.nextDouble();
        System.out.print("Informe a quantidade de ração diária consumida pelo gato 1 em gramas: ");
        double racao_gato1 = teclado.nextDouble();
        System.out.print("Informe a quantidade de ração diária consumida pelo gato 2 em gramas: ");
        double racao_gato2 = teclado.nextDouble();
        double total_final = peso_saco - (((racao_gato1 / 1000) + (racao_gato2 / 1000)) * 5);
        System.out.println("Ao final de 5 dias sobrará " + total_final + "kg de ração.");
        teclado.close();

        //Exercício 19
    }
    
}
