import java.util.Scanner;

public class IIlocacaocarro {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Informe o veículo que pretende alugar - Popular[1] ou luxo[2]: ");
        int tipo = teclado.nextInt();
        System.out.print("Informe por quantos dias o carro será aluguado: ");
        int dias = teclado.nextInt();
        System.out.println("Quantos quilômetros serão percorridos: ");
        int km = teclado.nextInt();
        double preco1;

        switch (tipo) {
            case 1:
                preco1 = 90 * dias;
                break;
            case 2:
                preco1 = 150 * dias;
                break;
            default:
                preco1 = 0;
                break; 
        }

        if ((tipo == 1) && (km < 100)){
            System.out.println("O valor do locação será de R$" + ((km * 0.2) + preco1));
        }   else if ((tipo == 1) && (km > 100)){
            System.out.println("O valor do locação será de R$" + ((km * 0.1) + preco1));
        }   else if ((tipo == 2) && (km < 200)){
            System.out.println("O valor do locação será de R$" + ((km * 0.3) + preco1));
        }   else if ((tipo == 2) && (km > 200)){
            System.out.println("O valor do locação será de R$" + ((km * 0.25) + preco1));
        }
        teclado.close();
        
        /*Uma empresa de aluguel de carros precisa cobrar pelos seus serviços. O aluguel de um carro custa R$90 por dia para carro popular e R$150 por dia para carro de luxo. Além disso, o cliente paga por Km percorrido. Faça um programa que leia o tipo de carro alugado (popular ou luxo), quantos dias de aluguel e quantos Km foram percorridos. No final mostre o preço a ser pago de acordo com a tabela a seguir:
        - Carros populares (aluguel de R$90 por dia).
        - Até 100Km percorridos: R$0,20 por Km.
        - Acima de 100Km percorridos: R$0,10 por Km.
        - Carros de luxo (aluguel de R$150 por dia).
        - Até 200Km percorridos: R$0,30 por Km.
        - Acima de 200Km percorridos: R$0,25 por Km.*/
    }
}
