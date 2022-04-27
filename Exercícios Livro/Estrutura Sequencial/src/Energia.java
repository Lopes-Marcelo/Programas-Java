import java.util.Scanner;

public class Energia {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        float vlr_sal, qtd_kw, vlr_kw, vlr_reais, desc, vlr_desc;
        System.out.print("Informe o valor do salário mínimo: R$" );
        vlr_sal = teclado.nextFloat();
        System.out.print("Informe a quantidade de quilowatts consumida: ");
        qtd_kw = teclado.nextFloat();
        vlr_kw = vlr_sal / 5;
        vlr_reais = vlr_kw * qtd_kw;
        desc = (vlr_reais * 15) / 100;
        vlr_desc = vlr_reais - desc;
        System.out.println("O valor de cada quilowatt é de R$" + vlr_kw);
        System.out.println("O valor a ser pago pela residência é de R$" + vlr_reais);
        System.out.println("O valor com desconto a ser pago é de R$" + vlr_desc);
        teclado.close();

        // Exercício 23
    }
}
