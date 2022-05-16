import java.util.Scanner;

public class DDDlocadora {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Quantos quilômetros foram rodados com o veículo: ");
        float km = teclado.nextFloat();
        System.out.print("Por quantos dias o carro esteve alugado: ");
        int dias_alugados = teclado.nextInt();
        double preco_final = dias_alugados*90 + km*0.2;
        
        System.out.println("O preço total da locação é de R$" + preco_final);
        teclado.close();
        
        //Escreva um programa que pergunte a quantidade de Km percorridos por um carro alugado e a quantidade de dias pelos quais ele foi alugado. Calcule o preço total a pagar, sabendo que o carro custa R$90 por dia e R$0,20 por Km rodado.
    }
}
