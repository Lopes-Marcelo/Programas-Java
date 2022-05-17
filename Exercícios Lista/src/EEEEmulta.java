import java.util.Scanner;

public class EEEEmulta {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Qual é a velocidade do carro em Km/h? ");
        float velocidade = teclado.nextFloat();
        float multa = (velocidade - 80) * 5;
        
        if (velocidade > 80) {
            System.out.println("O motorista foi multado, o valor da multa é: R$" + multa);
        }
        teclado.close();
        
        //Escreva um programa que pergunte a velocidade de um carro. Caso ultrapasse 80Km/h, exiba uma mensagem dizendo que o usuário foi multado. Nesse caso, exiba o valor da multa, cobrando R$5 por cada Km acima da velocidade permitida.
    }
}
