import java.util.Scanner;

public class SalarioMinimo {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in); 
        double horas_t, vlr_sal_min, vlr_hora_t, vlr_sal_bru, imp, vlr_sal_liq;
        System.out.print("Informe a quantidade de horas trabalhadas: ");
        horas_t = teclado.nextDouble();
        System.out.print("Informe o valor do salário mínimo: R$");
        vlr_sal_min = teclado.nextDouble();
        vlr_hora_t = vlr_sal_min / 10;
        vlr_sal_bru = horas_t * vlr_hora_t;
        imp = (vlr_sal_bru) * 3/100;
        vlr_sal_liq = vlr_sal_bru - imp;
        System.out.println("O salário líquido a receber diante de todas as regras é R$" + vlr_sal_liq);
        teclado.close();

        //Exercício 17
    }
    
}
