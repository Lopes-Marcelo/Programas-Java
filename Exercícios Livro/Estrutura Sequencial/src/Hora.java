import java.util.Scanner;

public class Hora {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double hora, h, m , conversao;
        System.out.print("Informe o tempo em horas/minutos: ");
        hora = teclado.nextDouble();
        h = Math.floor(hora);
        m = hora - h;
        conversao = (h * 60) + (m * 100);
        System.out.println("O total de minutos diante do valor apresentado é " + conversao + " minutos.");
        teclado.close();

        //Exercício 25
    }
    
}
