import java.util.Scanner;

public class Iprogramafitness {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Informe quantas horas de exercício físico você faz por mês: ");
        float horas = teclado.nextFloat();

        double p1 = horas * 2;
        double p2 = horas * 5;
        double p3 = horas * 10;

        double d1 = p1 * 0.05;
        double d2 = p2 * 0.05;
        double d3 = p3 * 0.05;

        if (horas <= 10){
            System.out.println("Você obteve " + p1 + " pontos e por isso recebeu R$ " + d1%2d);
        } else if ((horas > 10) && (horas <= 20)){
            System.out.println("Você obteve " + p2 + " pontos e por isso recebeu R$" + d2%2d);
        } else if (horas > 20){
            System.out.println("Você obteve " + p3 + " pontos e por isso recebeu R$" + d3%2d);
        }

        teclado.close();

        /*Um programa de vida saudável quer dar pontos atividades físicas que podem ser trocados por dinheiro. O sistema funciona assim:
        - Cada hora de atividade física no mês vale pontos.
        - até 10h de atividade no mês: ganha 2 pontos por hora.
        - de 10h até 20h de atividade no mês: ganha 5 pontos por hora.
        - acima de 20h de atividade no mês: ganha 10 pontos por hora.
        - A cada ponto ganho, o cliente fatura R$0,05 (5 centavos).*/

    }
}
